package org.thlws.payment.alipay.trade.service;

import com.alipay.api.response.MonitorHeartbeatSynResponse;
import org.thlws.payment.alipay.trade.model.builder.AlipayHeartbeatSynRequestBuilder;

/**
 *
 * @author liuyangkly
 * @date 15/10/22
 */
public interface AlipayMonitorService {

    // 交易保障接口 https://openhome.alipay.com/platform/document.htm#mobileApp-barcodePay-API-heartBeat

    /**
     * 可以提供给系统商/pos厂商使用
     *
     * @param builder the builder
     * @return the monitor heartbeat syn response
     */
     MonitorHeartbeatSynResponse heartbeatSyn(AlipayHeartbeatSynRequestBuilder builder);
}
