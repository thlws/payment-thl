package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.WeikeTaskView;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.daowei.weike.taskview.query response.
 *
 * @author auto create
 * @since 1.0, 2017-04-25 14:22:41
 */
public class AlipayDaoweiWeikeTaskviewQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7393834582326215684L;

	/** 
	 * 微客当前城市的任务视图列表
	 */
	@ApiListField("task_views")
	@ApiField("weike_task_view")
	private List<WeikeTaskView> taskViews;

    /**
     * Sets task views.
     *
     * @param taskViews the task views
     */
    public void setTaskViews(List<WeikeTaskView> taskViews) {
		this.taskViews = taskViews;
	}

    /**
     * Gets task views.
     *
     * @return the task views
     */
    public List<WeikeTaskView> getTaskViews( ) {
		return this.taskViews;
	}

}
