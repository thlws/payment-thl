package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页查询库存变更记录
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:33:27
 */
public class KoubeiRetailWmsInventoryrecordQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5518765722469296638L;

	/**
	 * 批次号
	 */
	@ApiField("batch_code")
	private String batchCode;

	/**
	 * 出入库截止时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 商品编码
	 */
	@ApiField("goods_code")
	private String goodsCode;

	/**
	 * 库存类型（ZP=正品, CC=残次,JS=机损, XS= 箱损, ZT=在途库存）
	 */
	@ApiField("inventory_type")
	private String inventoryType;

	/**
	 * 操作人信息
	 */
	@ApiField("operate_context")
	private OperateContext operateContext;

	/**
	 * 库存操作类型（INBOUND＝入库，OUTBOUND＝出库）
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 外部订单号
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/**
	 * 页码（默认值为1，必须为正整数）
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 页面大小（最小1，默认20，最大100）
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 出入库开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 仓库编码
	 */
	@ApiField("warehouse_code")
	private String warehouseCode;

    /**
     * Gets batch code.
     *
     * @return the batch code
     */
    public String getBatchCode() {
		return this.batchCode;
	}

    /**
     * Sets batch code.
     *
     * @param batchCode the batch code
     */
    public void setBatchCode(String batchCode) {
		this.batchCode = batchCode;
	}

    /**
     * Gets end time.
     *
     * @return the end time
     */
    public Date getEndTime() {
		return this.endTime;
	}

    /**
     * Sets end time.
     *
     * @param endTime the end time
     */
    public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

    /**
     * Gets goods code.
     *
     * @return the goods code
     */
    public String getGoodsCode() {
		return this.goodsCode;
	}

    /**
     * Sets goods code.
     *
     * @param goodsCode the goods code
     */
    public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}

    /**
     * Gets inventory type.
     *
     * @return the inventory type
     */
    public String getInventoryType() {
		return this.inventoryType;
	}

    /**
     * Sets inventory type.
     *
     * @param inventoryType the inventory type
     */
    public void setInventoryType(String inventoryType) {
		this.inventoryType = inventoryType;
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
     * Gets operate type.
     *
     * @return the operate type
     */
    public String getOperateType() {
		return this.operateType;
	}

    /**
     * Sets operate type.
     *
     * @param operateType the operate type
     */
    public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

    /**
     * Gets out biz id.
     *
     * @return the out biz id
     */
    public String getOutBizId() {
		return this.outBizId;
	}

    /**
     * Sets out biz id.
     *
     * @param outBizId the out biz id
     */
    public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

    /**
     * Gets page no.
     *
     * @return the page no
     */
    public Long getPageNo() {
		return this.pageNo;
	}

    /**
     * Sets page no.
     *
     * @param pageNo the page no
     */
    public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

    /**
     * Gets page size.
     *
     * @return the page size
     */
    public Long getPageSize() {
		return this.pageSize;
	}

    /**
     * Sets page size.
     *
     * @param pageSize the page size
     */
    public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

    /**
     * Gets start time.
     *
     * @return the start time
     */
    public Date getStartTime() {
		return this.startTime;
	}

    /**
     * Sets start time.
     *
     * @param startTime the start time
     */
    public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

    /**
     * Gets warehouse code.
     *
     * @return the warehouse code
     */
    public String getWarehouseCode() {
		return this.warehouseCode;
	}

    /**
     * Sets warehouse code.
     *
     * @param warehouseCode the warehouse code
     */
    public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

}
