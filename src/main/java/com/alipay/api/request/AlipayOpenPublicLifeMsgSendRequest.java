package com.alipay.api.request;

import java.util.List;
import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayOpenPublicLifeMsgSendResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.open.public.life.msg.send request
 *
 * @author auto create
 * @since 1.0, 2018-04-17 14:24:09
 */
public class AlipayOpenPublicLifeMsgSendRequest implements AlipayUploadRequest<AlipayOpenPublicLifeMsgSendResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 消息分类，请传入对应分类编码值
	 */
	private String category;

	/** 
	* 消息正文，html原文或纯文本
	 */
	private String content;

	/** 
	* 消息背景图片（目前支持格式jpg, jpeg, bmp），需上传图片原始二进制流，图片最大1MB
	 */
	private FileItem cover;

	/** 
	* 消息概述
	 */
	private String desc;

	/** 
	* 媒体资讯类生活号消息类型
	 */
	private String msgType;

	/** 
	* 消息来源方附属信息，供搜索、推荐使用
publish_time（int）：消息发布时间，单位秒
keyword_list（String）: 文章的标签列表，英文逗号分隔
comment（int）：消息来源处评论次数
reward（int）：消息来源处打赏次数
is_recommended（boolean）：消息在来源处是否被推荐
is_news（boolean）：消息是否实时性内容
read（int）：消息在来源处被阅读次数
like（int）：消息在来源处被点赞次数
is_hot（boolean）：消息在来源平台是否是热门内容
share（int）：文章在来源平台的分享次数
deadline（int）：文章的失效时间，单位秒
	 */
	private String sourceExtInfo;

	/** 
	* 消息标题
	 */
	private String title;

	/** 
	* 来源方消息唯一标识；若不为空，根据此id和生活号id对消息去重；若为空，不去重
	 */
	private String uniqueMsgId;

	/** 
	* 生活号消息视频时长，单位：秒（视频类消息必填）
	 */
	private String videoLength;

	/** 
	* 视频类型消息中视频抽样关键帧截图，视频类消息选填
	 */
	private List<String> videoSamples;

	/** 
	* 视频大小，单位：KB（视频类消息必填）
	 */
	private String videoSize;

	/** 
	* 视频资源来源id（视频类消息必填），取值限定youku, miaopai, taobao, sina中的一个
	 */
	private String videoSource;

	/** 
	* 视频的临时链接（优酷来源的视频消息，该字段不能为空）
	 */
	private String videoTemporaryUrl;

	/** 
	* 生活号视频类消息视频id或url（视频类消息必填，根据来源区分）
	 */
	private String videoUrl;

    /**
     * Sets category.
     *
     * @param category the category
     */
    public void setCategory(String category) {
		this.category = category;
	}

    /**
     * Gets category.
     *
     * @return the category
     */
    public String getCategory() {
		return this.category;
	}

    /**
     * Sets content.
     *
     * @param content the content
     */
    public void setContent(String content) {
		this.content = content;
	}

    /**
     * Gets content.
     *
     * @return the content
     */
    public String getContent() {
		return this.content;
	}

    /**
     * Sets cover.
     *
     * @param cover the cover
     */
    public void setCover(FileItem cover) {
		this.cover = cover;
	}

    /**
     * Gets cover.
     *
     * @return the cover
     */
    public FileItem getCover() {
		return this.cover;
	}

    /**
     * Sets desc.
     *
     * @param desc the desc
     */
    public void setDesc(String desc) {
		this.desc = desc;
	}

    /**
     * Gets desc.
     *
     * @return the desc
     */
    public String getDesc() {
		return this.desc;
	}

    /**
     * Sets msg type.
     *
     * @param msgType the msg type
     */
    public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

    /**
     * Gets msg type.
     *
     * @return the msg type
     */
    public String getMsgType() {
		return this.msgType;
	}

    /**
     * Sets source ext info.
     *
     * @param sourceExtInfo the source ext info
     */
    public void setSourceExtInfo(String sourceExtInfo) {
		this.sourceExtInfo = sourceExtInfo;
	}

    /**
     * Gets source ext info.
     *
     * @return the source ext info
     */
    public String getSourceExtInfo() {
		return this.sourceExtInfo;
	}

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
		this.title = title;
	}

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
		return this.title;
	}

    /**
     * Sets unique msg id.
     *
     * @param uniqueMsgId the unique msg id
     */
    public void setUniqueMsgId(String uniqueMsgId) {
		this.uniqueMsgId = uniqueMsgId;
	}

    /**
     * Gets unique msg id.
     *
     * @return the unique msg id
     */
    public String getUniqueMsgId() {
		return this.uniqueMsgId;
	}

    /**
     * Sets video length.
     *
     * @param videoLength the video length
     */
    public void setVideoLength(String videoLength) {
		this.videoLength = videoLength;
	}

    /**
     * Gets video length.
     *
     * @return the video length
     */
    public String getVideoLength() {
		return this.videoLength;
	}

    /**
     * Sets video samples.
     *
     * @param videoSamples the video samples
     */
    public void setVideoSamples(List<String> videoSamples) {
		this.videoSamples = videoSamples;
	}

    /**
     * Gets video samples.
     *
     * @return the video samples
     */
    public List<String> getVideoSamples() {
		return this.videoSamples;
	}

    /**
     * Sets video size.
     *
     * @param videoSize the video size
     */
    public void setVideoSize(String videoSize) {
		this.videoSize = videoSize;
	}

    /**
     * Gets video size.
     *
     * @return the video size
     */
    public String getVideoSize() {
		return this.videoSize;
	}

    /**
     * Sets video source.
     *
     * @param videoSource the video source
     */
    public void setVideoSource(String videoSource) {
		this.videoSource = videoSource;
	}

    /**
     * Gets video source.
     *
     * @return the video source
     */
    public String getVideoSource() {
		return this.videoSource;
	}

    /**
     * Sets video temporary url.
     *
     * @param videoTemporaryUrl the video temporary url
     */
    public void setVideoTemporaryUrl(String videoTemporaryUrl) {
		this.videoTemporaryUrl = videoTemporaryUrl;
	}

    /**
     * Gets video temporary url.
     *
     * @return the video temporary url
     */
    public String getVideoTemporaryUrl() {
		return this.videoTemporaryUrl;
	}

    /**
     * Sets video url.
     *
     * @param videoUrl the video url
     */
    public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

    /**
     * Gets video url.
     *
     * @return the video url
     */
    public String getVideoUrl() {
		return this.videoUrl;
	}
	private String terminalType;
	private String terminalInfo;
	private String prodCode;
	private String notifyUrl;
	private String returnUrl;
    private boolean needEncrypt=false;
	private AlipayObject bizModel=null;

	public String getNotifyUrl() {
		return this.notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public String getReturnUrl() {
		return this.returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	public String getApiVersion() {
		return this.apiVersion;
	}
	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	public void setTerminalType(String terminalType){
		this.terminalType=terminalType;
	}
	
    public String getTerminalType(){
    	return this.terminalType;
    }

    public void setTerminalInfo(String terminalInfo){
    	this.terminalInfo=terminalInfo;
    }

    public String getTerminalInfo(){
    	return this.terminalInfo;
    }
	
	public String getProdCode() {
		return this.prodCode; 
	}
	
	public void setProdCode(String prodCode) {
		this.prodCode=prodCode;
	}
    
	public String getApiMethodName() {
		return "alipay.open.public.life.msg.send";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("category", this.category);
		txtParams.put("content", this.content);
		txtParams.put("desc", this.desc);
		txtParams.put("msg_type", this.msgType);
		txtParams.put("source_ext_info", this.sourceExtInfo);
		txtParams.put("title", this.title);
		txtParams.put("unique_msg_id", this.uniqueMsgId);
		txtParams.put("video_length", this.videoLength);
		txtParams.put("video_samples", this.videoSamples == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.videoSamples, true));
		txtParams.put("video_size", this.videoSize);
		txtParams.put("video_source", this.videoSource);
		txtParams.put("video_temporary_url", this.videoTemporaryUrl);
		txtParams.put("video_url", this.videoUrl);
		if(udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

    /**
     * Put other text param.
     *
     * @param key   the key
     * @param value the value
     */
    public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new AlipayHashMap();
		}
		this.udfParams.put(key, value);
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("cover", this.cover);
		return params;
	}

	public Class<AlipayOpenPublicLifeMsgSendResponse> getResponseClass() {
		return AlipayOpenPublicLifeMsgSendResponse.class;
	}
	
	 public boolean isNeedEncrypt() {
    
      return this.needEncrypt;
    }


    public void setNeedEncrypt(boolean needEncrypt) {
    
         this.needEncrypt=needEncrypt;
    }
    
    public AlipayObject getBizModel() {
    
      return this.bizModel;
    }


    public void setBizModel(AlipayObject bizModel) {
    
         this.bizModel=bizModel;
    }
	
	
}
