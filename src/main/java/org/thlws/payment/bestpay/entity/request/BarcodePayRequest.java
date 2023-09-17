package org.thlws.payment.bestpay.entity.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 电信天翼支付参数对象
 * Created by HanleyTang on 2018/1/5
 *
 * @author Hanley[hanley @thlws.com]
 * @version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BarcodePayRequest {

	/**商户号	(必填)	length=30*/
	private String merchantId;
	
	/**子商户号	length=30*/
	private String subMerchantId;
	
	/**条形码号(必填)	 length=30*/
	private String barcode;
	
	/**订单号	(必填) length=30*/
	private String orderNo;
	
	/**订单请求交 易流水号(必填),由商户平台提供，支持纯数字、纯字母、字 母+数字组成，与订单号一致 （如果需要使 用条码退款业务，流水号必须为偶数位）*/
	private String orderReqNo;
	
	/**渠道(必填),默认填：05*/
	private String channel = "05";
	
	/**业务类型(必填), 默认填：0000001*/
	private String busiType = "0000001";
	
	/**订单日期(必填),由商户提供，长度14位，格式 yyyyMMddhhmmss (说明：该时间必须为 24小时制)*/
	private String orderDate;
	
	/**订单总金额(必填),length=10 单位：分。订单总金额 = 产品金额+附加金 额*/
	private String orderAmt;
	
	/**产品金额(必填), length=10*/
	private String productAmt;
	
	/**附加金额(必填),length=10*/
	private String attachAmt = "0";
	
	/**商品名称(必填),length=256*/
	private String goodsName;
	
	/**门店号(必填),length=10*/
	private String storeId;
	
	/**后台返回地址,商户提供的用于异步接收交易返回结果的后 台url，若不需要后台返回，可不填，若需要 后台返回，请保障地址可用*/
	private String backUrl;
	
	/**分账信息,length=256*/
	private String ledgerDetail;
	
	/**附加信息,length=128*/
	private String attach;
	
	/**MAC校验域(必填),采用标准的MD5算法，由商户实现， MD5 加密获得32位大写字符,无需调用者设值,依赖库会自动设置*/
	private String mac;
	
	/**商户自定义 终端号*/
	private String mchntTmNum;
	
	/**设备终端号*/
	private String deviceTmNum;

	
	
}
