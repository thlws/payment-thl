/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2012 All Rights Reserved.
 */
package com.alipay.api;

/**
 * The type Default alipay client.
 *
 * @author runzhi
 * @version $Id : DefaultAlipayClient.java, v 0.1 2012-11-49:45:21 runzhi Exp $
 */
public class DefaultAlipayClient extends AbstractAlipayClient {

    private String privateKey;
    private String encryptKey;
    private String alipayPublicKey;
    private Signer signer;
    private SignChecker signChecker;
    private Encryptor encryptor;
    private Decryptor decryptor;

    /**
     * Instantiates a new Default alipay client.
     *
     * @param serverUrl  the server url
     * @param appId      the app id
     * @param privateKey the private key
     */
    public DefaultAlipayClient(String serverUrl, String appId, String privateKey) {
        super(serverUrl, appId, null, null, null);
        this.privateKey = privateKey;
        this.signer = new DefaultSigner(privateKey);
    }

    /**
     * Instantiates a new Default alipay client.
     *
     * @param serverUrl  the server url
     * @param appId      the app id
     * @param privateKey the private key
     * @param format     the format
     */
    public DefaultAlipayClient(String serverUrl, String appId, String privateKey, String format) {
        super(serverUrl, appId, format, null, null);
        this.privateKey = privateKey;
        this.signer = new DefaultSigner(privateKey);
    }

    /**
     * Instantiates a new Default alipay client.
     *
     * @param serverUrl  the server url
     * @param appId      the app id
     * @param privateKey the private key
     * @param format     the format
     * @param charset    the charset
     */
    public DefaultAlipayClient(String serverUrl, String appId, String privateKey, String format,
                               String charset) {
        super(serverUrl, appId, format, charset, null);
        this.privateKey = privateKey;
        this.signer = new DefaultSigner(privateKey);
    }

    /**
     * Instantiates a new Default alipay client.
     *
     * @param serverUrl       the server url
     * @param appId           the app id
     * @param privateKey      the private key
     * @param format          the format
     * @param charset         the charset
     * @param alipayPublicKey the alipay public key
     */
    public DefaultAlipayClient(String serverUrl, String appId, String privateKey, String format,
                               String charset, String alipayPublicKey) {
        super(serverUrl, appId, format, charset, null);
        this.privateKey = privateKey;
        this.signer = new DefaultSigner(privateKey);
        this.alipayPublicKey = alipayPublicKey;
        this.signChecker = new DefaultSignChecker(alipayPublicKey);
    }

    /**
     * Instantiates a new Default alipay client.
     *
     * @param serverUrl       the server url
     * @param appId           the app id
     * @param privateKey      the private key
     * @param format          the format
     * @param charset         the charset
     * @param alipayPublicKey the alipay public key
     * @param signType        the sign type
     */
    public DefaultAlipayClient(String serverUrl, String appId, String privateKey, String format,
                               String charset, String alipayPublicKey, String signType) {
        super(serverUrl, appId, format, charset, signType);
        this.privateKey = privateKey;
        this.signer = new DefaultSigner(privateKey);
        this.alipayPublicKey = alipayPublicKey;
        this.signChecker = new DefaultSignChecker(alipayPublicKey);
    }

    /**
     * Instantiates a new Default alipay client.
     *
     * @param serverUrl       the server url
     * @param appId           the app id
     * @param privateKey      the private key
     * @param format          the format
     * @param charset         the charset
     * @param alipayPublicKey the alipay public key
     * @param signType        the sign type
     * @param proxyHost       the proxy host
     * @param proxyPort       the proxy port
     */
    public DefaultAlipayClient(String serverUrl, String appId, String privateKey, String format,
                               String charset, String alipayPublicKey, String signType,
                               String proxyHost, int proxyPort) {
        super(serverUrl, appId, format, charset, signType, proxyHost, proxyPort);
        this.privateKey = privateKey;
        this.signer = new DefaultSigner(privateKey);
        this.alipayPublicKey = alipayPublicKey;
        this.signChecker = new DefaultSignChecker(alipayPublicKey);
    }

    /**
     * Instantiates a new Default alipay client.
     *
     * @param serverUrl       the server url
     * @param appId           the app id
     * @param privateKey      the private key
     * @param format          the format
     * @param charset         the charset
     * @param alipayPublicKey the alipay public key
     * @param signType        the sign type
     * @param encryptKey      the encrypt key
     * @param encryptType     the encrypt type
     */
    public DefaultAlipayClient(String serverUrl, String appId, String privateKey, String format,
                               String charset, String alipayPublicKey, String signType,
                               String encryptKey, String encryptType) {
        super(serverUrl, appId, format, charset, signType, encryptType);
        this.privateKey = privateKey;
        this.signer = new DefaultSigner(privateKey);
        this.alipayPublicKey = alipayPublicKey;
        this.signChecker = new DefaultSignChecker(alipayPublicKey);
        this.encryptor = new DefaultEncryptor(encryptKey);
        this.decryptor = new DefaultDecryptor(encryptKey);
    }

    public Signer getSigner() {
        return signer;
    }

    public SignChecker getSignChecker() {
        return signChecker;
    }

    public Encryptor getEncryptor() {
        return encryptor;
    }

    public Decryptor getDecryptor() {
        return decryptor;
    }

    /**
     * Sets private key.
     *
     * @param privateKey the private key
     */
    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        if (this.signer == null) {
            this.signer = new DefaultSigner(privateKey);
        }
    }

    /**
     * Sets encrypt key.
     *
     * @param encryptKey the encrypt key
     */
    public void setEncryptKey(String encryptKey) {
        this.encryptKey = encryptKey;
        if (this.encryptor == null) {
            this.encryptor = new DefaultEncryptor(encryptKey);
        }
        if (this.decryptor == null) {
            this.decryptor = new DefaultDecryptor(encryptKey);
        }
    }

    /**
     * Sets alipay public key.
     *
     * @param alipayPublicKey the alipay public key
     */
    public void setAlipayPublicKey(String alipayPublicKey) {
        this.alipayPublicKey = alipayPublicKey;
        if (this.signChecker == null) {
            this.signChecker = new DefaultSignChecker(alipayPublicKey);
        }
    }

    /**
     * Builder builder.
     *
     * @param serverUrl  the server url
     * @param appId      the app id
     * @param privateKey the private key
     * @return the builder
     */
    public static Builder builder(String serverUrl, String appId, String privateKey) {
        return new Builder(serverUrl, appId, privateKey);
    }

    /**
     * The type Builder.
     */
    public static class Builder {
        private DefaultAlipayClient client;

        /**
         * Instantiates a new Builder.
         *
         * @param serverUrl  the server url
         * @param appId      the app id
         * @param privateKey the private key
         */
        Builder(String serverUrl, String appId, String privateKey) {
            client = new DefaultAlipayClient(serverUrl, appId, privateKey);
        }

        /**
         * Build default alipay client.
         *
         * @return the default alipay client
         */
        public DefaultAlipayClient build() {
            return client;
        }

        /**
         * Prod code builder.
         *
         * @param prodCode the prod code
         * @return the builder
         */
        public Builder prodCode(String prodCode) {
            client.setProdCode(prodCode);
            return this;
        }

        /**
         * Format builder.
         *
         * @param format the format
         * @return the builder
         */
        public Builder format(String format) {
            client.setFormat(format);
            return this;
        }

        /**
         * Sign type builder.
         *
         * @param signType the sign type
         * @return the builder
         */
        public Builder signType(String signType) {
            client.setSignType(signType);
            return this;
        }

        /**
         * Encrypt type builder.
         *
         * @param encryptType the encrypt type
         * @return the builder
         */
        public Builder encryptType(String encryptType) {
            client.setEncryptType(encryptType);
            return this;
        }

        /**
         * Encrypt key builder.
         *
         * @param encryptKey the encrypt key
         * @return the builder
         */
        public Builder encryptKey(String encryptKey) {
            client.setEncryptKey(encryptKey);
            return this;
        }

        /**
         * Alipay public key builder.
         *
         * @param alipayPublicKey the alipay public key
         * @return the builder
         */
        public Builder alipayPublicKey(String alipayPublicKey) {
            client.setAlipayPublicKey(alipayPublicKey);
            return this;
        }

        /**
         * Charset builder.
         *
         * @param charset the charset
         * @return the builder
         */
        public Builder charset(String charset) {
            client.setCharset(charset);
            return this;
        }

        /**
         * Connect timeout builder.
         *
         * @param connectTimeout the connect timeout
         * @return the builder
         */
        public Builder connectTimeout(int connectTimeout) {
            client.setConnectTimeout(connectTimeout);
            return this;
        }

        /**
         * Read timeout builder.
         *
         * @param readTimeout the read timeout
         * @return the builder
         */
        public Builder readTimeout(int readTimeout) {
            client.setReadTimeout(readTimeout);
            return this;
        }

        /**
         * Proxy host builder.
         *
         * @param proxyHost the proxy host
         * @return the builder
         */
        public Builder proxyHost(String proxyHost) {
            client.setProxyHost(proxyHost);
            return this;
        }

        /**
         * Proxy port builder.
         *
         * @param proxyPort the proxy port
         * @return the builder
         */
        public Builder proxyPort(int proxyPort) {
            client.setProxyPort(proxyPort);
            return this;
        }
    }
}
