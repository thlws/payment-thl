package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.WorkDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.work.query response.
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:33:39
 */
public class KoubeiRetailWmsWorkQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2816365128344451134L;

	/** 
	 * 扩展字段，json格式
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 作业完成时间，未完成则该值为空
	 */
	@ApiField("gmt_finished")
	private Date gmtFinished;

	/** 
	 * 作业对应的入库/出库通知单的外部业务单据号，这个单据可能是采购单、补货单等
	 */
	@ApiField("notice_out_biz_no")
	private String noticeOutBizNo;

	/** 
	 * 作业对应的通知单的外部业务类型，BHRK=补货入库，CGRK=采购入库，CGTHRK=采购退货入库，DDTHRK=订单退货入库，PDRK=盘点入库，CGCK=采购出库，DDCK=订单出库，PDCK=盘点出库，BHCK=补货出库
	 */
	@ApiField("notice_out_biz_type")
	private String noticeOutBizType;

	/** 
	 * 操作员id
	 */
	@ApiField("operator")
	private String operator;

	/** 
	 * 与作业相关的外部单据号，如菜鸟发货id
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 备注信息
	 */
	@ApiField("remark")
	private String remark;

	/** 
	 * 作业单状态 INIT=初始状态，FINISHED=完成状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 仓库编码
	 */
	@ApiField("warehouse_code")
	private String warehouseCode;

	/** 
	 * 作业明细模型列表
	 */
	@ApiListField("work_details")
	@ApiField("work_detail")
	private List<WorkDetail> workDetails;

	/** 
	 * 作业id
	 */
	@ApiField("work_id")
	private String workId;

    /**
     * Sets ext info.
     *
     * @param extInfo the ext info
     */
    public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

    /**
     * Gets ext info.
     *
     * @return the ext info
     */
    public String getExtInfo( ) {
		return this.extInfo;
	}

    /**
     * Sets gmt finished.
     *
     * @param gmtFinished the gmt finished
     */
    public void setGmtFinished(Date gmtFinished) {
		this.gmtFinished = gmtFinished;
	}

    /**
     * Gets gmt finished.
     *
     * @return the gmt finished
     */
    public Date getGmtFinished( ) {
		return this.gmtFinished;
	}

    /**
     * Sets notice out biz no.
     *
     * @param noticeOutBizNo the notice out biz no
     */
    public void setNoticeOutBizNo(String noticeOutBizNo) {
		this.noticeOutBizNo = noticeOutBizNo;
	}

    /**
     * Gets notice out biz no.
     *
     * @return the notice out biz no
     */
    public String getNoticeOutBizNo( ) {
		return this.noticeOutBizNo;
	}

    /**
     * Sets notice out biz type.
     *
     * @param noticeOutBizType the notice out biz type
     */
    public void setNoticeOutBizType(String noticeOutBizType) {
		this.noticeOutBizType = noticeOutBizType;
	}

    /**
     * Gets notice out biz type.
     *
     * @return the notice out biz type
     */
    public String getNoticeOutBizType( ) {
		return this.noticeOutBizType;
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
     * Gets operator.
     *
     * @return the operator
     */
    public String getOperator( ) {
		return this.operator;
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
     * Gets out biz no.
     *
     * @return the out biz no
     */
    public String getOutBizNo( ) {
		return this.outBizNo;
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
     * Gets remark.
     *
     * @return the remark
     */
    public String getRemark( ) {
		return this.remark;
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
     * Gets status.
     *
     * @return the status
     */
    public String getStatus( ) {
		return this.status;
	}

    /**
     * Sets warehouse code.
     *
     * @param warehouseCode the warehouse code
     */
    public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

    /**
     * Gets warehouse code.
     *
     * @return the warehouse code
     */
    public String getWarehouseCode( ) {
		return this.warehouseCode;
	}

    /**
     * Sets work details.
     *
     * @param workDetails the work details
     */
    public void setWorkDetails(List<WorkDetail> workDetails) {
		this.workDetails = workDetails;
	}

    /**
     * Gets work details.
     *
     * @return the work details
     */
    public List<WorkDetail> getWorkDetails( ) {
		return this.workDetails;
	}

    /**
     * Sets work id.
     *
     * @param workId the work id
     */
    public void setWorkId(String workId) {
		this.workId = workId;
	}

    /**
     * Gets work id.
     *
     * @return the work id
     */
    public String getWorkId( ) {
		return this.workId;
	}

}
