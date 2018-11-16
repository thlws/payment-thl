package com.alipay.trade.config;

/**
 * Created by liuyangkly on 15/7/29.
 * Modified by Hanley on 17/3/7
 */
public class Constants {

    private Constants() {
        // No Constructor.
    }

    public static final String SUCCESS = "10000"; // 成功
    public static final String PAYING = "10003";  // 用户支付中
    public static final String FAILED = "40004";  // 失败
    public static final String ERROR = "20000"; // 系统异常

    //交易保障线程第一次调度延迟和调度间隔（秒）
    public static final int heartbeat_delay = 5;
    public static final int heartbeat_duration = 900;

    //当面付最大撤销次数和撤销间隔（毫秒）
    public static final int cancel_duration = 2000;
    public static final int max_cancel_retry = 3;

    //当面付最大查询次数和查询间隔（毫秒）
    public static final int max_query_retry = 5;
    public static final int query_duration = 5000;


    public static final String open_api_domain = "https://openapi.alipay.com/gateway.do";
    public static final String mcloud_api_domain = "http://mcloudmonitor.com/gateway.do";
}
