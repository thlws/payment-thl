package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.deviceinfo.getidbytoken response.
 *
 * @author auto create
 * @since 1.0, 2017-03-29 16:20:47
 */
public class AlipayMobileDeviceinfoGetidbytokenResponse extends AlipayResponse {

	private static final long serialVersionUID = 3575896765466234486L;

	/** 
	 * 蚂蚁金服集团生成的设备id
	 */
	@ApiField("apdid")
	private String apdid;

	/** 
	 * 操作是否成功
	 */
	@ApiField("operateresult")
	private Boolean operateresult;

	/** 
	 * 阿里巴巴集团安全生产的设备id
	 */
	@ApiField("umid")
	private String umid;

    /**
     * Sets apdid.
     *
     * @param apdid the apdid
     */
    public void setApdid(String apdid) {
		this.apdid = apdid;
	}

    /**
     * Gets apdid.
     *
     * @return the apdid
     */
    public String getApdid( ) {
		return this.apdid;
	}

    /**
     * Sets operateresult.
     *
     * @param operateresult the operateresult
     */
    public void setOperateresult(Boolean operateresult) {
		this.operateresult = operateresult;
	}

    /**
     * Gets operateresult.
     *
     * @return the operateresult
     */
    public Boolean getOperateresult( ) {
		return this.operateresult;
	}

    /**
     * Sets umid.
     *
     * @param umid the umid
     */
    public void setUmid(String umid) {
		this.umid = umid;
	}

    /**
     * Gets umid.
     *
     * @return the umid
     */
    public String getUmid( ) {
		return this.umid;
	}

}
