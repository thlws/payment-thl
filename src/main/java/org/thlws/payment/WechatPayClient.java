package org.thlws.payment;

import cn.hutool.core.lang.Assert;
import org.thlws.payment.wechat.api.WechatMpApi;
import org.thlws.payment.wechat.core.WechatPayCore;
import org.thlws.payment.wechat.entity.request.*;
import org.thlws.payment.wechat.entity.response.*;

import java.util.Objects;

/**
 * 微信支付入口
 *
 * @author hanley @thlws.com
 *  2018 /11/16
 */
public class WechatPayClient implements WechatMpApi {


    /***
     * 统一下单接口
     * {@link WechatPayCore#unifiedOrder}
     * @param request the request data
     * @param apiKey the api key
     * @return unified order response
     * @throws Exception the exception
     * @author HanleyTang
     */
    public static UnifiedOrderResponse unifiedOrder(UnifiedOrderRequest request, String apiKey) throws  Exception{

		Objects.requireNonNull(request, "request can not be null.");
		Assert.notEmpty(apiKey, "apiKey can not be null");

		return WechatPayCore.unifiedOrder(request,apiKey);
	}

    /**
     * 微信退款
     * {@link WechatPayCore#refund}
     *
     * @param request     the data
     * @param apiKey      the api key
     * @param p12FilePath the p 12 file path
     * @return the wechat refund response
     * @throws Exception the exception
     */
    public static WechatRefundResponse refund(WechatRefundRequest request, String apiKey, String p12FilePath)throws  Exception{

		Objects.requireNonNull(request, "request can not be null.");
		Assert.notEmpty(apiKey, "apiKey can not be null");
		Assert.notEmpty(p12FilePath, "p12FilePath can not be null");

		return WechatPayCore.refund(request,apiKey,p12FilePath);

	}

    /**
     * 支付撤销.
     * {@link WechatPayCore#reverse}
     *
     * @param request     the data
     * @param apiKey      the api key
     * @param p12FilePath the p 12 file path
     * @return the wechat reverse response
     * @throws Exception the exception
     */
    public static WechatReverseResponse reverse(WechatReverseRequest request, String apiKey, String p12FilePath)throws  Exception{


		Objects.requireNonNull(request, "request can not be null.");
		Assert.notEmpty(apiKey, "apiKey can not be null");
		Assert.notEmpty(p12FilePath, "p12FilePath can not be null");

		return WechatPayCore.reverse(request,apiKey,p12FilePath);
	}


    /**
     * 刷卡支付.
     * {@link WechatPayCore#microPay}
     *
     * @param request the request
     * @param apiKey  the api key
     * @return the wechat pay response
     * @throws Exception the exception
     */
    public static WechatPayResponse microPay(WechatPayRequest request, String apiKey) throws  Exception{

		Objects.requireNonNull(request, "request can not be null.");
		Assert.notEmpty(apiKey, "apiKey can not be null");

		return WechatPayCore.microPay(request,apiKey);
	}

    /**
     * 支付查询.
     * {@link WechatPayCore#orderQuery}
     *
     * @param request the request
     * @param apiKey  the api key
     * @return the order query response
     * @throws Exception the exception
     */
    public static OrderQueryResponse orderQuery(OrderQueryRequest request, String apiKey)throws  Exception{

		Objects.requireNonNull(request, "request can not be null.");
		Assert.notEmpty(apiKey, "apiKey can not be null");

		return	WechatPayCore.orderQuery(request,apiKey);
	}

    /**
     * 订单关闭.
     * {@link WechatPayCore#closeOrder}
     *
     * @param request the request
     * @param apiKey  the api key
     * @return the close order response
     * @throws Exception the exception
     */
    public static CloseOrderResponse closeOrder(CloseOrderRequest request, String apiKey)throws  Exception{

		Objects.requireNonNull(request, "request can not be null.");
		Assert.notEmpty(apiKey, "apiKey can not be null");

		return WechatPayCore.closeOrder(request,apiKey);
	}


    /**
     * 查询OpenId.
     * {@link WechatPayCore#openidQuery}
     *
     * @param request the data
     * @param apiKey  the api key
     * @return the openid query response
     * @throws Exception the exception
     */
    public static OpenidQueryResponse openidQuery(OpenidQueryRequest request, String apiKey)throws  Exception{

		Objects.requireNonNull(request, "request can not be null.");
		Assert.notEmpty(apiKey, "apiKey can not be null");

		return WechatPayCore.openidQuery(request,apiKey);
	}


    /***
     *
     * @param request the request
     * @param apiKey the apiKey
     * @param p12FilePath the p12FilePath
     * @return query result
     * @throws Exception the Exception
     */
    public static MicroMchResponse queryMicroMch(MicroMchRequest request, String apiKey, String p12FilePath) throws  Exception{


		Objects.requireNonNull(request, "request can not be null.");
		Assert.notEmpty(apiKey, "apiKey can not be null");
		Assert.notEmpty(p12FilePath, "p12FilePath can not be null");

		return WechatPayCore.queryMicroMch(request,apiKey,p12FilePath);
	}


    /****
     * 申请小微收款权限(个人微信申请收款)
     * @param request the request
     * @param apiKey the apiKey
     * @param p12FilePath the p12FilePath
     * @return result micro mch response
     * @throws Exception the Exception
     */
    public static MicroMchResponse postMicroMch(MicroMchRequest request, String apiKey, String p12FilePath) throws  Exception{

		Objects.requireNonNull(request, "request can not be null.");
		Assert.notEmpty(apiKey, "apiKey can not be null");
		Assert.notEmpty(p12FilePath, "p12FilePath can not be null");

		return WechatPayCore.postMicroMch(request,apiKey,p12FilePath);
	}
}
