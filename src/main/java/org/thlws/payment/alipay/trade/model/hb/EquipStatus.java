package org.thlws.payment.alipay.trade.model.hb;

/**
 * Created by liuyangkly on 15/8/27.
 */
public enum EquipStatus {
    /**
     * 开机
     */
    ON("10")

    ,
    /**
     * 关机
     */
    OFF("20")

    ,
    /**
     * 正常
     */
    NORMAL("30")

    ,
    /**
     *  进入休眠
     */
    SLEEP("40")

    ,
    /**
     * 唤醒
     */
    AWAKE("41");

    private String value;

    EquipStatus(String value) {
        this.value = value;
    }

    /**
     * Gets value.
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }
}
