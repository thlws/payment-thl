package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 福利平台用户订单外部核销接口
 *
 * @author auto create
 * @since 1.0, 2016-11-02 19:53:47
 */
public class AlipayEcoWelfareCodeSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3793739867383685172L;

	/**
	 * 支付宝账户USERID，和福利账户ID而选一，可以通过支付宝钱包用户信息共享接口获取支付宝账户ID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 条码码值
	 */
	@ApiField("code")
	private String code;

	/**
	 * 条码可使用超时时间
格式为yyyy-MM-dd HH:mm:ss 
备注：超时时间不允许比启动时间小
	 */
	@ApiField("code_expire_date")
	private String codeExpireDate;

	/**
	 * 条码数量
	 */
	@ApiField("code_num")
	private Long codeNum;

	/**
	 * 条码图片url
	 */
	@ApiField("code_pic_url")
	private String codePicUrl;

	/**
	 * 条码可使用开发时间
格式为yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("code_start_date")
	private String codeStartDate;

	/**
	 * 条码状态
CREATE	创建
NOT_USED	没有使用
USED	已经被使用
INVALID	码无效
EXPIRED	码过期
DISABLED	码冻结
NOT_EXIST	码不存在
	 */
	@ApiField("code_status")
	private String codeStatus;

	/**
	 * 条码状态变更时间
格式为yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("code_status_date")
	private String codeStatusDate;

	/**
	 * 条码业务类型
商品品类码：goods
用户商品条码：barcode
	 */
	@ApiField("code_type")
	private String codeType;

	/**
	 * 扩展属性
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * ISV代码，唯一确定ISV身份由福利平台分配
	 */
	@ApiField("isv_code")
	private String isvCode;

	/**
	 * 核销门店详细信息
	 */
	@ApiField("store_info")
	private WelfareEcoStoreInfo storeInfo;

	/**
	 * 同步数据时间 格式为yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("sync_date")
	private String syncDate;

	/**
	 * 福利平台订单对应的用户ID，和支付宝用户ID而选一
	 */
	@ApiField("welfare_user_id")
	private String welfareUserId;

    /**
     * Gets alipay user id.
     *
     * @return the alipay user id
     */
    public String getAlipayUserId() {
		return this.alipayUserId;
	}

    /**
     * Sets alipay user id.
     *
     * @param alipayUserId the alipay user id
     */
    public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

    /**
     * Gets code.
     *
     * @return the code
     */
    public String getCode() {
		return this.code;
	}

    /**
     * Sets code.
     *
     * @param code the code
     */
    public void setCode(String code) {
		this.code = code;
	}

    /**
     * Gets code expire date.
     *
     * @return the code expire date
     */
    public String getCodeExpireDate() {
		return this.codeExpireDate;
	}

    /**
     * Sets code expire date.
     *
     * @param codeExpireDate the code expire date
     */
    public void setCodeExpireDate(String codeExpireDate) {
		this.codeExpireDate = codeExpireDate;
	}

    /**
     * Gets code num.
     *
     * @return the code num
     */
    public Long getCodeNum() {
		return this.codeNum;
	}

    /**
     * Sets code num.
     *
     * @param codeNum the code num
     */
    public void setCodeNum(Long codeNum) {
		this.codeNum = codeNum;
	}

    /**
     * Gets code pic url.
     *
     * @return the code pic url
     */
    public String getCodePicUrl() {
		return this.codePicUrl;
	}

    /**
     * Sets code pic url.
     *
     * @param codePicUrl the code pic url
     */
    public void setCodePicUrl(String codePicUrl) {
		this.codePicUrl = codePicUrl;
	}

    /**
     * Gets code start date.
     *
     * @return the code start date
     */
    public String getCodeStartDate() {
		return this.codeStartDate;
	}

    /**
     * Sets code start date.
     *
     * @param codeStartDate the code start date
     */
    public void setCodeStartDate(String codeStartDate) {
		this.codeStartDate = codeStartDate;
	}

    /**
     * Gets code status.
     *
     * @return the code status
     */
    public String getCodeStatus() {
		return this.codeStatus;
	}

    /**
     * Sets code status.
     *
     * @param codeStatus the code status
     */
    public void setCodeStatus(String codeStatus) {
		this.codeStatus = codeStatus;
	}

    /**
     * Gets code status date.
     *
     * @return the code status date
     */
    public String getCodeStatusDate() {
		return this.codeStatusDate;
	}

    /**
     * Sets code status date.
     *
     * @param codeStatusDate the code status date
     */
    public void setCodeStatusDate(String codeStatusDate) {
		this.codeStatusDate = codeStatusDate;
	}

    /**
     * Gets code type.
     *
     * @return the code type
     */
    public String getCodeType() {
		return this.codeType;
	}

    /**
     * Sets code type.
     *
     * @param codeType the code type
     */
    public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

    /**
     * Gets extend params.
     *
     * @return the extend params
     */
    public String getExtendParams() {
		return this.extendParams;
	}

    /**
     * Sets extend params.
     *
     * @param extendParams the extend params
     */
    public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

    /**
     * Gets isv code.
     *
     * @return the isv code
     */
    public String getIsvCode() {
		return this.isvCode;
	}

    /**
     * Sets isv code.
     *
     * @param isvCode the isv code
     */
    public void setIsvCode(String isvCode) {
		this.isvCode = isvCode;
	}

    /**
     * Gets store info.
     *
     * @return the store info
     */
    public WelfareEcoStoreInfo getStoreInfo() {
		return this.storeInfo;
	}

    /**
     * Sets store info.
     *
     * @param storeInfo the store info
     */
    public void setStoreInfo(WelfareEcoStoreInfo storeInfo) {
		this.storeInfo = storeInfo;
	}

    /**
     * Gets sync date.
     *
     * @return the sync date
     */
    public String getSyncDate() {
		return this.syncDate;
	}

    /**
     * Sets sync date.
     *
     * @param syncDate the sync date
     */
    public void setSyncDate(String syncDate) {
		this.syncDate = syncDate;
	}

    /**
     * Gets welfare user id.
     *
     * @return the welfare user id
     */
    public String getWelfareUserId() {
		return this.welfareUserId;
	}

    /**
     * Sets welfare user id.
     *
     * @param welfareUserId the welfare user id
     */
    public void setWelfareUserId(String welfareUserId) {
		this.welfareUserId = welfareUserId;
	}

}
