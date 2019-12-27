/*
 * Copyright (c) 2016. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.thlws.payment.wechat.utils;

import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.XmlUtil;
import org.thlws.payment.wechat.entity.dto.MpPayment;
import org.thlws.payment.wechat.entity.dto.MpTicket;
import org.thlws.payment.wechat.entity.response.NotifyResponse;
import org.thlws.payment.wechat.entity.response.UnifiedOrderResponse;
import org.thlws.utils.ThlwsBeanUtil;

import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.JAXBException;
import java.io.BufferedReader;
import java.security.MessageDigest;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by HanleyTang on 16/9/4.
 */
public class WechatUtil {

    /**
     * 普通签名,用户微信支付相关接口
     *
     * @param params the params
     * @param key    the key
     * @return string string
     * @author HanleyTang
     */
    public static String sign(Map<String, Object> params, String key){

        String prestr = ThlwsBeanUtil.createLinkString(params);
        prestr +="&key="+key;
        return ThlwsBeanUtil.getMD5(prestr).toUpperCase();
    }

    /**
     * 普通签名,用户微信支付相关接口
     *
     * @param mPayment the m payment
     * @param key      the key
     * @return the string
     */
    public static String sign(MpPayment mPayment, String key){

        Map<String, Object> params = new HashMap<>();
        params.put("appId", mPayment.getAppId());
        params.put("timeStamp",mPayment.getTimeStamp());
        params.put("nonceStr", mPayment.getNonceStr());
        params.put("package", mPayment.getPackageStr());
        params.put("signType", "MD5");
        return sign(params, key);
    }


    /**
     * JS Ticket 签名,用于微信页面分享，扫一扫等功能.
     *
     * @param appId  the app id
     * @param ticket the ticket
     * @param url    网页端URL,用户实际看到的页面地址
     * @return the mp ticket
     * @throws Exception the exception
     */
    public static MpTicket jsTicketSign(String appId,String ticket,String url) throws Exception{

        String nonce_str = IdUtil.fastSimpleUUID();
        String timestamp = Long.toString(System.currentTimeMillis() / 1000);

        String string1 = "jsapi_ticket=" + ticket +
                "&noncestr=" + nonce_str +
                "&timestamp=" + timestamp +
                "&url=" + url;
        MessageDigest crypt = MessageDigest.getInstance("SHA-1");
        crypt.reset();
        crypt.update(string1.getBytes("UTF-8"));
        String signature = byteToHex(crypt.digest());
        MpTicket mpTicket = new MpTicket();
        mpTicket.setAppId(appId);
        mpTicket.setNonceStr(nonce_str);
        mpTicket.setSignature(signature);
        mpTicket.setTimestamp(timestamp);

        return mpTicket;
    }


    private static String byteToHex(final byte[] hash) {
        try( Formatter formatter = new Formatter()){
            for (byte b : hash){
                formatter.format("%02x", b);
            }
           return formatter.toString();
        }
    }


    /**
     * 微信支付异步通知结果解析为Object
     *
     * @param xmlResult the xml result
     * @return notify response
     * @throws JAXBException the jaxb exception
     */
    public static NotifyResponse parseNotifyMsgToBean(String xmlResult) throws JAXBException {
        NotifyResponse response = ThlwsBeanUtil.xmlToBean(xmlResult, NotifyResponse.class);
        return response;
    }

    /***
     * 微信支付异步通知结果解析为Object
     * @param request HttpServletRequest
     * @return notify response
     * @throws Exception exception
     */
    public static NotifyResponse parseNotifyMsgToBean(HttpServletRequest request) throws Exception{
       return parseNotifyMsgToBean(parseNotifyMsgToXml(request));
    }


    /**
     * 微信支付异步通知结果解析为XML
     *
     * @param request the request
     * @return the string
     * @throws Exception the exception
     */
    public static String parseNotifyMsgToXml(HttpServletRequest request) throws Exception{

        StringBuffer notifyResult = new StringBuffer();
        try(BufferedReader reader = request.getReader()){
            String inputLine = "";
            while ((inputLine = reader.readLine()) != null){
                notifyResult.append(inputLine);
            }
        }
        return notifyResult.toString();

    }



    /**
     * Build request object.
     *
     * @param o      the o
     * @param clz    the clz
     * @param apiKey the api key
     * @return the object
     */
    public static Object buildRequest(Object o, Class clz,String apiKey){
        Map<String, Object> mapData = ThlwsBeanUtil.objectToMap(o);
        String sign = WechatUtil.sign(mapData,apiKey);
        mapData.put("sign", sign);
        return ThlwsBeanUtil.mapToObject(mapData,clz);
    }

    /**
     * Build xml request string.
     *
     * @param o      the o
     * @param clz    the clz
     * @param apiKey the api key
     * @return the string
     * @throws JAXBException the jaxb exception
     */
    public static String buildXmlRequest(Object o, Class clz,String apiKey) throws JAXBException {

        String originXml = ThlwsBeanUtil.beanToXml(clz,o);
        Map<String, Object> map = XmlUtil.xmlToMap(originXml);
        String sign = WechatUtil.sign(map,apiKey);
        map.put("sign", sign);
        String  xml = XmlUtil.mapToXmlStr(map, "xml");
        return xml;
    }


    /***
     * 微信 H5 公众号支付，数据处理（存入request,返回jsp页面时用于发起H5支付）
     * @param request the request
     * @param response the response
     * @param outTradeNo the out trade no
     * @param apiKey the api key
     */
    /***
     * 微信 H5 公众号支付，数据处理（存入request,返回jsp页面时用于发起H5支付）
     * @param request the request
     * @param response the response
     * @param outTradeNo the out trade no
     * @param apiKey the api key
     */
    public static void frontData(HttpServletRequest request
            , UnifiedOrderResponse response
            , String outTradeNo
            , String apiKey){

        long time = System.currentTimeMillis() / 1000;
        String timeStamp = String.valueOf(time);
        String appId = response.getAppId();
        String nonceStr = response.getNonceStr();
        String _package = "prepay_id=" + response.getPrepayId();
        Map<String, Object> sParam = new HashMap<>();
        sParam.put("appId", appId);
        sParam.put("timeStamp",timeStamp);
        sParam.put("nonceStr", nonceStr);
        sParam.put("package", _package);
        sParam.put("signType", "MD5");
        String paySign = WechatUtil.sign(sParam, apiKey);
        request.setAttribute("appId", appId);
        request.setAttribute("timeStamp", timeStamp);
        request.setAttribute("nonceStr", nonceStr);
        request.setAttribute("packageStr", _package);
        request.setAttribute("signType", "MD5");
        request.setAttribute("paySign", paySign);
        request.setAttribute("outTradeNo", outTradeNo);
    }


    /**
     * 小程序支付，公众号支付，前端需要的支付数据
     * 适用于前后端分离架构
     * @param response   the response
     * @param apiKey     the api key
     * @return the map
     */
    public static Map<String, Object>  frontData(UnifiedOrderResponse response , String apiKey){

        long time = System.currentTimeMillis() / 1000;
        String timeStamp = String.valueOf(time);
        String appId = response.getAppId();
        String nonceStr = response.getNonceStr();
        String _package = "prepay_id=" + response.getPrepayId();
        Map<String, Object> sParam = new HashMap<>();
        sParam.put("appId", appId);
        sParam.put("timeStamp",timeStamp);
        sParam.put("nonceStr", nonceStr);
        sParam.put("package", _package);
        sParam.put("signType", "MD5");
        String paySign = WechatUtil.sign(sParam, apiKey);

        sParam.clear();
        sParam.put("appId", appId);
        sParam.put("timeStamp", timeStamp);
        sParam.put("nonceStr", nonceStr);
        sParam.put("packageStr", _package);
        sParam.put("signType", "MD5");
        sParam.put("paySign", paySign);
        return sParam;
    }


}
