package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 云凤蝶空间详情模型
 *
 * @author auto create
 * @since 1.0, 2018-05-17 16:01:04
 */
public class FengdieSpaceDetailModel extends AlipayObject {

	private static final long serialVersionUID = 7688969171479939464L;

	/**
	 * 空间可用域名列表，云凤蝶站点发布后链接可用采用的域名
	 */
	@ApiListField("domains")
	@ApiField("fengdie_space_domains")
	private List<FengdieSpaceDomains> domains;

	/**
	 * 空间创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 空间 ID
	 */
	@ApiField("space_id")
	private String spaceId;

	/**
	 * 空间标题
	 */
	@ApiField("title")
	private String title;

    /**
     * Gets domains.
     *
     * @return the domains
     */
    public List<FengdieSpaceDomains> getDomains() {
		return this.domains;
	}

    /**
     * Sets domains.
     *
     * @param domains the domains
     */
    public void setDomains(List<FengdieSpaceDomains> domains) {
		this.domains = domains;
	}

    /**
     * Gets gmt create.
     *
     * @return the gmt create
     */
    public String getGmtCreate() {
		return this.gmtCreate;
	}

    /**
     * Sets gmt create.
     *
     * @param gmtCreate the gmt create
     */
    public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

    /**
     * Gets space id.
     *
     * @return the space id
     */
    public String getSpaceId() {
		return this.spaceId;
	}

    /**
     * Sets space id.
     *
     * @param spaceId the space id
     */
    public void setSpaceId(String spaceId) {
		this.spaceId = spaceId;
	}

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
		return this.title;
	}

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
		this.title = title;
	}

}
