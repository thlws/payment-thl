package org.thlws.payment.alipay.trade.service.impl.hb;

import com.alipay.api.response.MonitorHeartbeatSynResponse;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.thlws.payment.alipay.trade.config.Constants;
import org.thlws.payment.alipay.trade.model.builder.AlipayHeartbeatSynRequestBuilder;
import org.thlws.payment.alipay.trade.service.AlipayMonitorService;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by liuyangkly on 15/10/23.
 */
public abstract class AbsHbRunner implements Runnable {
    /**
     * The Log.
     */
    protected Log log = LogFactory.getLog(getClass());

    /**
     * Gets builder.
     *
     * @return the builder
     */
// 获取交易保障所需的信息
    public abstract AlipayHeartbeatSynRequestBuilder getBuilder();

    /**
     * Gets app auth token.
     *
     * @return the app auth token
     */
// 获取商户授权令牌，系统商通过此令牌帮助商户发起请求，完成业务
    public abstract String getAppAuthToken();

    private ScheduledExecutorService scheduledService = Executors.newSingleThreadScheduledExecutor();
    private AlipayMonitorService monitorService;

    private long delay = 0;
    private long duration = 0;

    /**
     * Instantiates a new Abs hb runner.
     *
     * @param monitorService the monitor service
     */
    public AbsHbRunner(AlipayMonitorService monitorService) {
        this.monitorService = monitorService;
    }

    @Override
    public void run() {
        AlipayHeartbeatSynRequestBuilder builder = getBuilder();
        builder.setAppAuthToken(getAppAuthToken());

        MonitorHeartbeatSynResponse response = monitorService.heartbeatSyn(builder);

        StringBuilder sb = new StringBuilder(response.getCode())
                                .append(":")
                                .append(response.getMsg());
        if (StringUtils.isNotEmpty(response.getSubCode())) {
            sb.append(", ")
            .append(response.getSubCode())
            .append(":")
            .append(response.getSubMsg());
        }
        log.debug(sb.toString());
    }

    /**
     * Schedule.
     */
    public void schedule() {
        if (delay == 0) {
            delay = Constants.heartbeat_delay;
        }
        if (duration == 0) {
            duration = Constants.cancel_duration;
        }
        scheduledService.scheduleAtFixedRate(this, delay, duration, TimeUnit.SECONDS);
    }

    /**
     * Shutdown.
     */
    public void shutdown() {
        scheduledService.shutdown();
    }

    /**
     * Gets delay.
     *
     * @return the delay
     */
    public long getDelay() {
        return delay;
    }

    /**
     * Sets delay.
     *
     * @param delay the delay
     */
    public void setDelay(long delay) {
        this.delay = delay;
    }

    /**
     * Gets duration.
     *
     * @return the duration
     */
    public long getDuration() {
        return duration;
    }

    /**
     * Sets duration.
     *
     * @param duration the duration
     */
    public void setDuration(long duration) {
        this.duration = duration;
    }
}
