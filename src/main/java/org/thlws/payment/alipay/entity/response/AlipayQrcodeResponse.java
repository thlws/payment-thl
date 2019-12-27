package org.thlws.payment.alipay.entity.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.thlws.utils.JsonUtil;

import java.io.Serializable;

/**
 * 支付宝扫码支付Response Bean,用户打开支付宝APP扫描Qrcode
 *
 * @author Hanley Tang
 * @version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AlipayQrcodeResponse implements Serializable{

	private String outTradeNo;
	private String qrCode;
	private boolean isSuccess;
	private String desc;
	private String              subCode;
	private String              subMsg;
	private String              code;
	private String              msg;


	@Override
	public String toString() {
		return JsonUtil.format(this);
	}
}
