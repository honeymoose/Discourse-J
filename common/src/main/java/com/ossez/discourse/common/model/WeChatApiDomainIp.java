package com.ossez.discourse.common.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * WeChatAccessToken Response Object
 *
 * @author YuCheng Hu
 */

public class WeChatApiDomainIp {


    @JsonProperty("ip_list")
    private List<String> ipList;

    public List<String> getIpList() {
        return ipList;
    }

    public void setIpList(List<String> ipList) {
        this.ipList = ipList;
    }
}
