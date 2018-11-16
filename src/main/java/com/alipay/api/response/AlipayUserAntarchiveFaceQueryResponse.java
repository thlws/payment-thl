package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ArchiveFaceInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.antarchive.face.query response.
 *
 * @author auto create
 * @since 1.0, 2018-03-27 17:47:47
 */
public class AlipayUserAntarchiveFaceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4215619781677888533L;

	/** 
	 * 返回人脸图片类型列表.若不存在则返回空列表
	 */
	@ApiListField("archive_face_list")
	@ApiField("archive_face_info")
	private List<ArchiveFaceInfo> archiveFaceList;

    /**
     * Sets archive face list.
     *
     * @param archiveFaceList the archive face list
     */
    public void setArchiveFaceList(List<ArchiveFaceInfo> archiveFaceList) {
		this.archiveFaceList = archiveFaceList;
	}

    /**
     * Gets archive face list.
     *
     * @return the archive face list
     */
    public List<ArchiveFaceInfo> getArchiveFaceList( ) {
		return this.archiveFaceList;
	}

}
