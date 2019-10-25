package org.thlws.payment.alipay.trade.model.hb;

/**
 *
 * @author liuyangkly
 * date15/9/28
 */
public class PosTradeInfo implements TradeInfo {
    private HbStatus status;
    private String time;
    private int timeConsume;

    private PosTradeInfo() {
        // no public constructor.
    }

    /**
     * New instance pos trade info.
     *
     * @param status      the status
     * @param time        the time
     * @param timeConsume the time consume
     * @return the pos trade info
     */
    public static PosTradeInfo newInstance(HbStatus status, String time, int timeConsume) {
        PosTradeInfo info = new PosTradeInfo();
        if (timeConsume > 99 || timeConsume < 0) {
            timeConsume = 99;
        }
        info.setTimeConsume(timeConsume);
        info.setStatus(status);
        info.setTime(time);
        return info;
    }

    @Override
    public String toString() {
        return new StringBuilder(status.name())
                .append(time)
                .append(String.format("%02d", timeConsume))
                .toString();
    }

    @Override
    public HbStatus getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(HbStatus status) {
        this.status = status;
    }

    /**
     * Gets time.
     *
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets time.
     *
     * @param time the time
     */
    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public double getTimeConsume() {
        return (double) timeConsume;
    }

    /**
     * Sets time consume.
     *
     * @param timeConsume the time consume
     */
    public void setTimeConsume(int timeConsume) {
        this.timeConsume = timeConsume;
    }
}
