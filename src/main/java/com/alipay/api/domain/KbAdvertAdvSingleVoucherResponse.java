package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑广告系统推广详情(单张券)
 *
 * @author auto create
 * @since 1.0, 2017-01-16 16:13:33
 */
public class KbAdvertAdvSingleVoucherResponse extends AlipayObject {

	private static final long serialVersionUID = 2728826251413693497L;

	/**
	 * 广告内容模型
	 */
	@ApiListField("adv_content_list")
	@ApiField("kb_advert_adv_content_response")
	private List<KbAdvertAdvContentResponse> advContentList;

	/**
	 * 广告内容（广告内容请使用新的属性adv_content_list，此属性仍会保留）
	 */
	@ApiField("content")
	private KbAdvertAdvContent content;

	/**
	 * 券标的
	 */
	@ApiField("voucher")
	private KbAdvertSubjectVoucherResponse voucher;

    /**
     * Gets adv content list.
     *
     * @return the adv content list
     */
    public List<KbAdvertAdvContentResponse> getAdvContentList() {
		return this.advContentList;
	}

    /**
     * Sets adv content list.
     *
     * @param advContentList the adv content list
     */
    public void setAdvContentList(List<KbAdvertAdvContentResponse> advContentList) {
		this.advContentList = advContentList;
	}

    /**
     * Gets content.
     *
     * @return the content
     */
    public KbAdvertAdvContent getContent() {
		return this.content;
	}

    /**
     * Sets content.
     *
     * @param content the content
     */
    public void setContent(KbAdvertAdvContent content) {
		this.content = content;
	}

    /**
     * Gets voucher.
     *
     * @return the voucher
     */
    public KbAdvertSubjectVoucherResponse getVoucher() {
		return this.voucher;
	}

    /**
     * Sets voucher.
     *
     * @param voucher the voucher
     */
    public void setVoucher(KbAdvertSubjectVoucherResponse voucher) {
		this.voucher = voucher;
	}

}
