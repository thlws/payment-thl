package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ProductBaseVO;
import com.alipay.api.domain.ProdIPRelationVO;
import com.alipay.api.domain.ProdLORelationVO;
import com.alipay.api.domain.ProdMarkRelationVO;
import com.alipay.api.domain.ProdRelationVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.prodpaas.product.common.query response.
 *
 * @author auto create
 * @since 1.0, 2016-09-09 20:38:33
 */
public class AntProdpaasProductCommonQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6636375952166782997L;

	/** 
	 * 产品基本信息
	 */
	@ApiField("prod_base")
	private ProductBaseVO prodBase;

	/** 
	 * 产品条件信息。值为json结构,嵌套结构。normal代表普通条件，其他代表息费等复杂条件，key为条件别名，value为条件值.
	 */
	@ApiField("prod_condition")
	private String prodCondition;

	/** 
	 * 产品参与者关系列表
	 */
	@ApiListField("prod_ip_list")
	@ApiField("prod_i_p_relation_v_o")
	private List<ProdIPRelationVO> prodIpList;

	/** 
	 * 产品区域关联信息列表
	 */
	@ApiListField("prod_lo_list")
	@ApiField("prod_l_o_relation_v_o")
	private List<ProdLORelationVO> prodLoList;

	/** 
	 * 产品外标关系列表
	 */
	@ApiListField("prod_mark_list")
	@ApiField("prod_mark_relation_v_o")
	private List<ProdMarkRelationVO> prodMarkList;

	/** 
	 * 产品间关系列表
	 */
	@ApiListField("prod_rel_list")
	@ApiField("prod_relation_v_o")
	private List<ProdRelationVO> prodRelList;

    /**
     * Sets prod base.
     *
     * @param prodBase the prod base
     */
    public void setProdBase(ProductBaseVO prodBase) {
		this.prodBase = prodBase;
	}

    /**
     * Gets prod base.
     *
     * @return the prod base
     */
    public ProductBaseVO getProdBase( ) {
		return this.prodBase;
	}

    /**
     * Sets prod condition.
     *
     * @param prodCondition the prod condition
     */
    public void setProdCondition(String prodCondition) {
		this.prodCondition = prodCondition;
	}

    /**
     * Gets prod condition.
     *
     * @return the prod condition
     */
    public String getProdCondition( ) {
		return this.prodCondition;
	}

    /**
     * Sets prod ip list.
     *
     * @param prodIpList the prod ip list
     */
    public void setProdIpList(List<ProdIPRelationVO> prodIpList) {
		this.prodIpList = prodIpList;
	}

    /**
     * Gets prod ip list.
     *
     * @return the prod ip list
     */
    public List<ProdIPRelationVO> getProdIpList( ) {
		return this.prodIpList;
	}

    /**
     * Sets prod lo list.
     *
     * @param prodLoList the prod lo list
     */
    public void setProdLoList(List<ProdLORelationVO> prodLoList) {
		this.prodLoList = prodLoList;
	}

    /**
     * Gets prod lo list.
     *
     * @return the prod lo list
     */
    public List<ProdLORelationVO> getProdLoList( ) {
		return this.prodLoList;
	}

    /**
     * Sets prod mark list.
     *
     * @param prodMarkList the prod mark list
     */
    public void setProdMarkList(List<ProdMarkRelationVO> prodMarkList) {
		this.prodMarkList = prodMarkList;
	}

    /**
     * Gets prod mark list.
     *
     * @return the prod mark list
     */
    public List<ProdMarkRelationVO> getProdMarkList( ) {
		return this.prodMarkList;
	}

    /**
     * Sets prod rel list.
     *
     * @param prodRelList the prod rel list
     */
    public void setProdRelList(List<ProdRelationVO> prodRelList) {
		this.prodRelList = prodRelList;
	}

    /**
     * Gets prod rel list.
     *
     * @return the prod rel list
     */
    public List<ProdRelationVO> getProdRelList( ) {
		return this.prodRelList;
	}

}
