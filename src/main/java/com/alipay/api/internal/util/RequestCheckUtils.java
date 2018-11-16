package com.alipay.api.internal.util;

import java.io.IOException;

import com.alipay.api.AlipayApiException;
import com.alipay.api.FileItem;

/**
 * The type Request check utils.
 */
public class RequestCheckUtils {
    /**
     * The constant ERROR_CODE_ARGUMENTS_MISS.
     */
    public static final String ERROR_CODE_ARGUMENTS_MISS    = "40001"; //Missing Required Arguments
    /**
     * The constant ERROR_CODE_ARGUMENTS_INVALID.
     */
    public static final String ERROR_CODE_ARGUMENTS_INVALID = "40002"; //Invalid Arguments

    /**
     * Check not empty.
     *
     * @param value     the value
     * @param fieldName the field name
     * @throws AlipayApiException the alipay api exception
     */
    public static void checkNotEmpty(Object value, String fieldName) throws AlipayApiException {
		if(value==null){
            throw new AlipayApiException(ERROR_CODE_ARGUMENTS_MISS,
                "client-error:Missing Required Arguments:" + fieldName + "");
		}
		if(value instanceof String){
			if(((String) value).trim().length()==0){
                throw new AlipayApiException(ERROR_CODE_ARGUMENTS_MISS,
                    "client-error:Missing Required Arguments:" + fieldName + "");
			}
		}
	}

    /**
     * Check max length.
     *
     * @param value     the value
     * @param maxLength the max length
     * @param fieldName the field name
     * @throws AlipayApiException the alipay api exception
     */
    public static void checkMaxLength(String value, int maxLength, String fieldName)
                                                                                    throws AlipayApiException {
		if(value!=null){
			if(value.length()>maxLength){
                throw new AlipayApiException(ERROR_CODE_ARGUMENTS_INVALID,
                    "client-error:Invalid Arguments:the length of " + fieldName
                            + " can not be larger than " + maxLength + ".");
			}
		}
	}

    /**
     * Check max length.
     *
     * @param fileItem  the file item
     * @param maxLength the max length
     * @param fieldName the field name
     * @throws AlipayApiException the alipay api exception
     */
    public static void checkMaxLength(FileItem fileItem, int maxLength, String fieldName)
                                                                                         throws AlipayApiException {
		try {
			if(fileItem!=null&&fileItem.getContent()!=null){
				
				if(fileItem.getContent().length>maxLength){
                    throw new AlipayApiException(ERROR_CODE_ARGUMENTS_INVALID,
                        "client-error:Invalid Arguments:the length of " + fieldName
                                + " can not be larger than " + maxLength + ".");
				}
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

    /**
     * Check max list size.
     *
     * @param value     the value
     * @param maxSize   the max size
     * @param fieldName the field name
     * @throws AlipayApiException the alipay api exception
     */
    public static void checkMaxListSize(String value, int maxSize, String fieldName)
                                                                                    throws AlipayApiException {
		if(value!=null){
			String[] list=value.split(",");
			if(list!=null&&list.length>maxSize){
                throw new AlipayApiException(ERROR_CODE_ARGUMENTS_INVALID,
                    "client-error:Invalid Arguments:the listsize(the string split by \",\") of "
                            + fieldName + " must be less than " + maxSize + ".");
			}
		}
	}

    /**
     * Check max value.
     *
     * @param value     the value
     * @param maxValue  the max value
     * @param fieldName the field name
     * @throws AlipayApiException the alipay api exception
     */
    public static void checkMaxValue(Long value, long maxValue, String fieldName)
                                                                                 throws AlipayApiException {
		if(value!=null){
			if(value>maxValue){
                throw new AlipayApiException(ERROR_CODE_ARGUMENTS_INVALID,
                    "client-error:Invalid Arguments:the value of " + fieldName
                            + " can not be larger than " + maxValue + ".");
			}
		}
	}

    /**
     * Check min value.
     *
     * @param value     the value
     * @param minValue  the min value
     * @param fieldName the field name
     * @throws AlipayApiException the alipay api exception
     */
    public static void checkMinValue(Long value, long minValue, String fieldName)
                                                                                 throws AlipayApiException {
		if(value!=null){
			if(value<minValue){
                throw new AlipayApiException(ERROR_CODE_ARGUMENTS_INVALID,
                    "client-error:Invalid Arguments:the value of " + fieldName
                            + " can not be less than " + minValue + ".");
			}
		}
	}
}
