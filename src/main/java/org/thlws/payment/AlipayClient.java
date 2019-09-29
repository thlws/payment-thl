package org.thlws.payment;

import cn.hutool.core.lang.Assert;
import org.thlws.payment.alipay.core.AlipayCore;
import org.thlws.payment.alipay.entity.request.*;
import org.thlws.payment.alipay.entity.response.*;

import java.util.Objects;

/**
 * 支付宝支付入口Class
 *
 * @author hanley @thlws.com
 *  2018 /11/16
 */
public class AlipayClient {

    /**
     * 手机网页支付
     * {@link AlipayCore#payInMobileSite}
     *
     * @param request    request
     * @param alipayCore alipayCore
     * @return html string
     * @throws Exception Exception
     */
    public static String payInMobileSite(AlipayMobileSiteRequest request, AlipayCore alipayCore) throws Exception{

        Objects.requireNonNull(alipayCore, "alipayCore can not be nul.");
        Objects.requireNonNull(request, "AlipayMobileSiteRequest can not be null.");

        return alipayCore.payInMobileSite(request);

    }

    /***
     * 普通网站支付
     * {@link AlipayCore#payInWebSite}
     * @param request request
     * @param alipayCore alipayCore
     * @return html string
     * @throws Exception Exception
     */
    public static  String payInWebSite(AlipayWebSiteRequest request, AlipayCore alipayCore) throws Exception{

        Objects.requireNonNull(alipayCore, "alipayCore can not be nul.");
        Objects.requireNonNull(request, "AlipayWebSiteRequest can not be null.");

        return alipayCore.payInWebSite(request);
    }


    /***
     * 支付宝预支付订单(用于用户主动扫码支付)
     * {@link AlipayCore#preCreate}
     * @param request the request
     * @param alipayCore the alipay core
     * @return alipay qrcode response
     */
    public static  AlipayQrcodeResponse preCreate(AlipayQrcodeRequest request, AlipayCore alipayCore) {

        Objects.requireNonNull(alipayCore, "alipayCore can not be nul.");
        Objects.requireNonNull(request, "AlipayQrcodeRequest can not be null.");

        return alipayCore.preCreate(request);
    }


    /***
     * 支付宝当面付,用户被扫码(商家扫用户手机收款码)
     * {@link AlipayCore#pay}
     * @param request the request
     * @param alipayCore the alipay core
     * @return alipay trade response
     */
    public static  AlipayTradeResponse pay(AlipayTradeRequest request, AlipayCore alipayCore) {

        Objects.requireNonNull(alipayCore, "alipayCore can not be nul.");
        Objects.requireNonNull(request, "AlipayTradeRequest can not be null.");

        return alipayCore.pay(request);
    }


    /***
     * 支付订单查询
     * {@link AlipayCore#query}
     * @param outTradeNo the out trade no
     * @param alipayCore the alipay core
     * @return alipay query response
     */
    public static  AlipayQueryResponse query(String outTradeNo, AlipayCore alipayCore) {

        Objects.requireNonNull(alipayCore, "alipayCore can not be null.");
        Assert.notEmpty(outTradeNo, "outTradeNo can not be null");

        return alipayCore.query(outTradeNo);
    }


    /***
     *
     * 支付订单退款
     * {@link AlipayCore#refund}
     * @param request the request
     * @param alipayCore the alipay core
     * @return alipay refund response
     * @throws Exception the exception
     */
    public static  AlipayRefundResponse refund(AlipayRefundRequest request, AlipayCore alipayCore) throws Exception{

        Objects.requireNonNull(alipayCore, "alipayCore can not be null.");
        Objects.requireNonNull(request, "AlipayRefundRequest can not be null.");

        return alipayCore.refund(request);
    }


    /***
     * 订单取消
     * {@link AlipayCore#cancel}
     * @param outTradeNo the out trade no
     * @param alipayCore the alipay core
     * @return alipay cancel response
     */
    public static  AlipayCancelResponse cancel(String outTradeNo, AlipayCore alipayCore) {

        Objects.requireNonNull(alipayCore, "alipayCore can not be null.");
        Assert.notEmpty(outTradeNo, "outTradeNo can not be null.");

        return alipayCore.cancel(outTradeNo);
    }
}
