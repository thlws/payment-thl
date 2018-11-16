package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 操作员列表查询
 *
 * @author auto create
 * @since 1.0, 2018-03-23 11:52:03
 */
public class KoubeiMerchantOperatorSearchQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7395114598417876193L;

	/**
	 * isv回传的auth_code，通过auth_code校验当前操作人与商户的关系
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 操作员所属部门id集合
	 */
	@ApiListField("dept_ids")
	@ApiField("string")
	private List<String> deptIds;

	/**
	 * 操作员对应的部门树集合，以“/”分割，最前面的为根部门id，
	 */
	@ApiListField("dept_paths")
	@ApiField("string")
	private List<String> deptPaths;

	/**
	 * 当前查询页数
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页大小，每页10条
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 操作员角色id列表，可以根据角色id列表查询关联的操作员列表
	 */
	@ApiListField("role_ids")
	@ApiField("string")
	private List<String> roleIds;

	/**
	 * 模糊查询字段，支持操作员的姓名，别名，手机模糊查询
	 */
	@ApiField("search_key")
	private String searchKey;

	/**
	 * 操作员的状态列表，T为激活，W为未激活
	 */
	@ApiListField("status")
	@ApiField("string")
	private List<String> status;

	/**
	 * 是否查询的是待分配列表，商户的存量数据没有部门关联，设置unassign为true，可以把存量的操作员查出来
	 */
	@ApiField("unassign")
	private Boolean unassign;

    /**
     * Gets auth code.
     *
     * @return the auth code
     */
    public String getAuthCode() {
		return this.authCode;
	}

    /**
     * Sets auth code.
     *
     * @param authCode the auth code
     */
    public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

    /**
     * Gets dept ids.
     *
     * @return the dept ids
     */
    public List<String> getDeptIds() {
		return this.deptIds;
	}

    /**
     * Sets dept ids.
     *
     * @param deptIds the dept ids
     */
    public void setDeptIds(List<String> deptIds) {
		this.deptIds = deptIds;
	}

    /**
     * Gets dept paths.
     *
     * @return the dept paths
     */
    public List<String> getDeptPaths() {
		return this.deptPaths;
	}

    /**
     * Sets dept paths.
     *
     * @param deptPaths the dept paths
     */
    public void setDeptPaths(List<String> deptPaths) {
		this.deptPaths = deptPaths;
	}

    /**
     * Gets page num.
     *
     * @return the page num
     */
    public Long getPageNum() {
		return this.pageNum;
	}

    /**
     * Sets page num.
     *
     * @param pageNum the page num
     */
    public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

    /**
     * Gets page size.
     *
     * @return the page size
     */
    public String getPageSize() {
		return this.pageSize;
	}

    /**
     * Sets page size.
     *
     * @param pageSize the page size
     */
    public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

    /**
     * Gets role ids.
     *
     * @return the role ids
     */
    public List<String> getRoleIds() {
		return this.roleIds;
	}

    /**
     * Sets role ids.
     *
     * @param roleIds the role ids
     */
    public void setRoleIds(List<String> roleIds) {
		this.roleIds = roleIds;
	}

    /**
     * Gets search key.
     *
     * @return the search key
     */
    public String getSearchKey() {
		return this.searchKey;
	}

    /**
     * Sets search key.
     *
     * @param searchKey the search key
     */
    public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public List<String> getStatus() {
		return this.status;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(List<String> status) {
		this.status = status;
	}

    /**
     * Gets unassign.
     *
     * @return the unassign
     */
    public Boolean getUnassign() {
		return this.unassign;
	}

    /**
     * Sets unassign.
     *
     * @param unassign the unassign
     */
    public void setUnassign(Boolean unassign) {
		this.unassign = unassign;
	}

}
