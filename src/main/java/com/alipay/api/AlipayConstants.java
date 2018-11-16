/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2012 All Rights Reserved.
 */
package com.alipay.api;

/**
 * The type Alipay constants.
 *
 * @author runzhi
 */
public class AlipayConstants {

    /**
     * The constant SIGN_TYPE.
     */
    public static final String SIGN_TYPE                      = "sign_type";

    /**
     * The constant SIGN_TYPE_RSA.
     */
    public static final String SIGN_TYPE_RSA                  = "RSA";

    /**
     * sha256WithRsa 算法请求类型
     */
    public static final String SIGN_TYPE_RSA2                 = "RSA2";

    /**
     * The constant SIGN_ALGORITHMS.
     */
    public static final String SIGN_ALGORITHMS                = "SHA1WithRSA";

    /**
     * The constant SIGN_SHA256RSA_ALGORITHMS.
     */
    public static final String SIGN_SHA256RSA_ALGORITHMS      = "SHA256WithRSA";

    /**
     * The constant ENCRYPT_TYPE_AES.
     */
    public static final String ENCRYPT_TYPE_AES               = "AES";

    /**
     * The constant APP_ID.
     */
    public static final String APP_ID                         = "app_id";

    /**
     * The constant FORMAT.
     */
    public static final String FORMAT                         = "format";

    /**
     * The constant METHOD.
     */
    public static final String METHOD                         = "method";

    /**
     * The constant TIMESTAMP.
     */
    public static final String TIMESTAMP                      = "timestamp";

    /**
     * The constant VERSION.
     */
    public static final String VERSION                        = "version";

    /**
     * The constant SIGN.
     */
    public static final String SIGN                           = "sign";

    /**
     * The constant ALIPAY_SDK.
     */
    public static final String ALIPAY_SDK                     = "alipay_sdk";

    /**
     * The constant ACCESS_TOKEN.
     */
    public static final String ACCESS_TOKEN                   = "auth_token";

    /**
     * The constant APP_AUTH_TOKEN.
     */
    public static final String APP_AUTH_TOKEN                 = "app_auth_token";

    /**
     * The constant TERMINAL_TYPE.
     */
    public static final String TERMINAL_TYPE                  = "terminal_type";

    /**
     * The constant TERMINAL_INFO.
     */
    public static final String TERMINAL_INFO                  = "terminal_info";

    /**
     * The constant CHARSET.
     */
    public static final String CHARSET                        = "charset";

    /**
     * The constant NOTIFY_URL.
     */
    public static final String NOTIFY_URL                     = "notify_url";

    /**
     * The constant RETURN_URL.
     */
    public static final String RETURN_URL                     = "return_url";

    /**
     * The constant ENCRYPT_TYPE.
     */
    public static final String ENCRYPT_TYPE                   = "encrypt_type";

    //-----===-------///

    /**
     * The constant BIZ_CONTENT_KEY.
     */
    public static final String BIZ_CONTENT_KEY                = "biz_content";

    /**
     * 默认时间格式
     */
    public static final String DATE_TIME_FORMAT               = "yyyy-MM-dd HH:mm:ss";

    /**
     * Date默认时区
     */
    public static final String DATE_TIMEZONE                  = "GMT+8";

    /**
     * UTF-8字符集
     */
    public static final String CHARSET_UTF8                   = "UTF-8";

    /**
     * GBK字符集
     */
    public static final String CHARSET_GBK                    = "GBK";

    /**
     * JSON 应格式
     */
    public static final String FORMAT_JSON                    = "json";

    /**
     * XML 应格式
     */
    public static final String FORMAT_XML                     = "xml";

    /**
     * SDK版本号
     */
    public static final String SDK_VERSION                    = "alipay-sdk-java-3.3.87.ALL";

    /**
     * The constant PROD_CODE.
     */
    public static final String PROD_CODE                      = "prod_code";

    /**
     * 老版本失败节点
     */
    public static final String ERROR_RESPONSE                 = "error_response";

    /**
     * 新版本节点后缀
     */
    public static final String RESPONSE_SUFFIX                = "_response";

    /**
     * 加密后XML返回报文的节点名字
     */
    public static final String RESPONSE_XML_ENCRYPT_NODE_NAME = "response_encrypted";

}
