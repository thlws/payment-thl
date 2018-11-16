package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑广告系统吱口令内容详情
 *
 * @author auto create
 * @since 1.0, 2017-02-15 13:57:59
 */
public class KbAdvertContentShareCode extends AlipayObject {

	private static final long serialVersionUID = 6116475257828129439L;

	/**
	 * 吱口令内容详情
	 */
	@ApiField("share_code_desc")
	private String shareCodeDesc;

    /**
     * Gets share code desc.
     *
     * @return the share code desc
     */
    public String getShareCodeDesc() {
		return this.shareCodeDesc;
	}

    /**
     * Sets share code desc.
     *
     * @param shareCodeDesc the share code desc
     */
    public void setShareCodeDesc(String shareCodeDesc) {
		this.shareCodeDesc = shareCodeDesc;
	}

}
