package com.ossez.discourse.common.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Post {

    @JsonProperty(value = "id", required = true)
    private Long id;
    @JsonProperty(value = "username")
    private String userName;
    private String avatarTemplate;
    private String createdAt;
    private String cooked;
    private Integer postNumber;
    private Integer postType;
    private String updatedAt;
    private Integer replyCount;
    private String replyToPostNumber;
    private Integer quoteCount;
    private Integer incomingLinkCount;
    private Integer reads;
    private Integer readersCount;
    private String score;
    private Boolean yours;
    private Long topicId;
    private String topicSlug;
    private String primaryGroupName;
    private String flairName;
    private String flairUrl;
    private String flairBgColor;
    private String flairGroupId;
    private Integer version;
    private Boolean canEdit;
    private Boolean canDelete;
    private Boolean canRecover;
    private Boolean canSeeHiddenPost;
    private Boolean canWiki;
    private String userTitle;
    private Boolean bookmarked;
    private String raw;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAvatarTemplate() {
        return avatarTemplate;
    }

    public void setAvatarTemplate(String avatarTemplate) {
        this.avatarTemplate = avatarTemplate;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getCooked() {
        return cooked;
    }

    public void setCooked(String cooked) {
        this.cooked = cooked;
    }

    public Integer getPostNumber() {
        return postNumber;
    }

    public void setPostNumber(Integer postNumber) {
        this.postNumber = postNumber;
    }

    public Integer getPostType() {
        return postType;
    }

    public void setPostType(Integer postType) {
        this.postType = postType;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(Integer replyCount) {
        this.replyCount = replyCount;
    }

    public String getReplyToPostNumber() {
        return replyToPostNumber;
    }

    public void setReplyToPostNumber(String replyToPostNumber) {
        this.replyToPostNumber = replyToPostNumber;
    }

    public Integer getQuoteCount() {
        return quoteCount;
    }

    public void setQuoteCount(Integer quoteCount) {
        this.quoteCount = quoteCount;
    }

    public Integer getIncomingLinkCount() {
        return incomingLinkCount;
    }

    public void setIncomingLinkCount(Integer incomingLinkCount) {
        this.incomingLinkCount = incomingLinkCount;
    }

    public Integer getReads() {
        return reads;
    }

    public void setReads(Integer reads) {
        this.reads = reads;
    }

    public Integer getReadersCount() {
        return readersCount;
    }

    public void setReadersCount(Integer readersCount) {
        this.readersCount = readersCount;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public Boolean getYours() {
        return yours;
    }

    public void setYours(Boolean yours) {
        this.yours = yours;
    }

    public Long getTopicId() {
        return topicId;
    }

    public void setTopicId(Long topicId) {
        this.topicId = topicId;
    }

    public String getTopicSlug() {
        return topicSlug;
    }

    public void setTopicSlug(String topicSlug) {
        this.topicSlug = topicSlug;
    }

    public String getPrimaryGroupName() {
        return primaryGroupName;
    }

    public void setPrimaryGroupName(String primaryGroupName) {
        this.primaryGroupName = primaryGroupName;
    }

    public String getFlairName() {
        return flairName;
    }

    public void setFlairName(String flairName) {
        this.flairName = flairName;
    }

    public String getFlairUrl() {
        return flairUrl;
    }

    public void setFlairUrl(String flairUrl) {
        this.flairUrl = flairUrl;
    }

    public String getFlairBgColor() {
        return flairBgColor;
    }

    public void setFlairBgColor(String flairBgColor) {
        this.flairBgColor = flairBgColor;
    }

    public String getFlairGroupId() {
        return flairGroupId;
    }

    public void setFlairGroupId(String flairGroupId) {
        this.flairGroupId = flairGroupId;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Boolean getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(Boolean canEdit) {
        this.canEdit = canEdit;
    }

    public Boolean getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
    }

    public Boolean getCanRecover() {
        return canRecover;
    }

    public void setCanRecover(Boolean canRecover) {
        this.canRecover = canRecover;
    }

    public Boolean getCanSeeHiddenPost() {
        return canSeeHiddenPost;
    }

    public void setCanSeeHiddenPost(Boolean canSeeHiddenPost) {
        this.canSeeHiddenPost = canSeeHiddenPost;
    }

    public Boolean getCanWiki() {
        return canWiki;
    }

    public void setCanWiki(Boolean canWiki) {
        this.canWiki = canWiki;
    }

    public String getUserTitle() {
        return userTitle;
    }

    public void setUserTitle(String userTitle) {
        this.userTitle = userTitle;
    }

    public Boolean getBookmarked() {
        return bookmarked;
    }

    public void setBookmarked(Boolean bookmarked) {
        this.bookmarked = bookmarked;
    }

    public String getRaw() {
        return raw;
    }

    public void setRaw(String raw) {
        this.raw = raw;
    }
}


