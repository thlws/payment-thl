package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 阶梯优惠折扣幅度模型
 *
 * @author auto create
 * @since 1.0, 2017-03-03 16:47:49
 */
public class DiscountRateModel extends AlipayObject {

	private static final long serialVersionUID = 6798535626494286296L;

	/**
	 * 折扣方式
	 */
	@ApiField("discount_dst_camp_prize_model")
	private DiscountDstCampPrizeModel discountDstCampPrizeModel;

	/**
	 * 交易金额下限必须为数字，大于0，最多2位小数，整数部分不能超过8位
	 */
	@ApiField("lower_trade_fee")
	private String lowerTradeFee;

	/**
	 * 奖品类型. 打折   满减   单笔减   阶梯优惠   抹零优惠    随机立减   订单金额减至 
     折扣方式
   REDUCE_TO_AMT("reduce_to_amt","优惠后价格")
   DISCOUNT("discount", "折扣方式"),
  REDUCE("reduce", "满立减"),
   SINGLE("single", "单笔减"),
	 */
	@ApiField("prize_type")
	private String prizeType;

	/**
	 * 满立减
	 */
	@ApiField("reduce_dst_camp_prize_model")
	private ReduceDstCampPrizeModel reduceDstCampPrizeModel;

	/**
	 * 优惠后价格 如果type选了reduce_to_amt 必填
	 */
	@ApiField("reduce_to_amt_dst_camp_prize_model")
	private ReduceToAmtDstCampPrizeModel reduceToAmtDstCampPrizeModel;

	/**
	 * 单笔减
	 */
	@ApiField("single_dst_camp_prize_model")
	private SingleDstCampPrizeModel singleDstCampPrizeModel;

	/**
	 * 交易金额上限必须为数字，大于0，最多2位小数，整数部分不能超过8位
	 */
	@ApiField("upper_trade_fee")
	private String upperTradeFee;

    /**
     * Gets discount dst camp prize entity.
     *
     * @return the discount dst camp prize entity
     */
    public DiscountDstCampPrizeModel getDiscountDstCampPrizeModel() {
		return this.discountDstCampPrizeModel;
	}

    /**
     * Sets discount dst camp prize entity.
     *
     * @param discountDstCampPrizeModel the discount dst camp prize entity
     */
    public void setDiscountDstCampPrizeModel(DiscountDstCampPrizeModel discountDstCampPrizeModel) {
		this.discountDstCampPrizeModel = discountDstCampPrizeModel;
	}

    /**
     * Gets lower trade fee.
     *
     * @return the lower trade fee
     */
    public String getLowerTradeFee() {
		return this.lowerTradeFee;
	}

    /**
     * Sets lower trade fee.
     *
     * @param lowerTradeFee the lower trade fee
     */
    public void setLowerTradeFee(String lowerTradeFee) {
		this.lowerTradeFee = lowerTradeFee;
	}

    /**
     * Gets prize type.
     *
     * @return the prize type
     */
    public String getPrizeType() {
		return this.prizeType;
	}

    /**
     * Sets prize type.
     *
     * @param prizeType the prize type
     */
    public void setPrizeType(String prizeType) {
		this.prizeType = prizeType;
	}

    /**
     * Gets reduce dst camp prize entity.
     *
     * @return the reduce dst camp prize entity
     */
    public ReduceDstCampPrizeModel getReduceDstCampPrizeModel() {
		return this.reduceDstCampPrizeModel;
	}

    /**
     * Sets reduce dst camp prize entity.
     *
     * @param reduceDstCampPrizeModel the reduce dst camp prize entity
     */
    public void setReduceDstCampPrizeModel(ReduceDstCampPrizeModel reduceDstCampPrizeModel) {
		this.reduceDstCampPrizeModel = reduceDstCampPrizeModel;
	}

    /**
     * Gets reduce to amt dst camp prize entity.
     *
     * @return the reduce to amt dst camp prize entity
     */
    public ReduceToAmtDstCampPrizeModel getReduceToAmtDstCampPrizeModel() {
		return this.reduceToAmtDstCampPrizeModel;
	}

    /**
     * Sets reduce to amt dst camp prize entity.
     *
     * @param reduceToAmtDstCampPrizeModel the reduce to amt dst camp prize entity
     */
    public void setReduceToAmtDstCampPrizeModel(ReduceToAmtDstCampPrizeModel reduceToAmtDstCampPrizeModel) {
		this.reduceToAmtDstCampPrizeModel = reduceToAmtDstCampPrizeModel;
	}

    /**
     * Gets single dst camp prize entity.
     *
     * @return the single dst camp prize entity
     */
    public SingleDstCampPrizeModel getSingleDstCampPrizeModel() {
		return this.singleDstCampPrizeModel;
	}

    /**
     * Sets single dst camp prize entity.
     *
     * @param singleDstCampPrizeModel the single dst camp prize entity
     */
    public void setSingleDstCampPrizeModel(SingleDstCampPrizeModel singleDstCampPrizeModel) {
		this.singleDstCampPrizeModel = singleDstCampPrizeModel;
	}

    /**
     * Gets upper trade fee.
     *
     * @return the upper trade fee
     */
    public String getUpperTradeFee() {
		return this.upperTradeFee;
	}

    /**
     * Sets upper trade fee.
     *
     * @param upperTradeFee the upper trade fee
     */
    public void setUpperTradeFee(String upperTradeFee) {
		this.upperTradeFee = upperTradeFee;
	}

}
