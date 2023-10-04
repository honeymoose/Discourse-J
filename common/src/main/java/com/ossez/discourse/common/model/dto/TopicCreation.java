package com.ossez.discourse.common.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class TopicCreation extends Creation implements Serializable {

    private static final long serialVersionUID = -8992308064707164065L;

    @JsonProperty(required = true)
    private String title;
    private Integer category;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }
}


