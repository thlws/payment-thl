package org.thlws.payment.wechat.entity.response.mp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.thlws.utils.JsonUtil;

import java.io.Serializable;

/**
 *
 * @author HanleyTang
 *2016/11/15
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MpTokenResponse implements Serializable{

    private String access_token;
    private String expires_in;
    private long errcode;
    private String errmsg;
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
