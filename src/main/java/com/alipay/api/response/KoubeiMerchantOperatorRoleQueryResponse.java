package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.KoubeiMerchantRole;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.operator.role.query response.
 *
 * @author auto create
 * @since 1.0, 2018-05-30 15:45:00
 */
public class KoubeiMerchantOperatorRoleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1861494625761593679L;

	/** 
	 * 角色信息包含角色ID和角色名称,以及权限汇总信息
	 */
	@ApiListField("list")
	@ApiField("koubei_merchant_role")
	private List<KoubeiMerchantRole> list;

    /**
     * Sets list.
     *
     * @param list the list
     */
    public void setList(List<KoubeiMerchantRole> list) {
		this.list = list;
	}

    /**
     * Gets list.
     *
     * @return the list
     */
    public List<KoubeiMerchantRole> getList( ) {
		return this.list;
	}

}
