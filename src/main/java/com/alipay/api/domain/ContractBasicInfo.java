package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合约基本属性信息
 *
 * @author auto create
 * @since 1.0, 2018-07-27 16:22:03
 */
public class ContractBasicInfo extends AlipayObject {

	private static final long serialVersionUID = 3147116378785594163L;

	/**
	 * 合约简要描述
	 */
	@ApiField("brief_desc")
	private String briefDesc;

	/**
	 * 合约中文名
	 */
	@ApiField("contract_name")
	private String contractName;

	/**
	 * 合约号
	 */
	@ApiField("contract_no")
	private String contractNo;

	/**
	 * 合约过期时间
	 */
	@ApiField("expire_time")
	private Date expireTime;

	/**
	 * 最后守约时间
	 */
	@ApiField("last_promise_date")
	private Date lastPromiseDate;

	/**
	 * 用户在输入场景下签约合同的序号
	 */
	@ApiField("order")
	private Long order;

	/**
	 * 合约签署时间
	 */
	@ApiField("sign_time")
	private Date signTime;

	/**
	 * 合同签约应用app标识
	 */
	@ApiField("source")
	private String source;

	/**
	 * 合同状态，可选值：success, fail
	 */
	@ApiField("status")
	private String status;

    /**
     * Gets brief desc.
     *
     * @return the brief desc
     */
    public String getBriefDesc() {
		return this.briefDesc;
	}

    /**
     * Sets brief desc.
     *
     * @param briefDesc the brief desc
     */
    public void setBriefDesc(String briefDesc) {
		this.briefDesc = briefDesc;
	}

    /**
     * Gets contract name.
     *
     * @return the contract name
     */
    public String getContractName() {
		return this.contractName;
	}

    /**
     * Sets contract name.
     *
     * @param contractName the contract name
     */
    public void setContractName(String contractName) {
		this.contractName = contractName;
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
     * Gets expire time.
     *
     * @return the expire time
     */
    public Date getExpireTime() {
		return this.expireTime;
	}

    /**
     * Sets expire time.
     *
     * @param expireTime the expire time
     */
    public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

    /**
     * Gets last promise date.
     *
     * @return the last promise date
     */
    public Date getLastPromiseDate() {
		return this.lastPromiseDate;
	}

    /**
     * Sets last promise date.
     *
     * @param lastPromiseDate the last promise date
     */
    public void setLastPromiseDate(Date lastPromiseDate) {
		this.lastPromiseDate = lastPromiseDate;
	}

    /**
     * Gets order.
     *
     * @return the order
     */
    public Long getOrder() {
		return this.order;
	}

    /**
     * Sets order.
     *
     * @param order the order
     */
    public void setOrder(Long order) {
		this.order = order;
	}

    /**
     * Gets sign time.
     *
     * @return the sign time
     */
    public Date getSignTime() {
		return this.signTime;
	}

    /**
     * Sets sign time.
     *
     * @param signTime the sign time
     */
    public void setSignTime(Date signTime) {
		this.signTime = signTime;
	}

    /**
     * Gets source.
     *
     * @return the source
     */
    public String getSource() {
		return this.source;
	}

    /**
     * Sets source.
     *
     * @param source the source
     */
    public void setSource(String source) {
		this.source = source;
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

}
