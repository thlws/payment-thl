package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 上数元数据信息同步服务
 *
 * @author auto create
 * @since 1.0, 2017-08-11 16:11:08
 */
public class SsdataDataserviceMetainfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4487533934316169224L;

	/**
	 * 元数据信息
	 */
	@ApiField("meta_info")
	private String metaInfo;

    /**
     * Gets meta info.
     *
     * @return the meta info
     */
    public String getMetaInfo() {
		return this.metaInfo;
	}

    /**
     * Sets meta info.
     *
     * @param metaInfo the meta info
     */
    public void setMetaInfo(String metaInfo) {
		this.metaInfo = metaInfo;
	}

}
