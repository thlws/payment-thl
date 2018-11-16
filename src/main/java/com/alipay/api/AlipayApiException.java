/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2012 All Rights Reserved.
 */
package com.alipay.api;


/**
 * The type Alipay api exception.
 *
 * @author runzhi
 */
public class AlipayApiException extends Exception {

    private static final long serialVersionUID = -238091758285157331L;

    private String            errCode;
    private String            errMsg;

    /**
     * Instantiates a new Alipay api exception.
     */
    public AlipayApiException() {
        super();
    }

    /**
     * Instantiates a new Alipay api exception.
     *
     * @param message the message
     * @param cause   the cause
     */
    public AlipayApiException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Instantiates a new Alipay api exception.
     *
     * @param message the message
     */
    public AlipayApiException(String message) {
        super(message);
    }

    /**
     * Instantiates a new Alipay api exception.
     *
     * @param cause the cause
     */
    public AlipayApiException(Throwable cause) {
        super(cause);
    }

    /**
     * Instantiates a new Alipay api exception.
     *
     * @param errCode the err code
     * @param errMsg  the err msg
     */
    public AlipayApiException(String errCode, String errMsg) {
        super(errCode + ":" + errMsg);
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    /**
     * Gets err code.
     *
     * @return the err code
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * Gets err msg.
     *
     * @return the err msg
     */
    public String getErrMsg() {
        return this.errMsg;
    }

}