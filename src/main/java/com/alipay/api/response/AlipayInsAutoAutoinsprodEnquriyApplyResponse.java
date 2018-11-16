package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CarModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.auto.autoinsprod.enquriy.apply response.
 *
 * @author auto create
 * @since 1.0, 2018-01-09 11:59:57
 */
public class AlipayInsAutoAutoinsprodEnquriyApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6655548688636161379L;

	/** 
	 * 车辆的品牌型号列表
	 */
	@ApiListField("car_model")
	@ApiField("car_model")
	private List<CarModel> carModel;

	/** 
	 * 车险询价申请号
	 */
	@ApiField("enquiry_biz_id")
	private String enquiryBizId;

	/** 
	 * 外部询价申请业务单号（幂等字段）
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

    /**
     * Sets car entity.
     *
     * @param carModel the car entity
     */
    public void setCarModel(List<CarModel> carModel) {
		this.carModel = carModel;
	}

    /**
     * Gets car entity.
     *
     * @return the car entity
     */
    public List<CarModel> getCarModel( ) {
		return this.carModel;
	}

    /**
     * Sets enquiry biz id.
     *
     * @param enquiryBizId the enquiry biz id
     */
    public void setEnquiryBizId(String enquiryBizId) {
		this.enquiryBizId = enquiryBizId;
	}

    /**
     * Gets enquiry biz id.
     *
     * @return the enquiry biz id
     */
    public String getEnquiryBizId( ) {
		return this.enquiryBizId;
	}

    /**
     * Sets out biz no.
     *
     * @param outBizNo the out biz no
     */
    public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

    /**
     * Gets out biz no.
     *
     * @return the out biz no
     */
    public String getOutBizNo( ) {
		return this.outBizNo;
	}

}
