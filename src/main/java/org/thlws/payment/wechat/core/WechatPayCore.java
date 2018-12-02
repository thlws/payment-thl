package org.thlws.payment.wechat.core;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import org.thlws.payment.wechat.api.WechatPayApi;
import org.thlws.payment.wechat.entity.request.*;
import org.thlws.payment.wechat.entity.response.*;
import org.thlws.utils.ConnUtil;
import org.thlws.utils.ThlwsBeanUtil;
import org.thlws.payment.wechat.utils.WechatUtil;

/**
 * 微信支付核心处理 <br>
 *
 * @author Hanley | hanley@thlws.com
 * @version 1.0
 * @see <a href="https://pay.weixin.qq.com/guide/index.shtml">https://pay.weixin.qq.com/guide/index.shtml</a>
 * @see <a href="https://pay.weixin.qq.com/wiki/doc/api/sl.html">https://pay.weixin.qq.com/wiki/doc/api/sl.html</a>
 * @see <a href="https://pay.weixin.qq.com/wiki/doc/api/index.html">https://pay.weixin.qq.com/wiki/doc/api/index.html</a>
 */
public class WechatPayCore implements WechatPayApi {

    private static final Log log = LogFactory.get();

    /**
     * 微信统一下单，同时支援扫码支付统一下单 和 微信公众号统一下单 <br>
     *
     * @param request 统一下单参数对象 {@link UnifiedOrderRequest}
     * @param apiKey  微信API秘钥
     * @return 统一下单结果对象 {@link UnifiedOrderResponse}
     * @throws Exception the exception
     * @see <a href="https://pay.weixin.qq.com/wiki/doc/api/native.php?chapter=9_1">https://pay.weixin.qq.com/wiki/doc/api/native.php?chapter=9_1</a>
     * @see <a href="https://pay.weixin.qq.com/wiki/doc/api/native_sl.php?chapter=9_1">https://pay.weixin.qq.com/wiki/doc/api/native_sl.php?chapter=9_1</a>
     */
    public static UnifiedOrderResponse unifiedOrder(UnifiedOrderRequest request, String apiKey) throws  Exception{

        UnifiedOrderResponse response;

        try {

            String xml = WechatUtil.buildXmlRequest(request,UnifiedOrderRequest.class, apiKey);
            log.debug("微信统一下单请求数据[unifiedorder]->xmlRequest:\n {}",xml);

            String xmlResponse = ConnUtil.connRemoteWithXml(xml,pay_unifiedorder);
            log.debug("微信统一下单返回数据[unifiedorder]->xmlResponse:\n {}",ThlwsBeanUtil.formatXml(xmlResponse));
            response = ThlwsBeanUtil.xmlToBean(xmlResponse,UnifiedOrderResponse.class);

        } catch (Exception e) {
            log.error(e);
            throw e;
        }

        return response;

    }


    /**
     * 微信退款,必须指定p12文件路径,否则无法完成退款动作,目前已知退款和撤销接口需要提供p12文件 <br>
     * 使用该接口注意事项<br>
     * <ol>
     * <li>交易时间超过一年的订单无法提交退款;</li>
     * <li>微信支付退款支持单笔交易分多次退款，多次退款需要提交原支付订单的商户订单号和设置不同的退款单号。申请退款总金额不能超过订单金额。 一笔退款失败后重新提交，请不要更换退款单号，请使用原商户退款单号;</li>
     * <li>请求频率限制：150qps，即每秒钟正常的申请退款请求次数不超过150次错误或无效请求频率限制：6qps，即每秒钟异常或错误的退款申请请求不超过6次;</li>
     * <li>每个支付订单的部分退款次数不能超过50次;</li>
     * </ol>
     *
     * @param request     退款参数对象 {@link WechatRefundRequest}
     * @param apiKey      微信API秘钥
     * @param p12FilePath 微信p12文件路径
     * @return 微信退款结果对象 {@link WechatRefundResponse}
     * @throws Exception the exception
     * @see <a href="https://pay.weixin.qq.com/wiki/doc/api/native.php?chapter=9_4">https://pay.weixin.qq.com/wiki/doc/api/native.php?chapter=9_4</a>
     * @see <a href="https://pay.weixin.qq.com/wiki/doc/api/native_sl.php?chapter=9_4">https://pay.weixin.qq.com/wiki/doc/api/native_sl.php?chapter=9_4</a>
     */
    public static WechatRefundResponse refund(WechatRefundRequest request, String apiKey, String p12FilePath) throws  Exception{

        WechatRefundResponse response;

        try {
            String xml = WechatUtil.buildXmlRequest(request, WechatRefundRequest.class,apiKey);
            log.debug("微信退款请求数据[refund]->xmlRequest:\n {}",xml);

            String xmlResponse = ConnUtil.encryptPost(xml, pay_refund, request.getMchId(), p12FilePath);
            log.debug("微信退款响应数据[refund]->xmlResponse:\n {}",ThlwsBeanUtil.formatXml(xmlResponse));
            response = ThlwsBeanUtil.xmlToBean(xmlResponse,WechatRefundResponse.class);

        } catch (Exception e) {
            log.error(e);
            throw  e;
        }
        return response;

    }


    /**
     * 微信订单查询,除核心参数外(appid,mch_id等为核心参数)业务参数 transaction_id ,out_trade_no 二选一即可<br>
     * <p>
     * 需要调用查询接口的情况<br>
     *
     * <ol>
     * <li>当商户后台、网络、服务器等出现异常，商户系统最终未接收到支付通知；</li>
     * <li>调用支付接口后，返回系统错误或未知交易状态情况；</li>
     * <li>调用刷卡支付API，返回USERPAYING的状态；</li>
     * <li>调用关单或撤销接口API之前，需确认支付状态；</li>
     * </ol>
     *
     * @param request 查询参数对象 {@link OrderQueryRequest}
     * @param apiKey  API秘钥
     * @return 订单查询结果对象 {@link OrderQueryResponse}
     * @throws Exception the exception
     * @see <a href="https://pay.weixin.qq.com/wiki/doc/api/native.php?chapter=9_2">https://pay.weixin.qq.com/wiki/doc/api/native.php?chapter=9_2</a>
     * @see <a href="https://pay.weixin.qq.com/wiki/doc/api/native_sl.php?chapter=9_2">https://pay.weixin.qq.com/wiki/doc/api/native_sl.php?chapter=9_2</a>
     */
    public static OrderQueryResponse orderQuery(OrderQueryRequest request, String apiKey) throws  Exception{

        OrderQueryResponse response;

        try {
            String xml = WechatUtil.buildXmlRequest(request, OrderQueryRequest.class,apiKey);
            log.debug("微信订单查询请求数据[orderQuery]->xmlRequest:\n {}",xml);

            String xmlResponse = ConnUtil.connRemoteWithXml(xml,pay_orderquery);
            log.debug("微信订单查询响应数据[orderQuery]->response xmlResponse:\n {}",ThlwsBeanUtil.formatXml(xmlResponse));
            response = ThlwsBeanUtil.xmlToBean(xmlResponse,OrderQueryResponse.class);

        } catch (Exception e) { 
            log.error(e);
            throw e;
        }

        return  response;
    }


    /**
     * 微信撤销订单<br>
     * 使用情境<br>
     * <p>支付交易返回失败或支付系统超时，调用该接口撤销交易。如果此订单用户支付失败，微信支付系统会将此订单关闭；如果用户支付成功，微信支付系统会将此订单资金退还给用户。</p>
     * 注意 <br>
     * <p>7天以内的交易单可调用撤销，其他正常支付的单如需实现相同功能请调用申请退款API。提交支付交易后调用【查询订单API】，  没有明确的支付结果再调用【撤销订单API】</p>
     *
     * @param request     撤销参数对象 {@link WechatReverseRequest}
     * @param apiKey      API秘钥
     * @param p12FilePath p12文件路径
     * @return 撤销结果对象 {@link WechatReverseResponse}
     * @throws Exception the exception
     * @see <a href="https://pay.weixin.qq.com/wiki/doc/api/micropay.php?chapter=9_11&index=3">普通商户撤销接口</a>
     * @see <a href="https://pay.weixin.qq.com/wiki/doc/api/micropay_sl.php?chapter=9_11&index=3">服务商撤销接口</a>
     */
    public static WechatReverseResponse reverse(WechatReverseRequest request, String apiKey, String p12FilePath) throws  Exception{

        WechatReverseResponse response;

        try {
            String xml = WechatUtil.buildXmlRequest(request, WechatReverseRequest.class,apiKey);
            log.debug("微信撤销订单请求数据[reverse]->xmlRequest:\n {}",xml);

            String xmlResponse = ConnUtil.encryptPost(xml, pay_reverse, request.getMchId(), p12FilePath);
            log.debug("微信撤销订单响应数据[reverse]->xmlResponse:\n {}",ThlwsBeanUtil.formatXml(xmlResponse));
            response = ThlwsBeanUtil.xmlToBean(xmlResponse,WechatReverseResponse.class);

        } catch (Exception e) {
            log.error(e);
            throw e;
        }
        return response;

    }


    /**
     * 微信订单关闭,商户订单支付失败需要生成新单号重新发起支付，要对原订单号调用关单，避免重复支付；系统下单后，用户支付超时，系统退出不再受理，避免用户继续，请调用关单接口.<br>
     * <span style="color:red;">订单生成后不能马上调用关单接口，最短调用时间间隔为5分钟。</span>
     *
     * @param request 参数对象 {@link CloseOrderRequest}
     * @param apiKey  微信API秘钥
     * @return 订单关闭结果对象 {@link CloseOrderResponse}
     * @throws Exception the exception
     * @see <a href="https://pay.weixin.qq.com/wiki/doc/api/native.php?chapter=9_3">普通商户关闭订单接口</a> <br>
     * @see <a href="https://pay.weixin.qq.com/wiki/doc/api/native_sl.php?chapter=9_3">服务商关闭订单接口</a>
     */
    public static CloseOrderResponse closeOrder(CloseOrderRequest request, String apiKey) throws  Exception{

        CloseOrderResponse response;

        try {
            String xml = WechatUtil.buildXmlRequest(request, CloseOrderRequest.class,apiKey);
            log.debug("微信关闭订单请求数据[closeOrder]->xmlRequest:\n {}",xml);

            String xmlResponse = ConnUtil.connRemoteWithXml(xml,close_order);
            log.debug("微信关闭订单响应数据[closeOrder]->xmlResponse:\n {}",ThlwsBeanUtil.formatXml(xmlResponse));
            response = ThlwsBeanUtil.xmlToBean(xmlResponse,CloseOrderResponse.class);

        } catch (Exception e) {
            log.error(e);
            throw e;
        }
        return response;
    }


    /***
     * 微信刷卡支付,商户使用扫描枪扫用户微信支付码,消费者为被扫码对象,此方式与扫码支付扫码方式相反.<br>
     * @param request 支付参数对象 {@link WechatPayRequest}
     * @param apiKey 微信API秘钥
     * @return 支付结果对象 {@link WechatPayResponse}
     * @throws Exception the exception
     * @see  <a href="https://pay.weixin.qq.com/wiki/doc/api/micropay.php?chapter=9_10&index=1">普通商户刷卡支付接口</a>
     * @see  <a href="https://pay.weixin.qq.com/wiki/doc/api/micropay_sl.php?chapter=9_10&index=1">服务商刷卡支付接口</a> 提醒事项<br> <ol>     <li>提交支付请求后微信会同步返回支付结果。当返回结果为“系统错误”时，商户系统等待5秒后调用【查询订单API】，查询支付实际交易结果；当返回结果为“USERPAYING”时，商户系统可设置间隔时间(建议10秒)重新查询支付结果，直到支付成功或超时(建议30秒)；</li>     <li>在调用查询接口返回后，如果交易状况不明晰，请调用【撤销订单API】，此时如果交易失败则关闭订单，该单不能再支付成功；如果交易成功，则将扣款退回到用户账户。当撤销无返回或错误时，请再次调用。注意：请勿扣款后立即调用【撤销订单API】,建议至少15秒后再调用。撤销订单API需要双向证书。</li> </ol>
     */
    public static WechatPayResponse microPay(WechatPayRequest request, String apiKey) throws  Exception{

        WechatPayResponse response;

        try {
            String xml = WechatUtil.buildXmlRequest(request, WechatPayRequest.class,apiKey);
            log.debug("微信支付请求数据[micropay]->xmlRequest:\n {}",xml);

            String xmlResponse = ConnUtil.connRemoteWithXml(xml,pay_micropay);
            log.debug("微信支付响应数据[micropay]->response xmlResponse:\n {}", ThlwsBeanUtil.formatXml(xmlResponse));
            response = ThlwsBeanUtil.xmlToBean(xmlResponse,WechatPayResponse.class);
        } catch (Exception e) {
            log.error(e);
            throw e;
        }

        return response;
    }

    /**
     * 根据用户支付码查询用户在该账户的openid.
     *
     * @param request data 支付参数对象 {@link OpenidQueryRequest}
     * @param apiKey  微信API秘钥
     * @return 查询结果对象 {@link OpenidQueryResponse}
     * @throws Exception the exception
     * @see <a href="https://pay.weixin.qq.com/wiki/doc/api/micropay.php?chapter=9_13&index=10">授权码查询openid</a>
     */
    public static OpenidQueryResponse openidQuery(OpenidQueryRequest request, String apiKey) throws  Exception{

        OpenidQueryResponse response;

        try {
            String xml = WechatUtil.buildXmlRequest(request, OpenidQueryRequest.class,apiKey);
            log.debug("查询用户openid[openidQuery]->xmlRequest:\n {}",xml);

            String xmlResponse = ConnUtil.connRemoteWithXml(xml,pay_openidquery);
            log.debug("查询用户openid[openidQuery]->response xmlResponse:\n {}", ThlwsBeanUtil.formatXml(xmlResponse));
            response = ThlwsBeanUtil.xmlToBean(xmlResponse,OpenidQueryResponse.class);
        } catch (Exception e) {
            log.error(e);
            throw e;
        }

        return response;
    }

    /**
     * 申请小微收款识别码
     *
     * @param request     the request
     * @param apiKey      the api key
     * @param p12FilePath the p 12 file path
     * @return the micro mch response
     * @throws Exception the exception
     */
    public static MicroMchResponse postMicroMch(MicroMchRequest request, String apiKey, String p12FilePath) throws  Exception{
        MicroMchResponse response;
        try {

            String xml = WechatUtil.buildXmlRequest(request, MicroMchRequest.class,apiKey);
            log.debug("申请小微收款识别码 [submchmanage] xml request:\n {}",xml);

            //p12FilePath = "/zone/1.p12";
            String xmlResponse = ConnUtil.encryptPost(xml, micro_mch_add, request.getMchId(), p12FilePath);
            log.debug("申请小微收款识别码 [submchmanage] xml response:\n {}", ThlwsBeanUtil.formatXml(xmlResponse));
            response = ThlwsBeanUtil.xmlToBean(xmlResponse,MicroMchResponse.class);

        } catch (Exception e) {
            log.error(e);
            throw e;
        }

        return response;

    }


    /***
     * 查询小微收款人信息
     * @param request the request
     * @param apiKey the api key
     * @param p12FilePath the p 12 file path
     * @return string micro mch response
     * @throws Exception the exception
     * @author HanleyTang
     */
    public static MicroMchResponse queryMicroMch(MicroMchRequest request, String apiKey, String p12FilePath) throws  Exception{

        MicroMchResponse response;
        try {

            String xml = WechatUtil.buildXmlRequest(request, MicroMchRequest.class,apiKey);
            log.debug("查询小微收款人资料[submchmanage?action=query] xml request:\n {}",xml);

            String xmlResponse =ConnUtil.encryptPost(xml, micro_mch_qry, request.getMchId(), p12FilePath);
            log.debug("查询小微收款人资料[submchmanage?action=query] xml response:\n {}",xmlResponse);
            response = ThlwsBeanUtil.xmlToBean(xmlResponse,MicroMchResponse.class);
        } catch (Exception e) {
            log.error(e);
            throw e;
        }
        return response;

    }
}
