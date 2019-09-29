package org.thlws.payment.alipay.trade.model.builder;

import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.StringUtils;
import org.thlws.payment.alipay.trade.model.hb.*;
import org.thlws.payment.alipay.trade.utils.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author liuyangkly
 * @date 16/3/2
 */
public class AlipayHeartbeatSynRequestBuilder extends RequestBuilder {

    private BizContent bizContent = new BizContent();

    @Override
    public BizContent getBizContent() {
        return bizContent;
    }

    @Override
    public boolean validate() {
        if (bizContent.product == null) {
            throw new NullPointerException("product should not be NULL!");
        }
        if (bizContent.type == null) {
            throw new NullPointerException("type should not be NULL!");
        }
        if (StringUtils.isEmpty(bizContent.equipmentId)) {
            throw new NullPointerException("equipment_id should not be NULL!");
        }
        if (bizContent.equipmentStatus == null) {
            throw new NullPointerException("equipment_status should not be NULL!");
        }
        if (StringUtils.isEmpty(bizContent.time)) {
            throw new NullPointerException("time should not be NULL!");
        }
        return true;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AlipayHeartbeatSynRequestBuilder{");
        sb.append("bizContent=").append(bizContent);
        sb.append(", super=").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public AlipayHeartbeatSynRequestBuilder setAppAuthToken(String appAuthToken) {
        return (AlipayHeartbeatSynRequestBuilder) super.setAppAuthToken(appAuthToken);
    }

    @Override
    public AlipayHeartbeatSynRequestBuilder setNotifyUrl(String notifyUrl) {
        return (AlipayHeartbeatSynRequestBuilder) super.setNotifyUrl(notifyUrl);
    }

    /**
     * Gets mac.
     *
     * @return the mac
     */
    public String getMac() {
        return bizContent.mac;
    }

    /**
     * Sets mac.
     *
     * @param mac the mac
     * @return the mac
     */
    public AlipayHeartbeatSynRequestBuilder setMac(String mac) {
        bizContent.mac = mac;
        return this;
    }

    /**
     * Gets network type.
     *
     * @return the network type
     */
    public String getNetworkType() {
        return bizContent.networkType;
    }

    /**
     * Sets network type.
     *
     * @param networkType the network type
     * @return the network type
     */
    public AlipayHeartbeatSynRequestBuilder setNetworkType(String networkType) {
        bizContent.networkType = networkType;
        return this;
    }

    /**
     * Gets battery.
     *
     * @return the battery
     */
    public String getBattery() {
        return bizContent.battery;
    }

    /**
     * Sets battery.
     *
     * @param battery the battery
     * @return the battery
     */
    public AlipayHeartbeatSynRequestBuilder setBattery(String battery) {
        bizContent.battery = battery;
        return this;
    }

    /**
     * Gets wifi mac.
     *
     * @return the wifi mac
     */
    public String getWifiMac() {
        return bizContent.wifiMac;
    }

    /**
     * Sets wifi mac.
     *
     * @param wifiMac the wifi mac
     * @return the wifi mac
     */
    public AlipayHeartbeatSynRequestBuilder setWifiMac(String wifiMac) {
        bizContent.wifiMac = wifiMac;
        return this;
    }

    /**
     * Gets wifi name.
     *
     * @return the wifi name
     */
    public String getWifiName() {
        return bizContent.wifiName;
    }

    /**
     * Sets wifi name.
     *
     * @param wifiName the wifi name
     * @return the wifi name
     */
    public AlipayHeartbeatSynRequestBuilder setWifiName(String wifiName) {
        bizContent.wifiName = wifiName;
        return this;
    }

    /**
     * Gets network status.
     *
     * @return the network status
     */
    public String getNetworkStatus() {
        return bizContent.networkStatus;
    }

    /**
     * Sets network status.
     *
     * @param networkStatus the network status
     * @return the network status
     */
    public AlipayHeartbeatSynRequestBuilder setNetworkStatus(String networkStatus) {
        bizContent.networkStatus = networkStatus;
        return this;
    }

    /**
     * Gets bbs position.
     *
     * @return the bbs position
     */
    public String getBbsPosition() {
        return bizContent.bbsPosition;
    }

    /**
     * Sets bbs position.
     *
     * @param bbsPosition the bbs position
     * @return the bbs position
     */
    public AlipayHeartbeatSynRequestBuilder setBbsPosition(String bbsPosition) {
        bizContent.bbsPosition = bbsPosition;
        return this;
    }

    /**
     * Gets manufacturer pid.
     *
     * @return the manufacturer pid
     */
    public String getManufacturerPid() {
        return bizContent.manufacturerPid;
    }

    /**
     * Sets manufacturer pid.
     *
     * @param manufacturerPid the manufacturer pid
     * @return the manufacturer pid
     */
    public AlipayHeartbeatSynRequestBuilder setManufacturerPid(String manufacturerPid) {
        bizContent.manufacturerPid = manufacturerPid;
        return this;
    }

    /**
     * Gets provider id.
     *
     * @return the provider id
     */
    public String getProviderId() {
        return bizContent.providerId;
    }

    /**
     * Sets provider id.
     *
     * @param providerId the provider id
     * @return the provider id
     */
    public AlipayHeartbeatSynRequestBuilder setProviderId(String providerId) {
        bizContent.providerId = providerId;
        return this;
    }

    /**
     * Gets equipment id.
     *
     * @return the equipment id
     */
    public String getEquipmentId() {
        return bizContent.equipmentId;
    }

    /**
     * Sets equipment id.
     *
     * @param equipmentId the equipment id
     * @return the equipment id
     */
    public AlipayHeartbeatSynRequestBuilder setEquipmentId(String equipmentId) {
        bizContent.equipmentId = equipmentId;
        return this;
    }

    /**
     * Gets equipment position.
     *
     * @return the equipment position
     */
    public String getEquipmentPosition() {
        return bizContent.equipmentPosition;
    }

    /**
     * Sets equipment position.
     *
     * @param equipmentPosition the equipment position
     * @return the equipment position
     */
    public AlipayHeartbeatSynRequestBuilder setEquipmentPosition(String equipmentPosition) {
        bizContent.equipmentPosition = equipmentPosition;
        return this;
    }

    /**
     * Gets equipment status.
     *
     * @return the equipment status
     */
    public EquipStatus getEquipmentStatus() {
        return bizContent.equipmentStatus;
    }

    /**
     * Sets equipment status.
     *
     * @param equipmentStatus the equipment status
     * @return the equipment status
     */
    public AlipayHeartbeatSynRequestBuilder setEquipmentStatus(EquipStatus equipmentStatus) {
        bizContent.equipmentStatus = equipmentStatus;
        return this;
    }

    /**
     * Gets exception info list.
     *
     * @return the exception info list
     */
    public List<ExceptionInfo> getExceptionInfoList() {
        return bizContent.exceptionInfoList;
    }

    /**
     * Sets exception info list.
     *
     * @param exceptionInfoList the exception info list
     * @return the exception info list
     */
    public AlipayHeartbeatSynRequestBuilder setExceptionInfoList(List<ExceptionInfo> exceptionInfoList) {
        bizContent.exceptionInfoList = exceptionInfoList;
        return this;
    }

    /**
     * Gets extend info.
     *
     * @return the extend info
     */
    public Map<String, Object> getExtendInfo() {
        return bizContent.extendInfo;
    }

    /**
     * Sets extend info.
     *
     * @param extendInfo the extend info
     * @return the extend info
     */
    public AlipayHeartbeatSynRequestBuilder setExtendInfo(Map<String, Object> extendInfo) {
        bizContent.extendInfo = extendInfo;
        return this;
    }

    /**
     * Gets ip.
     *
     * @return the ip
     */
    public String getIp() {
        return bizContent.ip;
    }

    /**
     * Sets ip.
     *
     * @param ip the ip
     * @return the ip
     */
    public AlipayHeartbeatSynRequestBuilder setIp(String ip) {
        bizContent.ip = ip;
        return this;
    }

    /**
     * Gets product.
     *
     * @return the product
     */
    public Product getProduct() {
        return bizContent.product;
    }

    /**
     * Sets product.
     *
     * @param product the product
     * @return the product
     */
    public AlipayHeartbeatSynRequestBuilder setProduct(Product product) {
        bizContent.product = product;
        return this;
    }

    /**
     * Gets store id.
     *
     * @return the store id
     */
    public String getStoreId() {
        return bizContent.storeId;
    }

    /**
     * Sets store id.
     *
     * @param storeId the store id
     * @return the store id
     */
    public AlipayHeartbeatSynRequestBuilder setStoreId(String storeId) {
        bizContent.storeId = storeId;
        return this;
    }

    /**
     * Gets time.
     *
     * @return the time
     */
    public String getTime() {
        return bizContent.time;
    }

    /**
     * Sets time.
     *
     * @param time the time
     * @return the time
     */
    public AlipayHeartbeatSynRequestBuilder setTime(String time) {
        bizContent.time = time;
        return this;
    }

    /**
     * Gets trade info list.
     *
     * @return the trade info list
     */
    public List<TradeInfo> getTradeInfoList() {
        return bizContent.tradeInfoList;
    }

    /**
     * Sets sys trade info list.
     *
     * @param sysTradeInfoList the sys trade info list
     * @return the sys trade info list
     */
    public AlipayHeartbeatSynRequestBuilder setSysTradeInfoList(List<SysTradeInfo> sysTradeInfoList) {
        if (Utils.isListNotEmpty(sysTradeInfoList)) {
            bizContent.tradeInfoList = new ArrayList<TradeInfo>(sysTradeInfoList);
        }
        return this;
    }

    /**
     * Sets pos trade info list.
     *
     * @param posTradeInfoList the pos trade info list
     * @return the pos trade info list
     */
    public AlipayHeartbeatSynRequestBuilder setPosTradeInfoList(List<PosTradeInfo> posTradeInfoList) {
        if (Utils.isListNotEmpty(posTradeInfoList)) {
            bizContent.tradeInfoList = new ArrayList<TradeInfo>(posTradeInfoList);
        }
        return this;
    }

    /**
     * Gets type.
     *
     * @return the type
     */
    public Type getType() {
        return bizContent.type;
    }

    /**
     * Sets type.
     *
     * @param type the type
     * @return the type
     */
    public AlipayHeartbeatSynRequestBuilder setType(Type type) {
        bizContent.type = type;
        return this;
    }

    /**
     * The type Biz content.
     */
    public static class BizContent {
        private Product product;

        private Type type;

        @SerializedName("equipment_id")
        private String equipmentId;

        @SerializedName("equipment_status")
        private EquipStatus equipmentStatus;

        private String time;

        @SerializedName("manufacturer_app_id")
        private String manufacturerPid;

        @SerializedName("sys_service_provider_id")
        private String providerId;

        @SerializedName("store_id")
        private String storeId;

        @SerializedName("equipment_position")
        private String equipmentPosition;

        @SerializedName("bbs_position")
        private String bbsPosition;

        @SerializedName("network_status")
        private String networkStatus;

        @SerializedName("network_type")
        private String networkType;

        private String battery;

        @SerializedName("wifi_mac")
        private String wifiMac;

        @SerializedName("wifi_name")
        private String wifiName;

        private String ip;

        private String mac;

        @SerializedName("trade_info")
        private List<TradeInfo> tradeInfoList;

        @SerializedName("exception_info")
        private List<ExceptionInfo> exceptionInfoList;

        @SerializedName("extend_info")
        private Map<String, Object> extendInfo;

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("BizContent{");
            sb.append("product=").append(product);
            sb.append(", type=").append(type);
            sb.append(", equipmentId='").append(equipmentId).append('\'');
            sb.append(", equipmentStatus=").append(equipmentStatus);
            sb.append(", time='").append(time).append('\'');
            sb.append(", manufacturerPid='").append(manufacturerPid).append('\'');
            sb.append(", providerId='").append(providerId).append('\'');
            sb.append(", storeId='").append(storeId).append('\'');
            sb.append(", equipmentPosition='").append(equipmentPosition).append('\'');
            sb.append(", bbsPosition='").append(bbsPosition).append('\'');
            sb.append(", networkStatus='").append(networkStatus).append('\'');
            sb.append(", networkType='").append(networkType).append('\'');
            sb.append(", battery='").append(battery).append('\'');
            sb.append(", wifiMac='").append(wifiMac).append('\'');
            sb.append(", wifiName='").append(wifiName).append('\'');
            sb.append(", ip='").append(ip).append('\'');
            sb.append(", mac='").append(mac).append('\'');
            sb.append(", tradeInfoList=").append(tradeInfoList);
            sb.append(", exceptionInfoList=").append(exceptionInfoList);
            sb.append(", extendInfo=").append(extendInfo);
            sb.append('}');
            return sb.toString();
        }
    }
}
