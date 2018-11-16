package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 匹配用户标签添加接口
 *
 * @author auto create
 * @since 1.0, 2018-07-25 13:53:51
 */
public class AlipayOpenPublicMatchuserLabelCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5242663478612987717L;

	/**
	 * 标签id，调用创建标签接口会返回label_id
	 */
	@ApiField("label_id")
	private String labelId;

	/**
	 * 标签值，由开发者自主指定，标签值类型要满足创建标签接口中data_type参数的限定。
	 */
	@ApiField("label_value")
	private String labelValue;

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
     * Gets label value.
     *
     * @return the label value
     */
    public String getLabelValue() {
		return this.labelValue;
	}

    /**
     * Sets label value.
     *
     * @param labelValue the label value
     */
    public void setLabelValue(String labelValue) {
		this.labelValue = labelValue;
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
