package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 匹配用户标签删除接口
 *
 * @author auto create
 * @since 1.0, 2018-07-25 13:51:59
 */
public class AlipayOpenPublicMatchuserLabelDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 8433556867574966521L;

	/**
	 * 标签id
	 */
	@ApiField("label_id")
	private String labelId;

	/**
	 * 支付宝用户匹配器列表，最多传入10条
	 */
	@ApiListField("matchers")
	@ApiField("matcher")
	private List<Matcher> matchers;

    /**
     * Gets label id.
     *
     * @return the label id
     */
    public String getLabelId() {
		return this.labelId;
	}

    /**
     * Sets label id.
     *
     * @param labelId the label id
     */
    public void setLabelId(String labelId) {
		this.labelId = labelId;
	}

    /**
     * Gets matchers.
     *
     * @return the matchers
     */
    public List<Matcher> getMatchers() {
		return this.matchers;
	}

    /**
     * Sets matchers.
     *
     * @param matchers the matchers
     */
    public void setMatchers(List<Matcher> matchers) {
		this.matchers = matchers;
	}

}
