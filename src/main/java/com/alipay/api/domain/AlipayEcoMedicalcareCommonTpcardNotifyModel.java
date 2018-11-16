package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 医疗行业通用消息通知
 *
 * @author auto create
 * @since 1.0, 2016-11-16 15:16:21
 */
public class AlipayEcoMedicalcareCommonTpcardNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 7837518496513149142L;

	/**
	 * 模板样式信息中的底部动作
	 */
	@ApiListField("action_info")
	@ApiField("medical_sv_tp_card_action_info")
	private List<MedicalSvTpCardActionInfo> actionInfo;

	/**
	 * 模板样式信息中的内容信息
	 */
	@ApiListField("body_info")
	@ApiField("medical_sv_tp_card_body_info")
	private List<MedicalSvTpCardBodyInfo> bodyInfo;

	/**
	 * 业务扩展参数json格式
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 模板样式信息中的头部信息
	 */
	@ApiField("header_info")
	private MedicalSvTpCardHeadInfo headerInfo;

	/**
	 * 通知时间
注意：通知时间确定card即时显示还是预定未来某个时间显示
通知时间不能早于当前时间
	 */
	@ApiField("notify_time")
	private String notifyTime;

	/**
	 * 操作类型：
CREATE_UPDATE表示创建并更新通知信息；
DELETE表示删除通知信息
	 */
	@ApiField("operate")
	private String operate;

	/**
	 * 通知业务模板样式编码，根据业务增加会增加模板类型
sv_remind_reg	预约挂号
sv_remind_clinic	诊间缴费
sv_remind_answer	问诊首次答复
sv_remind_report	报告已出
sv_remind_vaccine	疫苗接种
sv_app_doctors_say	名医说
	 */
	@ApiField("template_code")
	private String templateCode;

	/**
	 * 第三方唯一序列号，创建后不能修改，需要保证在商户端不重复。
	 */
	@ApiField("third_no")
	private String thirdNo;

	/**
	 * 支付宝用户ID,可以通过 获取会员信息产品 获取支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets action info.
     *
     * @return the action info
     */
    public List<MedicalSvTpCardActionInfo> getActionInfo() {
		return this.actionInfo;
	}

    /**
     * Sets action info.
     *
     * @param actionInfo the action info
     */
    public void setActionInfo(List<MedicalSvTpCardActionInfo> actionInfo) {
		this.actionInfo = actionInfo;
	}

    /**
     * Gets body info.
     *
     * @return the body info
     */
    public List<MedicalSvTpCardBodyInfo> getBodyInfo() {
		return this.bodyInfo;
	}

    /**
     * Sets body info.
     *
     * @param bodyInfo the body info
     */
    public void setBodyInfo(List<MedicalSvTpCardBodyInfo> bodyInfo) {
		this.bodyInfo = bodyInfo;
	}

    /**
     * Gets extend params.
     *
     * @return the extend params
     */
    public String getExtendParams() {
		return this.extendParams;
	}

    /**
     * Sets extend params.
     *
     * @param extendParams the extend params
     */
    public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

    /**
     * Gets header info.
     *
     * @return the header info
     */
    public MedicalSvTpCardHeadInfo getHeaderInfo() {
		return this.headerInfo;
	}

    /**
     * Sets header info.
     *
     * @param headerInfo the header info
     */
    public void setHeaderInfo(MedicalSvTpCardHeadInfo headerInfo) {
		this.headerInfo = headerInfo;
	}

    /**
     * Gets notify time.
     *
     * @return the notify time
     */
    public String getNotifyTime() {
		return this.notifyTime;
	}

    /**
     * Sets notify time.
     *
     * @param notifyTime the notify time
     */
    public void setNotifyTime(String notifyTime) {
		this.notifyTime = notifyTime;
	}

    /**
     * Gets operate.
     *
     * @return the operate
     */
    public String getOperate() {
		return this.operate;
	}

    /**
     * Sets operate.
     *
     * @param operate the operate
     */
    public void setOperate(String operate) {
		this.operate = operate;
	}

    /**
     * Gets template code.
     *
     * @return the template code
     */
    public String getTemplateCode() {
		return this.templateCode;
	}

    /**
     * Sets template code.
     *
     * @param templateCode the template code
     */
    public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

    /**
     * Gets third no.
     *
     * @return the third no
     */
    public String getThirdNo() {
		return this.thirdNo;
	}

    /**
     * Sets third no.
     *
     * @param thirdNo the third no
     */
    public void setThirdNo(String thirdNo) {
		this.thirdNo = thirdNo;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId() {
		return this.userId;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

}
