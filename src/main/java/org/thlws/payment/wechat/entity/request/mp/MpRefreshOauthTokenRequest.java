package org.thlws.payment.wechat.entity.request.mp;

/**
 * @author HanleyTang
 * @date 2018-12-08
 */
public class MpRefreshOauthTokenRequest {

    private String appid;
    private String refresh_token;
    private String grant_type = "refresh_token";

    public MpRefreshOauthTokenRequest(String appid, String refresh_token) {
        this.appid = appid;
        this.refresh_token = refresh_token;
    }

    public MpRefreshOauthTokenRequest() {
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    public String getGrant_type() {
        return grant_type;
    }

    public void setGrant_type(String grant_type) {
        this.grant_type = grant_type;
    }
}
