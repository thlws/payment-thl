package org.thlws.payment.wechat.entity.response.mp;

import cn.hutool.core.util.ObjectUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.thlws.payment.wechat.entity.extra.IndustryInfo;
import org.thlws.utils.JsonUtil;

import java.io.Serializable;

/**
 *
 * @author HanleyTang
 *2016/11/18
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MpGetIndustryResponse implements Serializable {

    private IndustryInfo primary_industry;
    private IndustryInfo secondary_industry;

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
