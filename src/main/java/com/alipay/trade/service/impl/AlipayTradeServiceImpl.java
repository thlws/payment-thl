package com.alipay.trade.service.impl;

import com.alipay.api.AlipayConstants;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePayRequest;
import com.alipay.api.response.AlipayTradePayResponse;
import com.alipay.api.response.AlipayTradeQueryResponse;
import com.alipay.trade.model.TradeStatus;
import com.alipay.trade.model.builder.AlipayTradePayRequestBuilder;
import com.alipay.trade.model.builder.AlipayTradeQueryRequestBuilder;
import com.alipay.trade.model.result.AlipayF2FPayResult;
import com.alipay.trade.config.Constants;

import org.apache.commons.lang.StringUtils;

/**
 * Created by liuyangkly on 15/7/29.
 * Modified By Hanley on 17/3/7
 * 支付宝核心接口,使用API前需先行初始化.
 */
public class AlipayTradeServiceImpl extends AbsAlipayTradeService {

    /**
     * The type Client builder.
     */
    public static class ClientBuilder {
        private String gatewayUrl;
        private String appid;
        private String privateKey;
        private String format;
        private String charset;
        private String alipayPublicKey;
        private String signType;

        /***
         * Modified By Hanley
         * 移除properties中读取支付宝参数
         * @return alipay trade service
         */
        public AlipayTradeServiceImpl build() {
            if (StringUtils.isEmpty(gatewayUrl)) {
                throw new NullPointerException("gatewayUrl should not be NULL!"); // 与mcloudmonitor网关地址不同
            }
            if (StringUtils.isEmpty(appid)) {
                throw new NullPointerException("appid should not be NULL!");
            }
            if (StringUtils.isEmpty(privateKey)) {
                throw new NullPointerException("privateKey should not be NULL!");
            }
            if (StringUtils.isEmpty(format)) {
                format = "json";
            }
            if (StringUtils.isEmpty(charset)) {
                charset = "utf-8";
            }
//            if (StringUtils.isEmpty(alipayPublicKey)) {
//                throw new NullPointerException("alipayPublicKey should not be NULL!");
//            }
            if (StringUtils.isEmpty(signType)) {
                throw new NullPointerException("signType should not be NULL!");
            }else{
                if(signType.equalsIgnoreCase(AlipayConstants.SIGN_TYPE_RSA2) && StringUtils.isEmpty(alipayPublicKey)){
                    throw new NullPointerException("please set alipay_public_key first,when the sign_type is RSA2!");
                }
            }



            return new AlipayTradeServiceImpl(this);
        }

        /**
         * Sets alipay public key.
         *
         * @param alipayPublicKey the alipay public key
         * @return the alipay public key
         */
        public ClientBuilder setAlipayPublicKey(String alipayPublicKey) {
            this.alipayPublicKey = alipayPublicKey;
            return this;
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
         * Gets alipay public key.
         *
         * @return the alipay public key
         */
        public String getAlipayPublicKey() {
            return alipayPublicKey;
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

        /**
         * Gets sign type.
         *
         * @return the sign type
         */
        public String getSignType() {
            return signType;
        }

        /**
         * Sets sign type.
         *
         * @param signType the sign type
         */
        public void setSignType(String signType) {
            this.signType = signType;
        }
    }

    /**
     * Instantiates a new Alipay trade service.
     *
     * @param builder the builder
     */
    public AlipayTradeServiceImpl(ClientBuilder builder) {
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
//        if (StringUtils.isEmpty(builder.getAlipayPublicKey())) {
//            throw new NullPointerException("alipayPublicKey should not be NULL!");
//        }

        client = new DefaultAlipayClient(builder.getGatewayUrl(), builder.getAppid(), builder.getPrivateKey(),
                builder.getFormat(), builder.getCharset(), builder.getAlipayPublicKey(),builder.getSignType());
    }


}
