package com.ossez.discourse.common.model.dto;

import java.io.Serializable;
import java.util.List;

public class SuggestedTopics implements Serializable {
    private static final long serialVersionUID = 7382606905010995326L;
    private List<Post> posts;
    private List<Long> stream;

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public List<Long> getStream() {
        return stream;
    }

    public void setStream(List<Long> stream) {
        this.stream = stream;
    }
}


