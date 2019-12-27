package org.thlws.payment.wechat.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 公众号支付页面参数
 * Created by  HanleyTang on 2019-01-02
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MpPayment implements Serializable {

   private  String appId;
   private  String timeStamp;
   private  String nonceStr;
   private  String packageStr;
   private  String signType = "MD5";
   private  String paySign;
   private  String outTradeNo;

}
