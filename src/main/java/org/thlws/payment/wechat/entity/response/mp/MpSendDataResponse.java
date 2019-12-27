package org.thlws.payment.wechat.entity.response.mp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.thlws.utils.JsonUtil;

/**
 *
 * @author HanleyTang
 *2016/11/18
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MpSendDataResponse {

    //{"errcode":0,"errmsg":"ok","msgid":414569352}

    private long  errcode;
    private String errmsg;
    private String msgid;
    private  String desc;

    @Override
    public String toString() {
        return JsonUtil.format(this);
    }

    public boolean isSuccess(){
        return errcode == 0 ? true : false;
    }
}
