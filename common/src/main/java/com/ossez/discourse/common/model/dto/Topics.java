package com.ossez.discourse.common.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.experimental.Accessors;

import java.util.List;

public class Topics {

    @JsonProperty(value = "id", required = true)
    private Long topicId;

    @JsonProperty(required = true)
    private String postId;

    @JsonProperty(required = true)
    private String title;

    @JsonProperty(required = true)
    private String raw;

    @JsonProperty(value = "category_id", required = true)
    private Integer category;

    @JsonProperty(value = "image_url")
    private String imageUrl;

    @JsonProperty(value = "word_count")
    private Integer wordCount;

    @JsonProperty(value = "tags")
    private List<String> tags;

    public Long getTopicId() {
        return topicId;
    }

    public void setTopicId(Long topicId) {
        this.topicId = topicId;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRaw() {
        return raw;
    }

    public void setRaw(String raw) {
        this.raw = raw;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getWordCount() {
        return wordCount;
    }

    public void setWordCount(Integer wordCount) {
        this.wordCount = wordCount;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}


