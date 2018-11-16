package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 标签信息模型
 *
 * @author auto create
 * @since 1.0, 2017-07-14 11:47:33
 */
public class LifeLabel extends AlipayObject {

	private static final long serialVersionUID = 8853983258632473336L;

	/**
	 * 该标签支持的业务列表，menu表示个性化菜单，extension表示个性化扩展区，message表示消息触达
	 */
	@ApiField("biz")
	private String biz;

	/**
	 * 标签类目
	 */
	@ApiField("category")
	private String category;

	/**
	 * 标签值数据类型
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 标签英文代码
	 */
	@ApiField("label_code")
	private String labelCode;

	/**
	 * 标签id，唯一标识一个标签
	 */
	@ApiField("label_id")
	private String labelId;

	/**
	 * 标签名
	 */
	@ApiField("label_name")
	private String labelName;

	/**
	 * 该标签支持的运算符
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 每个取值的业务含义
	 */
	@ApiListField("options")
	@ApiField("option")
	private List<Option> options;

	/**
	 * 标签类型，目前分为common（通用标签）、custom（生活号自定义标签）、cloud（云实验室标签）
	 */
	@ApiField("type")
	private String type;

    /**
     * Gets biz.
     *
     * @return the biz
     */
    public String getBiz() {
		return this.biz;
	}

    /**
     * Sets biz.
     *
     * @param biz the biz
     */
    public void setBiz(String biz) {
		this.biz = biz;
	}

    /**
     * Gets category.
     *
     * @return the category
     */
    public String getCategory() {
		return this.category;
	}

    /**
     * Sets category.
     *
     * @param category the category
     */
    public void setCategory(String category) {
		this.category = category;
	}

    /**
     * Gets data type.
     *
     * @return the data type
     */
    public String getDataType() {
		return this.dataType;
	}

    /**
     * Sets data type.
     *
     * @param dataType the data type
     */
    public void setDataType(String dataType) {
		this.dataType = dataType;
	}

    /**
     * Gets label code.
     *
     * @return the label code
     */
    public String getLabelCode() {
		return this.labelCode;
	}

    /**
     * Sets label code.
     *
     * @param labelCode the label code
     */
    public void setLabelCode(String labelCode) {
		this.labelCode = labelCode;
	}

    /**
     * Gets label id.
     *
     * @return the label id
     */
    public String getLabelId() {
		return this.labelId;
	}

    /**
     * Sets label id.
     *
     * @param labelId the label id
     */
    public void setLabelId(String labelId) {
		this.labelId = labelId;
	}

    /**
     * Gets label name.
     *
     * @return the label name
     */
    public String getLabelName() {
		return this.labelName;
	}

    /**
     * Sets label name.
     *
     * @param labelName the label name
     */
    public void setLabelName(String labelName) {
		this.labelName = labelName;
	}

    /**
     * Gets operator.
     *
     * @return the operator
     */
    public String getOperator() {
		return this.operator;
	}

    /**
     * Sets operator.
     *
     * @param operator the operator
     */
    public void setOperator(String operator) {
		this.operator = operator;
	}

    /**
     * Gets options.
     *
     * @return the options
     */
    public List<Option> getOptions() {
		return this.options;
	}

    /**
     * Sets options.
     *
     * @param options the options
     */
    public void setOptions(List<Option> options) {
		this.options = options;
	}

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
		return this.type;
	}

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
		this.type = type;
	}

}
