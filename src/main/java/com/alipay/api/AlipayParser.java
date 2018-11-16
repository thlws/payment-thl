package com.alipay.api;

/**
 * 响应解释器接口。响应格式可以是JSON, XML等等。
 *
 * @param <T> the type parameter
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public interface AlipayParser<T extends AlipayResponse> {

    /**
     * 把响应字符串解释成相应的领域对象。
     *
     * @param rsp 响应字符串
     * @return 领域对象 t
     * @throws AlipayApiException the alipay api exception
     */
    public T parse(String rsp) throws AlipayApiException;

    /**
     * 获取响应类类型。
     *
     * @return the response class
     * @throws AlipayApiException the alipay api exception
     */
    public Class<T> getResponseClass() throws AlipayApiException;

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
     * 获取实际串：如果是加密内容则返回内容已经是解密后的实际内容了
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
