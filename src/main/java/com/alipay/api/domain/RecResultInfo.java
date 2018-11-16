package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 推荐结果
 *
 * @author auto create
 * @since 1.0, 2018-03-08 16:40:40
 */
public class RecResultInfo extends AlipayObject {

	private static final long serialVersionUID = 7125719677942426296L;

	/**
	 * 错误码
NO_REC_ITEMS 无推荐服务
NO_ENOUGH_ITEMS 推荐数量不合法
	 */
	@ApiField("code")
	private String code;

	/**
	 * 推荐ITEM
	 */
	@ApiListField("items")
	@ApiField("rec_item_info")
	private List<RecItemInfo> items;

	/**
	 * 错误消息，如果成功则为空
	 */
	@ApiField("msg")
	private String msg;

	/**
	 * 推荐结果
	 */
	@ApiField("position_id")
	private String positionId;

	/**
	 * 是否成功
	 */
	@ApiField("success")
	private Boolean success;

    /**
     * Gets code.
     *
     * @return the code
     */
    public String getCode() {
		return this.code;
	}

    /**
     * Sets code.
     *
     * @param code the code
     */
    public void setCode(String code) {
		this.code = code;
	}

    /**
     * Gets items.
     *
     * @return the items
     */
    public List<RecItemInfo> getItems() {
		return this.items;
	}

    /**
     * Sets items.
     *
     * @param items the items
     */
    public void setItems(List<RecItemInfo> items) {
		this.items = items;
	}

    /**
     * Gets msg.
     *
     * @return the msg
     */
    public String getMsg() {
		return this.msg;
	}

    /**
     * Sets msg.
     *
     * @param msg the msg
     */
    public void setMsg(String msg) {
		this.msg = msg;
	}

    /**
     * Gets position id.
     *
     * @return the position id
     */
    public String getPositionId() {
		return this.positionId;
	}

    /**
     * Sets position id.
     *
     * @param positionId the position id
     */
    public void setPositionId(String positionId) {
		this.positionId = positionId;
	}

    /**
     * Gets success.
     *
     * @return the success
     */
    public Boolean getSuccess() {
		return this.success;
	}

    /**
     * Sets success.
     *
     * @param success the success
     */
    public void setSuccess(Boolean success) {
		this.success = success;
	}

}
