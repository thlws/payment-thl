# 快速上手

### 刷卡支付
“刷卡支付”是从用户的角度定义，用户出示微信付款码由商家扫码完成支付动作，此情境类似用户使用信用卡付款，必要时需用户输入支付密码。
#### 适用范围
- 普通商户
- 子商户
- ~~小微支付(不支持)~~ 

#### 请求参数
- 参数对象 [org.thlws.payment.wechat.entity.request.WechatPayRequest](../../src/main/java/org/thlws/payment/wechat/entity/request/WechatPayRequest.java)
- 官方说明 [https://pay.weixin.qq.com/wiki/doc/api/micropay_sl.php?chapter=9_10&index=1](https://pay.weixin.qq.com/wiki/doc/api/micropay_sl.php?chapter=9_10&index=1)
#### 返回参数
- 参数对象 [org.thlws.payment.wechat.entity.response.WechatPayResponse](../../src/main/java/org/thlws/payment/wechat/entity/response/WechatPayResponse.java)
- 官方说明 [https://pay.weixin.qq.com/wiki/doc/api/native_sl.php?chapter=9_1#6](https://pay.weixin.qq.com/wiki/doc/api/native_sl.php?chapter=9_1#6)
#### 示例代码

```
WechatPayRequest request = new WechatPayRequest();
request.setAppId(test_wechat_appid);
request.setMchId(test_wechat_mchid);

/*普通模式无需设置,子商户需设置子商户号*/
//request.setSub_mch_id(sp_wechat_sub_mchid);

request.setSpbillCreateIp(NetUtil.getLocalhostStr());
request.setTotalFee("1");
request.setAttach("00001025104487");
request.setOutTradeNo(ThlwsBeanUtil.getRandomString(32));
request.setAuthCode("134593261103056527");
request.setDeviceInfo("device...");
request.setBody("pay test");

WechatPayResponse response = WechatPayClient.microPay(request,apiKey);
boolean flag = response.isSuccess();
String  message = response.getMessage();
```


### 扫码支付
“扫码支付”是从用户的角度定义，用户使用微信扫描“付款码”完成支付动作，“扫描支付”包含两种模式，本文只针对《模式二》进行说明，微信官方模式说明请参看 [https://pay.weixin.qq.com/wiki/doc/api/native_sl.php?chapter=6_3#2](https://pay.weixin.qq.com/wiki/doc/api/native_sl.php?chapter=6_3#2) 。

#### 适用范围
- 普通商户
- 子商户
- 小微支付

#### 请求参数
- 参数对象 [org.thlws.payment.wechat.entity.request.UnifiedOrderRequest](../../src/main/java/org/thlws/payment/wechat/entity/request/UnifiedOrderRequest.java)
- 官方说明 [https://pay.weixin.qq.com/wiki/doc/api/native_sl.php?chapter=9_1](https://pay.weixin.qq.com/wiki/doc/api/native_sl.php?chapter=9_1)
#### 返回参数
- 参数对象 [org.thlws.payment.wechat.entity.response.UnifiedOrderResponse](../../src/main/java/org/thlws/payment/wechat/entity/response/UnifiedOrderResponse.java)
- 官方说明 [https://pay.weixin.qq.com/wiki/doc/api/native_sl.php?chapter=9_1](https://pay.weixin.qq.com/wiki/doc/api/native_sl.php?chapter=9_1)

#### 示例代码
```java

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
//TODO 调用查询接口，检测用户是否完成支付,或者基于微信 异步返回(notify_url) 检测是否完成支付

```


### 公众号支付 
“公众号支付”是指用户在微信H5中调用微信完成支付的动作，与“扫码支付”类似均需调用统一下单接口。


#### 适用范围
- 普通商户
- 子商户
- 小微支付

#### 前置条件
必须取得用户OpenId（透过code或其他方式支付后返回openid）

1.生成用于获取code的微信规则URL

```java
String appId = "wx5f22a16d8c94dba4";
String scope = "snsapi_base";
String callback = "http://www.thlws.com/wechat/callback/getcode.html";
String bizData = "";//对应微信state参数，微信会原样返回
String url = WechatMpClient.generateWechatUrl(appId, scope, callback, bizData);

```

2.处理如上callback数据，并获取code

```java
String code = request.getParameter("code");

```

3.根据code获取用户openid

```java
Map<String, Object> mapToken = new HashMap<String, Object>();
String appId = "wx5f22a16d8c94dba4";
String appSecret = "d24a3e612fca66ae28137de28916f875";
String code = "11111";
mapToken.put("appid", appId);
mapToken.put("secret", appSecret);
mapToken.put("code", code);
mapToken.put("grant_type", "authorization_code");
OauthTokenResponse response = WechatMpClient.obtainOauthAccessToken(mapToken);
System.out.println("openid="+response.getOpenid());

```

#### 支付流程
- 调用预订单接口（同扫码支付,注意tradeType="JSAPI"）
- 预订单结果数据返回前台JSP页面，调用微信JSAPI完成支付.

#### 示例代码

```jsp
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"
	trimDirectiveWhitespaces="true"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" style="overflow:auto" dir="ltr" class="uk-notouch">

<!-- 公账号支付示例JSP -->

<script type="text/javascript">

	function onBridgeReady() {
		WeixinJSBridge.invoke('getBrandWCPayRequest', {
			"appId" : '${appId}',
			"timeStamp" : '${timeStamp}',   
			"nonceStr" : '${nonceStr}',
			"package" : '${packageStr}',
			"signType" : '${signType}',   
			"paySign" :  '${paySign}'
		}, function(res) {
			if (res.err_msg == "get_brand_wcpay_request:ok") {

                setTimeout(pay_ok,1500);//支付成功并进行页面跳转

			}else{

				if(res.err_msg == "get_brand_wcpay_request:cancel"){
                    //支付被取消 FIXME
				}else{
                    //其他异常弹出对应异常信息 FIXME
				}
				setTimeout(pay_ng,1500);
			}
		});
	}


	if (typeof WeixinJSBridge == "undefined") {
		if (document.addEventListener) {
			document.addEventListener('WeixinJSBridgeReady',onBridgeReady, false);
		} else if (document.attachEvent) {
			document.attachEvent('WeixinJSBridgeReady', onBridgeReady);
			document.attachEvent('onWeixinJSBridgeReady', onBridgeReady);
		}
	} else {
		onBridgeReady();
	}


	function retry(){
		window.location.reload();
	}


	/*支付成功*/
	function pay_ok() {
	    //跟进自己业务决定跳转页面,pay_ok.html仅为示例URL
        window.location.href="${pageContext.request.contextPath}/pay_ok.html";
    }

    /*支付失败*/
    function pay_ng() {
        //跟进自己业务决定跳转页面,pay_ng.html仅为示例URL
        window.location.href="${pageContext.request.contextPath}/pay_ng.html";
    }

</script>
<head>

</head>
<body>

</body>
</html>

```

## 功能测试
- [org.thlws.payment.wechat.WechatPayClientTest](../../src/test/java/org/thlws/payment/wechat/WechatPayClientTest.java)
- [org.thlws.payment.wechat.WechatMpClientTest](../../src/test/java/org/thlws/payment/wechat/WechatMpClientTest.java)