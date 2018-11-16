package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电子合约链路存证
 *
 * @author auto create
 * @since 1.0, 2018-03-29 16:42:45
 */
public class ZhimaCustomerContractRecordSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3431711429394853111L;

	/**
	 * 本次业务流程唯一标识，一次电子合约流程中可能存在多次业务操作，比如有多次电子签名，每次业务操作有一个唯一标识，每次业务操作有多次存证记录
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 存证记录的业务发生时间，为格林威治时间从1970年1月1日0点到现在的毫秒数。Java程序里面通过System.currentTimeMillis()获取
	 */
	@ApiField("biz_time")
	private String bizTime;

	/**
	 * 存证记录业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 存证记录的电子合约号，标识一次完整的电子合约流程，一次电子合约流程会有多次业务流程，比如有多次电子签名，每个业务流程有多次存证记录
	 */
	@ApiField("contract_no")
	private String contractNo;

	/**
	 * 存证内容，根据biz type不同而不同
	 */
	@ApiField("record_content")
	private String recordContent;

    /**
     * Gets biz no.
     *
     * @return the biz no
     */
    public String getBizNo() {
		return this.bizNo;
	}

    /**
     * Sets biz no.
     *
     * @param bizNo the biz no
     */
    public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

    /**
     * Gets biz time.
     *
     * @return the biz time
     */
    public String getBizTime() {
		return this.bizTime;
	}

    /**
     * Sets biz time.
     *
     * @param bizTime the biz time
     */
    public void setBizTime(String bizTime) {
		this.bizTime = bizTime;
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
     * Gets contract no.
     *
     * @return the contract no
     */
    public String getContractNo() {
		return this.contractNo;
	}

    /**
     * Sets contract no.
     *
     * @param contractNo the contract no
     */
    public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

    /**
     * Gets record content.
     *
     * @return the record content
     */
    public String getRecordContent() {
		return this.recordContent;
	}

    /**
     * Sets record content.
     *
     * @param recordContent the record content
     */
    public void setRecordContent(String recordContent) {
		this.recordContent = recordContent;
	}

}
