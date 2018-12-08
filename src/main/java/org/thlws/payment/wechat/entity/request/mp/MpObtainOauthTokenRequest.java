package org.thlws.payment.wechat.entity.request.mp;

/**
 * 获取AccessToken请求对象
 * @author HanleyTang
 * @date 2018-12-08
 */
public class MpObtainOauthTokenRequest {

    private String appid;
    private String secret;
    private String code;
    private String grant_type = "authorization_code";

    public MpObtainOauthTokenRequest(String appid, String secret, String code) {
        this.appid = appid;
        this.secret = secret;
        this.code = code;
    }

    public MpObtainOauthTokenRequest() {
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getGrant_type() {
        return grant_type;
    }

    public void setGrant_type(String grant_type) {
        this.grant_type = grant_type;
    }
}
