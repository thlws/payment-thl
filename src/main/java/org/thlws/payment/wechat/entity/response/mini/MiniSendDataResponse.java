package org.thlws.payment.wechat.entity.response.mini;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * @author HanleyTang 2019/12/14
 */
public class MiniSendDataResponse implements Serializable {

    @SerializedName("errcode")
    private Integer errCode;

    @SerializedName("errmsg")
    private String errMsg;

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
}
