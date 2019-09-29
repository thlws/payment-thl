package org.thlws.payment.alipay.trade.model.builder;

import org.thlws.payment.alipay.trade.utils.GsonFactory;

/**
 * Created by liuyangkly on 15/7/31.
 */
public abstract class RequestBuilder {

    private String appAuthToken;
    private String notifyUrl;

    /**
     *  验证请求对象
     *
     * @return the boolean
     */
    public abstract boolean validate();

    /**
     * 获取bizContent对象，用于下一步转换为json字符串
     *
     * @return the biz content
     */
    public abstract Object getBizContent();

    /**
     * 将bizContent对象转换为json字符串
     *
     * @return the string
     */
    public String toJsonString() {
        return GsonFactory.getGson().toJson(this.getBizContent());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RequestBuilder{");
        sb.append("appAuthToken='").append(appAuthToken).append('\'');
        sb.append(", notifyUrl='").append(notifyUrl).append('\'');
        sb.append('}');
        return sb.toString();
    }

    /**
     * Gets app auth token.
     *
     * @return the app auth token
     */
    public String getAppAuthToken() {
        return appAuthToken;
    }

    /**
     * Sets app auth token.
     *
     * @param appAuthToken the app auth token
     * @return the app auth token
     */
    public RequestBuilder setAppAuthToken(String appAuthToken) {
        this.appAuthToken = appAuthToken;
        return this;
    }

    /**
     * Gets notify url.
     *
     * @return the notify url
     */
    public String getNotifyUrl() {
        return notifyUrl;
    }

    /**
     * Sets notify url.
     *
     * @param notifyUrl the notify url
     * @return the notify url
     */
    public RequestBuilder setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }
}
