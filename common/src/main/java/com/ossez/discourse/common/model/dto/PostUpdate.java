package com.ossez.discourse.common.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.io.Serializable;

/**
 * PostUpdate Data Object
 *
 * @author YuCheng Hu
 */
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class PostUpdate implements Serializable {

    private static final long serialVersionUID = -227183546475863573L;

    private Long id;
    private String raw;
    private String editReason;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRaw() {
        return raw;
    }

    public void setRaw(String raw) {
        this.raw = raw;
    }

    public String getEditReason() {
        return editReason;
    }

    public void setEditReason(String editReason) {
        this.editReason = editReason;
    }
}
