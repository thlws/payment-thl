package org.thlws.payment.wechat.entity.request.mini;

/**
 * 属性	        类型默认值	必填	说明
 * appid	    string		是	小程序 appId
 * secret	    string		是	小程序 appSecret
 * js_code	    string		是	登录时获取的 code
 * grant_type	string		是	授权类型，此处只需填写 authorization_code
 * @author HanleyTang 2019/9/13
 */
public class Code2SessionRequest {

    private String appId;
    private String secret;
    private String jsCode;
    private String grantType = "authorization_code";

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getJsCode() {
        return jsCode;
    }

    public void setJsCode(String jsCode) {
        this.jsCode = jsCode;
    }

    public String getGrantType() {
        return grantType;
    }

    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }
}
