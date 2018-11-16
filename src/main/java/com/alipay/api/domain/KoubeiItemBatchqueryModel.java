package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑商品查询
 *
 * @author auto create
 * @since 1.0, 2018-06-15 08:34:59
 */
public class KoubeiItemBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3215444746614254391L;

	/**
	 * 服务商、服务商员工、商户、商户员工等口碑角色操作时必填，对应为《koubei.member.data.oauth.query》中的auth_code，默认有效期24小时；
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 商品Id,多个用,分割，最多支持传5个,如果不传递则查询商户下所有商品，但是不返回适用门店字段，使用了该参数，则无需填写page_no和page_size
	 */
	@ApiField("item_ids")
	private String itemIds;

	/**
	 * 操作上下文 isv角色操作时必填；其他角色不需填写
	 */
	@ApiField("operation_context")
	private KoubeiOperationContext operationContext;

	/**
	 * 页码，留空标示第一页，默认10个结果为一页
	 */
	@ApiField("page_no")
	private String pageNo;

	/**
	 * 每页记录数，默认10，最大20
	 */
	@ApiField("page_size")
	private Long pageSize;

    /**
     * Gets auth code.
     *
     * @return the auth code
     */
    public String getAuthCode() {
		return this.authCode;
	}

    /**
     * Sets auth code.
     *
     * @param authCode the auth code
     */
    public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

    /**
     * Gets item ids.
     *
     * @return the item ids
     */
    public String getItemIds() {
		return this.itemIds;
	}

    /**
     * Sets item ids.
     *
     * @param itemIds the item ids
     */
    public void setItemIds(String itemIds) {
		this.itemIds = itemIds;
	}

    /**
     * Gets operation context.
     *
     * @return the operation context
     */
    public KoubeiOperationContext getOperationContext() {
		return this.operationContext;
	}

    /**
     * Sets operation context.
     *
     * @param operationContext the operation context
     */
    public void setOperationContext(KoubeiOperationContext operationContext) {
		this.operationContext = operationContext;
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

}
