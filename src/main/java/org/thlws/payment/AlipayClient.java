package org.thlws.payment;

import org.thlws.payment.alipay.core.AlipayCore;
import org.thlws.payment.alipay.entity.request.*;
import org.thlws.payment.alipay.entity.response.*;

/**
 * 支付宝支付入口Class
 * @author hanley@thlws.com
 * @date 2018/11/16
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

        if (null == alipayCore){
            throw new Exception("alipayCore can not be nul.");
        }

        if (null == request){
            throw new Exception("AlipayMobileSiteRequest can not be nul.");
        }
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

        if (null == alipayCore){
            throw new Exception("alipayCore can not be nul.");
        }
        if (null == request){
            throw new Exception("AlipayWebSiteRequest can not be nul.");
        }

        return alipayCore.payInWebSite(request);
    }


    /***
     * 支付宝预支付订单(用于用户主动扫码支付)
     * {@link AlipayCore#preCreate}
     * @param request the request
     * @param alipayCore the alipay core
     * @return alipay qrcode response
     * @throws Exception the exception
     */
    public static  AlipayQrcodeResponse preCreate(AlipayQrcodeRequest request, AlipayCore alipayCore) throws Exception{

        if (null == alipayCore){
            throw new Exception("alipayCore can not be nul.");
        }
        if (null == request){
            throw new Exception("AlipayQrcodeRequest can not be nul.");
        }

        return alipayCore.preCreate(request);
    }


    /***
     * 支付宝当面付,用户被扫码(商家扫用户手机收款码)
     * {@link AlipayCore#pay}
     * @param request the request
     * @param alipayCore the alipay core
     * @return alipay trade response
     * @throws Exception the exception
     */
    public static  AlipayTradeResponse pay(AlipayTradeRequest request, AlipayCore alipayCore) throws Exception{

        if (null == alipayCore){
            throw new Exception("alipayCore can not be nul.");
        }
        if (null == request){
            throw new Exception("AlipayTradeRequest can not be nul.");
        }

        return alipayCore.pay(request);
    }


    /***
     * 支付订单查询
     * {@link AlipayCore#query}
     * @param outTradeNo the out trade no
     * @param alipayCore the alipay core
     * @return alipay query response
     * @throws Exception the exception
     */
    public static  AlipayQueryResponse query(String outTradeNo, AlipayCore alipayCore) throws Exception {

        if (null == alipayCore){
            throw new Exception("alipayCore can not be nul.");
        }
        if (null == outTradeNo || outTradeNo.length() == 0){
            throw new Exception("outTradeNo can not be nul.");
        }

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

        if (null == alipayCore){
            throw new Exception("alipayCore can not be nul.");
        }
        if (null == request){
            throw new Exception("AlipayRefundRequest can not be nul.");
        }

        return alipayCore.refund(request);
    }


    /***
     * 订单取消
     * {@link AlipayCore#cancel}
     * @param outTradeNo the out trade no
     * @param alipayCore the alipay core
     * @return alipay cancel response
     * @throws Exception the exception
     */
    public static  AlipayCancelResponse cancel(String outTradeNo, AlipayCore alipayCore) throws Exception {

        if (null == alipayCore){
            throw new Exception("alipayCore can not be nul.");
        }
        if (null == outTradeNo || outTradeNo.length() == 0){
            throw new Exception("outTradeNo can not be nul.");
        }

        return alipayCore.cancel(outTradeNo);
    }
}
