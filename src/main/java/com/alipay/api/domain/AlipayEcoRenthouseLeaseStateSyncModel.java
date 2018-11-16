package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租约状态同步
 *
 * @author auto create
 * @since 1.0, 2018-06-25 14:53:30
 */
public class AlipayEcoRenthouseLeaseStateSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4153593745866282569L;

	/**
	 * 租约电子合同图片，内容字节组Base64处理，支持jpg、png、jpeg、bmp格式
	 */
	@ApiField("lease_ca_file")
	private String leaseCaFile;

	/**
	 * 租约编号(KA内部租约业务编号)
	 */
	@ApiField("lease_code")
	private String leaseCode;

	/**
	 * 租约状态
0-未确认
1-已确认
2-已退房
3-已撤销
	 */
	@ApiField("lease_status")
	private Long leaseStatus;

    /**
     * Gets lease ca file.
     *
     * @return the lease ca file
     */
    public String getLeaseCaFile() {
		return this.leaseCaFile;
	}

    /**
     * Sets lease ca file.
     *
     * @param leaseCaFile the lease ca file
     */
    public void setLeaseCaFile(String leaseCaFile) {
		this.leaseCaFile = leaseCaFile;
	}

    /**
     * Gets lease code.
     *
     * @return the lease code
     */
    public String getLeaseCode() {
		return this.leaseCode;
	}

    /**
     * Sets lease code.
     *
     * @param leaseCode the lease code
     */
    public void setLeaseCode(String leaseCode) {
		this.leaseCode = leaseCode;
	}

    /**
     * Gets lease status.
     *
     * @return the lease status
     */
    public Long getLeaseStatus() {
		return this.leaseStatus;
	}

    /**
     * Sets lease status.
     *
     * @param leaseStatus the lease status
     */
    public void setLeaseStatus(Long leaseStatus) {
		this.leaseStatus = leaseStatus;
	}

}
