package org.thlws.payment.wechat.entity.response.mp;

import org.thlws.utils.JsonUtil;

/**
 * Created by HanleyTang on 2016/11/18.
 */
public class MpSetIndustryResponse {

    private long errcode; // 0
    private String errmsg; // ok
    private String desc;

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
