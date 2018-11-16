package org.thlws.payment.wechat.entity.response.mp;

import org.thlws.utils.JsonUtil;

import java.io.Serializable;

/**
 * Created by HanleyTang on 2016/11/18.
 */
public class TemplateResponse implements Serializable{

    private long errcode;//0 表示成功
    private String errmsg;
    private String template_id;
    private String desc;

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

    public String getTemplate_id() {
        return template_id;
    }

    public void setTemplate_id(String template_id) {
        this.template_id = template_id;
    }
}
