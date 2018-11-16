package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 推荐菜数据
 *
 * @author auto create
 * @since 1.0, 2017-02-13 14:20:35
 */
public class ItemDiagnoseDetail extends AlipayObject {

	private static final long serialVersionUID = 8778968854237797185L;

	/**
	 * 菜品的热度等级	菜品热度等级（0/0.5/1/1.5/2/2.5/3/3.5/4/4.5/5）该字段是对热度值做离散化，方便用户用图像化表达热度
	 */
	@ApiField("hot_grade")
	private Long hotGrade;

	/**
	 * 菜品的热度值	保留两位小数，热度值在0~100分之间
	 */
	@ApiField("hot_value")
	private Long hotValue;

	/**
	 * 菜品诊断：001-明星菜品；002潜力菜品；003其他菜品。
	 */
	@ApiField("item_diagnose")
	private String itemDiagnose;

	/**
	 * 诊断描述  明星菜品：销量和复购多指标表现强劲，可力推该菜品；潜力菜品：高复购销量适中，可适当增加此类菜品推荐；其他菜品：除明星菜品和潜力菜品外的其他菜品。
	 */
	@ApiField("item_diagnose_desc")
	private String itemDiagnoseDesc;

	/**
	 * 外部商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 菜品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 单位分
	 */
	@ApiField("item_price")
	private Long itemPrice;

	/**
	 * 近90天消费的支付宝用户数
	 */
	@ApiField("rec_ninety_consume_uid_cnt")
	private Long recNinetyConsumeUidCnt;

	/**
	 * 近90天购买2次及以上的支付宝用户数
	 */
	@ApiField("rec_ninety_rebuy_uid_cnt")
	private Long recNinetyRebuyUidCnt;

	/**
	 * 近7天的销售金额
	 */
	@ApiField("rec_seven_sale_amt")
	private Long recSevenSaleAmt;

	/**
	 * 近7天销售个数
	 */
	@ApiField("rec_seven_sale_cnt")
	private Long recSevenSaleCnt;

	/**
	 * 近60天消费的支付
	 */
	@ApiField("rec_sixty_consume_uid_cnt")
	private Long recSixtyConsumeUidCnt;

	/**
	 * 近60天购买2次及以上的支付宝用户数
	 */
	@ApiField("rec_sixty_rebuy_uid_cnt")
	private Long recSixtyRebuyUidCnt;

	/**
	 * 近30天消费的支付宝用户数
	 */
	@ApiField("rec_thirty_consume_uid_cnt")
	private String recThirtyConsumeUidCnt;

	/**
	 * 近30天购买2次及以上的支付宝用户数
	 */
	@ApiField("rec_thirty_rebuy_uid_cnt")
	private Long recThirtyRebuyUidCnt;

	/**
	 * 近30天销售金额，单位分
	 */
	@ApiField("rec_thirty_sale_amt")
	private Long recThirtySaleAmt;

	/**
	 * 近30天销售个数
	 */
	@ApiField("rec_thirty_sale_cnt")
	private Long recThirtySaleCnt;

	/**
	 * 报表数据生成日期 yyyyMMdd格式	保留最近30天数据
	 */
	@ApiField("report_date")
	private String reportDate;

    /**
     * Gets hot grade.
     *
     * @return the hot grade
     */
    public Long getHotGrade() {
		return this.hotGrade;
	}

    /**
     * Sets hot grade.
     *
     * @param hotGrade the hot grade
     */
    public void setHotGrade(Long hotGrade) {
		this.hotGrade = hotGrade;
	}

    /**
     * Gets hot value.
     *
     * @return the hot value
     */
    public Long getHotValue() {
		return this.hotValue;
	}

    /**
     * Sets hot value.
     *
     * @param hotValue the hot value
     */
    public void setHotValue(Long hotValue) {
		this.hotValue = hotValue;
	}

    /**
     * Gets item diagnose.
     *
     * @return the item diagnose
     */
    public String getItemDiagnose() {
		return this.itemDiagnose;
	}

    /**
     * Sets item diagnose.
     *
     * @param itemDiagnose the item diagnose
     */
    public void setItemDiagnose(String itemDiagnose) {
		this.itemDiagnose = itemDiagnose;
	}

    /**
     * Gets item diagnose desc.
     *
     * @return the item diagnose desc
     */
    public String getItemDiagnoseDesc() {
		return this.itemDiagnoseDesc;
	}

    /**
     * Sets item diagnose desc.
     *
     * @param itemDiagnoseDesc the item diagnose desc
     */
    public void setItemDiagnoseDesc(String itemDiagnoseDesc) {
		this.itemDiagnoseDesc = itemDiagnoseDesc;
	}

    /**
     * Gets item id.
     *
     * @return the item id
     */
    public String getItemId() {
		return this.itemId;
	}

    /**
     * Sets item id.
     *
     * @param itemId the item id
     */
    public void setItemId(String itemId) {
		this.itemId = itemId;
	}

    /**
     * Gets item name.
     *
     * @return the item name
     */
    public String getItemName() {
		return this.itemName;
	}

    /**
     * Sets item name.
     *
     * @param itemName the item name
     */
    public void setItemName(String itemName) {
		this.itemName = itemName;
	}

    /**
     * Gets item price.
     *
     * @return the item price
     */
    public Long getItemPrice() {
		return this.itemPrice;
	}

    /**
     * Sets item price.
     *
     * @param itemPrice the item price
     */
    public void setItemPrice(Long itemPrice) {
		this.itemPrice = itemPrice;
	}

    /**
     * Gets rec ninety consume uid cnt.
     *
     * @return the rec ninety consume uid cnt
     */
    public Long getRecNinetyConsumeUidCnt() {
		return this.recNinetyConsumeUidCnt;
	}

    /**
     * Sets rec ninety consume uid cnt.
     *
     * @param recNinetyConsumeUidCnt the rec ninety consume uid cnt
     */
    public void setRecNinetyConsumeUidCnt(Long recNinetyConsumeUidCnt) {
		this.recNinetyConsumeUidCnt = recNinetyConsumeUidCnt;
	}

    /**
     * Gets rec ninety rebuy uid cnt.
     *
     * @return the rec ninety rebuy uid cnt
     */
    public Long getRecNinetyRebuyUidCnt() {
		return this.recNinetyRebuyUidCnt;
	}

    /**
     * Sets rec ninety rebuy uid cnt.
     *
     * @param recNinetyRebuyUidCnt the rec ninety rebuy uid cnt
     */
    public void setRecNinetyRebuyUidCnt(Long recNinetyRebuyUidCnt) {
		this.recNinetyRebuyUidCnt = recNinetyRebuyUidCnt;
	}

    /**
     * Gets rec seven sale amt.
     *
     * @return the rec seven sale amt
     */
    public Long getRecSevenSaleAmt() {
		return this.recSevenSaleAmt;
	}

    /**
     * Sets rec seven sale amt.
     *
     * @param recSevenSaleAmt the rec seven sale amt
     */
    public void setRecSevenSaleAmt(Long recSevenSaleAmt) {
		this.recSevenSaleAmt = recSevenSaleAmt;
	}

    /**
     * Gets rec seven sale cnt.
     *
     * @return the rec seven sale cnt
     */
    public Long getRecSevenSaleCnt() {
		return this.recSevenSaleCnt;
	}

    /**
     * Sets rec seven sale cnt.
     *
     * @param recSevenSaleCnt the rec seven sale cnt
     */
    public void setRecSevenSaleCnt(Long recSevenSaleCnt) {
		this.recSevenSaleCnt = recSevenSaleCnt;
	}

    /**
     * Gets rec sixty consume uid cnt.
     *
     * @return the rec sixty consume uid cnt
     */
    public Long getRecSixtyConsumeUidCnt() {
		return this.recSixtyConsumeUidCnt;
	}

    /**
     * Sets rec sixty consume uid cnt.
     *
     * @param recSixtyConsumeUidCnt the rec sixty consume uid cnt
     */
    public void setRecSixtyConsumeUidCnt(Long recSixtyConsumeUidCnt) {
		this.recSixtyConsumeUidCnt = recSixtyConsumeUidCnt;
	}

    /**
     * Gets rec sixty rebuy uid cnt.
     *
     * @return the rec sixty rebuy uid cnt
     */
    public Long getRecSixtyRebuyUidCnt() {
		return this.recSixtyRebuyUidCnt;
	}

    /**
     * Sets rec sixty rebuy uid cnt.
     *
     * @param recSixtyRebuyUidCnt the rec sixty rebuy uid cnt
     */
    public void setRecSixtyRebuyUidCnt(Long recSixtyRebuyUidCnt) {
		this.recSixtyRebuyUidCnt = recSixtyRebuyUidCnt;
	}

    /**
     * Gets rec thirty consume uid cnt.
     *
     * @return the rec thirty consume uid cnt
     */
    public String getRecThirtyConsumeUidCnt() {
		return this.recThirtyConsumeUidCnt;
	}

    /**
     * Sets rec thirty consume uid cnt.
     *
     * @param recThirtyConsumeUidCnt the rec thirty consume uid cnt
     */
    public void setRecThirtyConsumeUidCnt(String recThirtyConsumeUidCnt) {
		this.recThirtyConsumeUidCnt = recThirtyConsumeUidCnt;
	}

    /**
     * Gets rec thirty rebuy uid cnt.
     *
     * @return the rec thirty rebuy uid cnt
     */
    public Long getRecThirtyRebuyUidCnt() {
		return this.recThirtyRebuyUidCnt;
	}

    /**
     * Sets rec thirty rebuy uid cnt.
     *
     * @param recThirtyRebuyUidCnt the rec thirty rebuy uid cnt
     */
    public void setRecThirtyRebuyUidCnt(Long recThirtyRebuyUidCnt) {
		this.recThirtyRebuyUidCnt = recThirtyRebuyUidCnt;
	}

    /**
     * Gets rec thirty sale amt.
     *
     * @return the rec thirty sale amt
     */
    public Long getRecThirtySaleAmt() {
		return this.recThirtySaleAmt;
	}

    /**
     * Sets rec thirty sale amt.
     *
     * @param recThirtySaleAmt the rec thirty sale amt
     */
    public void setRecThirtySaleAmt(Long recThirtySaleAmt) {
		this.recThirtySaleAmt = recThirtySaleAmt;
	}

    /**
     * Gets rec thirty sale cnt.
     *
     * @return the rec thirty sale cnt
     */
    public Long getRecThirtySaleCnt() {
		return this.recThirtySaleCnt;
	}

    /**
     * Sets rec thirty sale cnt.
     *
     * @param recThirtySaleCnt the rec thirty sale cnt
     */
    public void setRecThirtySaleCnt(Long recThirtySaleCnt) {
		this.recThirtySaleCnt = recThirtySaleCnt;
	}

    /**
     * Gets report date.
     *
     * @return the report date
     */
    public String getReportDate() {
		return this.reportDate;
	}

    /**
     * Sets report date.
     *
     * @param reportDate the report date
     */
    public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

}
