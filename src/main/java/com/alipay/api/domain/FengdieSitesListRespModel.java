package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 获取云凤蝶站点列表返回值模型
 *
 * @author auto create
 * @since 1.0, 2018-05-17 16:00:49
 */
public class FengdieSitesListRespModel extends AlipayObject {

	private static final long serialVersionUID = 6136871196848474572L;

	/**
	 * 云凤蝶站点数据列表
	 */
	@ApiListField("list")
	@ApiField("fengdie_sites_list_model")
	private List<FengdieSitesListModel> list;

	/**
	 * 分页数据信息，包含总数，分页数，当前页码，请求每页的数量
	 */
	@ApiField("paginator")
	private FengdieListPaginator paginator;

    /**
     * Gets list.
     *
     * @return the list
     */
    public List<FengdieSitesListModel> getList() {
		return this.list;
	}

    /**
     * Sets list.
     *
     * @param list the list
     */
    public void setList(List<FengdieSitesListModel> list) {
		this.list = list;
	}

    /**
     * Gets paginator.
     *
     * @return the paginator
     */
    public FengdieListPaginator getPaginator() {
		return this.paginator;
	}

    /**
     * Sets paginator.
     *
     * @param paginator the paginator
     */
    public void setPaginator(FengdieListPaginator paginator) {
		this.paginator = paginator;
	}

}
