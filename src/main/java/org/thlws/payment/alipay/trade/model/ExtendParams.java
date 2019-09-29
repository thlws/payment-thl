package org.thlws.payment.alipay.trade.model;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author liuyangkly
 * @date 15/6/26
 * 扩展信息
 */
public class ExtendParams {

    @SerializedName("sys_service_provider_id")
    private String sysServiceProviderId;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ExtendParams{");
        sb.append("sysServiceProviderId='").append(sysServiceProviderId).append('\'');
        sb.append('}');
        return sb.toString();
    }

    /**
     * Gets sys service provider id.
     *
     * @return the sys service provider id
     */
    public String getSysServiceProviderId() {
        return sysServiceProviderId;
    }

    /**
     * Sets sys service provider id.
     *
     * @param sysServiceProviderId the sys service provider id
     * @return the sys service provider id
     */
    public ExtendParams setSysServiceProviderId(String sysServiceProviderId) {
        this.sysServiceProviderId = sysServiceProviderId;
        return this;
    }
}
