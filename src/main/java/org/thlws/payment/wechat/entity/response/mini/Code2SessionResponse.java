package org.thlws.payment.wechat.entity.response.mini;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.thlws.utils.JsonUtil;

import java.util.Objects;

/**
 * @author HanleyTang 2019/9/13
 *
 * openid	    string	用户唯一标识
 * session_key	string	会话密钥
 * unionid	    string	用户在开放平台的唯一标识符，在满足 UnionID 下发条件的情况下会返回，详见 UnionID 机制说明。
 * errcode	    number	错误码
 * errmsg	    string	错误信息
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Code2SessionResponse {

    @SerializedName("openid")
    private String openid;

    @SerializedName("session_key")
    private String sessionKey;

    @SerializedName("unionid")
    private String unionId;

    @SerializedName("errcode")
    private Integer errCode;

    @SerializedName("errmsg")
    private String errMsg;


    /**
     * 是否成功
     * @return boolean
     */
    public boolean isSuccess(){
        return (Objects.isNull(errCode)|| errCode == 0);
    }

    @Override
    public String toString() {
        return JsonUtil.beanToJsontring(this);
    }
}
