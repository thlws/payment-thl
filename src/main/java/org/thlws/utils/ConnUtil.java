package org.thlws.utils;

import java.io.*;
import java.security.KeyStore;

import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLSocketFactory;

import cn.hutool.http.HttpUtil;
import cn.hutool.http.Method;
import cn.hutool.http.ssl.SSLSocketFactoryBuilder;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import org.thlws.payment.wechat.config.WechatConfig;


/**
 * The type Conn util.
 */
public final class ConnUtil {

	private static final Log log = LogFactory.get();
	
	private static final int CONNECTION_TIMEOUT = 1000*10;

	private static final int SOCKET_TIMEOUT = 1000*10;

	private static final int CONNECTION_REQUEST_TIMEOUT = 1000 * 30;

	/**
	 * Conn remote string.
	 *
	 * @param request the request
	 * @param url     the url
	 * @return the string
	 * @throws Exception the exception
	 */
	public static String connRemote(String request,String url) throws Exception {
		String result = "";
		try {
			result = connRemoteWithJson(result,url);
		} catch (Exception e) {
			log.error("connRemote error: {}",e.getMessage());
			throw new Exception(e.getMessage());
		}
		return result;
	}


	/**
	 * Conn remote with json string.
	 *
	 * @param json the json
	 * @param url  the url
	 * @return the string
	 * @throws Exception the exception
	 */
	public static String connRemoteWithJson(String json,String url) throws Exception {

		String result = "";
		try {
			result = HttpUtil.createRequest(Method.POST,url)
					.body(json,"application/json;charset=UTF-8")
					.execute().body();

		} catch (Exception e) {
			log.error("connRemoteWithJson error:{} ",e.getMessage());
			throw new Exception(e.getMessage());
		}

		return result;
	}


	/**
	 * Conn remote with xml string.
	 *
	 * @param xml the xml
	 * @param url the url
	 * @return the string
	 * @throws Exception the exception
	 */
	public static String connRemoteWithXml(String xml,String url) throws Exception {

		String result;
		try {
			result = HttpUtil.createRequest(Method.POST,url)
					.body(xml,"text/xml;charset=UTF-8")
					.execute().body();
		} catch (Exception e) {
			log.error("connRemoteWithXml error: {}",e.getMessage());
			throw new Exception(e.getMessage());
		}

		return result;
	}


	/**
	 * Encrypt post string.
	 *
	 * @param data         the data
	 * @param url          the url
	 * @param pwd          the pwd
	 * @param absoluteFile the absolute file
	 * @return the string
	 */
	public static String encryptPost(String data,String url,String pwd,String absoluteFile){

		log.debug("请求网关："+url);
		log.debug("证书号："+pwd);
		log.debug("p12本地文件保存地址："+absoluteFile);
		
		String result;
		
		try {
			File p12File = new File(absoluteFile);
			if(!p12File.exists()){
				log.error("p12文件不存在,请检查路径下是否存在p12:"+absoluteFile);
				throw new Exception("p12文件不存在,请检查路径下是否存在p12:"+absoluteFile);
			}
			
			//读取证书，初始化http相关参数
			KeyStore keyStore  = KeyStore.getInstance(WechatConfig.PKCS12);
			FileInputStream instream = new FileInputStream(new File(absoluteFile));
			try {
				keyStore.load(instream, pwd.toCharArray());
			} finally {
				instream.close();
			}

			// 实例化密钥库 & 初始化密钥工厂
			KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
			kmf.init(keyStore, pwd.toCharArray());
			KeyManager[] keyManagers = kmf.getKeyManagers();

			SSLSocketFactoryBuilder sslBuilder = SSLSocketFactoryBuilder.create();
			SSLSocketFactory ssf = sslBuilder.setKeyManagers(keyManagers).build();

			result = cn.hutool.http.HttpRequest.post(url)
					.body(data, "text/xml;charset=UTF-8")
					.setSSLSocketFactory(ssf)
					.execute()
					.body();

		} catch (Exception e) {
			result = e.getMessage();
			log.error("encryptPost error:{}",e.getMessage());
		}
		
		return result;
	}
	
	
	public static String connURL(String url) throws Exception {
		String result;
		try {
			result =  HttpUtil.get(url);
		} catch (Exception e) {
			log.error("connURL error:{} ",e.getMessage());
			throw new Exception(e.getMessage());
		}
		return result;
	}


}