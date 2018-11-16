package org.thlws.payment.wechat.entity.response.mp;

import org.thlws.utils.JsonUtil;

/**
 * Created by HanleyTang on 2016/11/18.
 */
public class SendDataResponse {

    //{"errcode":0,"errmsg":"ok","msgid":414569352}

    private long  errcode;
    private String errmsg;
    private String msgid;
    private  String desc;

    @Override
    public String toString() {
        return JsonUtil.format(this);
    }

    public long getErrcode() {
        return errcode;
    }

    public void setErrcode(long errcode) {
        this.errcode = errcode;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public String getMsgid() {
        return msgid;
    }

    public void setMsgid(String msgid) {
        this.msgid = msgid;
    }
}
