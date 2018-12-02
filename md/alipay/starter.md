# 快速上手

#### 支付宝支付(当面付)

```java
AlipayCore alipayCore = clientBuilder.setAlipayPublicKey(alipay_public_key)
                        .setAppId(appid_2).setPrivateKey(private_key)
                        .setSignType(AlipayConstants.SIGN_TYPE_RSA2).build();
                        
AlipayTradeRequest request = new AlipayTradeRequest();
request.setTotalAmount("0.01");
request.setStoreId("00001025104487");
request.setOperatorId("hanley001");
request.setAuthCode("288609492126942746");
request.setOutTradeNo(System.currentTimeMillis()+"");
request.setSubject("CI测试买单001");      
//response就是支付结果,具体请参考相关属性说明
AlipayTradeResponse response = AlipayClient.pay(request,alipayCore);
```


#### 支付宝退款
```java
AlipayCore alipayCore = clientBuilder.setAlipayPublicKey(alipay_public_key)
                        .setAppId(appid_2).setPrivateKey(private_key)
                        .setSignType(AlipayConstants.SIGN_TYPE_RSA2).build();
                        
AlipayRefundRequest request = new AlipayRefundRequest();
request.setTradeNo("2018102322001444515405783599");
request.setRefundAmount("0.01");
request.setRefundReason("测试退款");
//response为退款结果
AlipayRefundResponse response = AlipayClient.refund(request,alipayCore);
```

### 功能测试
- [org.thlws.payment.alipay.AlipayPayClientTest](https://gitee.com/thlws/payment-thl/tree/master/src/test/java/org/thlws/payment/alipay/AlipayPayClientTest.java)
