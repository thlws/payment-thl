package org.thlws.payment.json;

import org.junit.Test;
import org.thlws.payment.alipay.entity.request.AlipayWebSiteRequest;
import org.thlws.utils.JsonUtil;

/**
 * @author HanleyTang 2019-08-04
 */
public class JsonConvertTest {


    @Test
    public void testObj2Json(){
        AlipayWebSiteRequest.BizContent bizContent = new AlipayWebSiteRequest.BizContent();
        bizContent.setOutTradeNo("987jkl111");
        bizContent.setBody("测试数据");
        bizContent.setProductCode("001ook");
        bizContent.setSubject("付款");
        bizContent.setTotalAmount("100");

        String myJson = JsonUtil.beanToJsontring(bizContent);
        System.out.println(myJson);
    }
}
