package org.thlws.payment.wechat.entity;

import cn.hutool.core.util.StrUtil;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;

/***
 * API请求结果
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class WechatResponse implements Serializable {

    /**返回状态码*/
    @XmlElement(name="return_code")
    private String returnCode;

    /**返回信息*/
    @XmlElement(name="return_msg")
    private String returnMsg ;

    /**业务结果*/
    @XmlElement(name="result_code")
    private String resultCode;

    /**错误代码*/
    @XmlElement(name="err_code")
    private String errCode;

    /**错误代码描述*/
    @XmlElement(name="err_code_des")
    private String errCodeDes;


    /**
     * Gets message.
     *
     * @return the message
     */
    public String getMessage() {
        return isSuccess() ? returnMsg:errCode+","+errCodeDes;
    }


    /**
     * Is success boolean.
     *
     * @return the boolean
     */
    public boolean isSuccess() {
        return StrUtil.equalsIgnoreCase(returnCode,resultCode) && StrUtil.equals("SUCCESS",resultCode);
    }

    /**
     * Gets return code.
     *
     * @return the return code
     */
    public String getReturnCode() {
        return returnCode;
    }

    /**
     * Sets return code.
     *
     * @param returnCode the return code
     */
    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    /**
     * Gets return msg.
     *
     * @return the return msg
     */
    public String getReturnMsg() {
        return returnMsg;
    }

    /**
     * Sets return msg.
     *
     * @param returnMsg the return msg
     */
    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }

    /**
     * Gets result code.
     *
     * @return the result code
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * Sets result code.
     *
     * @param resultCode the result code
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    /**
     * Gets err code.
     *
     * @return the err code
     */
    public String getErrCode() {
        return errCode;
    }

    /**
     * Sets err code.
     *
     * @param errCode the err code
     */
    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    /**
     * Gets err code des.
     *
     * @return the err code des
     */
    public String getErrCodeDes() {
        return errCodeDes;
    }

    /**
     * Sets err code des.
     *
     * @param errCodeDes the err code des
     */
    public void setErrCodeDes(String errCodeDes) {
        this.errCodeDes = errCodeDes;
    }
}
