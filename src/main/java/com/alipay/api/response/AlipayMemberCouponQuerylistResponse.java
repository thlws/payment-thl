package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.Coupon;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.member.coupon.querylist response.
 *
 * @author auto create
 * @since 1.0, 2017-04-14 11:46:40
 */
public class AlipayMemberCouponQuerylistResponse extends AlipayResponse {

	private static final long serialVersionUID = 1674272624171846665L;

	/** 
	 * 券信息数组.
如果没有查询到券信息，则为数组长度为0。
否则返回券信息数组
	 */
	@ApiListField("coupon_list")
	@ApiField("coupon")
	private List<Coupon> couponList;

	/** 
	 * 请求成功时，不存在本参数；
请求失败时，本参数为错误代码，参见“7  错误码”。
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 请求成功时，不存在本参数；
请求失败时，本参数返回具体的错误原因。
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/** 
	 * 本轮查询返回的数量
	 */
	@ApiField("list_size")
	private String listSize;

	/** 
	 * 整个业务处理成功时
返回T否则返回F。
具体的错误码和 信息科参考error_code和error_msg信息
	 */
	@ApiField("success_code")
	private String successCode;

	/** 
	 * 总记录数
	 */
	@ApiField("total_num")
	private String totalNum;

    /**
     * Sets coupon list.
     *
     * @param couponList the coupon list
     */
    public void setCouponList(List<Coupon> couponList) {
		this.couponList = couponList;
	}

    /**
     * Gets coupon list.
     *
     * @return the coupon list
     */
    public List<Coupon> getCouponList( ) {
		return this.couponList;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

    /**
     * Sets error msg.
     *
     * @param errorMsg the error msg
     */
    public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

    /**
     * Gets error msg.
     *
     * @return the error msg
     */
    public String getErrorMsg( ) {
		return this.errorMsg;
	}

    /**
     * Sets list size.
     *
     * @param listSize the list size
     */
    public void setListSize(String listSize) {
		this.listSize = listSize;
	}

    /**
     * Gets list size.
     *
     * @return the list size
     */
    public String getListSize( ) {
		return this.listSize;
	}

    /**
     * Sets success code.
     *
     * @param successCode the success code
     */
    public void setSuccessCode(String successCode) {
		this.successCode = successCode;
	}

    /**
     * Gets success code.
     *
     * @return the success code
     */
    public String getSuccessCode( ) {
		return this.successCode;
	}

    /**
     * Sets total num.
     *
     * @param totalNum the total num
     */
    public void setTotalNum(String totalNum) {
		this.totalNum = totalNum;
	}

    /**
     * Gets total num.
     *
     * @return the total num
     */
    public String getTotalNum( ) {
		return this.totalNum;
	}

}
