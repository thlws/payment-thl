package org.thlws.payment.wechat.entity.response.mp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.thlws.utils.JsonUtil;

/**
 *
 * @author HanleyTang
 * @date 2016/11/18
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MpSetIndustryResponse {

    private long errcode; // 0
    private String errmsg; // ok
    private String desc;


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
