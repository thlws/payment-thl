package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 修改入库作业
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:40:47
 */
public class KoubeiRetailWmsInboundworkModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7626263673398149845L;

	/**
	 * 扩展字段，json格式
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 入库作业id
	 */
	@ApiField("inbound_work_id")
	private String inboundWorkId;

	/**
	 * 操作上下文
	 */
	@ApiField("operate_context")
	private OperateContext operateContext;

	/**
	 * 备注信息
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 入库作业明细列表
	 */
	@ApiListField("work_details")
	@ApiField("work_detail")
	private List<WorkDetail> workDetails;

    /**
     * Gets ext info.
     *
     * @return the ext info
     */
    public String getExtInfo() {
		return this.extInfo;
	}

    /**
     * Sets ext info.
     *
     * @param extInfo the ext info
     */
    public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

    /**
     * Gets inbound work id.
     *
     * @return the inbound work id
     */
    public String getInboundWorkId() {
		return this.inboundWorkId;
	}

    /**
     * Sets inbound work id.
     *
     * @param inboundWorkId the inbound work id
     */
    public void setInboundWorkId(String inboundWorkId) {
		this.inboundWorkId = inboundWorkId;
	}

    /**
     * Gets operate context.
     *
     * @return the operate context
     */
    public OperateContext getOperateContext() {
		return this.operateContext;
	}

    /**
     * Sets operate context.
     *
     * @param operateContext the operate context
     */
    public void setOperateContext(OperateContext operateContext) {
		this.operateContext = operateContext;
	}

    /**
     * Gets remark.
     *
     * @return the remark
     */
    public String getRemark() {
		return this.remark;
	}

    /**
     * Sets remark.
     *
     * @param remark the remark
     */
    public void setRemark(String remark) {
		this.remark = remark;
	}

    /**
     * Gets work details.
     *
     * @return the work details
     */
    public List<WorkDetail> getWorkDetails() {
		return this.workDetails;
	}

    /**
     * Sets work details.
     *
     * @param workDetails the work details
     */
    public void setWorkDetails(List<WorkDetail> workDetails) {
		this.workDetails = workDetails;
	}

}
