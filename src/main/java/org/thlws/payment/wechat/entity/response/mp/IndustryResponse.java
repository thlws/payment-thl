package org.thlws.payment.wechat.entity.response.mp;

import org.thlws.utils.JsonUtil;

/**
 * Created by HanleyTang on 2016/11/18.
 */
public class IndustryResponse {

    private long errcode; // 0
    private String errmsg; // ok
    private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
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

    @Override
    public String toString() {
        return JsonUtil.format(this);
    }
}
