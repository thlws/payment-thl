package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 圈人规则查询
 *
 * @author auto create
 * @since 1.0, 2016-12-19 15:27:36
 */
public class AlipayMarketingCampaignRuleRulelistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4397937793253723138L;

	/**
	 * 签约商户下属子机构唯一编号
	 */
	@ApiField("mpid")
	private String mpid;

	/**
	 * 页码，从1开始
	 */
	@ApiField("pageno")
	private String pageno;

	/**
	 * 每页大小
	 */
	@ApiField("pagesize")
	private String pagesize;

    /**
     * Gets mpid.
     *
     * @return the mpid
     */
    public String getMpid() {
		return this.mpid;
	}

    /**
     * Sets mpid.
     *
     * @param mpid the mpid
     */
    public void setMpid(String mpid) {
		this.mpid = mpid;
	}

    /**
     * Gets pageno.
     *
     * @return the pageno
     */
    public String getPageno() {
		return this.pageno;
	}

    /**
     * Sets pageno.
     *
     * @param pageno the pageno
     */
    public void setPageno(String pageno) {
		this.pageno = pageno;
	}

    /**
     * Gets pagesize.
     *
     * @return the pagesize
     */
    public String getPagesize() {
		return this.pagesize;
	}

    /**
     * Sets pagesize.
     *
     * @param pagesize the pagesize
     */
    public void setPagesize(String pagesize) {
		this.pagesize = pagesize;
	}

}
