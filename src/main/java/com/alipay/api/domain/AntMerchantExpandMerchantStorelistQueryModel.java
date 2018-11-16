package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户外部门店查询接口
 *
 * @author auto create
 * @since 1.0, 2018-07-03 13:52:35
 */
public class AntMerchantExpandMerchantStorelistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7713556693941698667L;

	/**
	 * 可选：  true / false 。
当is_include_cognate = true ， 指定pid为空， 查询商户下所有pid的店铺
当is_include_cognate = true ，指定pid不为空时，查询指定pid的店铺
当is_include_cognate = false ，指定pid为空时，   查询当前商pid的店铺
当is_include_cognate = false ，指定pid不为空时，查询指定pid的店铺
	 */
	@ApiField("is_include_cognate")
	private String isIncludeCognate;

	/**
	 * 页码，必须为大于0的整数， 1表示第一页，2表示第2页，依次类推。
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页记录条数，必须为大于0的整数，最大值为30
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 指定的商户pid，如果指定， 只返回此pid的店铺信息。(此pid必须是商户自己的)
	 */
	@ApiField("pid")
	private String pid;

    /**
     * Gets is include cognate.
     *
     * @return the is include cognate
     */
    public String getIsIncludeCognate() {
		return this.isIncludeCognate;
	}

    /**
     * Sets is include cognate.
     *
     * @param isIncludeCognate the is include cognate
     */
    public void setIsIncludeCognate(String isIncludeCognate) {
		this.isIncludeCognate = isIncludeCognate;
	}

    /**
     * Gets page num.
     *
     * @return the page num
     */
    public Long getPageNum() {
		return this.pageNum;
	}

    /**
     * Sets page num.
     *
     * @param pageNum the page num
     */
    public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
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
     * Gets pid.
     *
     * @return the pid
     */
    public String getPid() {
		return this.pid;
	}

    /**
     * Sets pid.
     *
     * @param pid the pid
     */
    public void setPid(String pid) {
		this.pid = pid;
	}

}
