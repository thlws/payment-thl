package org.thlws.payment.bestpay;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import org.junit.Test;
import org.thlws.payment.BestPayClient;
import org.thlws.payment.bestpay.entity.request.BarcodePayRequest;
import org.thlws.payment.bestpay.entity.request.OrderRefundRequest;
import org.thlws.payment.bestpay.entity.request.OrderReverseRequest;
import org.thlws.payment.bestpay.entity.request.QueryOrderRequest;
import org.thlws.payment.bestpay.entity.response.OrderRefundResponse;
import org.thlws.payment.bestpay.entity.response.OrderResultResponse;
import org.thlws.payment.bestpay.entity.response.OrderReverseResponse;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * 电信天翼支付测试
 * <h3>特别注意</h3>
 * 项目中提供的微信测试账户，仅用于接口功能测试，请勿用作其他用途。
 *
 * @author Hanley[hanley @thlws.com]
 * @version 1.0
 *  2018 /11/16
 */
public class BestpayTest {

	private static final Log log = LogFactory.get();

	/**商户数据 KEY*/
	private final  String key = "E20356A94DA4E83810993FD14C10657F3120F1EDA1C43BF7";

	/**商户退款密码(又称 交易key)*/
	private final  String merchantPwd = "946476";

	/**商户号*/
	private final  String merchantId = "02450107030126669";


    /**
     * 支付-测试.
     */
    @Test
	public  void testPay() {

		try {
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
			
			assertTrue(response.isPaySuccess());
		} catch (Exception e) {
			log.error(e);
		}

	}


    /**
     * 查询交易-测试.
     */
    @Test
	public  void testQuery() {
		try {
			QueryOrderRequest request = new QueryOrderRequest();
			request.setMerchantId(merchantId);
			request.setOrderNo("5241085967971143");
			request.setOrderReqNo("5241085967971143");
			request.setOrderDate("20171224121212");

			OrderResultResponse response = BestPayClient.query(request, key);
			assertNotNull(response);
		} catch (Exception e) {
			log.error(e);
		}
	}

    /**
     * 撤销支付-测试.
     */
    @Test
	public  void testReverse() {

		try {
			OrderReverseRequest request = new OrderReverseRequest();
			request.setMerchantId(merchantId);
			request.setMerchantPwd(merchantPwd);
			request.setOldOrderNo("5241085967971143");
			request.setOldOrderReqNo("5241085967971143");
			request.setRefundReqNo(RandomUtil.randomNumbers(16));
			request.setRefundReqDate("20171224");
			request.setTransAmt("1");

			OrderReverseResponse response = BestPayClient.reverse(request, key);
			assertNotNull(response.getResult());
		} catch (Exception e) {
			log.error(e);
		}
	}


    /**
     * 退款-测试.
     */
    @Test
	public  void testRefund() {
		try {
			OrderRefundRequest request = new OrderRefundRequest();
			request.setMerchantId("02450107030126669");
			request.setOldOrderNo("5241085967971143");
			request.setOldOrderReqNo("5241085967971143");
			request.setMerchantPwd(merchantPwd);
			request.setRefundReqDate("20171224");
			request.setRefundReqNo(RandomUtil.randomNumbers(16));
			request.setTransAmt("1");

			OrderRefundResponse response = BestPayClient.refund(request, key);
			assertNotNull(response.getResult());
		} catch (Exception e) {
			log.error(e);
		}
	}


}
