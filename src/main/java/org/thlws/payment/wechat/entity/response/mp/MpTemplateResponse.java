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
 *2016/11/18
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
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
     * Is success boolean.
     *
     * @return the boolean
     */
    public boolean isSuccess(){
        return errcode == 0 ? true : false;
    }
}
