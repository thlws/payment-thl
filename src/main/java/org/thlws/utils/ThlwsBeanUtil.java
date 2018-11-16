package org.thlws.utils;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.json.JSONUtil;
import com.google.gson.Gson;
import org.dom4j.DocumentHelper;
import org.dom4j.io.XMLWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.*;

/**
 * The type Data util.
 *
 * @author Hanley Tang | hanley@thlws.com
 * @version 1.0
 */
public class ThlwsBeanUtil {


	/**
	 * Object to Map (will ignore null properties)
	 *
	 * @param o the o
	 * @return map
	 * @author HanleyTang
	 */
	public static Map<String, Object> ObjectToMap(Object o){

		Map<String, Object> map = BeanUtil.beanToMap(o,false,true);
		return map;
	}


	/***
	 * 去除空值
	 * @param map the map
	 * @return map
	 * @author HanleyTang
	 */
	public static Map<String, Object> dataFilter(Map<String, Object> map) {

		Map<String, Object> result = new HashMap<String, Object>();
		if (map == null || map.size() <= 0)
			return result;
		for (String key : map.keySet()) {
			Object value = map.get(key);
			if (value == null || value.equals(""))
				continue;
			result.put(key, value);
		}

		return result;
	}


	/**
	 * 把数组所有元素排序，并按照“参数=参数值”的模式用 &amp; 字符拼接成字符串
	 *
	 * @param params 需要排序并参与字符拼接的参数组
	 * @return 拼接后字符串 string
	 */
	public static String createLinkString(Map<String, Object> params) {
        List<String> keys = new ArrayList<String>(params.keySet());
        Collections.sort(keys);
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            Object value = params.get(key);
            if (i == keys.size() - 1) {//拼接时，不包括最后一个&字符
                sb.append(key).append("=").append(value);
            } else {
                sb.append(key).append("=").append(value).append("&");
            }
        }
        return sb.toString();
    }


	/**
	 * map数据转换为GET URL后的参数
	 * @param mapData the map data
	 * @return string
	 * @author HanleyTang
	 */
	public static String mapToParams(Map<String,Object> mapData){
        StringBuffer sb = new StringBuffer();
        if(mapData.isEmpty()){
            return "" ;
        }else{
            for(String key: mapData.keySet()){
                String value = (String)mapData.get(key);
                if(sb.length()<1){
                    sb.append(key).append("=").append(value);
                }else{
                    sb.append("&").append(key).append("=").append(value);
                }
            }
            return sb.toString();
        }
    }


	/**
	 * Map to object object.
	 *
	 * @param map       the map
	 * @param beanClass the bean class
	 * @return the object
	 */
	public static Object mapToObject(Map<String, Object> map, Class<?> beanClass){

		Object obj = BeanUtil.mapToBean(map,beanClass,true);
		return obj;
	}


	/***
	 * generate MD5 text
	 * @param data the data
	 * @return md 5
	 * @author HanleyTang
	 */
	public static String getMD5(String data) {
  	   String s = null;
  	   char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };// 用来将字节转换成16进制表示的字符
  	   try {
  		   byte[] source = data.getBytes("UTF-8");
  		   java.security.MessageDigest md = java.security.MessageDigest .getInstance("MD5");
  		   md.update(source);
  		   byte tmp[] = md.digest();// MD5 的计算结果是一个 128 位的长整数，
  		   // 用字节表示就是 16 个字节
  		   char str[] = new char[16 * 2];
  		   // 每个字节用 16 进制表示的话，使用两个字符， 所以表示成 16
  		   // 进制需要 32 个字符
  		   int k = 0;
  		   // 表示转换结果中对应的字符位置
  		   for (int i = 0; i < 16; i++) {
  			   // 从第一个字节开始，对 MD5 的每一个字节
  			   // 转换成 16
  			   // 进制字符的转换
  			   byte byte0 = tmp[i];
  			   // 取第 i 个字节
  			   str[k++] = hexDigits[byte0 >>> 4 & 0xf];
  			   // 取字节中高 4 位的数字转换,// >>> // 为逻辑右移，将符号位一起右移
  			   str[k++] = hexDigits[byte0 & 0xf];
  			   // 取字节中低 4 位的数字转换
  		   }
  		   s = new String(str);
  		   // 换后的结果转换为字符串
  	   } catch (Exception e){
  		   //e.printStackTrace();
  	   }
  	   return s;
     }


	/***
	 * 随机数产生
	 * @param length 产生长度
	 * @return random string
	 * @author HanleyTang
	 */
	public static String getRandomString(int length) { //length表示生成字符串的长度
	    String base = "abcdefghijklmnopqrstuvwxyz0123456789";
	    Random random = new Random();
	    StringBuffer sb = new StringBuffer();
	    for (int i = 0; i < length; i++) {
	        int number = random.nextInt(base.length());
	        sb.append(base.charAt(number));
	    }
	    return sb.toString();
	 }


	/***
	 * 格式化XML
	 * @param xml
	 * @return
	 * @throws Exception
	 */
	public static String formatXml(String xml) throws Exception {
		org.dom4j.Document document = DocumentHelper.parseText(xml);
		org.dom4j.io.OutputFormat format = org.dom4j.io.OutputFormat.createPrettyPrint();
		format.setEncoding("utf-8");
		StringWriter writer = new StringWriter();
		XMLWriter xmlWriter = new XMLWriter(writer, format);
		xmlWriter.write(document);
		xmlWriter.close();

		return writer.toString();
	}



	/***
	 * bean to xml,调用此方便需在Bean配置相关Annotation
	 * @param clazz
	 * @param bean
	 * @return
	 * @throws JAXBException
	 */
	public static String beanToXml(Class clazz,Object bean) throws JAXBException {

		StringWriter writer = new StringWriter();;
		JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
		Marshaller marshaller = jaxbContext.createMarshaller();
		//默认为false表示含xml头部信息,true不包含
		marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
		marshaller.marshal(bean, writer);
		return writer.toString();
	}


	/***
	 * xml to bean,调用此方便需在Bean配置相关Annotation
	 * @param xml
	 * @param cls
	 * @param <T>
	 * @return
	 * @throws JAXBException
	 * @throws IOException
	 */
	public static <T> T xmlToBean(String xml,Class<T> cls) throws JAXBException {

		StringReader reader = new StringReader(xml);
		JAXBContext context = JAXBContext.newInstance(cls);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		return  (T)unmarshaller.unmarshal(reader);

	}


	/**
	 * 格式化JSON.
	 *
	 * @param o 任意对象
	 * @return 格式友好的 JSON String
	 */
	public static String formatJson(Object o){
		return JSONUtil.parse(o).toStringPretty();
	}

	/**
	 * 格式化JSON.
	 *
	 * @param jsonStr JSON格式字符串
	 * @return 格式友好的 JSON String
	 */
	public static String formatJson(String jsonStr){
		return JSONUtil.formatJsonStr(jsonStr);
	}



	public static <T> T jsonToBean(String json,Class<T> cls){

		Gson gson = new Gson();
		T t = gson.fromJson(json, cls);
		return t;
	}


	public static String beanToJson(Object o){
		Gson gson = new Gson();;
		String json = gson.toJson(o);
		return json;
	}

}
