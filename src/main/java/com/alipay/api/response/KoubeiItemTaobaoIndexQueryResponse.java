package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.KbItemInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.item.taobao.index.query response.
 *
 * @author auto create
 * @since 1.0, 2017-12-01 11:23:12
 */
public class KoubeiItemTaobaoIndexQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2715942356295674226L;

	/** 
	 * 栏目名称
	 */
	@ApiField("column_title")
	private String columnTitle;

	/** 
	 * 扩展信息，json格式
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 商品信息列表
	 */
	@ApiListField("item_list")
	@ApiField("kb_item_info")
	private List<KbItemInfo> itemList;

	/** 
	 * 时段图标
	 */
	@ApiField("time_icon")
	private String timeIcon;

	/** 
	 * 时段名称
	 */
	@ApiField("time_title")
	private String timeTitle;

	/** 
	 * 商品列表页地址
	 */
	@ApiField("url")
	private String url;

    /**
     * Sets column title.
     *
     * @param columnTitle the column title
     */
    public void setColumnTitle(String columnTitle) {
		this.columnTitle = columnTitle;
	}

    /**
     * Gets column title.
     *
     * @return the column title
     */
    public String getColumnTitle( ) {
		return this.columnTitle;
	}

    /**
     * Sets ext info.
     *
     * @param extInfo the ext info
     */
    public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

    /**
     * Gets ext info.
     *
     * @return the ext info
     */
    public String getExtInfo( ) {
		return this.extInfo;
	}

    /**
     * Sets item list.
     *
     * @param itemList the item list
     */
    public void setItemList(List<KbItemInfo> itemList) {
		this.itemList = itemList;
	}

    /**
     * Gets item list.
     *
     * @return the item list
     */
    public List<KbItemInfo> getItemList( ) {
		return this.itemList;
	}

    /**
     * Sets time icon.
     *
     * @param timeIcon the time icon
     */
    public void setTimeIcon(String timeIcon) {
		this.timeIcon = timeIcon;
	}

    /**
     * Gets time icon.
     *
     * @return the time icon
     */
    public String getTimeIcon( ) {
		return this.timeIcon;
	}

    /**
     * Sets time title.
     *
     * @param timeTitle the time title
     */
    public void setTimeTitle(String timeTitle) {
		this.timeTitle = timeTitle;
	}

    /**
     * Gets time title.
     *
     * @return the time title
     */
    public String getTimeTitle( ) {
		return this.timeTitle;
	}

    /**
     * Sets url.
     *
     * @param url the url
     */
    public void setUrl(String url) {
		this.url = url;
	}

    /**
     * Gets url.
     *
     * @return the url
     */
    public String getUrl( ) {
		return this.url;
	}

}
