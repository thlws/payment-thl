package org.thlws.payment.wechat.entity.request.mp;

/**
 * @author HanleyTang
 */
public class MpValidOauthTokenRequest {

    private String access_token;
    private String openid;

    public MpValidOauthTokenRequest() {
    }

    public MpValidOauthTokenRequest(String access_token, String openid) {
        this.access_token = access_token;
        this.openid = openid;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }
}
