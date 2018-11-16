package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.quality.test.cloudacpt.item.query response.
 *
 * @author auto create
 * @since 1.0, 2016-06-15 15:07:35
 */
public class KoubeiQualityTestCloudacptItemQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7576378779834594955L;

	/** 
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/** 
	 * 批次id
	 */
	@ApiField("batch_id")
	private String batchId;

	/** 
	 * 批次状态
0，未检测
1，检测中
2，未通过
3，已通过
	 */
	@ApiField("batch_status")
	private String batchStatus;

	/** 
	 * 失败单品书列表
	 */
	@ApiListField("fail_list")
	@ApiField("open_item")
	private List<OpenItem> failList;

	/** 
	 * 失败数
	 */
	@ApiField("fail_num")
	private String failNum;

	/** 
	 * 单品列表
	 */
	@ApiListField("item_list")
	@ApiField("open_item")
	private List<OpenItem> itemList;

	/** 
	 * 单品数
	 */
	@ApiField("item_num")
	private String itemNum;

	/** 
	 * 通过单品列表
	 */
	@ApiListField("pass_list")
	@ApiField("open_item")
	private List<OpenItem> passList;

	/** 
	 * 通过数
	 */
	@ApiField("pass_num")
	private String passNum;

    /**
     * Sets activity id.
     *
     * @param activityId the activity id
     */
    public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

    /**
     * Gets activity id.
     *
     * @return the activity id
     */
    public String getActivityId( ) {
		return this.activityId;
	}

    /**
     * Sets batch id.
     *
     * @param batchId the batch id
     */
    public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

    /**
     * Gets batch id.
     *
     * @return the batch id
     */
    public String getBatchId( ) {
		return this.batchId;
	}

    /**
     * Sets batch status.
     *
     * @param batchStatus the batch status
     */
    public void setBatchStatus(String batchStatus) {
		this.batchStatus = batchStatus;
	}

    /**
     * Gets batch status.
     *
     * @return the batch status
     */
    public String getBatchStatus( ) {
		return this.batchStatus;
	}

    /**
     * Sets fail list.
     *
     * @param failList the fail list
     */
    public void setFailList(List<OpenItem> failList) {
		this.failList = failList;
	}

    /**
     * Gets fail list.
     *
     * @return the fail list
     */
    public List<OpenItem> getFailList( ) {
		return this.failList;
	}

    /**
     * Sets fail num.
     *
     * @param failNum the fail num
     */
    public void setFailNum(String failNum) {
		this.failNum = failNum;
	}

    /**
     * Gets fail num.
     *
     * @return the fail num
     */
    public String getFailNum( ) {
		return this.failNum;
	}

    /**
     * Sets item list.
     *
     * @param itemList the item list
     */
    public void setItemList(List<OpenItem> itemList) {
		this.itemList = itemList;
	}

    /**
     * Gets item list.
     *
     * @return the item list
     */
    public List<OpenItem> getItemList( ) {
		return this.itemList;
	}

    /**
     * Sets item num.
     *
     * @param itemNum the item num
     */
    public void setItemNum(String itemNum) {
		this.itemNum = itemNum;
	}

    /**
     * Gets item num.
     *
     * @return the item num
     */
    public String getItemNum( ) {
		return this.itemNum;
	}

    /**
     * Sets pass list.
     *
     * @param passList the pass list
     */
    public void setPassList(List<OpenItem> passList) {
		this.passList = passList;
	}

    /**
     * Gets pass list.
     *
     * @return the pass list
     */
    public List<OpenItem> getPassList( ) {
		return this.passList;
	}

    /**
     * Sets pass num.
     *
     * @param passNum the pass num
     */
    public void setPassNum(String passNum) {
		this.passNum = passNum;
	}

    /**
     * Gets pass num.
     *
     * @return the pass num
     */
    public String getPassNum( ) {
		return this.passNum;
	}

}
