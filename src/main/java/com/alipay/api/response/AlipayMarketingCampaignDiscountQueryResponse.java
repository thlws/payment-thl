package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DiscountDstCampPrizeModel;
import com.alipay.api.domain.DstCampRuleModel;
import com.alipay.api.domain.DateAreaModel;
import com.alipay.api.domain.RandomDiscountDstCampPrizeModel;
import com.alipay.api.domain.ReduceDstCampPrizeModel;
import com.alipay.api.domain.ReduceToDiscountDstCampPrizeModel;
import com.alipay.api.domain.ResetZeroDstCampPrizeModel;
import com.alipay.api.domain.SingleDstCampPrizeModel;
import com.alipay.api.domain.StagedDiscountDstCampPrizeModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.discount.query response.
 *
 * @author auto create
 * @since 1.0, 2017-03-03 16:47:49
 */
public class AlipayMarketingCampaignDiscountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3496737641332779613L;

	/** 
	 * 活动唯一标示
	 */
	@ApiField("camp_code")
	private String campCode;

	/** 
	 * 用于账户立减优惠,渠道立减优惠活动时,在收银台页面显示给会员看,最多512个字符，汉字、英文字母、数字都算一个，本输入框支持简单的html符号。
	 */
	@ApiField("camp_desc")
	private String campDesc;

	/** 
	 * camp_id:活动id
	 */
	@ApiField("camp_id")
	private String campId;

	/** 
	 * 活动名称
	 */
	@ApiField("camp_name")
	private String campName;

	/** 
	 * 活动slogan.活动Slogan会在前台显示，谨慎填写
	 */
	@ApiField("camp_slogan")
	private String campSlogan;

	/** 
	 * 活动状态，已经创建，暂停，上线，结束
	 */
	@ApiField("camp_status")
	private String campStatus;

	/** 
	 * 折扣方式模型 如果类型选了discount,则这个模型必须输入
	 */
	@ApiField("discount_dst_camp_prize_model")
	private DiscountDstCampPrizeModel discountDstCampPrizeModel;

	/** 
	 * 立减规则模型
	 */
	@ApiField("dst_camp_rule_model")
	private DstCampRuleModel dstCampRuleModel;

	/** 
	 * 活动子时间，可以不传
	 */
	@ApiListField("dst_camp_sub_time_model_list")
	@ApiField("date_area_model")
	private List<DateAreaModel> dstCampSubTimeModelList;

	/** 
	 * 活动结束时间
	 */
	@ApiField("gmt_end")
	private String gmtEnd;

	/** 
	 * 活动开始时间
	 */
	@ApiField("gmt_start")
	private String gmtStart;

	/** 
	 * 奖品类型. 打折   满减   单笔减   阶梯优惠   抹零优惠    随机立减   订单金额减至 
    折扣方式
     DISCOUNT("discount", "折扣方式"),
     REDUCE("reduce", "满立减"),
    SINGLE("single", "单笔减"),
     STAGED_DISCOUNT("staged_discount", "阶梯优惠"),
     RESET_ZERO_DISCOUNT("reset_zero_discount", "抹零优惠"),
   RANDOM_DISCOUNT("random", "随机立减");
    REDUCE_TO_DISCOUNT("reduce_to_discount","订单金额减至 ")
	 */
	@ApiField("prize_type")
	private String prizeType;

	/** 
	 * 随机立减模型如果类型选了random,则这个模型必须输入
	 */
	@ApiField("random_discount_dst_camp_prize_model")
	private RandomDiscountDstCampPrizeModel randomDiscountDstCampPrizeModel;

	/** 
	 * 满立减奖品模型 如果类型选了reduce,则这个模型必须输入
	 */
	@ApiField("reduce_dst_camp_prize_model")
	private ReduceDstCampPrizeModel reduceDstCampPrizeModel;

	/** 
	 * 订单金额减至模型如果类型选了reduce_to_discount,则这个模型必须输入
	 */
	@ApiField("reduce_to_discount_dst_camp_prize_model")
	private ReduceToDiscountDstCampPrizeModel reduceToDiscountDstCampPrizeModel;

	/** 
	 * 抹零优惠模型如果类型选了reset_zero_discount,则这个模型必须输入
	 */
	@ApiField("reset_zero_dst_camp_prize_model")
	private ResetZeroDstCampPrizeModel resetZeroDstCampPrizeModel;

	/** 
	 * 单笔减奖品模型如果类型选了single,则这个模型必须输入
	 */
	@ApiField("single_dst_camp_prize_model")
	private SingleDstCampPrizeModel singleDstCampPrizeModel;

	/** 
	 * 阶梯优惠如果类型选了staged_discount,则这个模型必须输入
	 */
	@ApiField("staged_discount_dst_camp_prize_model")
	private StagedDiscountDstCampPrizeModel stagedDiscountDstCampPrizeModel;

    /**
     * Sets camp code.
     *
     * @param campCode the camp code
     */
    public void setCampCode(String campCode) {
		this.campCode = campCode;
	}

    /**
     * Gets camp code.
     *
     * @return the camp code
     */
    public String getCampCode( ) {
		return this.campCode;
	}

    /**
     * Sets camp desc.
     *
     * @param campDesc the camp desc
     */
    public void setCampDesc(String campDesc) {
		this.campDesc = campDesc;
	}

    /**
     * Gets camp desc.
     *
     * @return the camp desc
     */
    public String getCampDesc( ) {
		return this.campDesc;
	}

    /**
     * Sets camp id.
     *
     * @param campId the camp id
     */
    public void setCampId(String campId) {
		this.campId = campId;
	}

    /**
     * Gets camp id.
     *
     * @return the camp id
     */
    public String getCampId( ) {
		return this.campId;
	}

    /**
     * Sets camp name.
     *
     * @param campName the camp name
     */
    public void setCampName(String campName) {
		this.campName = campName;
	}

    /**
     * Gets camp name.
     *
     * @return the camp name
     */
    public String getCampName( ) {
		return this.campName;
	}

    /**
     * Sets camp slogan.
     *
     * @param campSlogan the camp slogan
     */
    public void setCampSlogan(String campSlogan) {
		this.campSlogan = campSlogan;
	}

    /**
     * Gets camp slogan.
     *
     * @return the camp slogan
     */
    public String getCampSlogan( ) {
		return this.campSlogan;
	}

    /**
     * Sets camp status.
     *
     * @param campStatus the camp status
     */
    public void setCampStatus(String campStatus) {
		this.campStatus = campStatus;
	}

    /**
     * Gets camp status.
     *
     * @return the camp status
     */
    public String getCampStatus( ) {
		return this.campStatus;
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
     * Gets discount dst camp prize entity.
     *
     * @return the discount dst camp prize entity
     */
    public DiscountDstCampPrizeModel getDiscountDstCampPrizeModel( ) {
		return this.discountDstCampPrizeModel;
	}

    /**
     * Sets dst camp rule entity.
     *
     * @param dstCampRuleModel the dst camp rule entity
     */
    public void setDstCampRuleModel(DstCampRuleModel dstCampRuleModel) {
		this.dstCampRuleModel = dstCampRuleModel;
	}

    /**
     * Gets dst camp rule entity.
     *
     * @return the dst camp rule entity
     */
    public DstCampRuleModel getDstCampRuleModel( ) {
		return this.dstCampRuleModel;
	}

    /**
     * Sets dst camp sub time entity list.
     *
     * @param dstCampSubTimeModelList the dst camp sub time entity list
     */
    public void setDstCampSubTimeModelList(List<DateAreaModel> dstCampSubTimeModelList) {
		this.dstCampSubTimeModelList = dstCampSubTimeModelList;
	}

    /**
     * Gets dst camp sub time entity list.
     *
     * @return the dst camp sub time entity list
     */
    public List<DateAreaModel> getDstCampSubTimeModelList( ) {
		return this.dstCampSubTimeModelList;
	}

    /**
     * Sets gmt end.
     *
     * @param gmtEnd the gmt end
     */
    public void setGmtEnd(String gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

    /**
     * Gets gmt end.
     *
     * @return the gmt end
     */
    public String getGmtEnd( ) {
		return this.gmtEnd;
	}

    /**
     * Sets gmt start.
     *
     * @param gmtStart the gmt start
     */
    public void setGmtStart(String gmtStart) {
		this.gmtStart = gmtStart;
	}

    /**
     * Gets gmt start.
     *
     * @return the gmt start
     */
    public String getGmtStart( ) {
		return this.gmtStart;
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
     * Gets prize type.
     *
     * @return the prize type
     */
    public String getPrizeType( ) {
		return this.prizeType;
	}

    /**
     * Sets random discount dst camp prize entity.
     *
     * @param randomDiscountDstCampPrizeModel the random discount dst camp prize entity
     */
    public void setRandomDiscountDstCampPrizeModel(RandomDiscountDstCampPrizeModel randomDiscountDstCampPrizeModel) {
		this.randomDiscountDstCampPrizeModel = randomDiscountDstCampPrizeModel;
	}

    /**
     * Gets random discount dst camp prize entity.
     *
     * @return the random discount dst camp prize entity
     */
    public RandomDiscountDstCampPrizeModel getRandomDiscountDstCampPrizeModel( ) {
		return this.randomDiscountDstCampPrizeModel;
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
     * Gets reduce dst camp prize entity.
     *
     * @return the reduce dst camp prize entity
     */
    public ReduceDstCampPrizeModel getReduceDstCampPrizeModel( ) {
		return this.reduceDstCampPrizeModel;
	}

    /**
     * Sets reduce to discount dst camp prize entity.
     *
     * @param reduceToDiscountDstCampPrizeModel the reduce to discount dst camp prize entity
     */
    public void setReduceToDiscountDstCampPrizeModel(ReduceToDiscountDstCampPrizeModel reduceToDiscountDstCampPrizeModel) {
		this.reduceToDiscountDstCampPrizeModel = reduceToDiscountDstCampPrizeModel;
	}

    /**
     * Gets reduce to discount dst camp prize entity.
     *
     * @return the reduce to discount dst camp prize entity
     */
    public ReduceToDiscountDstCampPrizeModel getReduceToDiscountDstCampPrizeModel( ) {
		return this.reduceToDiscountDstCampPrizeModel;
	}

    /**
     * Sets reset zero dst camp prize entity.
     *
     * @param resetZeroDstCampPrizeModel the reset zero dst camp prize entity
     */
    public void setResetZeroDstCampPrizeModel(ResetZeroDstCampPrizeModel resetZeroDstCampPrizeModel) {
		this.resetZeroDstCampPrizeModel = resetZeroDstCampPrizeModel;
	}

    /**
     * Gets reset zero dst camp prize entity.
     *
     * @return the reset zero dst camp prize entity
     */
    public ResetZeroDstCampPrizeModel getResetZeroDstCampPrizeModel( ) {
		return this.resetZeroDstCampPrizeModel;
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
     * Gets single dst camp prize entity.
     *
     * @return the single dst camp prize entity
     */
    public SingleDstCampPrizeModel getSingleDstCampPrizeModel( ) {
		return this.singleDstCampPrizeModel;
	}

    /**
     * Sets staged discount dst camp prize entity.
     *
     * @param stagedDiscountDstCampPrizeModel the staged discount dst camp prize entity
     */
    public void setStagedDiscountDstCampPrizeModel(StagedDiscountDstCampPrizeModel stagedDiscountDstCampPrizeModel) {
		this.stagedDiscountDstCampPrizeModel = stagedDiscountDstCampPrizeModel;
	}

    /**
     * Gets staged discount dst camp prize entity.
     *
     * @return the staged discount dst camp prize entity
     */
    public StagedDiscountDstCampPrizeModel getStagedDiscountDstCampPrizeModel( ) {
		return this.stagedDiscountDstCampPrizeModel;
	}

}
