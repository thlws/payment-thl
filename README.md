糖葫芦支付
============
> 基于Java实现的 多平台支付 依赖库。


#### 正在憋招，耐心等待...

#### 适用人群
未接触过支付，觉得官方文档复杂, 但又需要快速接入支付功能的新人，如果已在项目中接入过,这对你没什么吸引力，这个项目主要面向刚接触或未接触过支付的小伙伴。

#### 官方有SDK,为什么要用这个？
- 整合多主流种支付平台于一体(支付宝、微信、翼支付);
- 接口参数全部封装，使用者仅需创建对象并设置参数；
- 项目极少依赖，接口简单清晰，日志详细且输出格式友好；
- 各种支付平台，支付场景提供示例项目，新手更容易上手，降低接入门槛；
- 微信模块整合了公众号相关功能(微信通知,用户信息获取等)；

#### 支持Android App系统吗？
不支持Android App，有这方面需求的请至 [官方说明](https://pay.weixin.qq.com/wiki/doc/api/app/app.php?chapter=8_4)；

#### 支持哪些支付场景？
- 微信公众号支付
- 微信刷卡付款(商家扫码支付)
- 微信扫码支付(用户扫码支付)
- 支付宝网站支付付款
- 支付宝刷卡付款(商家扫码完成付款)
- 支付宝扫描支付(用户扫码支付)
- 支付宝手机网页支付
- 翼支付刷卡支付(商家扫码支付)

#### 怎么使用?
> 后续会有示例项目

##### 前置条件
- 拿到平台核心参数,比如appId,mchId等(后续附图);
- 在微信或支付宝后台完成对应配置,比如回调地址,公钥上传;

##### 快速上手
```
#支付宝支付
AlipayCore alipayCore = clientBuilder
 .setAlipayPublicKey(alipay_public_key_2)
 .setAppId(appid_2)
 .setPrivateKey(alipay_public_key_2)
 .setSignType(AlipayConstants.SIGN_TYPE_RSA2).build();
 
AlipayTradeRequest request = new AlipayTradeRequest();
request.setTotalAmount("0.01");
request.setStoreId("00001025104487");
request.setOperatorId("hanley001");
request.setAuthCode("288609492126942746");
request.setOutTradeNo(System.currentTimeMillis()+"");
request.setSubject("CI测试买单001");
AlipayTradeResponse response = AlipayClient.pay(request,alipayCore);
boolean isSuccess = response.isSuccess();
 

#微信支付(刷卡)
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


#翼支付
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
- [AlipayClient](src/main/java/org/thlws/payment/AlipayClient.java) 支付宝功能入口.
- [WechatPayClient](src/main/java/org/thlws/payment/WechatPayClient.java) 微信支付功能入口.
- [WechatMpClient](src/main/java/org/thlws/payment/WechatMpClient.java) 微信公众号功能入口.




### 更新日志
- [v1.0.0](v1.0.0)



### 在线文档
- 还没来得及写 ~

### 在线交流
- 邮箱：hanley@thlws.com 
- QQ群：  [![](https://img.shields.io/badge/chat-on%20qq-red.svg)](//shang.qq.com/wpa/qunwpa?idkey=521df1fba7ef96db15c898e48feb26b6a82f6c2a60612154181b301febb30494) 693169203



### 依赖安装

暂未发布Maven仓库 ~ 


### FAQ
#### 调用支付接口后，如何判断调用成功与否？
```
WechatPayResponse response = WechatPayClient.microPay(request,apiKey);
//flag == true 表示成功
boolean flag = response.isSuccess();
String  message = response.getMessage();
System.out.println("isSuccess="+flag+", message="+message);
```


### 全部支付
<b style="color:red">payment-*</b> 是一系列基于Java实现的支付类库，包含支付宝、微信、翼支付等，其目的是以最简单的方式完成各种支付方式接入。目前支付类库各自独立，使用时需单独引用，详见“支付类库”各自主页说明，后续不排除对所有支付类库整体打包，请留意文档更新。另源码会同时push到gitee&github,可能的话帮忙star下~😍
#### 源码托管
- [https://gitee.com/thlws/payment-thl](https://gitee.com/thlws/payment-thl)
- [https://github.com/thlws/payment-thl](https://github.com/thlws/payment-thl)
