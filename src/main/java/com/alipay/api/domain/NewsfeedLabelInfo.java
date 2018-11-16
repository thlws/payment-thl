package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生活记录信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class NewsfeedLabelInfo extends AlipayObject {

	private static final long serialVersionUID = 6186821885144983842L;

	/**
	 * 根据主谓宾的格式生成动态的标题，此字段为谓语
	 */
	@ApiField("action")
	private String action;

	/**
	 * label行的跳转链接
	 */
	@ApiField("scheme")
	private String scheme;

	/**
	 * 根据主谓宾的格式生成动态的标题，此字段为宾语
	 */
	@ApiField("target")
	private String target;

    /**
     * Gets action.
     *
     * @return the action
     */
    public String getAction() {
		return this.action;
	}

    /**
     * Sets action.
     *
     * @param action the action
     */
    public void setAction(String action) {
		this.action = action;
	}

    /**
     * Gets scheme.
     *
     * @return the scheme
     */
    public String getScheme() {
		return this.scheme;
	}

    /**
     * Sets scheme.
     *
     * @param scheme the scheme
     */
    public void setScheme(String scheme) {
		this.scheme = scheme;
	}

    /**
     * Gets target.
     *
     * @return the target
     */
    public String getTarget() {
		return this.target;
	}

    /**
     * Sets target.
     *
     * @param target the target
     */
    public void setTarget(String target) {
		this.target = target;
	}

}
