package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑仓库信息查询
 *
 * @author auto create
 * @since 1.0, 2018-08-22 11:17:06
 */
public class KoubeiRetailWmsWarehouseQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5663586323872181911L;

	/**
	 * 城市编码，国标码，与归属人ID查询配合使用
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 操作上下文
	 */
	@ApiField("operate_context")
	private OperateContext operateContext;

	/**
	 * 仓库的归属人类型，SUPPLIER供货商的仓库/PARTNER商户的仓库
	 */
	@ApiField("own_type")
	private String ownType;

	/**
	 * 仓库的归属人ID、与仓库ID选择一个作为查询条件
	 */
	@ApiField("owner_id")
	private String ownerId;

	/**
	 * 页码，分页参数，与归属人ID查询配合使用
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 每页大小，分页参数，与归属人ID查询配合使用
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 仓库编码、与归属人ID选择一个作为查询条件
	 */
	@ApiField("warehouse_code")
	private String warehouseCode;

    /**
     * Gets city code.
     *
     * @return the city code
     */
    public String getCityCode() {
		return this.cityCode;
	}

    /**
     * Sets city code.
     *
     * @param cityCode the city code
     */
    public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
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
     * Gets own type.
     *
     * @return the own type
     */
    public String getOwnType() {
		return this.ownType;
	}

    /**
     * Sets own type.
     *
     * @param ownType the own type
     */
    public void setOwnType(String ownType) {
		this.ownType = ownType;
	}

    /**
     * Gets owner id.
     *
     * @return the owner id
     */
    public String getOwnerId() {
		return this.ownerId;
	}

    /**
     * Sets owner id.
     *
     * @param ownerId the owner id
     */
    public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
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
