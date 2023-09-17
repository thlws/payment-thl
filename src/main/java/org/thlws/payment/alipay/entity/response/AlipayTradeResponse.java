package org.thlws.payment.alipay.entity.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.thlws.utils.JsonUtil;


/**
 * 支付宝付款结果
 *
 * @author hanley @thlws.com
 *  2018 /11/16
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AlipayTradeResponse {

    private boolean isSuccess;
    private String desc;

    private String              code;
    private String              msg;
    private String              subCode;
    private String              subMsg;


    @Override
    public String toString() {
        return JsonUtil.format(this);
    }
}
