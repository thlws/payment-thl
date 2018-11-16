package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量代发明细统一查询接口
 *
 * @author auto create
 * @since 1.0, 2018-05-24 11:33:41
 */
public class AlipayFundBatchDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3448748965223139154L;

	/**
	 * 11～32位的数字或字母或数字与字母的组合，且区分大小写。
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 批量代发到支付宝账户：BATCH_TRANS_ACC
批量代发到银行账户：BATCH_TRANS_BC
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 批量代发业务场景。
GLOBAL: 全球代发. 除CNY的多币种代发或人民币跨境代发。
LOCAL：中国境内纯人民币代发。
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 批次文件中明细流水号
	 */
	@ApiField("detail_no")
	private String detailNo;

	/**
	 * INIT：支付宝只对上传的文件做了记录，还没有处理。
APPLIED：支付宝已完成兑换，等待发起付汇。
DEALED：已发起付汇申请，等待付汇结果。
SUCCESS	处理成功：付汇成功。
FAIL	处理失败：明细信息错误导致明细校验失败或者付汇失败。
DISUSE 已废弃：明细被支付宝系统废弃。
	 */
	@ApiField("detail_status")
	private String detailStatus;

	/**
	 * 采用分页查询，本参数为空或0默认显示第一页。每页最大500条记录，不足500条则按实际记录数返回，不需要商户输入每页的记录数。如果输入的值大于总页数，则支付宝返回最后一页数据。
例如：按条件查询到600条数据，则分成2页显示。输入2或大于2的整数都会返回100条数据；不输入任何数据则默认返回第一页。
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 收款方账号。对于批量代发到支付宝账户场景，填写钱包账号。对于批量代发到银行账户场景，填写银行卡号。
	 */
	@ApiField("payee_account")
	private String payeeAccount;

	/**
	 * 签约主体，即签约了批量代发产品的支付宝账号。
	 */
	@ApiField("sign_principal")
	private String signPrincipal;

    /**
     * Gets batch no.
     *
     * @return the batch no
     */
    public String getBatchNo() {
		return this.batchNo;
	}

    /**
     * Sets batch no.
     *
     * @param batchNo the batch no
     */
    public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

    /**
     * Gets biz code.
     *
     * @return the biz code
     */
    public String getBizCode() {
		return this.bizCode;
	}

    /**
     * Sets biz code.
     *
     * @param bizCode the biz code
     */
    public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

    /**
     * Gets biz scene.
     *
     * @return the biz scene
     */
    public String getBizScene() {
		return this.bizScene;
	}

    /**
     * Sets biz scene.
     *
     * @param bizScene the biz scene
     */
    public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

    /**
     * Gets detail no.
     *
     * @return the detail no
     */
    public String getDetailNo() {
		return this.detailNo;
	}

    /**
     * Sets detail no.
     *
     * @param detailNo the detail no
     */
    public void setDetailNo(String detailNo) {
		this.detailNo = detailNo;
	}

    /**
     * Gets detail status.
     *
     * @return the detail status
     */
    public String getDetailStatus() {
		return this.detailStatus;
	}

    /**
     * Sets detail status.
     *
     * @param detailStatus the detail status
     */
    public void setDetailStatus(String detailStatus) {
		this.detailStatus = detailStatus;
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
     * Gets payee account.
     *
     * @return the payee account
     */
    public String getPayeeAccount() {
		return this.payeeAccount;
	}

    /**
     * Sets payee account.
     *
     * @param payeeAccount the payee account
     */
    public void setPayeeAccount(String payeeAccount) {
		this.payeeAccount = payeeAccount;
	}

    /**
     * Gets sign principal.
     *
     * @return the sign principal
     */
    public String getSignPrincipal() {
		return this.signPrincipal;
	}

    /**
     * Sets sign principal.
     *
     * @param signPrincipal the sign principal
     */
    public void setSignPrincipal(String signPrincipal) {
		this.signPrincipal = signPrincipal;
	}

}
