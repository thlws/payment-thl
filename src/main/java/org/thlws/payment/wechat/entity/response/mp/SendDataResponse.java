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

    /**
     * Gets errcode.
     *
     * @return the errcode
     */
    public long getErrcode() {
        return errcode;
    }

    /**
     * Sets errcode.
     *
     * @param errcode the errcode
     */
    public void setErrcode(long errcode) {
        this.errcode = errcode;
    }

    /**
     * Gets desc.
     *
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets desc.
     *
     * @param desc the desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * Gets errmsg.
     *
     * @return the errmsg
     */
    public String getErrmsg() {
        return errmsg;
    }

    /**
     * Sets errmsg.
     *
     * @param errmsg the errmsg
     */
    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    /**
     * Gets msgid.
     *
     * @return the msgid
     */
    public String getMsgid() {
        return msgid;
    }

    /**
     * Sets msgid.
     *
     * @param msgid the msgid
     */
    public void setMsgid(String msgid) {
        this.msgid = msgid;
    }
}
