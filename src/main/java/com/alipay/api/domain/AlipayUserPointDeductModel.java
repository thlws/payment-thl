package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁会员积分扣减接口（需要用户授权）
 *
 * @author auto create
 * @since 1.0, 2018-04-03 15:32:54
 */
public class AlipayUserPointDeductModel extends AlipayObject {

	private static final long serialVersionUID = 4313675298862414832L;

	/**
	 * 蚂蚁会员平台上的权益所对应的编号
	 */
	@ApiField("benefit_id")
	private String benefitId;

	/**
	 * 格式为yyyy-MM-dd HH:mm:ss ，业务操作时间用于对账，不传则以调用请求的当前时间计算
	 */
	@ApiField("biz_date")
	private Date bizDate;

	/**
	 * 业务大类，表明此次调用的来源，若无需要则不传。
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 业务流水号，会用于幂等性校验，所以请保证每次请求的业务流水号的唯一性
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 扣减积分时，该字段用于补充描述积分扣减的场景，将会拼在积分扣减记录的标题中进行展示，若无特殊需求则不要传该参数。明文长度不要超过32个中文汉字。
	 */
	@ApiField("prod_title")
	private String prodTitle;

	/**
	 * 业务子类型，表明业务来源实际操作的业务分类，若无需要则不传。
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

    /**
     * Gets benefit id.
     *
     * @return the benefit id
     */
    public String getBenefitId() {
		return this.benefitId;
	}

    /**
     * Sets benefit id.
     *
     * @param benefitId the benefit id
     */
    public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}

    /**
     * Gets biz date.
     *
     * @return the biz date
     */
    public Date getBizDate() {
		return this.bizDate;
	}

    /**
     * Sets biz date.
     *
     * @param bizDate the biz date
     */
    public void setBizDate(Date bizDate) {
		this.bizDate = bizDate;
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
     * Gets out biz no.
     *
     * @return the out biz no
     */
    public String getOutBizNo() {
		return this.outBizNo;
	}

    /**
     * Sets out biz no.
     *
     * @param outBizNo the out biz no
     */
    public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

    /**
     * Gets prod title.
     *
     * @return the prod title
     */
    public String getProdTitle() {
		return this.prodTitle;
	}

    /**
     * Sets prod title.
     *
     * @param prodTitle the prod title
     */
    public void setProdTitle(String prodTitle) {
		this.prodTitle = prodTitle;
	}

    /**
     * Gets sub biz type.
     *
     * @return the sub biz type
     */
    public String getSubBizType() {
		return this.subBizType;
	}

    /**
     * Sets sub biz type.
     *
     * @param subBizType the sub biz type
     */
    public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

}
