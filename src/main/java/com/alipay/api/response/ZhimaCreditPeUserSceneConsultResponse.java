package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.user.scene.consult response.
 *
 * @author auto create
 * @since 1.0, 2018-09-11 17:00:33
 */
public class ZhimaCreditPeUserSceneConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 8698543961864689446L;

	/** 
	 * 展示给C看的文案，json格式字符串
	 */
	@ApiField("display_msg")
	private String displayMsg;

	/** 
	 * 在该信用场景下是否已签约
	 */
	@ApiField("open")
	private Boolean open;

	/** 
	 * 用户在该场景下能否享用免押，返回true：可享受免押，返回false：不可享受免押
	 */
	@ApiField("permit")
	private Boolean permit;

	/** 
	 * 拒绝码，只有当permit为false时，才有值
	 */
	@ApiField("refuse_code")
	private String refuseCode;

	/** 
	 * 拒绝原因描述，只有在permit=false时，才会返回该信息
	 */
	@ApiField("refuse_msg")
	private String refuseMsg;

	/** 
	 * 芝麻咨询单号，业务处理成功后，芝麻返回该字段，实际使用时请注意保存该字段
	 */
	@ApiField("risk_order_no")
	private String riskOrderNo;

	/** 
	 * 盖帽额度，取值范围[0.01,100000000]，精确到小数点后2位
	 */
	@ApiField("top_amount")
	private String topAmount;

	/** 
	 * 可免押盖帽物品件数
	 */
	@ApiField("top_goods_count")
	private Long topGoodsCount;

    /**
     * Sets display msg.
     *
     * @param displayMsg the display msg
     */
    public void setDisplayMsg(String displayMsg) {
		this.displayMsg = displayMsg;
	}

    /**
     * Gets display msg.
     *
     * @return the display msg
     */
    public String getDisplayMsg( ) {
		return this.displayMsg;
	}

    /**
     * Sets open.
     *
     * @param open the open
     */
    public void setOpen(Boolean open) {
		this.open = open;
	}

    /**
     * Gets open.
     *
     * @return the open
     */
    public Boolean getOpen( ) {
		return this.open;
	}

    /**
     * Sets permit.
     *
     * @param permit the permit
     */
    public void setPermit(Boolean permit) {
		this.permit = permit;
	}

    /**
     * Gets permit.
     *
     * @return the permit
     */
    public Boolean getPermit( ) {
		return this.permit;
	}

    /**
     * Sets refuse code.
     *
     * @param refuseCode the refuse code
     */
    public void setRefuseCode(String refuseCode) {
		this.refuseCode = refuseCode;
	}

    /**
     * Gets refuse code.
     *
     * @return the refuse code
     */
    public String getRefuseCode( ) {
		return this.refuseCode;
	}

    /**
     * Sets refuse msg.
     *
     * @param refuseMsg the refuse msg
     */
    public void setRefuseMsg(String refuseMsg) {
		this.refuseMsg = refuseMsg;
	}

    /**
     * Gets refuse msg.
     *
     * @return the refuse msg
     */
    public String getRefuseMsg( ) {
		return this.refuseMsg;
	}

    /**
     * Sets risk order no.
     *
     * @param riskOrderNo the risk order no
     */
    public void setRiskOrderNo(String riskOrderNo) {
		this.riskOrderNo = riskOrderNo;
	}

    /**
     * Gets risk order no.
     *
     * @return the risk order no
     */
    public String getRiskOrderNo( ) {
		return this.riskOrderNo;
	}

    /**
     * Sets top amount.
     *
     * @param topAmount the top amount
     */
    public void setTopAmount(String topAmount) {
		this.topAmount = topAmount;
	}

    /**
     * Gets top amount.
     *
     * @return the top amount
     */
    public String getTopAmount( ) {
		return this.topAmount;
	}

    /**
     * Sets top goods count.
     *
     * @param topGoodsCount the top goods count
     */
    public void setTopGoodsCount(Long topGoodsCount) {
		this.topGoodsCount = topGoodsCount;
	}

    /**
     * Gets top goods count.
     *
     * @return the top goods count
     */
    public Long getTopGoodsCount( ) {
		return this.topGoodsCount;
	}

}
