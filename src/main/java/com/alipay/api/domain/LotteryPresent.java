package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 彩票赠送订单
 *
 * @author auto create
 * @since 1.0, 2017-07-24 14:37:51
 */
public class LotteryPresent extends AlipayObject {

	private static final long serialVersionUID = 8644754411893851954L;

	/**
	 * 用户的支付宝用户ID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 彩种名称
	 */
	@ApiField("lottery_type_name")
	private String lotteryTypeName;

	/**
	 * 赠送时间，格式yyyy-MM-dd hh:mm:ss
	 */
	@ApiField("present_date")
	private String presentDate;

	/**
	 * 订单ID
	 */
	@ApiField("present_id")
	private Long presentId;

	/**
	 * 彩票注数
	 */
	@ApiField("stake_count")
	private Long stakeCount;

	/**
	 * 订单状态，含义如下：0-卖家资金未冻结;1-买家未领取;2-买家己领取;3-己创建彩票订单;4-彩票订单出票成功;5-资金己转交代理商;6-订单己过期，待退款;7-冻结资金己退款;8-订单取消。
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 订单状态描述，参见status描述。
	 */
	@ApiField("status_desc")
	private String statusDesc;

	/**
	 * 赠言，不超过20个汉字
	 */
	@ApiField("sweety_words")
	private String sweetyWords;

	/**
	 * 中奖金额，单位：分，为0表示未中奖
	 */
	@ApiField("win_fee")
	private Long winFee;

    /**
     * Gets alipay user id.
     *
     * @return the alipay user id
     */
    public String getAlipayUserId() {
		return this.alipayUserId;
	}

    /**
     * Sets alipay user id.
     *
     * @param alipayUserId the alipay user id
     */
    public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

    /**
     * Gets lottery type name.
     *
     * @return the lottery type name
     */
    public String getLotteryTypeName() {
		return this.lotteryTypeName;
	}

    /**
     * Sets lottery type name.
     *
     * @param lotteryTypeName the lottery type name
     */
    public void setLotteryTypeName(String lotteryTypeName) {
		this.lotteryTypeName = lotteryTypeName;
	}

    /**
     * Gets present date.
     *
     * @return the present date
     */
    public String getPresentDate() {
		return this.presentDate;
	}

    /**
     * Sets present date.
     *
     * @param presentDate the present date
     */
    public void setPresentDate(String presentDate) {
		this.presentDate = presentDate;
	}

    /**
     * Gets present id.
     *
     * @return the present id
     */
    public Long getPresentId() {
		return this.presentId;
	}

    /**
     * Sets present id.
     *
     * @param presentId the present id
     */
    public void setPresentId(Long presentId) {
		this.presentId = presentId;
	}

    /**
     * Gets stake count.
     *
     * @return the stake count
     */
    public Long getStakeCount() {
		return this.stakeCount;
	}

    /**
     * Sets stake count.
     *
     * @param stakeCount the stake count
     */
    public void setStakeCount(Long stakeCount) {
		this.stakeCount = stakeCount;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public Long getStatus() {
		return this.status;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(Long status) {
		this.status = status;
	}

    /**
     * Gets status desc.
     *
     * @return the status desc
     */
    public String getStatusDesc() {
		return this.statusDesc;
	}

    /**
     * Sets status desc.
     *
     * @param statusDesc the status desc
     */
    public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}

    /**
     * Gets sweety words.
     *
     * @return the sweety words
     */
    public String getSweetyWords() {
		return this.sweetyWords;
	}

    /**
     * Sets sweety words.
     *
     * @param sweetyWords the sweety words
     */
    public void setSweetyWords(String sweetyWords) {
		this.sweetyWords = sweetyWords;
	}

    /**
     * Gets win fee.
     *
     * @return the win fee
     */
    public Long getWinFee() {
		return this.winFee;
	}

    /**
     * Sets win fee.
     *
     * @param winFee the win fee
     */
    public void setWinFee(Long winFee) {
		this.winFee = winFee;
	}

}
