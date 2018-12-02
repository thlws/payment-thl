/*
 * Copyright (c) 2016. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.thlws.payment.wechat.utils;

import cn.hutool.core.util.XmlUtil;
import org.thlws.utils.ThlwsBeanUtil;
import org.thlws.payment.wechat.entity.response.NotifyResponse;
import org.thlws.payment.wechat.entity.response.UnifiedOrderResponse;

import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.JAXBException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by HanleyTang on 16/9/4.
 */
public class WechatUtil {

    /**
     * sign wechat request data
     *
     * @param params the params
     * @param key    the key
     * @return string string
     * @author HanleyTang
     */
    public static String sign(Map<String, Object> params, String key){

        String prestr = ThlwsBeanUtil.createLinkString(params);
        prestr +="&key="+key;
        String mysign = ThlwsBeanUtil.getMD5(prestr).toUpperCase();
        return mysign;
    }


    /**
     * 微信支付异步通知结果解析为Object
     *
     * @param xmlResult the xml result
     * @return notify response
     * @throws JAXBException the jaxb exception
     */
    public static NotifyResponse parseNotifyMsg(String xmlResult) throws JAXBException {
        NotifyResponse response = ThlwsBeanUtil.xmlToBean(xmlResult, NotifyResponse.class);
        return response;
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
        Map<String, Object> mapData = ThlwsBeanUtil.ObjectToMap(o);
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
    public static void h5_pay(HttpServletRequest request
            , UnifiedOrderResponse response
            , String outTradeNo
            , String apiKey){

        long time = System.currentTimeMillis() / 1000;
        String timeStamp = String.valueOf(time);
        String appId = response.getAppId();
        String nonceStr = response.getNonceStr();
        String _package = "prepay_id=" + response.getPrepayId();
        Map<String, Object> sParam = new HashMap<String, Object>();
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
}
