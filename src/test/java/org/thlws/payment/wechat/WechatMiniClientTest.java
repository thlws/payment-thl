package org.thlws.payment.wechat;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import org.junit.Test;
import org.thlws.payment.WechatMiniClient;
import org.thlws.payment.wechat.entity.request.mini.Code2SessionRequest;
import org.thlws.payment.wechat.entity.request.mini.MiniSendDataRequest;
import org.thlws.payment.wechat.entity.response.mini.Code2SessionResponse;
import org.thlws.payment.wechat.entity.response.mp.MpTokenResponse;

import java.util.HashMap;

/***
 * 微信公众号测试
 * Created by HanleyTang on 16/9/4.
 */
public class WechatMiniClientTest {

    private static final Log log = LogFactory.get();

    private String miniAppId = "wx8955431b7b4f0fd8";
    private String miniAppSecret = "b7f492f0a0d1930c530a405efc852c29";

    /***
     * 获取普通access_token
     */
    @Test
    public void testObtainAccessToken(){
        try {
            MpTokenResponse response = WechatMiniClient.obtainAccessToken(miniAppId,miniAppSecret);
            System.out.println(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Test
    public void testCode2Session(){
        try {
            Code2SessionRequest request = new Code2SessionRequest();
            request.setAppId(miniAppId);
            request.setSecret(miniAppSecret);
            request.setJsCode("434jflasjfook00dkkk0lpo");
            Code2SessionResponse response = WechatMiniClient.code2Session(request);
            System.out.println(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    /**
     * 测试消息发送
     * https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/subscribe-message/subscribeMessage.send.html
     */
    @Test
    public void testSendMsgToUser(){
        try {
            String zxl = "ogj985QqZkc8VYnMrZFWw1Ugl04M";
            String thl = "ogj985ZYA4KLoPVUbLMIwn8WFx1U";
            MiniSendDataRequest request = new MiniSendDataRequest();
            request.setToUser(zxl);
            request.setTemplateId("0JxUYpCyxIVEQKlN3wAFtXgFuGELJgTjd9aZ29ijwN0");
            HashMap<String, MiniSendDataRequest.Value> data = new HashMap<>();
            data.put("thing1",new MiniSendDataRequest.Value("能力检测"));
            data.put("thing2",new MiniSendDataRequest.Value("恭喜您,得分80,请静候佳音."));
            data.put("number3",new MiniSendDataRequest.Value("10010"));
            request.setData(data);

            WechatMiniClient.sendMsgToUser("28_xkQYxQ-NSL4MvjhPXKA9ceVXm4JUQGHrxSesdnUMF9FtfbsI8j6f5ww9NzrtahLF0l6Pf2j1gzmtGXDohFm2Gsx0Z98Y2KiJYzW6DwAY6U7oFHcPmk9R71NcKQADHIcAHAMQR",request);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
