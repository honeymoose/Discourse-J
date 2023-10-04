package com.ossez.discourse.client.service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ossez.discourse.common.model.dto.Topic;
import com.ossez.discourse.client.DiscourseClient;
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
                discourseTopic = Optional.of(objectMapper.readValue(responseStr, Topic.class));

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return discourseTopic;
    }


}
