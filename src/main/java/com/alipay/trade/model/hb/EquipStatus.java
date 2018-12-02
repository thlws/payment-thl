package com.alipay.trade.model.hb;

/**
 * Created by liuyangkly on 15/8/27.
 */
public enum EquipStatus {
    /**
     * On equip status.
     */
    ON("10")    // 开机

    ,
    /**
     * Off equip status.
     */
    OFF("20")  // 关机

    ,
    /**
     * Normal equip status.
     */
    NORMAL("30")  // 正常

    ,
    /**
     * Sleep equip status.
     */
    SLEEP("40")  // 进入休眠

    ,
    /**
     * Awake equip status.
     */
    AWAKE("41");  // 唤醒

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
