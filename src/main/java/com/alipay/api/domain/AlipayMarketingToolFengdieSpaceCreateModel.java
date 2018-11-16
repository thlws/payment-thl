package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建空间
 *
 * @author auto create
 * @since 1.0, 2018-08-19 16:17:32
 */
public class AlipayMarketingToolFengdieSpaceCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5553432855589874561L;

	/**
	 * 欲创建的空间名称。应注意云凤蝶中每个空间有唯一的空间名称，尽量使用自己平台的前缀。另外空间名称只允许是中英文字符数字下划线组成的字符串。
	 */
	@ApiField("title")
	private String title;

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
