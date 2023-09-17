package org.thlws.payment.alipay.entity.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.thlws.utils.JsonUtil;

/**
 * 支付宝退款
 *
 * @author hanley @thlws.com
 *  2018 /11/16
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AlipayRefundResponse {

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
