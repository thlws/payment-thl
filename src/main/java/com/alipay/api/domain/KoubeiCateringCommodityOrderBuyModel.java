package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * isv订购口碑插件接口
 *
 * @author auto create
 * @since 1.0, 2018-03-23 14:20:46
 */
public class KoubeiCateringCommodityOrderBuyModel extends AlipayObject {

	private static final long serialVersionUID = 5622514968557959239L;

	/**
	 * 订购服务时订购人id(订购人是操作员的时候，agent_Id为操作员个人Id)
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * merchant:表示订购人是商户，此时agentId和consumerCardNo是同一个;
operator: 表示订购人是操作员，此时agentId为操作员id，consumerCardNo是该操作员对应的主账户
	 */
	@ApiField("agent_type")
	private String agentType;

	/**
	 * 订购服务时订购人的主账户
	 */
	@ApiField("consumer_card_no")
	private String consumerCardNo;

	/**
	 * 订购的服务ID
	 */
	@ApiField("merchandise_id")
	private String merchandiseId;

	/**
	 * 需要订购插件的门店集合；不传是不订购任何门店，order_result返回false
	 */
	@ApiListField("shop_ids")
	@ApiField("string")
	private List<String> shopIds;

    /**
     * Gets agent id.
     *
     * @return the agent id
     */
    public String getAgentId() {
		return this.agentId;
	}

    /**
     * Sets agent id.
     *
     * @param agentId the agent id
     */
    public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

    /**
     * Gets agent type.
     *
     * @return the agent type
     */
    public String getAgentType() {
		return this.agentType;
	}

    /**
     * Sets agent type.
     *
     * @param agentType the agent type
     */
    public void setAgentType(String agentType) {
		this.agentType = agentType;
	}

    /**
     * Gets consumer card no.
     *
     * @return the consumer card no
     */
    public String getConsumerCardNo() {
		return this.consumerCardNo;
	}

    /**
     * Sets consumer card no.
     *
     * @param consumerCardNo the consumer card no
     */
    public void setConsumerCardNo(String consumerCardNo) {
		this.consumerCardNo = consumerCardNo;
	}

    /**
     * Gets merchandise id.
     *
     * @return the merchandise id
     */
    public String getMerchandiseId() {
		return this.merchandiseId;
	}

    /**
     * Sets merchandise id.
     *
     * @param merchandiseId the merchandise id
     */
    public void setMerchandiseId(String merchandiseId) {
		this.merchandiseId = merchandiseId;
	}

    /**
     * Gets shop ids.
     *
     * @return the shop ids
     */
    public List<String> getShopIds() {
		return this.shopIds;
	}

    /**
     * Sets shop ids.
     *
     * @param shopIds the shop ids
     */
    public void setShopIds(List<String> shopIds) {
		this.shopIds = shopIds;
	}

}
