package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 店铺信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class ShopInfo extends AlipayObject {

	private static final long serialVersionUID = 8354478419615774782L;

	/**
	 * 企业门店名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 店铺内景图片，如要签约当面付产品，需上传3张店铺内景图片
	 */
	@ApiListField("shop_scene_pic")
	@ApiField("string")
	private List<String> shopScenePic;

	/**
	 * 店铺门头照图片
	 */
	@ApiField("shop_sign_board_pic")
	private String shopSignBoardPic;

    /**
     * Gets shop name.
     *
     * @return the shop name
     */
    public String getShopName() {
		return this.shopName;
	}

    /**
     * Sets shop name.
     *
     * @param shopName the shop name
     */
    public void setShopName(String shopName) {
		this.shopName = shopName;
	}

    /**
     * Gets shop scene pic.
     *
     * @return the shop scene pic
     */
    public List<String> getShopScenePic() {
		return this.shopScenePic;
	}

    /**
     * Sets shop scene pic.
     *
     * @param shopScenePic the shop scene pic
     */
    public void setShopScenePic(List<String> shopScenePic) {
		this.shopScenePic = shopScenePic;
	}

    /**
     * Gets shop sign board pic.
     *
     * @return the shop sign board pic
     */
    public String getShopSignBoardPic() {
		return this.shopSignBoardPic;
	}

    /**
     * Sets shop sign board pic.
     *
     * @param shopSignBoardPic the shop sign board pic
     */
    public void setShopSignBoardPic(String shopSignBoardPic) {
		this.shopSignBoardPic = shopSignBoardPic;
	}

}
