package org.thlws.payment.wechat;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import org.junit.Test;
import org.thlws.payment.WechatMpClient;
import org.thlws.payment.wechat.entity.extra.AuthorizeType;
import org.thlws.payment.wechat.entity.request.mp.MpObtainOauthTokenRequest;
import org.thlws.payment.wechat.entity.request.mp.MpRefreshOauthTokenRequest;
import org.thlws.payment.wechat.entity.request.mp.MpUserInfoRequest;
import org.thlws.payment.wechat.entity.request.mp.MpValidOauthTokenRequest;
import org.thlws.payment.wechat.entity.response.NotifyResponse;
import org.thlws.payment.wechat.entity.response.mp.MpGetIndustryResponse;
import org.thlws.payment.wechat.entity.response.mp.MpOauthTokenResponse;
import org.thlws.payment.wechat.entity.response.mp.MpTokenResponse;
import org.thlws.payment.wechat.utils.WechatUtil;

import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.JAXBException;
import java.util.HashMap;
import java.util.Map;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertNotNull;

/***
 * 微信公众号测试
 * Created by HanleyTang on 16/9/4.
 */
public class WechatMpClientTest {

    private static final Log log = LogFactory.get();

    /***
     * 获取OauthaccessToken
     */
    @Test
    public void testObtainOauthToken() {
        try {
            Map<String, Object> mapToken = new HashMap<String, Object>();
            String appId = "wx5f22a16d8c94dba4";
            String appSecret = "d24a3e612fca66ae28137de28916f875";
            String code = "11111";
            mapToken.put("appid", appId);
            mapToken.put("secret", appSecret);
            mapToken.put("code", code);
            mapToken.put("grant_type", "authorization_code");

            //同时支持Map和Bean request
            //MpOauthTokenResponse response = WechatMpClient.obtainOauthAccessToken(mapToken);

            MpObtainOauthTokenRequest request = new MpObtainOauthTokenRequest("","","");
            MpOauthTokenResponse response = WechatMpClient.obtainOauthAccessToken(request);


            System.out.println("openid="+response.getOpenid());
            assertNotNull(response.getOpenid());
        } catch (Exception e) {
            log.error(e);
        }
    }

    /***
     * 刷新OauthToken
     */
    @Test
    public void testRefreshOauthToken() {
        try {
            Map<String, Object> mapToken = new HashMap<String, Object>();
            String appId = "wx5f22a16d8c94dba4";
            mapToken.put("appid", appId);
            mapToken.put("refresh_token", "填写通过access_token获取到的refresh_token参数");
            mapToken.put("grant_type", "refresh_token");

            //同时支持Map和Bean request
            //MpOauthTokenResponse response = WechatMpClient.refreshOauthAccessToken(mapToken);
            //assertNotNull(response.getAccess_token());


            MpRefreshOauthTokenRequest request = new MpRefreshOauthTokenRequest("","");
            MpOauthTokenResponse response = WechatMpClient.refreshOauthAccessToken(request);

        } catch (Exception e) {
            log.error(e);
        }
    }

    /***
     * 获取微信用户信息
     */
    @Test
    public void testObtainUserInfo() {
        try {
            Map<String, Object> userInfoMap = new HashMap<String, Object>();
            String accessToken = "";
            String openId = "";
            userInfoMap.put("access_token", accessToken);
            userInfoMap.put("openid", openId);
            userInfoMap.put("lang", "zh_CN");

            //map bean 同时支持
            MpUserInfoRequest request = new MpUserInfoRequest("", "");
            WechatMpClient.obtainUserInfo(userInfoMap);

//            MpUserInfoResponse response = WechatMpClient.obtainUserInfo(userInfoMap);
//            assertNotNull(response.getOpenid());
        } catch (Exception e) {
            log.error(e);
        }
    }

    /**
     * 生成微信URL[包含回调地址]
     * 生成URL后，引导用户点击，微信会向回调地址中返回code，可用于获取用户OpenId
     */
    @Test
    public void testBuildWechatURL() {
        try {
            String appId = "wx5f22a16d8c94dba4";
            String scope = "snsapi_base";
            /***
             * 需在getcode.html中取得code参数
             * <code>String code = request.getParameter("code");</code>
             */
            String callback = "http://www.thlws.com/wechat/callback/getcode.html";
            String bizData = "";//对应微信state参数，微信会原样返回
            String url = WechatMpClient.generateWechatUrl(appId, AuthorizeType.snsapi_base, callback, bizData);
            assertNotNull(url);
        } catch (Exception e) {
            log.error(e);
        }
    }

    /***
     * 检测token是否有效
     */
    @Test
    public void testIsvalidOauthToken() {
        try {
            Map<String, Object> mapToken = new HashMap<String, Object>();
            String access_token = "your token";
            String open_id = "your openid";
            mapToken.put("access_token", access_token);
            mapToken.put("openid", "");

            //boolean flag = WechatMpClient.isvalidOauthAccessToken(mapToken);

            MpValidOauthTokenRequest request = new MpValidOauthTokenRequest("","");
            boolean flag = WechatMpClient.isvalidOauthAccessToken(request);


            assertTrue(flag);
        } catch (Exception e) {
            log.error(e);
        }
    }

    /***
     * 获取普通access_token
     */
    @Test
    public void testObtainAccessToken(){
        try {
            MpTokenResponse response = WechatMpClient.obtainAccessToken("wxa3f3406c0b04a601","04303a8acc9786ddac6458d401ca764f");
            System.out.println(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /***
     * 测试获取JS API Ticket
     */
    @Test
    public void testObtainJsApiTicket(){
        try {
            //功能一样
            WechatMpClient.obtainJsApiTicket("");
            WechatMpClient.obtainJsApiTicket("","");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /***
     * 测试 模板ID获取
     */
    @Test
    public void testObtainTemplateId(){
        try {
            WechatMpClient.obtainTemplateId("","");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /***
     * 测试设置 行业属性
     */
    @Test
    public void testSetupIndustry(){
        try {
            WechatMpClient.setupIndustry("","","");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Test
    public void testGetIndustry(){
        try {
            MpGetIndustryResponse response = WechatMpClient.getIndustry("16_f2KiZdoAtfYhadyTKvhkkqGRwcH6UMOKqFqD3pt79--k8C9V5cIauw5ZXFRjkp2YXVi42RvvtG1WXLr_Nz1-EjRDTbssntdhCPEInej8Qqyv531QqgkrYsRarZEa5eWyDsLP5Qn__74bteKvUHEgABALYV");
            System.out.println(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * 测试消息发送
     */
    @Test
    public void testSendMsgToUser(){
        try {
            WechatMpClient.sendMsgToUser("","");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Test
    public void testIsFromWechat(){
        WechatMpClient.isFromWechat(null);
    }


    /***
     * 测试微信异步通知 数据处理
     */
    @Test
    public  void testParseNotifyMsg() {
        try {
            String notifyXmlResult = "<xml><appid><![CDATA[wx5f22a16d8c94dba4]]></appid><attach><![CDATA[69a8ef0cb3c742779c438e92bbc33118]]></attach><bank_type><![CDATA[CFT]]></bank_type><cash_fee><![CDATA[1]]></cash_fee><device_info><![CDATA[hanley@1025@cust_test]]></device_info><fee_type><![CDATA[CNY]]></fee_type><is_subscribe><![CDATA[Y]]></is_subscribe><mch_id><![CDATA[1336236101]]></mch_id><nonce_str><![CDATA[txjam10ant72jxl5umsl2hbl2nrb0kzr]]></nonce_str><openid><![CDATA[o2nMlwuj_cHFBcNDfPkpufta80KU]]></openid><out_trade_no><![CDATA[20170224052028]]></out_trade_no><result_code><![CDATA[SUCCESS]]></result_code><return_code><![CDATA[SUCCESS]]></return_code><sign><![CDATA[D8D69790FB5416AF86070B4DAD673E89]]></sign><time_end><![CDATA[20170224052134]]></time_end><total_fee>1</total_fee><trade_type><![CDATA[JSAPI]]></trade_type><transaction_id><![CDATA[4005332001201702241084568187]]></transaction_id></xml>";

            //方式一
            NotifyResponse response = WechatUtil.parseNotifyMsgToBean(notifyXmlResult);
            HttpServletRequest request = null;//Controller中传入

            //方式二
            WechatUtil.parseNotifyMsgToBean(request);
            assertTrue(null != response);
        } catch (Exception e) {
            log.error(e);
        }
    }


    @Test
    public void testJsApiTicket(){

        try {
            //直接使用appId secret,SDK 会自动回去token后再获取Ticket
            WechatMpClient.obtainJsApiTicket("", "");

            //手动获取token后再获取Ticket
            WechatMpClient.obtainJsApiTicket("");
        } catch (Exception e) {
            log.error(e);
        }
    }


    @Test
    public void testJsApiTicketSign(){

        try {
            //使用 testJsApiTicket 方式得到的ticket ，页面url获取ticket sign
            WechatUtil.jsTicketSign("", "", "");

        } catch (Exception e) {
            log.error(e);
        }
    }

    @Test
    public void testXML0(){
        try {
            String xml = "<xml><appid><![CDATA[wxa3f3406c0b04a601]]></appid><bank_type><![CDATA[CFT]]></bank_type><cash_fee><![CDATA[1]]></cash_fee><fee_type><![CDATA[CNY]]></fee_type><is_subscribe><![CDATA[Y]]></is_subscribe><mch_id><![CDATA[1511132631]]></mch_id><nonce_str><![CDATA[un3q6fwci0cxaqebv5ybmrzjzxz3or2i]]></nonce_str><openid><![CDATA[ofSpd1T-jkJ0UNzmHzDAd5Q2V_EM]]></openid><out_trade_no><![CDATA[80fbc69ff768432da508276cc0969504]]></out_trade_no><result_code><![CDATA[SUCCESS]]></result_code><return_code><![CDATA[SUCCESS]]></return_code><sign><![CDATA[0F9628659144CE571B9F685312843101]]></sign><sub_mch_id><![CDATA[1517927831]]></sub_mch_id><time_end><![CDATA[20190110134719]]></time_end><total_fee>1</total_fee><trade_type><![CDATA[JSAPI]]></trade_type><transaction_id><![CDATA[4200000251201901109450527881]]></transaction_id></xml>";
            NotifyResponse response = WechatUtil.parseNotifyMsgToBean(xml);
            System.out.println(response);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }

}
