package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 服务插件扩展信息补充
 *
 * @author auto create
 * @since 1.0, 2018-03-16 17:31:50
 */
public class AlipayOpenServicemarketCommodityExtendinfosConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 7846982325158899763L;

	/**
	 * 公服BD审核扩展信息
	 */
	@ApiListField("commodity_ext_infos")
	@ApiField("commodity_ext_info_confirm")
	private List<CommodityExtInfoConfirm> commodityExtInfos;

	/**
	 * 服务Id
	 */
	@ApiField("commodity_id")
	private String commodityId;

	/**
	 * status 为驳回时 必须输入驳回原因
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 公服BD审核结果：成功还是失败:
status 【0：表示不通过 ， 1：表示通过】
	 */
	@ApiField("status")
	private String status;

	/**
	 * 用户Id
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets commodity ext infos.
     *
     * @return the commodity ext infos
     */
    public List<CommodityExtInfoConfirm> getCommodityExtInfos() {
		return this.commodityExtInfos;
	}

    /**
     * Sets commodity ext infos.
     *
     * @param commodityExtInfos the commodity ext infos
     */
    public void setCommodityExtInfos(List<CommodityExtInfoConfirm> commodityExtInfos) {
		this.commodityExtInfos = commodityExtInfos;
	}

    /**
     * Gets commodity id.
     *
     * @return the commodity id
     */
    public String getCommodityId() {
		return this.commodityId;
	}

    /**
     * Sets commodity id.
     *
     * @param commodityId the commodity id
     */
    public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
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
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId() {
		return this.userId;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

}
