package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ISV推送新违章信息
 *
 * @author auto create
 * @since 1.0, 2017-09-15 16:29:47
 */
public class AlipayEcoMycarViolationInfoPushModel extends AlipayObject {

	private static final long serialVersionUID = 8218313155412837554L;

	/**
	 * 1:可在线处理, 2:不可在线处理, 3:需查询确定
	 */
	@ApiField("deal_type")
	private String dealType;

	/**
	 * 暂无
	 */
	@ApiField("push_type")
	private String pushType;

	/**
	 * 违章地点
	 */
	@ApiField("vi_address")
	private String viAddress;

	/**
	 * 违章罚款金额
	 */
	@ApiField("vi_fine")
	private String viFine;

	/**
	 * 是否已处理, 0:已处理，1:未处理
	 */
	@ApiField("vi_handled")
	private String viHandled;

	/**
	 * 车牌号
	 */
	@ApiField("vi_number")
	private String viNumber;

	/**
	 * 违章扣分
	 */
	@ApiField("vi_point")
	private String viPoint;

	/**
	 * 违章时间(yyyyMMddhhmmss)
	 */
	@ApiField("vi_time")
	private Date viTime;

	/**
	 * 违章行为
	 */
	@ApiField("vi_type")
	private String viType;

    /**
     * Gets deal type.
     *
     * @return the deal type
     */
    public String getDealType() {
		return this.dealType;
	}

    /**
     * Sets deal type.
     *
     * @param dealType the deal type
     */
    public void setDealType(String dealType) {
		this.dealType = dealType;
	}

    /**
     * Gets push type.
     *
     * @return the push type
     */
    public String getPushType() {
		return this.pushType;
	}

    /**
     * Sets push type.
     *
     * @param pushType the push type
     */
    public void setPushType(String pushType) {
		this.pushType = pushType;
	}

    /**
     * Gets vi address.
     *
     * @return the vi address
     */
    public String getViAddress() {
		return this.viAddress;
	}

    /**
     * Sets vi address.
     *
     * @param viAddress the vi address
     */
    public void setViAddress(String viAddress) {
		this.viAddress = viAddress;
	}

    /**
     * Gets vi fine.
     *
     * @return the vi fine
     */
    public String getViFine() {
		return this.viFine;
	}

    /**
     * Sets vi fine.
     *
     * @param viFine the vi fine
     */
    public void setViFine(String viFine) {
		this.viFine = viFine;
	}

    /**
     * Gets vi handled.
     *
     * @return the vi handled
     */
    public String getViHandled() {
		return this.viHandled;
	}

    /**
     * Sets vi handled.
     *
     * @param viHandled the vi handled
     */
    public void setViHandled(String viHandled) {
		this.viHandled = viHandled;
	}

    /**
     * Gets vi number.
     *
     * @return the vi number
     */
    public String getViNumber() {
		return this.viNumber;
	}

    /**
     * Sets vi number.
     *
     * @param viNumber the vi number
     */
    public void setViNumber(String viNumber) {
		this.viNumber = viNumber;
	}

    /**
     * Gets vi point.
     *
     * @return the vi point
     */
    public String getViPoint() {
		return this.viPoint;
	}

    /**
     * Sets vi point.
     *
     * @param viPoint the vi point
     */
    public void setViPoint(String viPoint) {
		this.viPoint = viPoint;
	}

    /**
     * Gets vi time.
     *
     * @return the vi time
     */
    public Date getViTime() {
		return this.viTime;
	}

    /**
     * Sets vi time.
     *
     * @param viTime the vi time
     */
    public void setViTime(Date viTime) {
		this.viTime = viTime;
	}

    /**
     * Gets vi type.
     *
     * @return the vi type
     */
    public String getViType() {
		return this.viType;
	}

    /**
     * Sets vi type.
     *
     * @param viType the vi type
     */
    public void setViType(String viType) {
		this.viType = viType;
	}

}
