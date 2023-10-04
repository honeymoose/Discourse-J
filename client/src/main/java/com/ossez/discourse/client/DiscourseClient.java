package com.ossez.discourse.client;


import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;

/**
 *
 */
public abstract class DiscourseClient {
    public static String site_url = "https://www.zchub.net/";// base url. e.g. http://your_discourse_domain.com
    public static String api_key = "";
    public static String api_username = "";
    public  ObjectMapper objectMapper = new ObjectMapper();
    public Request getRequest(String path) {
        HttpUrl.Builder urlBuilder = HttpUrl.parse(site_url + path).newBuilder();
        Request request = new Request.Builder().url(urlBuilder.build().toString())
                .addHeader("api-username", api_username)
                .addHeader("api-key", api_key)
                .build();

        return request;
    }

    public Request postRequest(String path, RequestBody body) {
        HttpUrl.Builder urlBuilder = HttpUrl.parse(site_url + path).newBuilder();
        Request request = new Request.Builder().url(urlBuilder.build().toString())
                .addHeader("api-username", api_username)
                .addHeader("api-key", api_key)
                .post(body)
                .build();
        return request;
    }

}
