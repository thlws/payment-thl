package org.thlws.sign;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;

import java.security.MessageDigest;

/**
 * MD5 签名
 * <p>
 * Created by HanleyTang on 2018/1/5
 *
 * @author Hanley[hanley @thlws.com]
 * @version 1.0
 */
public class MD5 {

    private static final Log log = LogFactory.get();

    /**
     * 签名得32位字符
     *
     * @param val the val
     * @return the string
     */
    public static String sign(String val){
        char hexDigits[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        try {
            byte[] btInput = val.getBytes();
            MessageDigest mdInst = MessageDigest.getInstance("MD5");
            mdInst.update(btInput);
            byte[] md = mdInst.digest();
            int j = md.length;
            char str[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);
        } catch (Exception e) {
            log.error("MD5 sign error:{}",e.getMessage());
            return null;
        }
    }

}
