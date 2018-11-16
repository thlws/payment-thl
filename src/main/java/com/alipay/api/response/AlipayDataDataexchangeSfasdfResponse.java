package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AlipayItemGoodsList;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataexchange.sfasdf response.
 *
 * @author auto create
 * @since 1.0, 2016-03-18 20:58:13
 */
public class AlipayDataDataexchangeSfasdfResponse extends AlipayResponse {

	private static final long serialVersionUID = 3632723243173988287L;

	/** 
	 * dsfagshdj
	 */
	@ApiListField("azxfghd")
	@ApiField("string")
	private List<String> azxfghd;

	/** 
	 * asghdfsdas阿福故事、
	 */
	@ApiListField("gfdhsdasafg")
	@ApiField("string")
	private List<String> gfdhsdasafg;

	/** 
	 * fgdhjdsfgh
	 */
	@ApiListField("gfhjfdsa")
	@ApiField("string")
	private List<String> gfhjfdsa;

	/** 
	 * sdfdhgjfdfsaghjfd
	 */
	@ApiListField("ghjfdsafgh")
	@ApiField("string")
	private List<String> ghjfdsafgh;

	/** 
	 * sadasff
	 */
	@ApiField("sdvsdv")
	private String sdvsdv;

	/** 
	 * hysasd
	 */
	@ApiListField("wrty")
	@ApiField("alipay_item_goods_list")
	private List<AlipayItemGoodsList> wrty;

    /**
     * Sets azxfghd.
     *
     * @param azxfghd the azxfghd
     */
    public void setAzxfghd(List<String> azxfghd) {
		this.azxfghd = azxfghd;
	}

    /**
     * Gets azxfghd.
     *
     * @return the azxfghd
     */
    public List<String> getAzxfghd( ) {
		return this.azxfghd;
	}

    /**
     * Sets gfdhsdasafg.
     *
     * @param gfdhsdasafg the gfdhsdasafg
     */
    public void setGfdhsdasafg(List<String> gfdhsdasafg) {
		this.gfdhsdasafg = gfdhsdasafg;
	}

    /**
     * Gets gfdhsdasafg.
     *
     * @return the gfdhsdasafg
     */
    public List<String> getGfdhsdasafg( ) {
		return this.gfdhsdasafg;
	}

    /**
     * Sets gfhjfdsa.
     *
     * @param gfhjfdsa the gfhjfdsa
     */
    public void setGfhjfdsa(List<String> gfhjfdsa) {
		this.gfhjfdsa = gfhjfdsa;
	}

    /**
     * Gets gfhjfdsa.
     *
     * @return the gfhjfdsa
     */
    public List<String> getGfhjfdsa( ) {
		return this.gfhjfdsa;
	}

    /**
     * Sets ghjfdsafgh.
     *
     * @param ghjfdsafgh the ghjfdsafgh
     */
    public void setGhjfdsafgh(List<String> ghjfdsafgh) {
		this.ghjfdsafgh = ghjfdsafgh;
	}

    /**
     * Gets ghjfdsafgh.
     *
     * @return the ghjfdsafgh
     */
    public List<String> getGhjfdsafgh( ) {
		return this.ghjfdsafgh;
	}

    /**
     * Sets sdvsdv.
     *
     * @param sdvsdv the sdvsdv
     */
    public void setSdvsdv(String sdvsdv) {
		this.sdvsdv = sdvsdv;
	}

    /**
     * Gets sdvsdv.
     *
     * @return the sdvsdv
     */
    public String getSdvsdv( ) {
		return this.sdvsdv;
	}

    /**
     * Sets wrty.
     *
     * @param wrty the wrty
     */
    public void setWrty(List<AlipayItemGoodsList> wrty) {
		this.wrty = wrty;
	}

    /**
     * Gets wrty.
     *
     * @return the wrty
     */
    public List<AlipayItemGoodsList> getWrty( ) {
		return this.wrty;
	}

}
