package com.ossez.discourse.common.model.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

import java.io.Serializable;

/**
 * CustomMessage
 *
 * @author YuCheng
 */
public class DataCubeRequest implements Serializable {
    private static final long serialVersionUID = -9196732086954365246L;

    @NotNull
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
