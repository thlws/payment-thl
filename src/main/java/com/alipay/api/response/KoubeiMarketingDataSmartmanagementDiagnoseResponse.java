package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DiagnoseResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.smartmanagement.diagnose response.
 *
 * @author auto create
 * @since 1.0, 2017-07-26 11:31:56
 */
public class KoubeiMarketingDataSmartmanagementDiagnoseResponse extends AlipayResponse {

	private static final long serialVersionUID = 3375922147161389945L;

	/** 
	 * 诊断结果CODE，目前有如下四个值
TRADE_RATE	流失会员占比高
USER_COUNT	会员数量少
REPAY_RATE	复购率低
SUPER_ITEM  建议打造单品爆款(适用于菜品营销)

提示文案业务参数,JSON对象形式返回
对于非菜品营销的诊断，JSON的KEY包含tradeCycle，userRate，industryRate，repayRate调用方根据诊断CODE分别给出不同的诊断文案，例如：
TRADE_RATE	流失会员占比高	您当前${tradeCycle}(90)天未到店消费会员占总会员${userRate}(40%)，落后同行${industryRate}(60%)的商家。				
USER_COUNT	会员数量少	您当前店均会员量较少，落后同行${industryRate}(60%)的商家。
				
REPAY_RATE	复购率低	您当前${tradeCycle}(60)天会员回头率为${repayRate}(30%)，落后于同行${industryRate}(60%)的商家。

对于菜品营销的诊断(诊断码为SUPER_ITEM)，JSON的KEY包含 
repay_increase(开展单品营销对顾客回头率的提升度) 
revenue_increase(开展单品营销对店面收益提升额)
repurchase_customer(开展单品营销对回头客拉动数)

通过调用该接口得到的数据用于封装自己的一键营销入口的文案，例如：
repay_increase 返回0.36 ，则封装的文案可为“明星菜的单品营销可提升顾客回头率36%。”
revenue_increase返回2000，则封装的文案可为“建议开展单品营销，吸引更多回头客提升店面收益，30天内可提升收益2000元。”
repurchase_customer返回8，则封装的文案是“一个明星菜将带来8个回头客。”
	 */
	@ApiListField("diagnose_result")
	@ApiField("diagnose_result")
	private List<DiagnoseResult> diagnoseResult;

    /**
     * Sets diagnose result.
     *
     * @param diagnoseResult the diagnose result
     */
    public void setDiagnoseResult(List<DiagnoseResult> diagnoseResult) {
		this.diagnoseResult = diagnoseResult;
	}

    /**
     * Gets diagnose result.
     *
     * @return the diagnose result
     */
    public List<DiagnoseResult> getDiagnoseResult( ) {
		return this.diagnoseResult;
	}

}
