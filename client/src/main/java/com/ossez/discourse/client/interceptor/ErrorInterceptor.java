package com.ossez.discourse.client.interceptor;

import com.ossez.discourse.common.constant.HttpClientMediaType;
import okhttp3.*;
import okio.BufferedSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * The reason we have Interceptor here was because will return code 200 with error message.
 * <p>
 * For example, if we have error secret and try to get access token.
 * WeChat will return code 200 success with json error message like:
 *
 * <pre>
 *   {"errcode":40125,"errmsg":"invalid appsecret rid: 63cf14c3-1af7da21-37efbc86"}
 * </pre>
 * <p>
 * We need to check the response content, if the response content has errcode.
 * We Interceptor response with error code 400 and add error json format to response body.
 *
 * @author YuCheng Hu
 */
public class ErrorInterceptor implements Interceptor {

    final static Logger log = LoggerFactory.getLogger(ErrorInterceptor.class);

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Response response = chain.proceed(request);

        ResponseBody responseBody = response.body();
        BufferedSource source = responseBody.source();
        source.request(Long.MAX_VALUE); // Buffer the entire body.
        String responseStr = source.getBuffer().clone().readString(StandardCharsets.UTF_8).toString();

        log.debug("WeChat Response String - {}",responseStr);

//        if (hasError(responseStr) ) {
//                responseBody = ResponseBody.create(MediaType.get(HttpClientMediaType.APPLICATION_JSON), responseStr);
//                return response.newBuilder().code(400).body(responseBody).build();
//        }

        return response;
    }
}
