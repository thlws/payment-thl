package org.thlws.payment.alipay.entity.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.thlws.utils.JsonUtil;

/**
 *
 * @author HanleyTang
 * date2017/3/8
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AlipayCancelResponse {

    private boolean isSuccess;
    private String desc;

    private String              subCode;
    private String              subMsg;
    private String              code;
    private String              msg;


    @Override
    public String toString() {
        return JsonUtil.format(this);
    }
}
