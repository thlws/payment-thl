package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SimpleShopModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.department.detail.query response.
 *
 * @author auto create
 * @since 1.0, 2018-08-16 19:00:59
 */
public class KoubeiMerchantDepartmentDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5821429668796724661L;

	/** 
	 * 人员管理场景的部门id
	 */
	@ApiField("dept_id")
	private String deptId;

	/** 
	 * 员工管理场景下的商户部门名称，根目录为商户名称，下属部门由商户自己创建，例如可以创建下属部门为“华东大区”
	 */
	@ApiField("dept_name")
	private String deptName;

	/** 
	 * 人员组织场景的部门标签码
	 */
	@ApiField("label_code")
	private String labelCode;

	/** 
	 * 当前部门的上级部门id
	 */
	@ApiField("parent_dept_id")
	private String parentDeptId;

	/** 
	 * 部门下包含的门店
	 */
	@ApiListField("shops")
	@ApiField("simple_shop_model")
	private List<SimpleShopModel> shops;

	/** 
	 * 组织部门类型(5为非叶子部门，6为叶子部门)
	 */
	@ApiField("type")
	private String type;

    /**
     * Sets dept id.
     *
     * @param deptId the dept id
     */
    public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

    /**
     * Gets dept id.
     *
     * @return the dept id
     */
    public String getDeptId( ) {
		return this.deptId;
	}

    /**
     * Sets dept name.
     *
     * @param deptName the dept name
     */
    public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

    /**
     * Gets dept name.
     *
     * @return the dept name
     */
    public String getDeptName( ) {
		return this.deptName;
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
     * Gets label code.
     *
     * @return the label code
     */
    public String getLabelCode( ) {
		return this.labelCode;
	}

    /**
     * Sets parent dept id.
     *
     * @param parentDeptId the parent dept id
     */
    public void setParentDeptId(String parentDeptId) {
		this.parentDeptId = parentDeptId;
	}

    /**
     * Gets parent dept id.
     *
     * @return the parent dept id
     */
    public String getParentDeptId( ) {
		return this.parentDeptId;
	}

    /**
     * Sets shops.
     *
     * @param shops the shops
     */
    public void setShops(List<SimpleShopModel> shops) {
		this.shops = shops;
	}

    /**
     * Gets shops.
     *
     * @return the shops
     */
    public List<SimpleShopModel> getShops( ) {
		return this.shops;
	}

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
		this.type = type;
	}

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType( ) {
		return this.type;
	}

}
