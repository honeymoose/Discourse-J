package com.ossez.discourse.client.service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.ossez.discourse.client.DiscourseClient;
import com.ossez.discourse.common.model.dto.Post;
import com.ossez.discourse.common.model.dto.PostUpdate;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.math.NumberUtils;
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
public class PostsService extends DiscourseClient {
    private final Logger log = LoggerFactory.getLogger(PostsService.class);

    private WeChatOfficialAccountApi weChatOfficialAccountApi;

    private OkHttpClient client = new OkHttpClient();

    public PostsService(String siteUrl, String apiName, String apiKey) {
        DiscourseClient.site_url = siteUrl;
        DiscourseClient.api_username = apiName;
        DiscourseClient.api_key = apiKey;
    }

    /**
     * Get Post Object by search postId
     *
     * @param postId
     * @return
     */
    public Optional<Post> getPost(Long postId) {
        String path = "posts/" + String.valueOf(postId) + ".json";

        Optional<Post> post = Optional.ofNullable(new Post());
        try {
            Response response = client.newCall(getRequest(path)).execute();
            String responseStr = response.body().string();

            if (response.code() == HttpStatus.SC_OK) {
                objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
                objectMapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
                post = Optional.of(objectMapper.readValue(responseStr, Post.class));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return post;
    }

    public Optional<Post> updatePost(PostUpdate postUpdate) {
        if (ObjectUtils.isEmpty(postUpdate.getId()))
            throw new RuntimeException("Post Id is empty, not able to update a post.");

        String path = "posts/" + String.valueOf(postUpdate.getId()) + ".json";

        Optional<Post> post = Optional.ofNullable(new Post());
        try {
            RequestBody body = RequestBody.create(
                    MediaType.parse("application/json"), objectMapper.writeValueAsString(postUpdate));
            Response response = client.newCall(putRequest(path, body)).execute();
            String responseStr = response.body().string();
            JsonNode jsonNode = objectMapper.readTree(responseStr);

            if (response.code() == HttpStatus.SC_OK) {
                objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
                objectMapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);

                if (ObjectUtils.isNotEmpty(jsonNode.get("post"))) {
                    post = Optional.of(objectMapper.treeToValue(jsonNode.get("post"), Post.class));
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return post;
    }


}
