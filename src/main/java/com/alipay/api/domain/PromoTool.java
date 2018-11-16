package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销工具
 *
 * @author auto create
 * @since 1.0, 2017-10-10 11:24:31
 */
public class PromoTool extends AlipayObject {

	private static final long serialVersionUID = 5414648716295428621L;

	/**
	 * 集点卡工具，仅在活动类型为POINT_SEND时才有效且必填，其他活动类型此字段必须为null
	 */
	@ApiField("point_card")
	private PointCard pointCard;

	/**
	 * 奖品发放的规则
	 */
	@ApiField("send_rule")
	private SendRule sendRule;

	/**
	 * 单个营销工具的生效状态，当在招商部分券失效后会使用这个字段
	 */
	@ApiField("status")
	private String status;

	/**
	 * 券对象，当活动类型为POINT_SEND时为null，其他活动类型此字段必填
	 */
	@ApiField("voucher")
	private Voucher voucher;

	/**
	 * 营销工具uid,创建营销活动时无需设置
	 */
	@ApiField("voucher_no")
	private String voucherNo;

    /**
     * Gets point card.
     *
     * @return the point card
     */
    public PointCard getPointCard() {
		return this.pointCard;
	}

    /**
     * Sets point card.
     *
     * @param pointCard the point card
     */
    public void setPointCard(PointCard pointCard) {
		this.pointCard = pointCard;
	}

    /**
     * Gets send rule.
     *
     * @return the send rule
     */
    public SendRule getSendRule() {
		return this.sendRule;
	}

    /**
     * Sets send rule.
     *
     * @param sendRule the send rule
     */
    public void setSendRule(SendRule sendRule) {
		this.sendRule = sendRule;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
		return this.status;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

    /**
     * Gets voucher.
     *
     * @return the voucher
     */
    public Voucher getVoucher() {
		return this.voucher;
	}

    /**
     * Sets voucher.
     *
     * @param voucher the voucher
     */
    public void setVoucher(Voucher voucher) {
		this.voucher = voucher;
	}

    /**
     * Gets voucher no.
     *
     * @return the voucher no
     */
    public String getVoucherNo() {
		return this.voucherNo;
	}

    /**
     * Sets voucher no.
     *
     * @param voucherNo the voucher no
     */
    public void setVoucherNo(String voucherNo) {
		this.voucherNo = voucherNo;
	}

}
