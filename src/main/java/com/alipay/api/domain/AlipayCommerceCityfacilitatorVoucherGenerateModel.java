package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 地铁购票核销码发码
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:20
 */
public class AlipayCommerceCityfacilitatorVoucherGenerateModel extends AlipayObject {

	private static final long serialVersionUID = 6646756985163129811L;

	/**
	 * 城市编码请参考查询：http://www.stats.gov.cn/tjsj/tjbz/xzqhdm/201504/t20150415_712722.html；
已支持城市：广州 440100，深圳 440300，杭州330100。
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 起点站站点编码
	 */
	@ApiField("site_begin")
	private String siteBegin;

	/**
	 * 终点站站点编码
	 */
	@ApiField("site_end")
	private String siteEnd;

	/**
	 * 地铁票购票数量
	 */
	@ApiField("ticket_num")
	private String ticketNum;

	/**
	 * 单张票价，元为单价
	 */
	@ApiField("ticket_price")
	private String ticketPrice;

	/**
	 * 地铁票种类
	 */
	@ApiField("ticket_type")
	private String ticketType;

	/**
	 * 订单总金额，元为单位
	 */
	@ApiField("total_fee")
	private String totalFee;

	/**
	 * 支付宝交易号（交易支付时，必须通过指定sellerId：2088121612215201，将钱支付到指定的中间户中）
	 */
	@ApiField("trade_no")
	private String tradeNo;

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
     * Gets site begin.
     *
     * @return the site begin
     */
    public String getSiteBegin() {
		return this.siteBegin;
	}

    /**
     * Sets site begin.
     *
     * @param siteBegin the site begin
     */
    public void setSiteBegin(String siteBegin) {
		this.siteBegin = siteBegin;
	}

    /**
     * Gets site end.
     *
     * @return the site end
     */
    public String getSiteEnd() {
		return this.siteEnd;
	}

    /**
     * Sets site end.
     *
     * @param siteEnd the site end
     */
    public void setSiteEnd(String siteEnd) {
		this.siteEnd = siteEnd;
	}

    /**
     * Gets ticket num.
     *
     * @return the ticket num
     */
    public String getTicketNum() {
		return this.ticketNum;
	}

    /**
     * Sets ticket num.
     *
     * @param ticketNum the ticket num
     */
    public void setTicketNum(String ticketNum) {
		this.ticketNum = ticketNum;
	}

    /**
     * Gets ticket price.
     *
     * @return the ticket price
     */
    public String getTicketPrice() {
		return this.ticketPrice;
	}

    /**
     * Sets ticket price.
     *
     * @param ticketPrice the ticket price
     */
    public void setTicketPrice(String ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

    /**
     * Gets ticket type.
     *
     * @return the ticket type
     */
    public String getTicketType() {
		return this.ticketType;
	}

    /**
     * Sets ticket type.
     *
     * @param ticketType the ticket type
     */
    public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}

    /**
     * Gets total fee.
     *
     * @return the total fee
     */
    public String getTotalFee() {
		return this.totalFee;
	}

    /**
     * Sets total fee.
     *
     * @param totalFee the total fee
     */
    public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}

    /**
     * Gets trade no.
     *
     * @return the trade no
     */
    public String getTradeNo() {
		return this.tradeNo;
	}

    /**
     * Sets trade no.
     *
     * @param tradeNo the trade no
     */
    public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
