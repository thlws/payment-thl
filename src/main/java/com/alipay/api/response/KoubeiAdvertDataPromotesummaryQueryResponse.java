package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PromoteDataModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.advert.data.promotesummary.query response.
 *
 * @author auto create
 * @since 1.0, 2017-09-29 15:06:09
 */
public class KoubeiAdvertDataPromotesummaryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1128329951335949164L;

	/** 
	 * 口碑平台推广数据
	 */
	@ApiField("kb_platform_promote_data")
	private PromoteDataModel kbPlatformPromoteData;

	/** 
	 * 其他推广者推广数据
	 */
	@ApiField("others_promote_data")
	private PromoteDataModel othersPromoteData;

	/** 
	 * 入参时间段内总推广数据
	 */
	@ApiField("part_promote_data")
	private PromoteDataModel partPromoteData;

	/** 
	 * 自己推广数据
	 */
	@ApiField("self_promote_data")
	private PromoteDataModel selfPromoteData;

	/** 
	 * 总推广数据
	 */
	@ApiField("total_promote_data")
	private PromoteDataModel totalPromoteData;

    /**
     * Sets kb platform promote data.
     *
     * @param kbPlatformPromoteData the kb platform promote data
     */
    public void setKbPlatformPromoteData(PromoteDataModel kbPlatformPromoteData) {
		this.kbPlatformPromoteData = kbPlatformPromoteData;
	}

    /**
     * Gets kb platform promote data.
     *
     * @return the kb platform promote data
     */
    public PromoteDataModel getKbPlatformPromoteData( ) {
		return this.kbPlatformPromoteData;
	}

    /**
     * Sets others promote data.
     *
     * @param othersPromoteData the others promote data
     */
    public void setOthersPromoteData(PromoteDataModel othersPromoteData) {
		this.othersPromoteData = othersPromoteData;
	}

    /**
     * Gets others promote data.
     *
     * @return the others promote data
     */
    public PromoteDataModel getOthersPromoteData( ) {
		return this.othersPromoteData;
	}

    /**
     * Sets part promote data.
     *
     * @param partPromoteData the part promote data
     */
    public void setPartPromoteData(PromoteDataModel partPromoteData) {
		this.partPromoteData = partPromoteData;
	}

    /**
     * Gets part promote data.
     *
     * @return the part promote data
     */
    public PromoteDataModel getPartPromoteData( ) {
		return this.partPromoteData;
	}

    /**
     * Sets self promote data.
     *
     * @param selfPromoteData the self promote data
     */
    public void setSelfPromoteData(PromoteDataModel selfPromoteData) {
		this.selfPromoteData = selfPromoteData;
	}

    /**
     * Gets self promote data.
     *
     * @return the self promote data
     */
    public PromoteDataModel getSelfPromoteData( ) {
		return this.selfPromoteData;
	}

    /**
     * Sets total promote data.
     *
     * @param totalPromoteData the total promote data
     */
    public void setTotalPromoteData(PromoteDataModel totalPromoteData) {
		this.totalPromoteData = totalPromoteData;
	}

    /**
     * Gets total promote data.
     *
     * @return the total promote data
     */
    public PromoteDataModel getTotalPromoteData( ) {
		return this.totalPromoteData;
	}

}
