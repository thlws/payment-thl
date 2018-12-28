package org.thlws.payment.wechat.entity.extra;

/**
 * scope取值为:snsapi_base[无需用户授权] 或 userinfo[需用户授权]
 * Created by  HanleyTang on 2018-12-25
 */
public enum AuthorizeType {

    snsapi_base("snsapi_base"),
    userinfo("userinfo");

    public final String value;

    AuthorizeType(String value) {
        this.value = value;
    }
}
