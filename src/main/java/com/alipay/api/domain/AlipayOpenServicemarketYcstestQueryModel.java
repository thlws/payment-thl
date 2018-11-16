package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 时劼的测试api
 *
 * @author auto create
 * @since 1.0, 2018-08-06 15:21:00
 */
public class AlipayOpenServicemarketYcstestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8528773849939392855L;

	/**
	 * aaaa
	 */
	@ApiField("in_1")
	private String in1;

	/**
	 * 222
	 */
	@ApiField("in_2")
	private Boolean in2;

	/**
	 * 333
	 */
	@ApiField("in_3")
	private Date in3;

	/**
	 * 444
	 */
	@ApiField("in_4")
	private Long in4;

	/**
	 * 55
	 */
	@ApiField("in_5")
	private String in5;

	/**
	 * 66666
	 */
	@ApiField("in_6")
	private XwbTestData in6;

    /**
     * Gets in 1.
     *
     * @return the in 1
     */
    public String getIn1() {
		return this.in1;
	}

    /**
     * Sets in 1.
     *
     * @param in1 the in 1
     */
    public void setIn1(String in1) {
		this.in1 = in1;
	}

    /**
     * Gets in 2.
     *
     * @return the in 2
     */
    public Boolean getIn2() {
		return this.in2;
	}

    /**
     * Sets in 2.
     *
     * @param in2 the in 2
     */
    public void setIn2(Boolean in2) {
		this.in2 = in2;
	}

    /**
     * Gets in 3.
     *
     * @return the in 3
     */
    public Date getIn3() {
		return this.in3;
	}

    /**
     * Sets in 3.
     *
     * @param in3 the in 3
     */
    public void setIn3(Date in3) {
		this.in3 = in3;
	}

    /**
     * Gets in 4.
     *
     * @return the in 4
     */
    public Long getIn4() {
		return this.in4;
	}

    /**
     * Sets in 4.
     *
     * @param in4 the in 4
     */
    public void setIn4(Long in4) {
		this.in4 = in4;
	}

    /**
     * Gets in 5.
     *
     * @return the in 5
     */
    public String getIn5() {
		return this.in5;
	}

    /**
     * Sets in 5.
     *
     * @param in5 the in 5
     */
    public void setIn5(String in5) {
		this.in5 = in5;
	}

    /**
     * Gets in 6.
     *
     * @return the in 6
     */
    public XwbTestData getIn6() {
		return this.in6;
	}

    /**
     * Sets in 6.
     *
     * @param in6 the in 6
     */
    public void setIn6(XwbTestData in6) {
		this.in6 = in6;
	}

}
