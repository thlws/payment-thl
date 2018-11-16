package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑广告系统推广详情
 *
 * @author auto create
 * @since 1.0, 2017-01-13 18:49:18
 */
public class KbAdvertAdvResponse extends AlipayObject {

	private static final long serialVersionUID = 6789248472166767828L;

	/**
	 * 推广ID
	 */
	@ApiField("adv_id")
	private String advId;

	/**
	 * 指定推广活动的名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 单张券推广
只有type=single_voucher才会有值
	 */
	@ApiField("single_voucher")
	private KbAdvertAdvSingleVoucherResponse singleVoucher;

	/**
	 * 推广类型
	 */
	@ApiField("type")
	private String type;

    /**
     * Gets adv id.
     *
     * @return the adv id
     */
    public String getAdvId() {
		return this.advId;
	}

    /**
     * Sets adv id.
     *
     * @param advId the adv id
     */
    public void setAdvId(String advId) {
		this.advId = advId;
	}

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
		return this.name;
	}

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
		this.name = name;
	}

    /**
     * Gets single voucher.
     *
     * @return the single voucher
     */
    public KbAdvertAdvSingleVoucherResponse getSingleVoucher() {
		return this.singleVoucher;
	}

    /**
     * Sets single voucher.
     *
     * @param singleVoucher the single voucher
     */
    public void setSingleVoucher(KbAdvertAdvSingleVoucherResponse singleVoucher) {
		this.singleVoucher = singleVoucher;
	}

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
		return this.type;
	}

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
		this.type = type;
	}

}
