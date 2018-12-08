package org.thlws.payment.wechat.entity.response.mp;

import org.thlws.utils.JsonUtil;

import java.io.Serializable;

/**
 * Created by HanleyTang on 2016/11/15.
 */
public class MpTokenResponse implements Serializable{

    private String access_token;
    private String expires_in;
    private long errcode;
    private String errmsg;
    private String desc;

    /**
     * Instantiates a new Token response.
     */
    public MpTokenResponse() {
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
     * Gets expires in.
     *
     * @return the expires in
     */
    public String getExpires_in() {
        return expires_in;
    }

    /**
     * Sets expires in.
     *
     * @param expires_in the expires in
     */
    public void setExpires_in(String expires_in) {
        this.expires_in = expires_in;
    }

    /**
     * Gets access token.
     *
     * @return the access token
     */
    public String getAccess_token() {
        return access_token;
    }

    /**
     * Sets access token.
     *
     * @param access_token the access token
     */
    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }
}
