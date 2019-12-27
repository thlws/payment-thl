糖葫芦支付
============
[![](https://img.shields.io/badge/release-v1.1.9-green.svg)](https://github.com/thlws/payment-thl)   [![](https://img.shields.io/badge/license-Apache--2-yellowgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0.html) [![](https://img.shields.io/badge/maven%20central-v1.1.9-blue.svg)](https://search.maven.org/artifact/org.thlws/payment-thl/1.1.9/jar) 
[![](https://img.shields.io/badge/jdk-1.8%2B-red.svg)](https://www.oracle.com/technetwork/java/javase/downloads/index.html)


![](img/thl.png)

### 在线Demo
- [http://47.100.122.135:7171/](http://47.100.122.135:7171/)

### 依赖安装
```
<dependency>
    <groupId>org.thlws</groupId>
    <artifactId>payment-thl</artifactId>
    <version>1.2.0-SNAPSHOT</version>
</dependency>
```

### 源码托管
- [https://gitee.com/thlws/payment-thl](https://gitee.com/thlws/payment-thl)
- [https://github.com/thlws/payment-thl](https://github.com/thlws/payment-thl)

### 在线文档
- [https://pay.thlws.org](https://pay.thlws.org)

### 特别鸣谢
- [hutool](https://www.hutool.cn/)
- [alipay-sdk-java](https://docs.open.alipay.com/54/103419/)

### 适用人群
未接触过支付，觉得官方文档复杂, 但又需要快速接入支付功能的小白程序员，这个项目一定会让你省下不少力气，如果你是之前接入过各种支付的老鸟,这对你可能没什么吸引力，这个项目主要面向刚接触或未接触过支付的小伙伴，无论你是小白还是老鸟，喜欢的话帮忙star下，感谢。

### 在线交流
- 邮箱：hanley@thlws.com 
- QQ群：  [![](https://img.shields.io/badge/chat-on%20qq-red.svg)](//shang.qq.com/wpa/qunwpa?idkey=521df1fba7ef96db15c898e48feb26b6a82f6c2a60612154181b301febb30494) 693169203
- 欢迎有意愿的小伙伴加入持续维护(邮件或码云私信我)

### 示例项目
- [https://gitee.com/thlws/payment-simple 【待完善】](https://gitee.com/thlws/payment-simple)

### 接口列表
**支付宝**
[org.thlws.payment.AlipayClient](src/main/java/org/thlws/payment/AlipayClient.java) 


| 方法名称 | 功能说明 |
|:--------|:--------|
| payInMobileSite | 手机网页支付 |
| payInWebSite | 普通网站支付 |
| preCreate | 创建预订单 |
| pay | 刷卡支付(当面付) |
| query | 支付查询 |
| refund | 支付退款 |
| cancel | 订单取消|

**微信支付**
[org.thlws.payment.WechatPayClient](src/main/java/org/thlws/payment/WechatPayClient.java)

| 方法名称 | 功能说明 |
|:--------|:--------|
| unifiedOrder | 统一下单(类似预订单) |
| refund | 申请退款 |
| reverse | 支付撤销 |
| microPay | 刷卡支付 |
| orderQuery | 支付查询 |
| closeOrder | 订单关闭 |
| openidQuery | 查询OpenId|
| queryMicroMch | 查询小微收款人信息|
| postMicroMch | 申请开通小微收款功能|

**微信公众号**
[org.thlws.payment.WechatMpClient](src/main/java/org/thlws/payment/WechatMpClient.java)

| 方法名称 | 功能说明 |
|--------|--------|
| obtainOauthAccessToken | 获取accesToken(OAuth2) |
| refreshOauthAccessToken | 刷新accesToken(OAuth2) |
| isvalidOauthAccessToken | 验证token是否过期(OAuth2) |
| generateWechatUrl | 生成微信规则URL |
| obtainUserInfo | 获取用户资料|
| obtainAccessToken | 获取accesToken(普通) |
| obtainJsApiTicket | 获取JSAPI Ticket |
| obtainTemplateId | 获取微信消息模板ID |
| setupIndustry | 设置行业属性 |
| sendMsgToUser | 发送微信通知 |

#### 公众号开发会涉及Token,Ticket等时效性参数，建议程序中使用Redis进行存储.

**翼支付**
[org.thlws.payment.BestPayClient](src/main/java/org/thlws/payment/BestPayClient.java) 

| 方法名称 | 功能说明 |
|--------|--------|
| barcode | 扫码支付 |
| query | 订单查询 |
| refund | 订单退款 |
| reverse | 订单撤销 |

### 如何使用

**前置条件**

- 拿到平台核心参数,比如appId,mchId等(查看文档);
- 在微信或支付宝后台完成对应配置,比如回调地址,公钥上传;

**快速上手**

```java
//支付宝支付
AlipayCore alipayCore = clientBuilder
 .setAlipayPublicKey(alipay_public_key_2)
 .setAppId(appid_2)
 .setPrivateKey(alipay_public_key_2)
 .setSignType(AlipayConstants.SIGN_TYPE_RSA2).build();
 
AlipayTradeRequest request = new AlipayTradeRequest();
request.setTotalAmount("0.01");
request.setStoreId("123456");
request.setOperatorId("hanley001");
request.setAuthCode("288609492126942746");
request.setOutTradeNo(System.currentTimeMillis()+"");
request.setSubject("测试买单001");
AlipayTradeResponse response = AlipayClient.pay(request,alipayCore);
boolean isSuccess = response.isSuccess();
 

//微信支付(刷卡)
String apiKey = "test_wechat_apikey";
WechatPayRequest request = new WechatPayRequest();
request.setAppId("test_wechat_appid");
request.setMchId("test_wechat_mchid");
request.setSpbillCreateIp(NetUtil.getLocalhostStr());
request.setTotalFee("1");
request.setAttach("some messages");
request.setOutTradeNo(ThlwsBeanUtil.getRandomString(32));
request.setAuthCode("13459326110303327");
request.setBody("pay test");
WechatPayResponse response = WechatPayClient.microPay(request,apiKey);
boolean isSuccess = response.isSuccess();
String  message = response.getMessage();


//翼支付
BarcodePayRequest request = new BarcodePayRequest();
request.setMerchantId(merchantId);
request.setBarcode("510094008028763507");
request.setOrderNo( RandomUtil.randomNumbers(16));
request.setOrderReqNo( RandomUtil.randomNumbers(16));
request.setOrderDate("20171224121212");
request.setOrderAmt("1");
request.setProductAmt("1");
request.setGoodsName("测试商品");
request.setStoreId("00001025104487");
OrderResultResponse response = BestPayClient.barcode(request, key);
boolean isSuccess = response.isPaySuccess();
```

全部支付的入口在此,直接使用Client中的对应方法即可,测试功能请至test目录下参考Junit.
![](img/client.png) ![](img/test.png)





### 详见问题
**调用支付接口后，如何判断调用成功与否？**

```
WechatPayResponse response = WechatPayClient.microPay(request,apiKey);
//flag == true 表示成功
boolean flag = response.isSuccess();
String  message = response.getMessage();
System.out.println("isSuccess="+flag+", message="+message);
```

**支持Android App吗**

不支持Android App，有这方面需求的请至 [微信APP支付](https://pay.weixin.qq.com/wiki/doc/api/app/app.php?chapter=8_4) 或 [支付宝APP支付](https://b.alipay.com/signing/productDetail.htm?productId=I1011000290000001002) .

### 更版记录
- v1.0.0 整合多种支付平台
- v1.0.1 公众号模块代码规范
- v1.0.2 微信公众号返回新增isSuccess()
- v1.0.3 新增行业属性获取接口
- v1.0.4 行业属性汇总,代码优化
- v1.0.5 新增请求是否来自微信(WechatMpClient.isFromWechat)
- v1.0.6 新增微信异步通知数据处理 WechatUtil.parseNotifyMsgToBean(HttpServletRequest request)
- v1.0.7 修正公众号支付签名问题,异步数据通知处理优化
- v1.0.8 修正微信网页授权问题，新增公众号入口类部分注释
- v1.0.9 修复issues-I1047Y，感谢 alterem 反馈
- v1.1.0 修正支付宝网页支付宝参数格式问题
- v1.1.1 升级支付宝SDK，修改 支付宝支付中productCode的赋值
- v1.1.2 优化支付宝网站、手机网站支付时 productCode 平台参数，同步更新payment-simple
- v1.1.3 新增code2session接口,修正 [github#1](https://github.com/thlws/payment-thl/issues/1), [gitee#I12BOM](https://gitee.com/thlws/payment-thl/issues/I12BOM)
- v1.1.4 支付宝SDK升级，JDK最低版本要求1.8+，接口优化等。
- v1.1.5 解决Session2Code 小程序调用接口isSuccess逻辑.
- v1.1.6 例行更新,升级 alipay-sdk-java hutoll,规范javadoc
- v1.1.7 抽离小程序API，升级alipay-sdk-java hutoll
- v1.1.8 调整公众号推送（公众号模板推送）接口
- v1.1.9 小程序，公众支付封装前端支付数据

