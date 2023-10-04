package com.ossez.discourse.client.service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.ossez.discourse.client.DiscourseClient;
import com.ossez.discourse.common.model.dto.Post;
import okhttp3.OkHttpClient;
import okhttp3.Response;
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
}
