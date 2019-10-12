package com.alipay.trade.utils;

import org.apache.commons.lang.StringUtils;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by liuyangkly on 15/6/27.
 * 杂物工具类
 */
public class Utils {

    private Utils() {
        // No instances.
    }

    /**
     * To amount string.
     *
     * @param amount the amount
     * @return the string
     */
    public static String toAmount(long amount) {
        return new BigDecimal(amount).divide(new BigDecimal(100)).toString();
    }

    /**
     * To date string.
     *
     * @param date the date
     * @return the string
     */
    public static String toDate(Date date) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
    }

    /**
     * Is empty boolean.
     *
     * @param object the object
     * @return the boolean
     */
    public static boolean isEmpty(Object object) {
        if (object instanceof String) {
            return StringUtils.isEmpty((String) object);
        }
        return object == null;
    }

    /**
     * Is not empty boolean.
     *
     * @param object the object
     * @return the boolean
     */
    public static boolean isNotEmpty(Object object) {
        return !isEmpty(object);
    }

    /**
     * Is list not empty boolean.
     *
     * @param <T>  the type parameter
     * @param list the list
     * @return the boolean
     */
    public static <T> boolean isListNotEmpty(List<T> list) {
        return list != null && list.size() > 0;
    }

    /**
     * Is list empty boolean.
     *
     * @param <T>  the type parameter
     * @param list the list
     * @return the boolean
     */
    public static <T> boolean isListEmpty(List<T> list) {
        return !isListNotEmpty(list);
    }

    /**
     * Sleep.
     *
     * @param time the time
     */
    public static void sleep(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
