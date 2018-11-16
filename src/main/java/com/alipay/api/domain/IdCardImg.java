package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 证件图片信息
 *
 * @author auto create
 * @since 1.0, 2018-04-20 09:30:36
 */
public class IdCardImg extends AlipayObject {

	private static final long serialVersionUID = 1184778568923158612L;

	/**
	 * 证件类型，营业执照：businessLicense，身份证：IDCARD
	 */
	@ApiField("cardtype")
	private String cardtype;

	/**
	 * 图片地址，支持一个证件的多页照片同时传入，key:页码，value:图片地址。页码从1开始递增，身份证人脸面为1，国徽面为2。
图片地址若是oss地址的话，将bucket的名称组装到path里
	 */
	@ApiField("imgurls")
	private String imgurls;

	/**
	 * 图片地址类型，SFS 或OSS
	 */
	@ApiField("imgurltype")
	private String imgurltype;

    /**
     * Gets cardtype.
     *
     * @return the cardtype
     */
    public String getCardtype() {
		return this.cardtype;
	}

    /**
     * Sets cardtype.
     *
     * @param cardtype the cardtype
     */
    public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}

    /**
     * Gets imgurls.
     *
     * @return the imgurls
     */
    public String getImgurls() {
		return this.imgurls;
	}

    /**
     * Sets imgurls.
     *
     * @param imgurls the imgurls
     */
    public void setImgurls(String imgurls) {
		this.imgurls = imgurls;
	}

    /**
     * Gets imgurltype.
     *
     * @return the imgurltype
     */
    public String getImgurltype() {
		return this.imgurltype;
	}

    /**
     * Sets imgurltype.
     *
     * @param imgurltype the imgurltype
     */
    public void setImgurltype(String imgurltype) {
		this.imgurltype = imgurltype;
	}

}
