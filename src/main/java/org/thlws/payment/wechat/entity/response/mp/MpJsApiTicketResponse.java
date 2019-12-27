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
 * @date 2016/11/15
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MpJsApiTicketResponse implements Serializable {

    private long errcode;
    private String errmsg;
    private String ticket;
    private String expires_in;
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
