package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金明细模型
 *
 * @author auto create
 * @since 1.0, 2017-07-07 11:36:57
 */
public class FundItemAOPModel extends AlipayObject {

	private static final long serialVersionUID = 5152731272155436527L;

	/**
	 * 财务外部单据号
	 */
	@ApiField("acctrans_out_biz_no")
	private String acctransOutBizNo;

	/**
	 * 资金变动金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 资产类型编码
	 */
	@ApiField("assert_type_code")
	private String assertTypeCode;

	/**
	 * 银行卡支付工具类型
	 */
	@ApiField("bank_card_pay_type")
	private String bankCardPayType;

	/**
	 * 银行卡类型
	 */
	@ApiField("bank_card_type")
	private String bankCardType;

	/**
	 * 业务ID
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务号
	 */
	@ApiField("biz_in_no")
	private String bizInNo;

	/**
	 * 业务外部流水号
	 */
	@ApiField("biz_out_no")
	private String bizOutNo;

	/**
	 * 业务类型（枚举值对应的code）
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 币种（数字形式）
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 充退金额
	 */
	@ApiField("dback_amount")
	private String dbackAmount;

	/**
	 * 退款申请时间
	 */
	@ApiField("dback_gmt_create")
	private Date dbackGmtCreate;

	/**
	 * 实际/预估银行响应时间
	 */
	@ApiField("dback_gmt_est_bk_ack")
	private Date dbackGmtEstBkAck;

	/**
	 * 预估银行入账时间
	 */
	@ApiField("dback_gmt_est_bk_into")
	private Date dbackGmtEstBkInto;

	/**
	 * 充值账户名
	 */
	@ApiField("dback_inst_account_name")
	private String dbackInstAccountName;

	/**
	 * 充值卡号（后四位）
	 */
	@ApiField("dback_inst_account_no")
	private String dbackInstAccountNo;

	/**
	 * 机构ID
	 */
	@ApiField("dback_inst_id")
	private String dbackInstId;

	/**
	 * 机构名称
	 */
	@ApiField("dback_inst_name")
	private String dbackInstName;

	/**
	 * 统一支付资金条目ID
	 */
	@ApiField("fid")
	private String fid;

	/**
	 * 面向系统的资金工具接入类型
	 */
	@ApiField("fund_access_type")
	private Long fundAccessType;

	/**
	 * 资金账号。可以是支付宝主卡账号，子卡账号，银行卡号等等。
	 */
	@ApiField("fund_account_no")
	private String fundAccountNo;

	/**
	 * 资金业务类型枚举
	 */
	@ApiField("fund_biz_type")
	private Long fundBizType;

	/**
	 * 资金明细创建时间
	 */
	@ApiField("fund_create_time")
	private Date fundCreateTime;

	/**
	 * 资金变动完成时间
	 */
	@ApiField("fund_finish_time")
	private Date fundFinishTime;

	/**
	 * 资金流向枚举
	 */
	@ApiField("fund_in_out")
	private Long fundInOut;

	/**
	 * 资金工具机构
	 */
	@ApiField("fund_inst_id")
	private String fundInstId;

	/**
	 * 资金明细最后修改时间
	 */
	@ApiField("fund_modify_time")
	private Date fundModifyTime;

	/**
	 * 资金状态
	 */
	@ApiField("fund_status")
	private String fundStatus;

	/**
	 * 该资金变动的资金工具是否为ownerCardNo所拥有
	 */
	@ApiField("fund_tool_belong_to_crowner")
	private Boolean fundToolBelongToCrowner;

	/**
	 * fundToolBelongToCROwner为false时，该字段记录资金工具的实际拥有者
	 */
	@ApiField("fund_tool_owner_card_no")
	private String fundToolOwnerCardNo;

	/**
	 * 面向用户的资金工具类型
	 */
	@ApiField("fund_tool_type_for_crowner")
	private String fundToolTypeForCrowner;

	/**
	 * 面向系统的资金工具类型
	 */
	@ApiField("fund_tool_type_for_system")
	private String fundToolTypeForSystem;

	/**
	 * 资金工具名字（中文），供外部直接展示用。
	 */
	@ApiField("fund_tool_type_name")
	private String fundToolTypeName;

	/**
	 * 业务创建时间
	 */
	@ApiField("gmt_biz_create")
	private Date gmtBizCreate;

	/**
	 * 差错资金自服务入口开放类型，TAOBAO-对淘宝开放，ALIPAY-对支付宝站内开放
	 */
	@ApiField("open_self_slip_type")
	private String openSelfSlipType;

	/**
	 * 导致该资金变动在业务上的另一方的卡别名
	 */
	@ApiField("opposite_biz_card_alias")
	private String oppositeBizCardAlias;

	/**
	 * 导致该资金变动在业务上的另一方的卡别名。
	 */
	@ApiField("opposite_biz_card_no")
	private String oppositeBizCardNo;

	/**
	 * 导致该资金变动在资金上的另一方的卡别名。
	 */
	@ApiField("opposite_fund_card_no")
	private String oppositeFundCardNo;

	/**
	 * 外部请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 本方卡号
	 */
	@ApiField("owner_card_no")
	private String ownerCardNo;

	/**
	 * 银行卡退款进度状态
	 */
	@ApiField("refund_bank_status")
	private String refundBankStatus;

	/**
	 * 差错可提取金额，单位元
	 */
	@ApiField("slip_amount")
	private String slipAmount;

	/**
	 * 差错挂账id
	 */
	@ApiField("slip_id")
	private String slipId;

	/**
	 * 差错挂账资金申领状态，W-待申领，P-申领中，S-成功，F-失败
	 */
	@ApiField("slip_status")
	private String slipStatus;

	/**
	 * 预付子卡类型
	 */
	@ApiField("sub_prepaid_card_type")
	private String subPrepaidCardType;

	/**
	 * 统一支付ID
	 */
	@ApiField("uid")
	private String uid;

    /**
     * Gets acctrans out biz no.
     *
     * @return the acctrans out biz no
     */
    public String getAcctransOutBizNo() {
		return this.acctransOutBizNo;
	}

    /**
     * Sets acctrans out biz no.
     *
     * @param acctransOutBizNo the acctrans out biz no
     */
    public void setAcctransOutBizNo(String acctransOutBizNo) {
		this.acctransOutBizNo = acctransOutBizNo;
	}

    /**
     * Gets amount.
     *
     * @return the amount
     */
    public String getAmount() {
		return this.amount;
	}

    /**
     * Sets amount.
     *
     * @param amount the amount
     */
    public void setAmount(String amount) {
		this.amount = amount;
	}

    /**
     * Gets assert type code.
     *
     * @return the assert type code
     */
    public String getAssertTypeCode() {
		return this.assertTypeCode;
	}

    /**
     * Sets assert type code.
     *
     * @param assertTypeCode the assert type code
     */
    public void setAssertTypeCode(String assertTypeCode) {
		this.assertTypeCode = assertTypeCode;
	}

    /**
     * Gets bank card pay type.
     *
     * @return the bank card pay type
     */
    public String getBankCardPayType() {
		return this.bankCardPayType;
	}

    /**
     * Sets bank card pay type.
     *
     * @param bankCardPayType the bank card pay type
     */
    public void setBankCardPayType(String bankCardPayType) {
		this.bankCardPayType = bankCardPayType;
	}

    /**
     * Gets bank card type.
     *
     * @return the bank card type
     */
    public String getBankCardType() {
		return this.bankCardType;
	}

    /**
     * Sets bank card type.
     *
     * @param bankCardType the bank card type
     */
    public void setBankCardType(String bankCardType) {
		this.bankCardType = bankCardType;
	}

    /**
     * Gets biz id.
     *
     * @return the biz id
     */
    public String getBizId() {
		return this.bizId;
	}

    /**
     * Sets biz id.
     *
     * @param bizId the biz id
     */
    public void setBizId(String bizId) {
		this.bizId = bizId;
	}

    /**
     * Gets biz in no.
     *
     * @return the biz in no
     */
    public String getBizInNo() {
		return this.bizInNo;
	}

    /**
     * Sets biz in no.
     *
     * @param bizInNo the biz in no
     */
    public void setBizInNo(String bizInNo) {
		this.bizInNo = bizInNo;
	}

    /**
     * Gets biz out no.
     *
     * @return the biz out no
     */
    public String getBizOutNo() {
		return this.bizOutNo;
	}

    /**
     * Sets biz out no.
     *
     * @param bizOutNo the biz out no
     */
    public void setBizOutNo(String bizOutNo) {
		this.bizOutNo = bizOutNo;
	}

    /**
     * Gets biz type.
     *
     * @return the biz type
     */
    public String getBizType() {
		return this.bizType;
	}

    /**
     * Sets biz type.
     *
     * @param bizType the biz type
     */
    public void setBizType(String bizType) {
		this.bizType = bizType;
	}

    /**
     * Gets currency.
     *
     * @return the currency
     */
    public String getCurrency() {
		return this.currency;
	}

    /**
     * Sets currency.
     *
     * @param currency the currency
     */
    public void setCurrency(String currency) {
		this.currency = currency;
	}

    /**
     * Gets dback amount.
     *
     * @return the dback amount
     */
    public String getDbackAmount() {
		return this.dbackAmount;
	}

    /**
     * Sets dback amount.
     *
     * @param dbackAmount the dback amount
     */
    public void setDbackAmount(String dbackAmount) {
		this.dbackAmount = dbackAmount;
	}

    /**
     * Gets dback gmt create.
     *
     * @return the dback gmt create
     */
    public Date getDbackGmtCreate() {
		return this.dbackGmtCreate;
	}

    /**
     * Sets dback gmt create.
     *
     * @param dbackGmtCreate the dback gmt create
     */
    public void setDbackGmtCreate(Date dbackGmtCreate) {
		this.dbackGmtCreate = dbackGmtCreate;
	}

    /**
     * Gets dback gmt est bk ack.
     *
     * @return the dback gmt est bk ack
     */
    public Date getDbackGmtEstBkAck() {
		return this.dbackGmtEstBkAck;
	}

    /**
     * Sets dback gmt est bk ack.
     *
     * @param dbackGmtEstBkAck the dback gmt est bk ack
     */
    public void setDbackGmtEstBkAck(Date dbackGmtEstBkAck) {
		this.dbackGmtEstBkAck = dbackGmtEstBkAck;
	}

    /**
     * Gets dback gmt est bk into.
     *
     * @return the dback gmt est bk into
     */
    public Date getDbackGmtEstBkInto() {
		return this.dbackGmtEstBkInto;
	}

    /**
     * Sets dback gmt est bk into.
     *
     * @param dbackGmtEstBkInto the dback gmt est bk into
     */
    public void setDbackGmtEstBkInto(Date dbackGmtEstBkInto) {
		this.dbackGmtEstBkInto = dbackGmtEstBkInto;
	}

    /**
     * Gets dback inst account name.
     *
     * @return the dback inst account name
     */
    public String getDbackInstAccountName() {
		return this.dbackInstAccountName;
	}

    /**
     * Sets dback inst account name.
     *
     * @param dbackInstAccountName the dback inst account name
     */
    public void setDbackInstAccountName(String dbackInstAccountName) {
		this.dbackInstAccountName = dbackInstAccountName;
	}

    /**
     * Gets dback inst account no.
     *
     * @return the dback inst account no
     */
    public String getDbackInstAccountNo() {
		return this.dbackInstAccountNo;
	}

    /**
     * Sets dback inst account no.
     *
     * @param dbackInstAccountNo the dback inst account no
     */
    public void setDbackInstAccountNo(String dbackInstAccountNo) {
		this.dbackInstAccountNo = dbackInstAccountNo;
	}

    /**
     * Gets dback inst id.
     *
     * @return the dback inst id
     */
    public String getDbackInstId() {
		return this.dbackInstId;
	}

    /**
     * Sets dback inst id.
     *
     * @param dbackInstId the dback inst id
     */
    public void setDbackInstId(String dbackInstId) {
		this.dbackInstId = dbackInstId;
	}

    /**
     * Gets dback inst name.
     *
     * @return the dback inst name
     */
    public String getDbackInstName() {
		return this.dbackInstName;
	}

    /**
     * Sets dback inst name.
     *
     * @param dbackInstName the dback inst name
     */
    public void setDbackInstName(String dbackInstName) {
		this.dbackInstName = dbackInstName;
	}

    /**
     * Gets fid.
     *
     * @return the fid
     */
    public String getFid() {
		return this.fid;
	}

    /**
     * Sets fid.
     *
     * @param fid the fid
     */
    public void setFid(String fid) {
		this.fid = fid;
	}

    /**
     * Gets fund access type.
     *
     * @return the fund access type
     */
    public Long getFundAccessType() {
		return this.fundAccessType;
	}

    /**
     * Sets fund access type.
     *
     * @param fundAccessType the fund access type
     */
    public void setFundAccessType(Long fundAccessType) {
		this.fundAccessType = fundAccessType;
	}

    /**
     * Gets fund account no.
     *
     * @return the fund account no
     */
    public String getFundAccountNo() {
		return this.fundAccountNo;
	}

    /**
     * Sets fund account no.
     *
     * @param fundAccountNo the fund account no
     */
    public void setFundAccountNo(String fundAccountNo) {
		this.fundAccountNo = fundAccountNo;
	}

    /**
     * Gets fund biz type.
     *
     * @return the fund biz type
     */
    public Long getFundBizType() {
		return this.fundBizType;
	}

    /**
     * Sets fund biz type.
     *
     * @param fundBizType the fund biz type
     */
    public void setFundBizType(Long fundBizType) {
		this.fundBizType = fundBizType;
	}

    /**
     * Gets fund create time.
     *
     * @return the fund create time
     */
    public Date getFundCreateTime() {
		return this.fundCreateTime;
	}

    /**
     * Sets fund create time.
     *
     * @param fundCreateTime the fund create time
     */
    public void setFundCreateTime(Date fundCreateTime) {
		this.fundCreateTime = fundCreateTime;
	}

    /**
     * Gets fund finish time.
     *
     * @return the fund finish time
     */
    public Date getFundFinishTime() {
		return this.fundFinishTime;
	}

    /**
     * Sets fund finish time.
     *
     * @param fundFinishTime the fund finish time
     */
    public void setFundFinishTime(Date fundFinishTime) {
		this.fundFinishTime = fundFinishTime;
	}

    /**
     * Gets fund in out.
     *
     * @return the fund in out
     */
    public Long getFundInOut() {
		return this.fundInOut;
	}

    /**
     * Sets fund in out.
     *
     * @param fundInOut the fund in out
     */
    public void setFundInOut(Long fundInOut) {
		this.fundInOut = fundInOut;
	}

    /**
     * Gets fund inst id.
     *
     * @return the fund inst id
     */
    public String getFundInstId() {
		return this.fundInstId;
	}

    /**
     * Sets fund inst id.
     *
     * @param fundInstId the fund inst id
     */
    public void setFundInstId(String fundInstId) {
		this.fundInstId = fundInstId;
	}

    /**
     * Gets fund modify time.
     *
     * @return the fund modify time
     */
    public Date getFundModifyTime() {
		return this.fundModifyTime;
	}

    /**
     * Sets fund modify time.
     *
     * @param fundModifyTime the fund modify time
     */
    public void setFundModifyTime(Date fundModifyTime) {
		this.fundModifyTime = fundModifyTime;
	}

    /**
     * Gets fund status.
     *
     * @return the fund status
     */
    public String getFundStatus() {
		return this.fundStatus;
	}

    /**
     * Sets fund status.
     *
     * @param fundStatus the fund status
     */
    public void setFundStatus(String fundStatus) {
		this.fundStatus = fundStatus;
	}

    /**
     * Gets fund tool belong to crowner.
     *
     * @return the fund tool belong to crowner
     */
    public Boolean getFundToolBelongToCrowner() {
		return this.fundToolBelongToCrowner;
	}

    /**
     * Sets fund tool belong to crowner.
     *
     * @param fundToolBelongToCrowner the fund tool belong to crowner
     */
    public void setFundToolBelongToCrowner(Boolean fundToolBelongToCrowner) {
		this.fundToolBelongToCrowner = fundToolBelongToCrowner;
	}

    /**
     * Gets fund tool owner card no.
     *
     * @return the fund tool owner card no
     */
    public String getFundToolOwnerCardNo() {
		return this.fundToolOwnerCardNo;
	}

    /**
     * Sets fund tool owner card no.
     *
     * @param fundToolOwnerCardNo the fund tool owner card no
     */
    public void setFundToolOwnerCardNo(String fundToolOwnerCardNo) {
		this.fundToolOwnerCardNo = fundToolOwnerCardNo;
	}

    /**
     * Gets fund tool type for crowner.
     *
     * @return the fund tool type for crowner
     */
    public String getFundToolTypeForCrowner() {
		return this.fundToolTypeForCrowner;
	}

    /**
     * Sets fund tool type for crowner.
     *
     * @param fundToolTypeForCrowner the fund tool type for crowner
     */
    public void setFundToolTypeForCrowner(String fundToolTypeForCrowner) {
		this.fundToolTypeForCrowner = fundToolTypeForCrowner;
	}

    /**
     * Gets fund tool type for system.
     *
     * @return the fund tool type for system
     */
    public String getFundToolTypeForSystem() {
		return this.fundToolTypeForSystem;
	}

    /**
     * Sets fund tool type for system.
     *
     * @param fundToolTypeForSystem the fund tool type for system
     */
    public void setFundToolTypeForSystem(String fundToolTypeForSystem) {
		this.fundToolTypeForSystem = fundToolTypeForSystem;
	}

    /**
     * Gets fund tool type name.
     *
     * @return the fund tool type name
     */
    public String getFundToolTypeName() {
		return this.fundToolTypeName;
	}

    /**
     * Sets fund tool type name.
     *
     * @param fundToolTypeName the fund tool type name
     */
    public void setFundToolTypeName(String fundToolTypeName) {
		this.fundToolTypeName = fundToolTypeName;
	}

    /**
     * Gets gmt biz create.
     *
     * @return the gmt biz create
     */
    public Date getGmtBizCreate() {
		return this.gmtBizCreate;
	}

    /**
     * Sets gmt biz create.
     *
     * @param gmtBizCreate the gmt biz create
     */
    public void setGmtBizCreate(Date gmtBizCreate) {
		this.gmtBizCreate = gmtBizCreate;
	}

    /**
     * Gets open self slip type.
     *
     * @return the open self slip type
     */
    public String getOpenSelfSlipType() {
		return this.openSelfSlipType;
	}

    /**
     * Sets open self slip type.
     *
     * @param openSelfSlipType the open self slip type
     */
    public void setOpenSelfSlipType(String openSelfSlipType) {
		this.openSelfSlipType = openSelfSlipType;
	}

    /**
     * Gets opposite biz card alias.
     *
     * @return the opposite biz card alias
     */
    public String getOppositeBizCardAlias() {
		return this.oppositeBizCardAlias;
	}

    /**
     * Sets opposite biz card alias.
     *
     * @param oppositeBizCardAlias the opposite biz card alias
     */
    public void setOppositeBizCardAlias(String oppositeBizCardAlias) {
		this.oppositeBizCardAlias = oppositeBizCardAlias;
	}

    /**
     * Gets opposite biz card no.
     *
     * @return the opposite biz card no
     */
    public String getOppositeBizCardNo() {
		return this.oppositeBizCardNo;
	}

    /**
     * Sets opposite biz card no.
     *
     * @param oppositeBizCardNo the opposite biz card no
     */
    public void setOppositeBizCardNo(String oppositeBizCardNo) {
		this.oppositeBizCardNo = oppositeBizCardNo;
	}

    /**
     * Gets opposite fund card no.
     *
     * @return the opposite fund card no
     */
    public String getOppositeFundCardNo() {
		return this.oppositeFundCardNo;
	}

    /**
     * Sets opposite fund card no.
     *
     * @param oppositeFundCardNo the opposite fund card no
     */
    public void setOppositeFundCardNo(String oppositeFundCardNo) {
		this.oppositeFundCardNo = oppositeFundCardNo;
	}

    /**
     * Gets out request no.
     *
     * @return the out request no
     */
    public String getOutRequestNo() {
		return this.outRequestNo;
	}

    /**
     * Sets out request no.
     *
     * @param outRequestNo the out request no
     */
    public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

    /**
     * Gets owner card no.
     *
     * @return the owner card no
     */
    public String getOwnerCardNo() {
		return this.ownerCardNo;
	}

    /**
     * Sets owner card no.
     *
     * @param ownerCardNo the owner card no
     */
    public void setOwnerCardNo(String ownerCardNo) {
		this.ownerCardNo = ownerCardNo;
	}

    /**
     * Gets refund bank status.
     *
     * @return the refund bank status
     */
    public String getRefundBankStatus() {
		return this.refundBankStatus;
	}

    /**
     * Sets refund bank status.
     *
     * @param refundBankStatus the refund bank status
     */
    public void setRefundBankStatus(String refundBankStatus) {
		this.refundBankStatus = refundBankStatus;
	}

    /**
     * Gets slip amount.
     *
     * @return the slip amount
     */
    public String getSlipAmount() {
		return this.slipAmount;
	}

    /**
     * Sets slip amount.
     *
     * @param slipAmount the slip amount
     */
    public void setSlipAmount(String slipAmount) {
		this.slipAmount = slipAmount;
	}

    /**
     * Gets slip id.
     *
     * @return the slip id
     */
    public String getSlipId() {
		return this.slipId;
	}

    /**
     * Sets slip id.
     *
     * @param slipId the slip id
     */
    public void setSlipId(String slipId) {
		this.slipId = slipId;
	}

    /**
     * Gets slip status.
     *
     * @return the slip status
     */
    public String getSlipStatus() {
		return this.slipStatus;
	}

    /**
     * Sets slip status.
     *
     * @param slipStatus the slip status
     */
    public void setSlipStatus(String slipStatus) {
		this.slipStatus = slipStatus;
	}

    /**
     * Gets sub prepaid card type.
     *
     * @return the sub prepaid card type
     */
    public String getSubPrepaidCardType() {
		return this.subPrepaidCardType;
	}

    /**
     * Sets sub prepaid card type.
     *
     * @param subPrepaidCardType the sub prepaid card type
     */
    public void setSubPrepaidCardType(String subPrepaidCardType) {
		this.subPrepaidCardType = subPrepaidCardType;
	}

    /**
     * Gets uid.
     *
     * @return the uid
     */
    public String getUid() {
		return this.uid;
	}

    /**
     * Sets uid.
     *
     * @param uid the uid
     */
    public void setUid(String uid) {
		this.uid = uid;
	}

}
