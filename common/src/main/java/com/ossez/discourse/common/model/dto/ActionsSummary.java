package com.ossez.discourse.common.model.dto;

import java.io.Serializable;

/**
 * actions_summary JSON Objet
 *
 * @author YuCheng
 */
public class ActionsSummary implements Serializable {
    private static final long serialVersionUID = 6968673707557955512L;
    private Long id;
    private Integer count;
    private Boolean hidden;
    private Boolean canAct;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public Boolean getCanAct() {
        return canAct;
    }

    public void setCanAct(Boolean canAct) {
        this.canAct = canAct;
    }
}


