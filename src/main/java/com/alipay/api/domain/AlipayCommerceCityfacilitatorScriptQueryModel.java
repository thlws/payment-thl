package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询城市一卡通的判卡、读卡脚本
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:20
 */
public class AlipayCommerceCityfacilitatorScriptQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1571682815277718191L;

	/**
	 * 卡类型，智能卡中心的内部编码规则
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 脚本类型，目前支持两种
readCardType：判定卡是什么城市的交通卡
readCardInfo：读取卡中的余额等信息
	 */
	@ApiField("script_type")
	private String scriptType;

    /**
     * Gets card type.
     *
     * @return the card type
     */
    public String getCardType() {
		return this.cardType;
	}

    /**
     * Sets card type.
     *
     * @param cardType the card type
     */
    public void setCardType(String cardType) {
		this.cardType = cardType;
	}

    /**
     * Gets script type.
     *
     * @return the script type
     */
    public String getScriptType() {
		return this.scriptType;
	}

    /**
     * Sets script type.
     *
     * @param scriptType the script type
     */
    public void setScriptType(String scriptType) {
		this.scriptType = scriptType;
	}

}
