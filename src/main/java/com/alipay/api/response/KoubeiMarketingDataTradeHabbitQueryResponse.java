package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.trade.habbit.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-26 14:04:58
 */
public class KoubeiMarketingDataTradeHabbitQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1734315111449667147L;

	/** 
	 * biz_date: 业务日期  格式:yyyyMMdd
     partner_industry_type:商户行业标识（轻餐or正餐）
     shop_id: 门店id
     shop_name: 门店名称
     trade_again_ratio_7d: （近7天）复购率
     trade_again_ratio_active_7d: （近7天）复购率（口碑活跃用户）
     trade_user_cnt_7d: （近7天）交易会员数
     trade_user_cnt_active_7d: （近7天）交易活跃会员数（口碑活跃用户贡献）
     zdj_order_amt_7d: （近7天）桌单价（订单金额）(单位:分)
     zdj_service_amt_7d: （近7天）桌单价（实收金额）(单位:分)
     zdj_service_amt_distribution_7d: （近7天）桌单价（实收金额）段分布（示例：0-15:0.2799,15-20:0.1775,20-25:0.1058,25-30:0.0956,30-35:0.0648,35-40:0.0751,40-45:0.0444,45-50:0.0137,50-55:0.0171,55及以上:0.1263 意思是消费0-15元的比例占消费总人数的0.2799）
注意：出参中还包含30天/60天/90天的类似指标，篇幅有限不一一列举
	 */
	@ApiField("trade_habit_info")
	private String tradeHabitInfo;

    /**
     * Sets trade habit info.
     *
     * @param tradeHabitInfo the trade habit info
     */
    public void setTradeHabitInfo(String tradeHabitInfo) {
		this.tradeHabitInfo = tradeHabitInfo;
	}

    /**
     * Gets trade habit info.
     *
     * @return the trade habit info
     */
    public String getTradeHabitInfo( ) {
		return this.tradeHabitInfo;
	}

}
