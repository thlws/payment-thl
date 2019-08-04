package org.thlws.payment.wechat.entity.request.mp;

/**
 * @author HanleyTang
 */
public class MpUserInfoRequest {

    private String access_token;
    private String openid;
    private String lang = "zh_CN";

    public MpUserInfoRequest(String access_token, String openid) {
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

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }
}
