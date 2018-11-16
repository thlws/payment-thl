package org.thlws.payment.wechat.entity.response;

import org.thlws.payment.wechat.entity.WechatResponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The type Micro mch response.
 *
 * @author Hanley Tang | hanley@hanley.cn
 * @version 1.0
 */
@XmlRootElement(name="xml")
@XmlAccessorType(XmlAccessType.FIELD)
public class MicroMchResponse extends WechatResponse {

	@XmlElement(name="mch_id")
	private String mchId      ;

	@XmlElement(name="sign")
	private String sign        ;

	@XmlElement(name="micro_mch_id")
	private String microMchId ;	//result_code 为 SUCCESS 的时候有返回


	public String getMchId() {
		return mchId;
	}

	public void setMchId(String mchId) {
		this.mchId = mchId;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getMicroMchId() {
		return microMchId;
	}

	public void setMicroMchId(String microMchId) {
		this.microMchId = microMchId;
	}
}
