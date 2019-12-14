package org.thlws.payment.wechat;

import cn.hutool.core.net.NetUtil;
import cn.hutool.core.util.IdUtil;
import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import org.junit.Test;
import org.thlws.payment.WechatPayClient;
import org.thlws.payment.wechat.entity.request.*;
import org.thlws.payment.wechat.entity.response.*;
import org.thlws.utils.ThlwsBeanUtil;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


/**
 * 微信非公众号测试<br>
 * <h3>特别注意</h3>
 * 项目中提供的微信测试账户，仅用于接口功能测试，请勿用作其他用途。
 * 微信p12文件涉及资金安全，不在项目中提供，测试时请输入 自己的相关参数及其p12文件.
 * Created by HanleyTang on 16/9/4.
 */
public class WechatPayClientTest {

    private static final Log log = LogFactory.get();

    /**服务商-I[下属含子商户].微信配置 sp = service provider */
    private static final String sp_01_wechat_appid= "wxc475c2bd2958388e";
    private static final String sp_01_wechat_appsecret="f02f5eecfed86f8a3cf753697fbf3246";
    private static final String sp_01_wechat_mchid="1386246702";
    private static final String sp_01_wechat_apikey="f02f5eecfed86f8a3cf753697fbf3246";
    private static final String sp_01_wechat_sub_mchid="1490071962";//1490071962   1396726602
    private static final String sp_01_wechat_openid="ou9z1v4CQEJLqbIikJr7UxPmIvYQ";

    /**服务商-II[下属含子商户].微信配置 sp = service provider */
    private static final String sp_02_wechat_appid= "wxa3f3406c0b04a601";
    private static final String sp_02_wechat_appsecret="04303a8acc9786ddac6458d401ca764f";
    private static final String sp_02_wechat_mchid="1511132631";
    private static final String sp_02_wechat_apikey="04303a8acc9786ddac6458d401ca764f";
    private static final String sp_02_wechat_sub_mchid="1517927831";//1490071962   1396726602

    /*普通商户*/
    private static final String test_wechat_appid= "wx5f22a16d8c94dba4";
    private static final String test_wechat_appsecret="d24a3e612fca66ae28137de28916f875";
    private static final String test_wechat_mchid="1336236101";
    private static final String test_wechat_apikey="d24a3e612fca66ae28137de28916f875";


    /***
     * 扫码支付 & 公众支付 时必须调用该接口
     * @throws Exception the exception
     */
    @Test
    public  void testUnifiedOrder() throws Exception{

        UnifiedOrderRequest request = new UnifiedOrderRequest();
        request.setAppId(test_wechat_appid);
        request.setMchId(test_wechat_mchid);

        /*普通模式无需设置,子商户需设置子商户号,小微模式固定填1000077001*/
        //request.setSub_mch_id("1396726602");

         /*open_id 与 sub_openid 择其一即可,具体传值方式以参数说明为准*/
        //request.setOpenid("用户在appid下用户标识");

        /*open_id 与 sub_openid 择其一即可,具体传值方式以参数说明为准*/
        //request.setSub_openid("用户在sub_appid下用户标识");
        String body = "动态二维码支付测试";
        request.setBody(body);
        request.setOutTradeNo(System.currentTimeMillis()+"");
        request.setTotalFee("1");
        request.setTradeType("NATIVE");
        request.setNotifyUrl("http://www.thlws.com/notify4Wechat.html");
        request.setSpbillCreateIp(NetUtil.getLocalhostStr());

        UnifiedOrderResponse response = WechatPayClient.unifiedOrder(request,test_wechat_apikey);
        boolean flag = response.isSuccess();
        String  message = response.getMessage();
        log.debug("isSuccess="+flag+", message="+message);
        String qrcode = response.getCodeUrl();
        assertNotNull(qrcode);
       
        //生成支付二维码，供用户扫码支付
        //ZxingUtil.qrCode(qrcode,"png","/zone/qrcode/"+request.getOut_trade_no()+".png");
        //TODO 调用查询接口，检测用户是否完成支付
    }


    /***
     * 微信付款，二维码刷卡支付
     */
    @Test
    public void testPay(){
        try {
            log.debug("微信下线[支付]测试开始-WechatPayClient.micropay");
            String apiKey = test_wechat_apikey;
            WechatPayRequest request = new WechatPayRequest();
            request.setAppId(test_wechat_appid);
            request.setMchId(test_wechat_mchid);

            /*普通模式无需设置,子商户需设置子商户号*/
            //request.setSub_mch_id("子商户号");

            request.setSpbillCreateIp(NetUtil.getLocalhostStr());
            request.setTotalFee("1");// 微信金额单位为分
            request.setAttach("00001025104487");
            request.setOutTradeNo(ThlwsBeanUtil.getRandomString(32));
            request.setAuthCode("134593261103056527");
            request.setDeviceInfo("device...");
            request.setBody("pay test");

            WechatPayResponse response = WechatPayClient.microPay(request,apiKey);
            System.out.println(ThlwsBeanUtil.beanToJson(response));
            boolean flag = response.isSuccess();
            String  message = response.getMessage();
            log.debug("isSuccess="+flag+", message="+message);
            assertEquals(flag,true);
        } catch (Exception e) {
            log.error(e);
        }
    }


    /***
     * 退款
     */
    @Test
    public void testRefund(){

        try {
            String p12FilePath = "p12文件绝对路径";

            log.debug("微信[退款]测试开始-WechatPayClient.refund");
            WechatRefundRequest request = new WechatRefundRequest();
            //request.setSub_mch_id("子商户号");//若为子商户退款需设置该参数

            String apiKey = test_wechat_apikey;
            request.setAppId(test_wechat_appid);
            request.setMchId(test_wechat_mchid);
            request.setOutTradeNo(IdUtil.fastSimpleUUID());
            request.setOutRefundNo(ThlwsBeanUtil.getRandomString(24));
            request.setTotalFee("1");
            request.setRefundFee("1");

            WechatRefundResponse response = WechatPayClient.refund(request,apiKey,p12FilePath);
            boolean flag = response.isSuccess();
            String  message = response.getMessage();
            log.debug("isSuccess="+flag+", message="+message);
            assertEquals(flag,true);
        } catch (Exception e) {
            log.error(e);
            //自行处理异常
        }
    }


    /***
     * 订单查询
     */
    @Test
    public void testOrderQuery(){

        try {
            log.debug("微信[订单查询]测试开始-WechatPayClient.orderQuery");
            OrderQueryRequest request = new OrderQueryRequest();
            request.setAppId(test_wechat_appid);
            request.setMchId(test_wechat_mchid);
            //request.setSub_mch_id("子账户号");//若为子商户退款需设置该参数
            request.setTransactionId("4005332001201610166835977303");
            request.setOutTradeNo(IdUtil.fastSimpleUUID());
            OrderQueryResponse response = WechatPayClient.orderQuery(request,test_wechat_apikey);

            boolean flag = response.isSuccess();
            String  message = response.getMessage();
            log.debug("isSuccess="+flag+", message="+message);
            assertEquals(flag,true);

        } catch (Exception e) {
            log.error(e);
        }

    }


    /***
     * 撤销订单
     */
    @Test
    public void testReverse(){

        try {
            String p12FilePath = "p12文件路径";

            log.debug("微信[撤销订单]测试开始-WechatPayClient.reverse");
            WechatReverseRequest request = new WechatReverseRequest();
            request.setAppId(test_wechat_appid);
            request.setMchId(test_wechat_mchid);
            //request.setSub_mch_id("子商户号");//若为子商户退款需设置该参数
            request.setTransactionId("1217752501201407033233368018");
            request.setOutTradeNo("20160902224757");
            WechatReverseResponse response = WechatPayClient.reverse(request,test_wechat_apikey,p12FilePath);
            boolean flag = response.isSuccess();
            String  message = response.getMessage();
            log.debug("isSuccess="+flag+", message="+message);
            assertEquals(flag,true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Test close order.
     */
    @Test
    public void testCloseOrder(){

        try {
            CloseOrderRequest request = new CloseOrderRequest();
            request.setAppId(test_wechat_appid);
            request.setMchId(test_wechat_mchid);
            //request.setSub_mch_id("子商户号");//若为子商户退款需设置该参数
            request.setOutTradeNo(IdUtil.fastSimpleUUID());
            CloseOrderResponse response = WechatPayClient.closeOrder(request,test_wechat_apikey);
            boolean flag = response.isSuccess();
            String  message = response.getMessage();
            log.debug("isSuccess="+flag+", message="+message);
            assertEquals(flag,true);
        } catch (Exception e) {
            log.error(e);
        }
    }


    /***
     * 提交小微申请-个人微信号实现收款功能
     * 服务商模式下，申请个人微信收款码,该模式下每日有收款限额，并且不支持退款。
     */
    @Test
    public void testPostMciroMch(){

        try {
            String p12FilePath = "p12文件路径";
            //just for  add(新增收款个人用户)
            MicroMchRequest wr = new MicroMchRequest();
            wr.setAppid(sp_02_wechat_appid);
            wr.setMchId(sp_02_wechat_mchid);
            wr.setMerchantName("THLWS");
            wr.setMerchantShortname("Hanley");
            wr.setRecipientName("新安江发");
            wr.setRecipientIdcardno("433453534534435");
            wr.setRecipientWechatid("helloworld");
            wr.setBusiness("THLWS");
            wr.setMerchantRemark("THLWS");
            wr.setMerchantGbaddress("200041");
            wr.setMerchantDetailaddress("上海市武威东路821弄16号101");
            MicroMchResponse response = WechatPayClient.postMicroMch(wr,sp_02_wechat_apikey,p12FilePath);
            boolean flag = response.isSuccess();
            String message = response.getMessage();
            assertNotNull(response);
        } catch (Exception e) {
            log.error(e);
        }
    }

    /***
     * 查询小微资料-查询个人微信收款资料
     * 服务商下查询个人收款账户
     */
    @Test
    public void testQueryMciro(){

        try {
            String p12FilePath = "p12文件绝对路径";
            //just for query
            MicroMchRequest wr2 = new MicroMchRequest();
            wr2.setAppid(sp_01_wechat_appid);
            wr2.setMchId(sp_01_wechat_mchid);
            wr2.setRecipientWechatid("hanleytang");
            MicroMchResponse result = WechatPayClient.queryMicroMch(wr2,sp_01_wechat_apikey,p12FilePath);
            assertNotNull(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * Test openid query.
     */
    @Test
    public void testOpenidQuery(){

        try {
            OpenidQueryRequest request = new OpenidQueryRequest();
            request.setAppId(sp_02_wechat_appid);
            request.setMchId(sp_02_wechat_mchid);
            request.setSubMchId(sp_02_wechat_sub_mchid);
            request.setAuthCode("134653648160290430");

            OpenidQueryResponse response = WechatPayClient.openidQuery(request, sp_02_wechat_apikey);
            boolean flag = response.isSuccess();
            String  message = response.getMessage();
            log.debug("isSuccess="+flag+", message="+message);
            System.out.println(response.toString());
            assertEquals(flag,true);
        } catch (Exception e) {
            log.error(e);
        }
    }





}
