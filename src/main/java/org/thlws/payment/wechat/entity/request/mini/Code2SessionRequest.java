package org.thlws.payment.wechat.entity.request.mini;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 属性	        类型默认值	必填	说明
 * appid	    string		是	小程序 appId
 * secret	    string		是	小程序 appSecret
 * js_code	    string		是	登录时获取的 code
 * grant_type	string		是	授权类型，此处只需填写 authorization_code
 * @author HanleyTang 2019/9/13
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Code2SessionRequest {

    private String appId;
    private String secret;
    private String jsCode;
    private String grantType = "authorization_code";

}
