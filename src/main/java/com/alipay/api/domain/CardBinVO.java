package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据卡号和instId查询得到的卡bin信息对象模型
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class CardBinVO extends AlipayObject {

	private static final long serialVersionUID = 3898417418636141658L;

	/**
	 * 卡的别名
	 */
	@ApiField("card_alias")
	private String cardAlias;

	/**
	 * 卡bin值，通常为卡号的前6位
	 */
	@ApiField("card_bin_value")
	private String cardBinValue;

	/**
	 * 卡类型对象定义
	 */
	@ApiField("card_type_vo")
	private CardTypeVO cardTypeVo;

	/**
	 * 卡域模型定义
	 */
	@ApiField("domain_vo")
	private CardDomainVO domainVo;

	/**
	 * 机构内标
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 卡号长度
	 */
	@ApiField("inst_len")
	private String instLen;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 操作员
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 卡版本信息
	 */
	@ApiField("version")
	private String version;

    /**
     * Gets card alias.
     *
     * @return the card alias
     */
    public String getCardAlias() {
		return this.cardAlias;
	}

    /**
     * Sets card alias.
     *
     * @param cardAlias the card alias
     */
    public void setCardAlias(String cardAlias) {
		this.cardAlias = cardAlias;
	}

    /**
     * Gets card bin value.
     *
     * @return the card bin value
     */
    public String getCardBinValue() {
		return this.cardBinValue;
	}

    /**
     * Sets card bin value.
     *
     * @param cardBinValue the card bin value
     */
    public void setCardBinValue(String cardBinValue) {
		this.cardBinValue = cardBinValue;
	}

    /**
     * Gets card type vo.
     *
     * @return the card type vo
     */
    public CardTypeVO getCardTypeVo() {
		return this.cardTypeVo;
	}

    /**
     * Sets card type vo.
     *
     * @param cardTypeVo the card type vo
     */
    public void setCardTypeVo(CardTypeVO cardTypeVo) {
		this.cardTypeVo = cardTypeVo;
	}

    /**
     * Gets domain vo.
     *
     * @return the domain vo
     */
    public CardDomainVO getDomainVo() {
		return this.domainVo;
	}

    /**
     * Sets domain vo.
     *
     * @param domainVo the domain vo
     */
    public void setDomainVo(CardDomainVO domainVo) {
		this.domainVo = domainVo;
	}

    /**
     * Gets inst id.
     *
     * @return the inst id
     */
    public String getInstId() {
		return this.instId;
	}

    /**
     * Sets inst id.
     *
     * @param instId the inst id
     */
    public void setInstId(String instId) {
		this.instId = instId;
	}

    /**
     * Gets inst len.
     *
     * @return the inst len
     */
    public String getInstLen() {
		return this.instLen;
	}

    /**
     * Sets inst len.
     *
     * @param instLen the inst len
     */
    public void setInstLen(String instLen) {
		this.instLen = instLen;
	}

    /**
     * Gets memo.
     *
     * @return the memo
     */
    public String getMemo() {
		return this.memo;
	}

    /**
     * Sets memo.
     *
     * @param memo the memo
     */
    public void setMemo(String memo) {
		this.memo = memo;
	}

    /**
     * Gets operator.
     *
     * @return the operator
     */
    public String getOperator() {
		return this.operator;
	}

    /**
     * Sets operator.
     *
     * @param operator the operator
     */
    public void setOperator(String operator) {
		this.operator = operator;
	}

    /**
     * Gets version.
     *
     * @return the version
     */
    public String getVersion() {
		return this.version;
	}

    /**
     * Sets version.
     *
     * @param version the version
     */
    public void setVersion(String version) {
		this.version = version;
	}

}
