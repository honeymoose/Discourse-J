package com.ossez.discourse.client.service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.ossez.discourse.common.exception.DiscourseError;
import com.ossez.discourse.common.exception.DiscourseRuntimeException;
import com.ossez.discourse.common.model.dto.Post;
import com.ossez.discourse.common.model.dto.Topic;
import com.ossez.discourse.client.DiscourseClient;
import com.ossez.discourse.common.model.dto.TopicCreation;
import okhttp3.*;
import org.apache.http.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Optional;

/**
 * WeChat Official Account Platform related Service
 *
 * @author YuCheng
 */
public class TopicsService extends DiscourseClient {
    private final Logger log = LoggerFactory.getLogger(TopicsService.class);

    private WeChatOfficialAccountApi weChatOfficialAccountApi;

    private OkHttpClient client = new OkHttpClient();

    public TopicsService(String siteUrl, String apiName, String apiKey) {
        DiscourseClient.site_url = siteUrl;
        DiscourseClient.api_username = apiName;
        DiscourseClient.api_key = apiKey;
    }

    public Optional<Topic> getTopic(Long topicId) {
        String path = "t/" + String.valueOf(topicId) + ".json";

        Optional<Topic> discourseTopic = Optional.ofNullable(new Topic());
        try {
            Response response = client.newCall(getRequest(path)).execute();

            String responseStr = response.body().string();

            if (response.code() == HttpStatus.SC_OK) {
                ObjectMapper objectMapper = new ObjectMapper();
                objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
                objectMapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
                discourseTopic = Optional.of(objectMapper.readValue(responseStr, Topic.class));

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return discourseTopic;
    }

    public Optional<Topic> createTopic(TopicCreation topicCreation) {
        String path = "/posts.json";

        Optional<Topic> topic = Optional.ofNullable(new Topic());
        Optional<Post> post = Optional.ofNullable(new Post());

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        try {
            RequestBody body = RequestBody.create(
                    MediaType.parse("application/json"), objectMapper.writeValueAsString(topicCreation));
            Response response = client.newCall(postRequest(path, body)).execute();

            String responseStr = response.body().string();

            log.debug("PROCESS CREATE RESPONSE CODE AND STR - [{}]", response.code());

            if (response.code() == HttpStatus.SC_OK) {
                /*
                 When you create a Topic, the Discourse API will return a Post Object.
                 The function in here try to create a topic, so we can get topicId and do search again to get topic details.
                 */

                post = Optional.of(objectMapper.readValue(responseStr, Post.class));
                if (post.isPresent()) {
                    topic = getTopic(post.get().getTopicId());
                }
            } else {
                throw new DiscourseRuntimeException(responseStr);
            }
        } catch (IOException e) {
            throw new DiscourseRuntimeException(e);
        }

        return topic;
    }


}
