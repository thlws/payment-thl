package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 子凭证详细信息
 *
 * @author auto create
 * @since 1.0, 2018-07-25 15:27:12
 */
public class SubCertDetail extends AlipayObject {

	private static final long serialVersionUID = 7147772369869912519L;

	/**
	 * 凭证批次号
	 */
	@ApiField("lot_num")
	private String lotNum;

	/**
	 * 子凭证有效点数
	 */
	@ApiField("lot_point")
	private String lotPoint;

	/**
	 * 子凭证编号
	 */
	@ApiField("sub_lotnum")
	private String subLotnum;

    /**
     * Gets lot num.
     *
     * @return the lot num
     */
    public String getLotNum() {
		return this.lotNum;
	}

    /**
     * Sets lot num.
     *
     * @param lotNum the lot num
     */
    public void setLotNum(String lotNum) {
		this.lotNum = lotNum;
	}

    /**
     * Gets lot point.
     *
     * @return the lot point
     */
    public String getLotPoint() {
		return this.lotPoint;
	}

    /**
     * Sets lot point.
     *
     * @param lotPoint the lot point
     */
    public void setLotPoint(String lotPoint) {
		this.lotPoint = lotPoint;
	}

    /**
     * Gets sub lotnum.
     *
     * @return the sub lotnum
     */
    public String getSubLotnum() {
		return this.subLotnum;
	}

    /**
     * Sets sub lotnum.
     *
     * @param subLotnum the sub lotnum
     */
    public void setSubLotnum(String subLotnum) {
		this.subLotnum = subLotnum;
	}

}
