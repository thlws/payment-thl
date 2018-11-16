package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.crowd.detail.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-26 14:05:09
 */
public class KoubeiMarketingCampaignCrowdDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5532263227558319525L;

	/** 
	 * op:表示操作符，目前支持的有EQ相等,GT大于,GTEQ大于等于,LT小于,LTEQ小于等于,NEQ不等,LIKE模糊匹配,IN在枚举范围内,NOTIN不在枚举范围内,BETWEEN范围比较,LEFTDAYS几天以内,RIGHTDAYS几天以外,LOCATE地理位置比较,LBS地图位置数据
tagCode:就是标签code，详细标签信息参见附件<a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/tags%26usecase.zip">标签信息</a>
value：标签对应的值
	 */
	@ApiField("crowd_group_info")
	private String crowdGroupInfo;

	/** 
	 * 人群名称
	 */
	@ApiField("name")
	private String name;

    /**
     * Sets crowd group info.
     *
     * @param crowdGroupInfo the crowd group info
     */
    public void setCrowdGroupInfo(String crowdGroupInfo) {
		this.crowdGroupInfo = crowdGroupInfo;
	}

    /**
     * Gets crowd group info.
     *
     * @return the crowd group info
     */
    public String getCrowdGroupInfo( ) {
		return this.crowdGroupInfo;
	}

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
		this.name = name;
	}

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName( ) {
		return this.name;
	}

}
