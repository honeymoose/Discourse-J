package com.ossez.discourse.common.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Topic {

    private PostStream postStream;
    private List<List<Integer>> timelineLookup;
    @JsonProperty(value = "id", required = true)
    private Long id;
    @JsonProperty(required = true)
    private String title;
    private String fancyTitle;
    private Integer postsCount;
    private String createdAt;
    private Integer views;
    private Integer replyCount;
    private Integer likeCount;
    private String lastPostedAt;
    private Boolean visible;
    private Boolean closed;
    private Boolean archived;
    private Boolean hasSummary;
    private String archetype;
    private String slug;
    private Integer categoryId;
    private Integer wordCount;
    private String deletedAt;
    private Long userId;
    private String featuredLink;
    private Boolean pinnedGlobally;
    private String pinnedAt;
    private String pinnedUntil;
    private String imageUrl;
    private Integer slowModeSeconds;
    private String draft;
    private String draftKey;
    private Integer draftSequence;
    private String unpinned;
    private Boolean pinned;
    private Integer currentPostNumber;
    private Integer highestPostNumber;
    private String deletedBy;
    private Boolean hasDeleted;
    private List<ActionsSummary> actionsSummary;
    private Integer chunkSize;
    private Boolean bookmarked;
    private String bookmarks;
    private String topicTimer;
    private Long messageBus_LastId;
    private Integer participantCount;
    private Boolean showReadIndicator;
    private String thumbnails;
    private String slowModeEnabledUUntil;
    private Boolean summarizable;


    public PostStream getPostStream() {
        return postStream;
    }

    public void setPostStream(PostStream postStream) {
        this.postStream = postStream;
    }

    public List<List<Integer>> getTimelineLookup() {
        return timelineLookup;
    }

    public void setTimelineLookup(List<List<Integer>> timelineLookup) {
        this.timelineLookup = timelineLookup;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFancyTitle() {
        return fancyTitle;
    }

    public void setFancyTitle(String fancyTitle) {
        this.fancyTitle = fancyTitle;
    }

    public Integer getPostsCount() {
        return postsCount;
    }

    public void setPostsCount(Integer postsCount) {
        this.postsCount = postsCount;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Integer getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(Integer replyCount) {
        this.replyCount = replyCount;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public String getLastPostedAt() {
        return lastPostedAt;
    }

    public void setLastPostedAt(String lastPostedAt) {
        this.lastPostedAt = lastPostedAt;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public Boolean getClosed() {
        return closed;
    }

    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public Boolean getHasSummary() {
        return hasSummary;
    }

    public void setHasSummary(Boolean hasSummary) {
        this.hasSummary = hasSummary;
    }

    public String getArchetype() {
        return archetype;
    }

    public void setArchetype(String archetype) {
        this.archetype = archetype;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getWordCount() {
        return wordCount;
    }

    public void setWordCount(Integer wordCount) {
        this.wordCount = wordCount;
    }

    public String getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(String deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFeaturedLink() {
        return featuredLink;
    }

    public void setFeaturedLink(String featuredLink) {
        this.featuredLink = featuredLink;
    }

    public Boolean getPinnedGlobally() {
        return pinnedGlobally;
    }

    public void setPinnedGlobally(Boolean pinnedGlobally) {
        this.pinnedGlobally = pinnedGlobally;
    }

    public String getPinnedAt() {
        return pinnedAt;
    }

    public void setPinnedAt(String pinnedAt) {
        this.pinnedAt = pinnedAt;
    }

    public String getPinnedUntil() {
        return pinnedUntil;
    }

    public void setPinnedUntil(String pinnedUntil) {
        this.pinnedUntil = pinnedUntil;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getSlowModeSeconds() {
        return slowModeSeconds;
    }

    public void setSlowModeSeconds(Integer slowModeSeconds) {
        this.slowModeSeconds = slowModeSeconds;
    }

    public String getDraft() {
        return draft;
    }

    public void setDraft(String draft) {
        this.draft = draft;
    }

    public String getDraftKey() {
        return draftKey;
    }

    public void setDraftKey(String draftKey) {
        this.draftKey = draftKey;
    }

    public Integer getDraftSequence() {
        return draftSequence;
    }

    public void setDraftSequence(Integer draftSequence) {
        this.draftSequence = draftSequence;
    }

    public String getUnpinned() {
        return unpinned;
    }

    public void setUnpinned(String unpinned) {
        this.unpinned = unpinned;
    }

    public Boolean getPinned() {
        return pinned;
    }

    public void setPinned(Boolean pinned) {
        this.pinned = pinned;
    }

    public Integer getCurrentPostNumber() {
        return currentPostNumber;
    }

    public void setCurrentPostNumber(Integer currentPostNumber) {
        this.currentPostNumber = currentPostNumber;
    }

    public Integer getHighestPostNumber() {
        return highestPostNumber;
    }

    public void setHighestPostNumber(Integer highestPostNumber) {
        this.highestPostNumber = highestPostNumber;
    }

    public String getDeletedBy() {
        return deletedBy;
    }

    public void setDeletedBy(String deletedBy) {
        this.deletedBy = deletedBy;
    }

    public Boolean getHasDeleted() {
        return hasDeleted;
    }

    public void setHasDeleted(Boolean hasDeleted) {
        this.hasDeleted = hasDeleted;
    }

    public List<ActionsSummary> getActionsSummary() {
        return actionsSummary;
    }

    public void setActionsSummary(List<ActionsSummary> actionsSummary) {
        this.actionsSummary = actionsSummary;
    }

    public Integer getChunkSize() {
        return chunkSize;
    }

    public void setChunkSize(Integer chunkSize) {
        this.chunkSize = chunkSize;
    }

    public Boolean getBookmarked() {
        return bookmarked;
    }

    public void setBookmarked(Boolean bookmarked) {
        this.bookmarked = bookmarked;
    }

    public String getBookmarks() {
        return bookmarks;
    }

    public void setBookmarks(String bookmarks) {
        this.bookmarks = bookmarks;
    }

    public String getTopicTimer() {
        return topicTimer;
    }

    public void setTopicTimer(String topicTimer) {
        this.topicTimer = topicTimer;
    }

    public Long getMessageBus_LastId() {
        return messageBus_LastId;
    }

    public void setMessageBus_LastId(Long messageBus_LastId) {
        this.messageBus_LastId = messageBus_LastId;
    }

    public Integer getParticipantCount() {
        return participantCount;
    }

    public void setParticipantCount(Integer participantCount) {
        this.participantCount = participantCount;
    }

    public Boolean getShowReadIndicator() {
        return showReadIndicator;
    }

    public void setShowReadIndicator(Boolean showReadIndicator) {
        this.showReadIndicator = showReadIndicator;
    }

    public String getThumbnails() {
        return thumbnails;
    }

    public void setThumbnails(String thumbnails) {
        this.thumbnails = thumbnails;
    }

    public String getSlowModeEnabledUUntil() {
        return slowModeEnabledUUntil;
    }

    public void setSlowModeEnabledUUntil(String slowModeEnabledUUntil) {
        this.slowModeEnabledUUntil = slowModeEnabledUUntil;
    }

    public Boolean getSummarizable() {
        return summarizable;
    }

    public void setSummarizable(Boolean summarizable) {
        this.summarizable = summarizable;
    }
}


