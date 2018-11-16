package org.thlws.payment.wechat;

import cn.hutool.core.util.NetUtil;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import org.thlws.payment.WechatMpClient;
import org.thlws.payment.WechatPayClient;
import org.thlws.payment.wechat.entity.request.UnifiedOrderRequest;
import org.thlws.payment.wechat.entity.response.NotifyResponse;
import org.thlws.payment.wechat.entity.response.UnifiedOrderResponse;
import org.thlws.payment.wechat.entity.response.mp.OauthTokenResponse;
import org.thlws.payment.wechat.utils.WechatUtil;
import org.thlws.utils.ThlwsBeanUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by HanleyTang on 2018/1/22
 * 请配合wechat_pay.jsp 参考公众号支付
 * @author Hanley[hanley@thlws.com]
 * @version 1.0
 */
public class WechatWebDemo {

    private static final Log log = LogFactory.get();

    /*普通商户*/
    private static final String test_wechat_appid= "wx5f22a16d8c94dba4";
    private static final String test_wechat_appsecret="d24a3e612fca66ae28137de28916f875";
    private static final String test_wechat_mchid="1336236101";
    private static final String test_wechat_apikey="d24a3e612fca66ae28137de28916f875";


    /*此方法不用提供外部访问地址,根据项目业务编码即可*/
    public void buildWechatUrl(){
        try {
            /*第一步，依据微信规则组装URL*/
            String scope = "snsapi_base";
            String callback = "http://www.x.com/wechat/pay_in_wechat.html"; //示例URL,请按照实际情况填写
            String bizData = "";//对应微信state参数，微信会原样返回
            String url = WechatMpClient.generateWechatUrl(test_wechat_appid, scope, callback, bizData);

            //其他步骤请参看 pay_in_wechat  代码示例
        } catch (Exception e) {
           log.error(e);
        }
    }


    /***
     * 需提供外部访问地址
     * 此处可以是SpringMVC、Struts2、Servlet 请根据项目前端框架编写如下代码.
     * 该方法访问路径应为如上方法 build_wechat_url 中 callback 完整地址
     */
    public void payInWechat(HttpServletRequest request, HttpServletResponse response){

        try {
            /*第二步，引导用户触发URL（公众号添加链接按钮，或在微信H5中触发）*/
            String code = request.getParameter("code");
            String state = request.getParameter("state");
            Map<String, Object> codeMap = new HashMap<String, Object>();
            codeMap.put("appid", test_wechat_appid);
            codeMap.put("secret", test_wechat_appsecret);
            codeMap.put("code", code);
            codeMap.put("grant_type", "authorization_code");
            //得到openid及其token相关数据
            OauthTokenResponse oauthTokenOutput = WechatMpClient.obtainOauthAccessToken(codeMap);
            //实际应用中，最好记录appid 与 openid 关系，无需每次获取
            String openId = oauthTokenOutput.getOpenid();


            /*第三步，调用统一下单接口*/
            String outTradeNo = RandomUtil.randomString(32);
            String notifyUrl = "http://www.x.com/wechat/notify_wechat_pay.html";
            UnifiedOrderRequest uInput = new UnifiedOrderRequest();
            uInput.setAppId(test_wechat_appid);
            uInput.setMchId(test_wechat_mchid);
            uInput.setOpenId(openId);//上一步得到的openId
            uInput.setBody("购买xx商品");
            uInput.setOutTradeNo(outTradeNo);
            uInput.setTotalFee("1");//单位分
            uInput.setTradeType("JSAPI");//JSAPI表示公众号支付时下预订单
            uInput.setNotifyUrl(notifyUrl);//URL设计应指向 notify_wechat_pay 访问路径
            uInput.setSpbillCreateIp(NetUtil.getLocalhostStr());
            //若为子商户或小微收款，还需设置sub_mch_id / attach
            UnifiedOrderResponse unifiedOrderOutput = WechatPayClient.unifiedOrder(uInput,test_wechat_appsecret);


            /*第四步，数据处理用于页面调用微信JS支付模块*/
            WechatUtil.h5_pay(request,unifiedOrderOutput,outTradeNo,test_wechat_apikey);


            /*第五步，页面跳转至 wechat_pay.jsp ,供用户完成微信付款，支付完成后同步跳转页面，提示支付成功等 */


            /*第六步，异步处理（参考notify_wechat_pay），依据自己业务编码存储数据等*/
        } catch (Exception e) {
            log.error(e);
        }

    }



    /***
     * 需提供外部访问地址
     * 此处可以是SpringMVC、Struts2、Servlet 请根据项目前端框架编写如下代码.
     * 调用微信统一下单时，传入 UnifiedOrderRequest.notify_url,应为该放方法的访问路径
     */
    public void notifyWechatPay(HttpServletRequest request, HttpServletResponse response){

        String status="SUCCESS",msg = "处理成功";
        PrintWriter writer = null;
        try {
            writer = response.getWriter();
            StringBuffer xmlResult = new StringBuffer();
            InputStream is = request.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            String buffer = null;
            while ((buffer = br.readLine()) != null){
                xmlResult.append(buffer);
            }
            log.debug("微信异步返回信息："+ ThlwsBeanUtil.formatXml(xmlResult.toString()));
            NotifyResponse notifyOutput = WechatUtil.parseNotifyMsg(xmlResult.toString());
            //notifyOutput 是微信推送数据转换为Java对象，直接从该对象取值并进行相关业务操作
            //TODO 业务逻辑
        } catch (Exception e) {
            log.error(e);
        }finally {
            writer.println("<xml><return_code><![CDATA["+status+"]]></return_code><return_msg><![CDATA["+msg+"]]></return_msg></xml>");
        }
    }




}
