package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DishRecommend;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.recommend.query response.
 *
 * @author auto create
 * @since 1.0, 2018-06-22 14:30:00
 */
public class KoubeiCateringDishRecommendQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3122258993979767844L;

	/** 
	 * 推荐菜品列表
	 */
	@ApiListField("dish_list")
	@ApiField("dish_recommend")
	private List<DishRecommend> dishList;

    /**
     * Sets dish list.
     *
     * @param dishList the dish list
     */
    public void setDishList(List<DishRecommend> dishList) {
		this.dishList = dishList;
	}

    /**
     * Gets dish list.
     *
     * @return the dish list
     */
    public List<DishRecommend> getDishList( ) {
		return this.dishList;
	}

}
