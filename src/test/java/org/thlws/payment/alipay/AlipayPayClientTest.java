package org.thlws.payment.alipay;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import com.alipay.api.AlipayConstants;
import org.junit.Before;
import org.junit.Test;
import org.thlws.payment.AlipayClient;
import org.thlws.payment.alipay.core.AlipayCore;
import org.thlws.payment.alipay.entity.request.*;
import org.thlws.payment.alipay.entity.response.*;
import org.thlws.utils.JsonUtil;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * 支付宝接口测试
 * <h3>特别注意</h3>
 * 项目中提供的微信测试账户，仅用于接口功能测试，请勿用作其他用途。
 * @author hanley@thlws.com
 * @date 2018/11/16
 */
public class AlipayPayClientTest {

    private static final Log log = LogFactory.get();

    //RSA加密方式,秘钥长度为1024,支付宝公钥为可选参数
    private static final String appid = "2016042501333089";
    private static final String private_key = "MIICdQIBADANBgkqhkiG9w0BAQEFAASCAl8wggJbAgEAAoGBAOGAI1Nf+T3F/BGb CxLQg04h1tqxtIz31T0GuiPHq25xvRacoyI4HMeJrFt72iSxnNiFjGqCLySTrKs2 zrGjbxA2dGSKkNVDWFjAx4yaDjG/nOK0sXyKwjbaf4gGjW4fq9BzP6KKG+LoZj/e wa5syDvK1UTstAc3fqCKXqOQN24vAgMBAAECgYBr5aIBfMSHWDo6OlNcF0Ucl3h0 f98CLHttjdB22k0etXFiZmRwNSUgHLHJvEMul4WS3KPJOq1P9REDg1/3A1paI345 r6qZdn8dovEX9DG6cVnjLxx7zoobCz/eGt/nWhgIQqPXSdTYhcnlncJPogSQhnUF 0lOUUIsC/RddZYXyMQJBAPlSqy5QXB/LudH8orRSjzRWHlhVswknzIMOJX9o0Tje nlwRM3vqnstvCZKaHc0lbmitHKqDfXNCA4u49zlKB5UCQQDniiVFKY5v+VQm6724 hkVvd8ctYwdx2Qj4HXdnoXfOKxOJQuSRUW2xvTSBFtFcFlC/KZNS4Zr9u01+s5Bh J12zAkAgTWimUH0PFYsWvL+r00KAimPWGAxhNEnX9P5AuqjY0Gb+ELB17pjyTImV 9+fCi4X5g+xB31VimHvzH1zQjFndAkAz0zMGaQfNvmP8ljWP8NXn3kqBuTG4ZNji GE5arsSPLAsiZQueDzjbWLtAzaes0f3e2+Jy4bZ8Zokw++YsKNCLAkBKB1vZplV2 NG9ryG2C7KGG2AgcfkUthcFPT9tXoIYPxPXwYbChjMddMDK3QK99e9CoSKLq+RY/ B0fCEdSbADgS";
    private static final String alipay_public_key = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDDI6d306Q8fIfCOaTXyiUeJHkrIvYISRcc73s3vF1ZT7XN8RNPwJxo8pWaJMmvyTn9N4HQ632qJBVHf8sxHi/fEsraprwCtzvzQETrNRwVxLO5jVmRGi60j8Ue1efIlzPXV9je9mkjzOmdssymZkh2QhUrCmZYI/FCEa3/cNMW0QIDAQAB";


    //RSA2 秘钥长度为2048
    private final static String appid_2 = "2018082461122382";
    private final static String private_key_2 = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCuVBRIRrH3lUsLjp93koaH1Ngg1WvGFXFOD8ac0aqQzuBWU+jZViZ0v8DFfBVjW6pJQ/e84i0Lh2JpFuWVLVh9YgjIv0mNQ83iC1n3Ab28gg8p1783/5QSEmNjg6+vCySJAxctqjbE0tqWhsAtM7O+38Oro91B3Gicn3GzFJQ9VydrwMda+hd5U5FYP2sNSf6cNHS6A5PasKhMaQOCGiQhW40kD7u5TklyzAiXT7t18aq8J6VlGlPe31tX8iFLiSCV87v7COH7krXHKhpNoM/SWf8Z+rlbUe2pbkuX38JsPt3l80fooTf7sYhj0I4LnjIg/Aoh8QE1sMuASSbGCS+VAgMBAAECggEABQDiyCRHTVzal41TZGIvPEzOmzqk6j2JT/1B7RRTee6GH9QutbY0SluKk+B42K4z2AB8Zs5zDoanO27tzfdMN+UNbX2YBdbxXNCIl39US8nL156anWfXfyFJ+vw3maWPOeN90dC127ZVkcZyU5nNSegwPIfqfM5vrjchU0t+6be/gZAyIocA6PaRxPWSf567ANs7jguedeMPdVVdvee6rY1ROhKwdyLP2kls4pKzXv3FSQcbs/alyfqhZWvcWdNebjvFTJszsipjPFGOnIQmxzxOZbPEF++nyiM2OeOoO36bDVBFsXtfttm8qsxs+tWQwGRsJEW0h2a3qBMI4+hpYQKBgQDh0YbN76tcW255XMiGsHIazfct4Ji6JYCkqBPTiVa9NingCL+aCC/4sqKoKN8FNlvWaTR4YmpT4tAYpeyW40vcLqYZT+0gbucWkbBTWB0o2qmkEeIczr4IZON0QW1rV9clpXWpl4HR1qxvFq3zxXDRcnAUqSK9o8ajUlwbJoH1bQKBgQDFoMy6lGPnFLYKTPDF/JdLbqqkuAy87BmlrkqylrVw0MquJHFm/UujNmSOS+2FbmI17wAkSl0Dku9c0bKNTtPBquqeq5Wol/SEB4C6Sr5oCaRtz92Sp48rYuRYEoy6AI6Rv0osKg2t+UVnE42bDiq2SwkYoG5Xj9b1lFBD+bhRyQKBgDZZNEWKIkb3Jm6FGyn3e27iFVRwUrGyZvS6ExN9YWfmikuGL38F623CqI0qUQqzG4VOCrfSj96inwzfmkJycAaNH6LF7r84kduHstVMRrBXeC6psy7VvzzL80Y+nPQRzxEbcmcftLnpHdUas0ERSubN0RXX4ymbKiqSnuJV8T89AoGAP0x8pnom8XnJwMzaBaAc2XVNxMqKkexRXqbPmBn7bXICqPpVNDaHBnTCim05W5Z6cGnnsrf6yM1ES4eC2A3ad1qGIWI14jUhhTRd/8025V3JQ77jajiu+6eGGct/NYg+IeKSIEkr7oA7wYMaxQIpng+0jyW7keIpaKkjeFJAvjkCgYBnu5KAZWBHuv/nr+P43zFTYylMZhoKN3IqT4PO5f06xiWxTX3zn9k5Fg/M7WdzgHak7H/MgSoQoftVfFgD5YWklUNh4AXjprdf4oSMIzM88QHTFplHh2hFLnplJrP6qGCsW2MUWQR0CF/uNdOaDp/AYOUCAqnI/WWzd3ceFxj0FQ==";
    private final static String alipay_public_key_2 = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAlpmpIhPr7pqm+v9wHQTd3xD7Wo1Ko7VTkMBgkw/V9jKd8h9vpUSKnx8la4SlJBY2Rcn72YXwMB3fjvh9MhrxY0yGsGJzwcpFjYa9z/ivwxke8uuyT9jVtDGWIMeVPPChaRF5pEyb6kJ6jDsdrp34GnNYthrblWqUKuw7QvRfvpARwl/Gp3pczwcPRWnkHrcnoZzU6YndLSVAqT+gmFia0DJ2H4S27r8igegbfbOpTJc+n+YuN734LLvcaoKINR9CbRPSkF5JOMmuwWThBdKBU5VwT/mrLwbIxdZkLcZ/w/17NZMHy963efhwIqTOEAup6WTD27sJi+MLjIkD9B4/6QIDAQAB";



    static AlipayCore alipayCore;

    /**
     * 初始化函数.
     */
    @Before
    public  void init(){
        AlipayCore.ClientBuilder clientBuilder = new AlipayCore.ClientBuilder();
        //signType=rsa时，可不传 alipay_public_key
        //alipayCore = clientBuilder.setAppId(appid).setPrivateKey(private_key).setSignType(AlipayConstants.SIGN_TYPE_RSA).build();

        //signType=rsa2时，必须传 支付宝公钥 alipay_public_key
        alipayCore = clientBuilder.setAlipayPublicKey(alipay_public_key_2).setAppId(appid_2).setPrivateKey(alipay_public_key_2).setSignType(AlipayConstants.SIGN_TYPE_RSA2).build();
    }



    /***
     * 统一收单交易支付接口（条码支付）
     */
    @Test
    public void testPay(){

        try {

            AlipayTradeRequest request = new AlipayTradeRequest();

            //必须参数
            request.setTotalAmount("0.01");
            request.setStoreId("00001025104487");
            request.setOperatorId("hanley001");
            request.setAuthCode("288609492126942746");
            request.setOutTradeNo(System.currentTimeMillis()+"");
            request.setSubject("CI测试买单001");

//            如下为可选参数，全部参数请查看 AlipayTradeRequest
//            request.setBody("测试支付");
//            request.setDiscountableAmount("0");
//            request.setUndiscountableAmount("0");
//            request.setSellerId(partner_id_0);
//            List<GoodsDetail> list = new ArrayList<GoodsDetail>();
//            list.add(GoodsDetail.newInstance("g01","name1",10,1));
//            list.add(GoodsDetail.newInstance("g02","name2",12,3));
//            request.setGoodsDetailList(list);

            AlipayTradeResponse response = AlipayClient.pay(request,alipayCore);
//            assertTrue(response.isSuccess());
            //response就是支付结果,具体请参考相关属性说明
        } catch (Exception e) {
            log.error(e);
        }
    }




    @Test
    public void testRefund(){
        try {
            AlipayRefundRequest request = new AlipayRefundRequest();
            request.setTradeNo("2018102322001444515405783599");
            request.setRefundAmount("0.01");
            request.setRefundReason("测试退款");
            AlipayRefundResponse response = AlipayClient.refund(request,alipayCore);
            log.debug("response="+JsonUtil.format(response));
            assertTrue(response.isSuccess());
        } catch (Exception e) {
           log.error(e);
        }
    }


    /***
     * 统一收单交易退款接口(部分退款)
     */
    @Test
    public void  testPartRefund(){

        try {
            AlipayRefundRequest request = new AlipayRefundRequest();
            //request.setOutTradeNo("1508487673867");
            request.setTradeNo("2018062821001004510561182960");
            request.setRefundAmount("0.05");
            request.setRefundReason("测试部分退款");
            request.setStoreId("00001025104487");
            request.setTerminalId("10007");
            request.setOutRequestNo(System.currentTimeMillis()+"");
            AlipayRefundResponse response = AlipayClient.refund(request,alipayCore);
            log.debug("response="+JsonUtil.format(response));
            assertTrue(response.isSuccess());
            //response 就是退款结果
        } catch (Exception e) {
           log.error(e);
        }
    }


    /***
     * 统一收单线下交易查询
     */
    @Test
    public void testQuery(){
        try {
            AlipayQueryResponse response = AlipayClient.query("1540262464959",alipayCore);
            log.debug("response="+JsonUtil.format(response));
            assertTrue(response.isSuccess());
        } catch (Exception e) {
           log.error(e);
        }
    }


    /***
     * 统一收单线下交易预创建（扫码支付）
     * 暂未开启异步通知,完成预订单创建后,请自行实现Thread调用query()查询支付结果
     */
    @Test
    public void testPreCreate(){

        try {
            AlipayQrcodeRequest request = new AlipayQrcodeRequest();
            request.setSubject("购买商品");
            request.setOutTradeNo(System.currentTimeMillis()+"");
            request.setBody("测试下单");
            request.setOperatorId("990001");
            request.setStoreId("0001025104489");
            request.setTotalAmount("0.01");
            //request.setSellerId(partner_id);

            AlipayQrcodeResponse response = AlipayClient.preCreate(request,alipayCore);
            log.debug("response="+JsonUtil.format(response));
            assertTrue(response.isSuccess());
            
        } catch (Exception e) {
           log.error(e);
        }
    }


    /***
     * H5网页支付接口（手机网站支付）
     */
    @Test
    public void testPayInMobileSite(){

        try {
            AlipayMobileSiteRequest request = new AlipayMobileSiteRequest();
            request.setNotifyUrl("异步通知地址,支付宝通知支付结果");
            request.setReturnUrl("同步返回地址,完成支付后自动转向的地址");
            AlipayMobileSiteRequest.BizContent bizContent = new AlipayMobileSiteRequest.BizContent();
            bizContent.setTotalAmount("0.01");
            bizContent.setSubject("测试H5(手机网页)支付");
            //bizContent.setSeller_id(partner_id);
            bizContent.setProductCode("p0001");
            bizContent.setOutTradeNo(System.currentTimeMillis()+"");
            request.setBizContent(bizContent);
            String html = AlipayClient.payInMobileSite(request,alipayCore);
            log.debug("html="+html);
            assertNotNull(html);
            //html结果直接显示在页面即可
        } catch (Exception e) {
           log.error(e);
        }
    }


    /***
     * 电脑网页支付接口[待测试]
     */
    @Test
    public void testPayInWebSite(){

        try {
            AlipayWebSiteRequest request = new AlipayWebSiteRequest();
            request.setNotifyUrl("异步通知地址,支付宝通知支付结果");
            request.setReturnUrl("同步返回地址,完成支付后自动转向的地址");
            AlipayWebSiteRequest.BizContent bizContent = new AlipayWebSiteRequest.BizContent();
            bizContent.setTotalAmount("0.01");
            bizContent.setSubject("测试电脑网站支付");
            bizContent.setBody("测试");
            bizContent.setProductCode("p0001");
            bizContent.setOutTradeNo(System.currentTimeMillis()+"");
            String html = AlipayClient.payInWebSite(request,alipayCore);
            assertNotNull(html);
            //html结果直接显示在页面即可
        } catch (Exception e) {
           log.error(e);
        }
    }



    /***
     * 统一收单交易撤销接口
     */
    @Test
    public void testCancel(){
        try {
            AlipayCancelResponse response = AlipayClient.cancel("1542362127106",alipayCore);
            log.debug("response="+JsonUtil.format(response));
            assertTrue(response.isSuccess());
        } catch (Exception e) {
           log.error(e);
        }
    }

}
