package org.thlws.payment.wechat.entity.response.mp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.thlws.utils.JsonUtil;

/**
 * Oauth access_token  refresh_token Response POJO
 * 此为Oauth方式得Token,非普通方式token
 *
 * @author Hanley Tang | hanley@thlws.com
 * @version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MpOauthTokenResponse {

	private String access_token    ;
	private String expires_in      ;//access_token接口调用凭证超时时间，单位（秒）
	private String refresh_token   ;
	private String openid          ;
	private String scope           ;
	private String unionid         ;

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
