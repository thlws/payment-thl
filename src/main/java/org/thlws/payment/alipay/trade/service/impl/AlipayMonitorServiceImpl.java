package org.thlws.payment.alipay.trade.service.impl;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.MonitorHeartbeatSynRequest;
import com.alipay.api.response.MonitorHeartbeatSynResponse;
import org.apache.commons.lang3.StringUtils;
import org.thlws.payment.alipay.trade.config.Constants;
import org.thlws.payment.alipay.trade.model.builder.AlipayHeartbeatSynRequestBuilder;
import org.thlws.payment.alipay.trade.service.AlipayMonitorService;


/**
 * Created by liuyangkly on 15/10/22.
 */
public class AlipayMonitorServiceImpl extends AbsAlipayService implements AlipayMonitorService {
    private AlipayClient client;

    /**
     * The type Client builder.
     */
    public static class ClientBuilder {
        private String gatewayUrl;
        private String appid;
        private String privateKey;
        private String format;
        private String charset;

        /**
         * Build alipay monitor service.
         *
         * @return the alipay monitor service
         */
        public AlipayMonitorServiceImpl build() {
            if (StringUtils.isEmpty(gatewayUrl)) {
                gatewayUrl = Constants.mcloud_api_domain; // 与openapi网关地址不同
            }
            if (StringUtils.isEmpty(appid)) {
                throw new NullPointerException("appid can not be Null.");
            }
            if (StringUtils.isEmpty(privateKey)) {
                throw new NullPointerException("privateKey can not be Null.");
            }
            if (StringUtils.isEmpty(format)) {
                format = "json";
            }
            if (StringUtils.isEmpty(charset)) {
                charset = "utf-8";
            }
            return new AlipayMonitorServiceImpl(this);
        }

        /**
         * Sets appid.
         *
         * @param appid the appid
         * @return the appid
         */
        public ClientBuilder setAppid(String appid) {
            this.appid = appid;
            return this;
        }

        /**
         * Sets charset.
         *
         * @param charset the charset
         * @return the charset
         */
        public ClientBuilder setCharset(String charset) {
            this.charset = charset;
            return this;
        }

        /**
         * Sets format.
         *
         * @param format the format
         * @return the format
         */
        public ClientBuilder setFormat(String format) {
            this.format = format;
            return this;
        }

        /**
         * Sets gateway url.
         *
         * @param gatewayUrl the gateway url
         * @return the gateway url
         */
        public ClientBuilder setGatewayUrl(String gatewayUrl) {
            this.gatewayUrl = gatewayUrl;
            return this;
        }

        /**
         * Sets private key.
         *
         * @param privateKey the private key
         * @return the private key
         */
        public ClientBuilder setPrivateKey(String privateKey) {
            this.privateKey = privateKey;
            return this;
        }

        /**
         * Gets appid.
         *
         * @return the appid
         */
        public String getAppid() {
            return appid;
        }

        /**
         * Gets charset.
         *
         * @return the charset
         */
        public String getCharset() {
            return charset;
        }

        /**
         * Gets format.
         *
         * @return the format
         */
        public String getFormat() {
            return format;
        }

        /**
         * Gets gateway url.
         *
         * @return the gateway url
         */
        public String getGatewayUrl() {
            return gatewayUrl;
        }

        /**
         * Gets private key.
         *
         * @return the private key
         */
        public String getPrivateKey() {
            return privateKey;
        }
    }

    /**
     * Instantiates a new Alipay monitor service.
     *
     * @param builder the builder
     */
    public AlipayMonitorServiceImpl(ClientBuilder builder) {
        if (StringUtils.isEmpty(builder.getGatewayUrl())) {
            throw new NullPointerException("gatewayUrl should not be NULL!");
        }
        if (StringUtils.isEmpty(builder.getAppid())) {
            throw new NullPointerException("appid should not be NULL!");
        }
        if (StringUtils.isEmpty(builder.getPrivateKey())) {
            throw new NullPointerException("privateKey should not be NULL!");
        }
        if (StringUtils.isEmpty(builder.getFormat())) {
            throw new NullPointerException("format should not be NULL!");
        }
        if (StringUtils.isEmpty(builder.getCharset())) {
            throw new NullPointerException("charset should not be NULL!");
        }

        // 此处不需要使用alipay public key，因为金融云不产生签名
        client = new DefaultAlipayClient(builder.getGatewayUrl(), builder.getAppid(), builder.getPrivateKey(),
                builder.getFormat(), builder.getCharset());
    }

    @Override
    public MonitorHeartbeatSynResponse heartbeatSyn(AlipayHeartbeatSynRequestBuilder builder) {
        validateBuilder(builder);

        MonitorHeartbeatSynRequest request = new MonitorHeartbeatSynRequest();
        request.putOtherTextParam("app_auth_token", builder.getAppAuthToken());
        request.setBizContent(builder.toJsonString());
        log.debug("heartbeat.sync bizContent:" + request.getBizContent());

        return (MonitorHeartbeatSynResponse) getResponse(client, request);
    }
}
