package org.thlws.payment.wechat.config;

/**
 * 微信相关配置
 *
 * @author Hanley | hanley@thlws.com
 * @version 1.0
 */
public class WechatConfig {

	/** 编码格式 */
	public static String INPUT_CHARSET = "UTF-8";

	/** 加密方式 */
	public static final String SIGN_TYPE = "MD5";

	/** 数字证书 */
	public static final String PKCS12 = "PKCS12";

    /** 加密协议 */
    public static final String [] SUPPORTED_PROTOCOLS = new String[] { "TLSv1" };

}
