package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商圈圈子用户产生数据安全校验
 *
 * @author auto create
 * @since 1.0, 2018-06-20 13:41:41
 */
public class KoubeiMarketingDataMallCheckGetModel extends AlipayObject {

	private static final long serialVersionUID = 2729919561461831643L;

	/**
	 * 安全校验数据内容入参
	 */
	@ApiListField("check_contents")
	@ApiField("data_sec_check_content")
	private List<DataSecCheckContent> checkContents;

	/**
	 * 数据源:USER--C端，MERCHANT--B端
	 */
	@ApiField("data_source")
	private String dataSource;

    /**
     * Gets check contents.
     *
     * @return the check contents
     */
    public List<DataSecCheckContent> getCheckContents() {
		return this.checkContents;
	}

    /**
     * Sets check contents.
     *
     * @param checkContents the check contents
     */
    public void setCheckContents(List<DataSecCheckContent> checkContents) {
		this.checkContents = checkContents;
	}

    /**
     * Gets data source.
     *
     * @return the data source
     */
    public String getDataSource() {
		return this.dataSource;
	}

    /**
     * Sets data source.
     *
     * @param dataSource the data source
     */
    public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

}
