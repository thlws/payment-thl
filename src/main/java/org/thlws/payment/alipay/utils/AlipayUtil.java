package org.thlws.payment.alipay.utils;

import org.thlws.payment.alipay.entity.response.AlipayNotifyResponse;
import org.thlws.sign.RSA;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/***
 * 支付宝通知处理类,处理支付宝各接口通知返回
 */
public class AlipayUtil {

    /**
     * 支付宝消息验证地址
     */
    private static final String HTTPS_VERIFY_URL = "https://mapi.alipay.com/gateway.do?service=notify_verify&";

    public AlipayNotifyResponse verify(HttpServletRequest alipayRequest, String partner, String alipayPublicKey){
        AlipayNotifyResponse output = new AlipayNotifyResponse();
        try {
            //获取支付宝POST过来反馈信息
            Map<String,String> params = new HashMap<String,String>();
            Map requestParams = alipayRequest.getParameterMap();
            for (Iterator iter = requestParams.keySet().iterator(); iter.hasNext();) {
                String name = (String) iter.next();
                String[] values = (String[]) requestParams.get(name);
                String valueStr = "";
                for (int i = 0; i < values.length; i++) {
                    valueStr = (i == values.length - 1) ? valueStr + values[i]
                            : valueStr + values[i] + ",";
                }
                //乱码解决，这段代码在出现乱码时使用。如果mysign和sign不相等也可以使用这段代码转化 'valueStr = new String(valueStr.getBytes("ISO-8859-1"), "gbk")'
                params.put(name, valueStr);
            }
            String outTradeNo = new String(alipayRequest.getParameter("out_trade_no").getBytes("ISO-8859-1"),"UTF-8");
            String tradeNo = new String(alipayRequest.getParameter("trade_no").getBytes("ISO-8859-1"),"UTF-8");
            String tradeStatus = new String(alipayRequest.getParameter("trade_status").getBytes("ISO-8859-1"),"UTF-8");
            boolean verifyFlg = verify(params,partner,alipayPublicKey);
            output.setVerifyFlg(verifyFlg);
            output.setOutTradeNo(outTradeNo);
            output.setTradeNo(tradeNo);
            output.setTradeStatus(tradeStatus);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return output;

    }


    /**
     * 验证消息是否是支付宝发出的合法消息
     * @param params 通知返回来的参数数组
     * @return 验证结果
     */
    private static boolean verify(Map<String, String> params,String partner,String alipayPublicKey) {

        //判断responsetTxt是否为true，isSign是否为true
        //responsetTxt的结果不是true，与服务器设置问题、合作身份者ID、notify_id一分钟失效有关
        //isSign不是true，与安全校验码、请求时的参数格式（如：带自定义参数等）、编码格式有关
    	String responseTxt = "false";
		if(params.get("notify_id") != null) {
			String notifyId = params.get("notify_id");
			responseTxt = verifyResponse(notifyId,partner);
		}
	    String sign = "";
	    if(params.get("sign") != null) {sign = params.get("sign");}
	    boolean isSign = getSignVeryfy(params, sign,alipayPublicKey);

        //写日志记录（若要调试，请取消下面两行注释）
        //String sWord = "responseTxt=" + responseTxt + "\n isSign=" + isSign + "\n 返回回来的参数：" + AlipayCore.createLinkString(params);
	    //AlipayCore.logResult(sWord);

        if (isSign && responseTxt.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 根据反馈回来的信息，生成签名结果
     * @param params 通知返回来的参数数组
     * @param sign 比对的签名结果
     * @return 生成的签名结果
     */
	private static boolean getSignVeryfy(Map<String, String> params, String sign,String alipayPublicKey) {
    	//过滤空值、sign与sign_type参数
    	Map<String, String> sParaNew = VeryfyUtil.paraFilter(params);
        //获取待签名字符串
        String preSignStr = VeryfyUtil.createLinkString(sParaNew);
        //获得签名验证结果
        boolean isSign = false;
        //if(AlipayConfig.sign_type.equals("RSA")){
            //这里判断是否需要RSA验证签名 TODO
        	isSign = RSA.verify(preSignStr, sign, alipayPublicKey, "utf-8");
        //}
        return isSign;
    }

    /**
    * 获取远程服务器ATN结果,验证返回URL
    * @param notifyId 通知校验ID
    * @param partner    合作者ID
    * @return 服务器ATN结果
    * 验证结果集：
    * invalid命令参数不对 出现这个错误，请检测返回处理中partner和key是否为空 
    * true 返回正确信息
    * false 请检查防火墙或者是服务器阻止端口问题以及验证时间是否超过一分钟
    */
    private static String verifyResponse(String notifyId,String partner) {
        //获取远程服务器ATN结果，验证是否是支付宝服务器发来的请求

        String veryfyUrl = HTTPS_VERIFY_URL + "partner=" + partner + "&notify_id=" + notifyId;

        return checkUrl(veryfyUrl);
    }

    /**
    * 获取远程服务器ATN结果
    * @param urlValue 指定URL路径地址
    * @return 服务器ATN结果
    * 验证结果集：
    * invalid命令参数不对 出现这个错误，请检测返回处理中partner和key是否为空 
    * true 返回正确信息
    * false 请检查防火墙或者是服务器阻止端口问题以及验证时间是否超过一分钟
    */
    private static String checkUrl(String urlValue) {
        String inputLine;

        try {
            URL url = new URL(urlValue);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(urlConnection
                .getInputStream()));
            inputLine = in.readLine().toString();
        } catch (Exception e) {
            e.printStackTrace();
            inputLine = "";
        }

        return inputLine;
    }
}
