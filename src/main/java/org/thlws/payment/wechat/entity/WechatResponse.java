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


    public String getMessage() {
        return isSuccess() ? returnMsg:errCode+","+errCodeDes;
    }


    public boolean isSuccess() {
        return StrUtil.equalsIgnoreCase(returnCode,resultCode) && StrUtil.equals("SUCCESS",resultCode);
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMsg() {
        return returnMsg;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getErrCodeDes() {
        return errCodeDes;
    }

    public void setErrCodeDes(String errCodeDes) {
        this.errCodeDes = errCodeDes;
    }
}
