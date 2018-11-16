package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询用户的保单列表
 *
 * @author auto create
 * @since 1.0, 2018-07-18 13:53:50
 */
public class AlipayInsUnderwriteUserPolicyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3777887848423699781L;

	/**
	 * 页码，必须为大于0的整数， 1表示第一页，2表示第2页，依次类推。不填默认值为1
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 每页记录条数，必须为大于0的整数，最大值为20,不填默认值为10
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 查询对应的保险干系人
	 */
	@ApiField("person")
	private InsQueryPerson person;

	/**
	 * 查询的保单对于的产品列表。查询返回的结果是这几个产品下的保单,格式为:
[产品码1,产品码2,...]
	 */
	@ApiListField("product_list")
	@ApiField("string")
	private List<String> productList;

	/**
	 * 保单状态.INEFFECTIVE:未生效、GUARANTEE:保障中、EXPIRED:已失效、SURRENDERRED:已退保、ALL: 所有保单  不填默认值为ALL(所有保单)
	 */
	@ApiField("status")
	private String status;

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
     * Gets person.
     *
     * @return the person
     */
    public InsQueryPerson getPerson() {
		return this.person;
	}

    /**
     * Sets person.
     *
     * @param person the person
     */
    public void setPerson(InsQueryPerson person) {
		this.person = person;
	}

    /**
     * Gets product list.
     *
     * @return the product list
     */
    public List<String> getProductList() {
		return this.productList;
	}

    /**
     * Sets product list.
     *
     * @param productList the product list
     */
    public void setProductList(List<String> productList) {
		this.productList = productList;
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
