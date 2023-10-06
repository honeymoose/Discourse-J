package com.ossez.discourse.common.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.io.Serializable;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class PostCreation extends Creation implements Serializable {

    private static final long serialVersionUID = 5896160842728180229L;

    @JsonProperty(required = true)
    private Long topicId;
    private Long replyToPostNumber;


    public Long getTopicId() {
        return topicId;
    }

    public void setTopicId(Long topicId) {
        this.topicId = topicId;
    }

    public Long getReplyToPostNumber() {
        return replyToPostNumber;
    }

    public void setReplyToPostNumber(Long replyToPostNumber) {
        this.replyToPostNumber = replyToPostNumber;
    }
}


