package com.ossez.discourse.client.service;

import com.ossez.discourse.common.model.WeChatApiDomainIp;
import com.ossez.discourse.common.model.WeChatStatus;
import com.ossez.discourse.common.model.req.CustomMessage;
import com.ossez.discourse.common.model.req.DataCubeRequest;
import com.ossez.discourse.common.model.req.NetworkCheck;
import com.ossez.discourse.common.model.dto.PostUpdate;
import com.ossez.discourse.common.model.res.DataCubeArticle;
import com.ossez.discourse.common.model.res.DataCubeUser;
import com.ossez.discourse.common.model.res.NetworkCheckResponse;
import com.ossez.discourse.common.model.res.QueryQuotaResponse;
import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface WeChatOfficialAccountApi {

    @GET("/cgi-bin/get_api_domain_ip")
    Single<WeChatApiDomainIp> getDomainIPs();

    @POST("/cgi-bin/callback/check")
    Single<NetworkCheckResponse> checkNetwork(@Body NetworkCheck request);

    @POST("/cgi-bin/clear_quota")
    Single<NetworkCheckResponse> clearQuota(@Body NetworkCheck request);

    @POST("/cgi-bin/openapi/quota/get")
    Single<QueryQuotaResponse> queryQuota(@Body PostUpdate request);

    @POST("/cgi-bin/message/custom/send")
    Single<WeChatStatus> sendMessage(@Body CustomMessage customMessage);

    // MENU
    @GET("/cgi-bin/get_current_selfmenu_info")
    Single<WeChatStatus> getMenu();

    // DATA ANALYST
    @POST("/datacube/getusersummary")
    Single<DataCubeUser> getUserSummary(@Body DataCubeRequest dataCubeRequest);

    @POST("/datacube/getusercumulate")
    Single<DataCubeUser> getUserCumulate(@Body DataCubeRequest dataCubeRequest);

    @POST("/datacube/getarticlesummary")
    Single<DataCubeArticle> getarticlesummary(@Body DataCubeRequest dataCubeRequest);

    @POST("/datacube/getarticletotal")
    Single<DataCubeUser> getarticletotal(@Body DataCubeRequest dataCubeRequest);

    @POST("/datacube/getuserread")
    Single<DataCubeUser> getuserread(@Body DataCubeRequest dataCubeRequest);

    @POST("/datacube/getuserreadhour")
    Single<DataCubeUser> getuserreadhour(@Body DataCubeRequest dataCubeRequest);

    @POST("/datacube/getusershare")
    Single<DataCubeUser> getusershare(@Body DataCubeRequest dataCubeRequest);

    @POST("/datacube/getusersharehour")
    Single<DataCubeUser> getusersharehour(@Body DataCubeRequest dataCubeRequest);
}