package org.thlws.payment.wechat.entity.response.mp;

import cn.hutool.core.util.ObjectUtil;
import org.thlws.payment.wechat.entity.extra.IndustryInfo;
import org.thlws.utils.JsonUtil;

import java.io.Serializable;

/**
 * Created by HanleyTang on 2016/11/18.
 */
public class MpGetIndustryResponse implements Serializable {

    private IndustryInfo primary_industry;
    private IndustryInfo secondary_industry;

    public IndustryInfo getPrimary_industry() {
        return primary_industry;
    }

    public void setPrimary_industry(IndustryInfo primary_industry) {
        this.primary_industry = primary_industry;
    }

    public IndustryInfo getSecondary_industry() {
        return secondary_industry;
    }

    public void setSecondary_industry(IndustryInfo secondary_industry) {
        this.secondary_industry = secondary_industry;
    }

    /**
     * Is success boolean.
     *
     * @return the boolean
     */
    public boolean isSuccess(){
        return (ObjectUtil.isNotNull(primary_industry) && ObjectUtil.isNotNull(secondary_industry)) ? true : false;
    }

    @Override
    public String toString() {
        return JsonUtil.beanToJsontring(this);
    }
}
