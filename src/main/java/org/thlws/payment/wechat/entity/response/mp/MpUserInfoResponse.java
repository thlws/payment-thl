package org.thlws.payment.wechat.entity.response.mp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.thlws.utils.JsonUtil;

import java.util.List;

/***
 * 拉取用户信息(需scope为 snsapi_userinfo) Response POJO
 * @author Hanley Tang | hanley@hanley.cn
 * @version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MpUserInfoResponse {

	private String openid         ;
	private String nickname       ;
	private String sex            ;
	private String province       ;
	private String city           ;
	private String country        ;
	private String headimgurl     ;
	private String unionid        ;
	private List<String> privilege;//用户特权信息，json数组，如微信沃卡用户为（chinaunicom）

	private long errcode		   ;
	private String errmsg			;
	private String desc;



	@Override
	public String toString() {
		return JsonUtil.format(this);
	}


	/**
	 * Is success boolean.
	 *
	 * @return the boolean
	 */
	public boolean isSuccess(){
		return errcode == 0 ? true : false;
	}
	
}
