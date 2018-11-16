package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MyObjectDdd;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.echo.send response.
 *
 * @author auto create
 * @since 1.0, 2018-08-09 22:10:00
 */
public class AlipayOpenEchoSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 6766657681437198122L;

	/** 
	 * DDDD
	 */
	@ApiField("obj")
	private MyObjectDdd obj;

	/** 
	 * hello world
	 */
	@ApiField("out_a")
	private String outA;

	/** 
	 * Number
	 */
	@ApiField("out_b")
	private Long outB;

	/** 
	 * Price
	 */
	@ApiField("out_c")
	private String outC;

	/** 
	 * xxx
	 */
	@ApiField("out_d")
	private String outD;

	/** 
	 * hello world
	 */
	@ApiField("word")
	private String word;

    /**
     * Sets obj.
     *
     * @param obj the obj
     */
    public void setObj(MyObjectDdd obj) {
		this.obj = obj;
	}

    /**
     * Gets obj.
     *
     * @return the obj
     */
    public MyObjectDdd getObj( ) {
		return this.obj;
	}

    /**
     * Sets out a.
     *
     * @param outA the out a
     */
    public void setOutA(String outA) {
		this.outA = outA;
	}

    /**
     * Gets out a.
     *
     * @return the out a
     */
    public String getOutA( ) {
		return this.outA;
	}

    /**
     * Sets out b.
     *
     * @param outB the out b
     */
    public void setOutB(Long outB) {
		this.outB = outB;
	}

    /**
     * Gets out b.
     *
     * @return the out b
     */
    public Long getOutB( ) {
		return this.outB;
	}

    /**
     * Sets out c.
     *
     * @param outC the out c
     */
    public void setOutC(String outC) {
		this.outC = outC;
	}

    /**
     * Gets out c.
     *
     * @return the out c
     */
    public String getOutC( ) {
		return this.outC;
	}

    /**
     * Sets out d.
     *
     * @param outD the out d
     */
    public void setOutD(String outD) {
		this.outD = outD;
	}

    /**
     * Gets out d.
     *
     * @return the out d
     */
    public String getOutD( ) {
		return this.outD;
	}

    /**
     * Sets word.
     *
     * @param word the word
     */
    public void setWord(String word) {
		this.word = word;
	}

    /**
     * Gets word.
     *
     * @return the word
     */
    public String getWord( ) {
		return this.word;
	}

}
