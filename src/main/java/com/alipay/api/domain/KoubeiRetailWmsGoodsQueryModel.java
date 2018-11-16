package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑仓库的商品信息查询
 *
 * @author auto create
 * @since 1.0, 2018-08-22 11:16:32
 */
public class KoubeiRetailWmsGoodsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3315572672671898953L;

	/**
	 * 根据状态查询货品
EFFECTIVE：生效
INVALID ：无效
	 */
	@ApiField("biz_status")
	private String bizStatus;

	/**
	 * 类目ID
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 货品编码
	 */
	@ApiField("goods_code")
	private String goodsCode;

	/**
	 * 根据货品前缀名称查询
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 操作上下文
	 */
	@ApiField("operate_context")
	private OperateContext operateContext;

	/**
	 * 页码，分页参数，当以 goods_code为查询条件时不用传，默认1
	 */
	@ApiField("page_no")
	private String pageNo;

	/**
	 * 页面大小，分页参数，当以goods_code为查询条件时不用传，默认20
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 生产厂商ID
	 */
	@ApiField("producer_id")
	private String producerId;

	/**
	 * 供应商ID
	 */
	@ApiField("supplier_id")
	private String supplierId;

    /**
     * Gets biz status.
     *
     * @return the biz status
     */
    public String getBizStatus() {
		return this.bizStatus;
	}

    /**
     * Sets biz status.
     *
     * @param bizStatus the biz status
     */
    public void setBizStatus(String bizStatus) {
		this.bizStatus = bizStatus;
	}

    /**
     * Gets category id.
     *
     * @return the category id
     */
    public String getCategoryId() {
		return this.categoryId;
	}

    /**
     * Sets category id.
     *
     * @param categoryId the category id
     */
    public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
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
     * Gets goods name.
     *
     * @return the goods name
     */
    public String getGoodsName() {
		return this.goodsName;
	}

    /**
     * Sets goods name.
     *
     * @param goodsName the goods name
     */
    public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
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
     * Gets page no.
     *
     * @return the page no
     */
    public String getPageNo() {
		return this.pageNo;
	}

    /**
     * Sets page no.
     *
     * @param pageNo the page no
     */
    public void setPageNo(String pageNo) {
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
     * Gets producer id.
     *
     * @return the producer id
     */
    public String getProducerId() {
		return this.producerId;
	}

    /**
     * Sets producer id.
     *
     * @param producerId the producer id
     */
    public void setProducerId(String producerId) {
		this.producerId = producerId;
	}

    /**
     * Gets supplier id.
     *
     * @return the supplier id
     */
    public String getSupplierId() {
		return this.supplierId;
	}

    /**
     * Sets supplier id.
     *
     * @param supplierId the supplier id
     */
    public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

}
