package org.thlws.payment.wechat.entity.response.mp;

import org.thlws.utils.JsonUtil;

import java.io.Serializable;

/**
 * Created by HanleyTang on 2016/11/15.
 */
public class JsApiTicketResponse implements Serializable {

    private long errcode;
    private String errmsg;
    private String ticket;
    private String expires_in;
    private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public JsApiTicketResponse() {
    }

    public long getErrcode() {
        return errcode;
    }

    public void setErrcode(long errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public String getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(String expires_in) {
        this.expires_in = expires_in;
    }

    @Override
    public String toString() {
        return JsonUtil.format(this);
    }
}
