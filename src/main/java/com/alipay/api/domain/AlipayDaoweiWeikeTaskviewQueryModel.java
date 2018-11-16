package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询微客任务视图
 *
 * @author auto create
 * @since 1.0, 2017-04-25 14:22:41
 */
public class AlipayDaoweiWeikeTaskviewQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2875995676831584537L;

	/**
	 * 当前城市城市码,精确到地级市级别.城市编码参考最新国家标准http://www.stats.gov.cn/tjsj/tjbz/xzqhdm/201703/t20170310_1471429.html
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 第三方调用场景来源,由微客分配
	 */
	@ApiField("source")
	private String source;

    /**
     * Gets city code.
     *
     * @return the city code
     */
    public String getCityCode() {
		return this.cityCode;
	}

    /**
     * Sets city code.
     *
     * @param cityCode the city code
     */
    public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

    /**
     * Gets source.
     *
     * @return the source
     */
    public String getSource() {
		return this.source;
	}

    /**
     * Sets source.
     *
     * @param source the source
     */
    public void setSource(String source) {
		this.source = source;
	}

}
