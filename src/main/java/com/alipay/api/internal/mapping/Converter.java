package com.alipay.api.internal.mapping;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayRequest;
import com.alipay.api.AlipayResponse;
import com.alipay.api.Decryptor;
import com.alipay.api.SignItem;

/**
 * 动态格式转换器。
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public interface Converter {

    /**
     * 把字符串转换为响应对象。
     *
     * @param <T>   领域泛型
     * @param rsp   响应字符串
     * @param clazz 领域类型
     * @return 响应对象 t
     * @throws AlipayApiException the alipay api exception
     */
    public <T extends AlipayResponse> T toResponse(String rsp, Class<T> clazz)
                                                                              throws AlipayApiException;

    /**
     * 获取响应内的签名数据
     *
     * @param request      the request
     * @param responseBody the response body
     * @return sign item
     * @throws AlipayApiException the alipay api exception
     */
    public SignItem getSignItem(AlipayRequest<?> request, String responseBody)
                                                                              throws AlipayApiException;

    /**
     * 获取解密后的响应内的真实内容
     *
     * @param request     the request
     * @param body        the body
     * @param format      the format
     * @param decryptor   the decryptor
     * @param encryptType the encrypt type
     * @param charset     the charset
     * @return string
     * @throws AlipayApiException the alipay api exception
     */
    public String decryptSourceData(AlipayRequest<?> request, String body, String format,
                                    Decryptor decryptor, String encryptType, String charset)
            throws AlipayApiException;

}
