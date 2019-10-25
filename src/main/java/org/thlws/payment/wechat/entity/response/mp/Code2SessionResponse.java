package org.thlws.payment.wechat.entity.response.mp;

import com.google.gson.annotations.SerializedName;
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

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public Integer getErrCode() {
        return errCode;
    }

    public void setErrCode(Integer errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

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
