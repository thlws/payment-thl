package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PublicMessageInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.message.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayOpenPublicMessageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6272793969927318916L;

	/** 
	 * 发送消息结果集。仅返回该用户已发送的消息
	 */
	@ApiListField("list")
	@ApiField("public_message_info")
	private List<PublicMessageInfo> list;

    /**
     * Sets list.
     *
     * @param list the list
     */
    public void setList(List<PublicMessageInfo> list) {
		this.list = list;
	}

    /**
     * Gets list.
     *
     * @return the list
     */
    public List<PublicMessageInfo> getList( ) {
		return this.list;
	}

}
