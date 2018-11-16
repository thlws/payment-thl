package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 飞猪内容对接内容阅读数点赞数同步接口
 *
 * @author auto create
 * @since 1.0, 2017-11-29 17:17:03
 */
public class AlipayOverseasTravelContentCountSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4221847544893282131L;

	/**
	 * 计数信息列表
	 */
	@ApiListField("count_infos")
	@ApiField("count_info")
	private List<CountInfo> countInfos;

    /**
     * Gets count infos.
     *
     * @return the count infos
     */
    public List<CountInfo> getCountInfos() {
		return this.countInfos;
	}

    /**
     * Sets count infos.
     *
     * @param countInfos the count infos
     */
    public void setCountInfos(List<CountInfo> countInfos) {
		this.countInfos = countInfos;
	}

}
