# 项目介绍

未接触过支付，觉得官方文档复杂, 但又需要快速接入支付功能的小白程序员，这个项目一定会让你省下不少力气，如果你是之前接入过各种支付的老鸟,这对你可能没什么吸引力，这个项目主要面向刚接触或未接触过支付的小伙伴，无论你是小白还是老鸟，喜欢的话帮忙star下，感谢。

### Maven坐标
```
<dependency>
    <groupId>org.thlws</groupId>
    <artifactId>payment-thl</artifactId>
    <version>1.1.3</version>
</dependency>
```

### 特性说明
- 整合多主流种支付平台于一体(支付宝、微信、翼支付)
- 接口参数全部封装，使用者仅需创建对象并设置参数
- 项目极少依赖，接口简单清晰，日志详细且输出格式友好
- 各种支付平台，支付场景提供示例项目，新手更容易上手，降低接入门槛
- 微信模块整合了公众号相关功能(openId获取,微信通知,用户信息获取等)

### 支付功能
- 微信公众号支付(微信JSAPI)
- 微信刷卡付款(商家扫码支付)
- 微信扫码支付(用户扫码支付)
- 支付宝网站支付付款(普通网站支付)
- 支付宝刷卡付款(商家扫码完成付款,一般用于C/S架构系统)
- 支付宝扫描支付(用户扫码支付,类似自动贩卖机扫码支付)
- 支付宝手机网页支付(手机上打开的网页后进行支付)
- 翼支付刷卡支付(商家扫码支付,一般用于C/S架构系统)

### 更新日志
- v1.0.0 三合一支付整合(微信，支付宝，翼支付).
- v1.0.1 公众号模块代码规范.
- v1.0.2 微信公众号返回新增isSuccess().
- v1.0.3 新增行业属性获取接口
- v1.0.4 行业属性汇总,代码优化
- v1.0.5 新增请求是否来自微信(WechatMpClient.isFromWechat)
- v1.0.6 新增微信异步通知数据处理 WechatUtil.parseNotifyMsg(HttpServletRequest request)
- v1.0.7 修正公众号支付签名问题,异步数据通知处理优化
- v1.0.8 修正微信网页授权问题，新增公众号入口类部分注释
- v1.0.9 修复issues-I1047Y，感谢 alterem 反馈
- v1.1.0 修正支付宝网页网页支付宝参数格式问题
- v1.1.1 升级支付宝SDK，修改 支付宝支付中productCode的赋值
- v1.1.2 优化支付宝网站、手机网站支付时 productCode 平台参数，同步更新payment-simple
- v1.1.3 新增code2session接口,修正 [github#1](https://github.com/thlws/payment-thl/issues/1), [gitee#I12BOM](https://gitee.com/thlws/payment-thl/issues/I12BOM)

### 源码托管
- [https://gitee.com/thlws/payment-thl](https://gitee.com/thlws/payment-thl)
- [https://github.com/thlws/payment-thl](https://github.com/thlws/payment-thl)