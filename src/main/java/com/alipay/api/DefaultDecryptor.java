/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.alipay.api;

import com.alipay.api.internal.util.AlipayEncrypt;

/**
 * The type Default decryptor.
 *
 * @author liuqun.lq
 * @version $Id : DefaultDecryptor.java, v 0.1 2018年07月03日 12:35 liuqun.lq Exp $
 */
public class DefaultDecryptor implements Decryptor {

    private String encryptKey;

    /**
     * Instantiates a new Default decryptor.
     *
     * @param encryptKey the encrypt key
     */
    public DefaultDecryptor(String encryptKey) {
        this.encryptKey = encryptKey;
    }

    public String decrypt(String encryptContent, String encryptType, String charset) {
        String decryptContent = null;
        try {
            decryptContent = AlipayEncrypt.decryptContent(encryptContent, encryptType,
                    encryptKey, charset);
        } catch (AlipayApiException e) {
            throw new RuntimeException(e);
        }
        return decryptContent;
    }

    /**
     * Getter method for property <tt>encryptKey</tt>.
     *
     * @return property value of encryptKey
     */
    public String getEncryptKey() {
        return encryptKey;
    }

    /**
     * Setter method for property <tt>encryptKey</tt>.
     *
     * @param encryptKey value to be assigned to property encryptKey
     */
    public void setEncryptKey(String encryptKey) {
        this.encryptKey = encryptKey;
    }
}