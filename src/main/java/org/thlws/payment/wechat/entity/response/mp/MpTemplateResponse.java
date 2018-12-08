package org.thlws.payment.wechat.entity.response.mp;

import org.thlws.utils.JsonUtil;

import java.io.Serializable;

/**
 * Created by HanleyTang on 2016/11/18.
 */
public class MpTemplateResponse implements Serializable{

    private long errcode;//0 表示成功
    private String errmsg;
    private String template_id;
    private String desc;

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
     * Gets template id.
     *
     * @return the template id
     */
    public String getTemplate_id() {
        return template_id;
    }

    /**
     * Sets template id.
     *
     * @param template_id the template id
     */
    public void setTemplate_id(String template_id) {
        this.template_id = template_id;
    }
}
