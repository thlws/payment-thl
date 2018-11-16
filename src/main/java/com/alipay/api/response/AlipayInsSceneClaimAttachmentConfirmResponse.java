package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.claim.attachment.confirm response.
 *
 * @author auto create
 * @since 1.0, 2017-07-19 16:55:40
 */
public class AlipayInsSceneClaimAttachmentConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 8432214918591197246L;

	/** 
	 * 差异的文件清单列表
	 */
	@ApiListField("lost_files")
	@ApiField("string")
	private List<String> lostFiles;

	/** 
	 * 文件上传的状态,清单和实际文件一致的返回SUCCEED，不一致的返回FAIL，同时给出lost_files清单
	 */
	@ApiField("status")
	private String status;

    /**
     * Sets lost files.
     *
     * @param lostFiles the lost files
     */
    public void setLostFiles(List<String> lostFiles) {
		this.lostFiles = lostFiles;
	}

    /**
     * Gets lost files.
     *
     * @return the lost files
     */
    public List<String> getLostFiles( ) {
		return this.lostFiles;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus( ) {
		return this.status;
	}

}
