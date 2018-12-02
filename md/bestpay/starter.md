# 快速上手

```java
String barcode = "510094008028763507";
String orderAmt = "1";
String orderNo = RandomUtil.randomNumbers(16);

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

### 功能测试
- [org.thlws.payment.bestpay.BestpayTest](https://gitee.com/thlws/payment-thl/tree/master/src/test/java/org/thlws/payment/bestpay/BestpayTest.java)
