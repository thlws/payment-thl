package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 生活圈新动态发布接口
 *
 * @author auto create
 * @since 1.0, 2016-08-12 11:11:25
 */
public class AlipaySocialBaseMcommentNewsfeedAddModel extends AlipayObject {

	private static final long serialVersionUID = 3624115887572378514L;

	/**
	 * 活动地点名称
	 */
	@ApiField("activity_address")
	private String activityAddress;

	/**
	 * 活动名称
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * 动态关联的现场id
	 */
	@ApiField("aid")
	private String aid;

	/**
	 * 业务系统ID,必须保证唯一性
规则：uid@时间戳
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 动态的文字内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 红包信息
	 */
	@ApiField("gift_info")
	private NewsfeedMediaGiftInfo giftInfo;

	/**
	 * 图片信息
	 */
	@ApiListField("img_infos")
	@ApiField("newsfeed_media_img")
	private List<NewsfeedMediaImg> imgInfos;

	/**
	 * 动态的标题信息
	 */
	@ApiField("label_info")
	private NewsfeedLabelInfo labelInfo;

	/**
	 * 链接信息（link类型时必填）
	 */
	@ApiField("link_info")
	private NewsfeedMediaLinkInfo linkInfo;

	/**
	 * 动态相关的地理位置（发给现场的动态必填）
	 */
	@ApiField("location_info")
	private NewsfeedLocationInfo locationInfo;

	/**
	 * 地理位置名称
	 */
	@ApiField("location_name")
	private String locationName;

	/**
	 * 地理位置跳转链接（当前支持https和alipay开头）
	 */
	@ApiField("location_scheme")
	private String locationScheme;

	/**
	 * 场景码,生活圈默认LFC
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 支持口碑评论等特殊类型需要的评分，不为空可显示星级评分
满分10分，每1分代表半颗星
	 */
	@ApiField("score")
	private Long score;

	/**
	 * 接口请求来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 用于标识来源app的图标
	 */
	@ApiField("source_icon")
	private String sourceIcon;

	/**
	 * 用于标识来源APP的名称
	 */
	@ApiField("source_name")
	private String sourceName;

	/**
	 * 个人动态扩散范围：0只生活圈，
1只现场，2既有生活圈也有现场
	 */
	@ApiField("spread_range")
	private Long spreadRange;

	/**
	 * 动态的类型：text纯文本，
image图片，video视频，link链接
，crossVideo横屏视频
	 */
	@ApiField("type")
	private String type;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * video信息（video、crossVideo类型时必填）
	 */
	@ApiField("video_info")
	private NewsfeedMediaVideoInfo videoInfo;

	/**
	 * 动态的可见性：0公开，1私密（仅本人可见）
	 */
	@ApiField("visible")
	private Long visible;

	/**
	 * 动态的可见范围
visible为0,1时，为空列表
visible为2时，表示可见的标签分组列表，
visible为3时，表示不可见的标签分组列表
	 */
	@ApiListField("visible_range")
	@ApiField("string")
	private List<String> visibleRange;

	/**
	 * 和谁在一起，用户列表
	 */
	@ApiListField("with_me")
	@ApiField("newsfeed_with_me_info")
	private List<NewsfeedWithMeInfo> withMe;

    /**
     * Gets activity address.
     *
     * @return the activity address
     */
    public String getActivityAddress() {
		return this.activityAddress;
	}

    /**
     * Sets activity address.
     *
     * @param activityAddress the activity address
     */
    public void setActivityAddress(String activityAddress) {
		this.activityAddress = activityAddress;
	}

    /**
     * Gets activity name.
     *
     * @return the activity name
     */
    public String getActivityName() {
		return this.activityName;
	}

    /**
     * Sets activity name.
     *
     * @param activityName the activity name
     */
    public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

    /**
     * Gets aid.
     *
     * @return the aid
     */
    public String getAid() {
		return this.aid;
	}

    /**
     * Sets aid.
     *
     * @param aid the aid
     */
    public void setAid(String aid) {
		this.aid = aid;
	}

    /**
     * Gets biz no.
     *
     * @return the biz no
     */
    public String getBizNo() {
		return this.bizNo;
	}

    /**
     * Sets biz no.
     *
     * @param bizNo the biz no
     */
    public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
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
     * Sets content.
     *
     * @param content the content
     */
    public void setContent(String content) {
		this.content = content;
	}

    /**
     * Gets gift info.
     *
     * @return the gift info
     */
    public NewsfeedMediaGiftInfo getGiftInfo() {
		return this.giftInfo;
	}

    /**
     * Sets gift info.
     *
     * @param giftInfo the gift info
     */
    public void setGiftInfo(NewsfeedMediaGiftInfo giftInfo) {
		this.giftInfo = giftInfo;
	}

    /**
     * Gets img infos.
     *
     * @return the img infos
     */
    public List<NewsfeedMediaImg> getImgInfos() {
		return this.imgInfos;
	}

    /**
     * Sets img infos.
     *
     * @param imgInfos the img infos
     */
    public void setImgInfos(List<NewsfeedMediaImg> imgInfos) {
		this.imgInfos = imgInfos;
	}

    /**
     * Gets label info.
     *
     * @return the label info
     */
    public NewsfeedLabelInfo getLabelInfo() {
		return this.labelInfo;
	}

    /**
     * Sets label info.
     *
     * @param labelInfo the label info
     */
    public void setLabelInfo(NewsfeedLabelInfo labelInfo) {
		this.labelInfo = labelInfo;
	}

    /**
     * Gets link info.
     *
     * @return the link info
     */
    public NewsfeedMediaLinkInfo getLinkInfo() {
		return this.linkInfo;
	}

    /**
     * Sets link info.
     *
     * @param linkInfo the link info
     */
    public void setLinkInfo(NewsfeedMediaLinkInfo linkInfo) {
		this.linkInfo = linkInfo;
	}

    /**
     * Gets location info.
     *
     * @return the location info
     */
    public NewsfeedLocationInfo getLocationInfo() {
		return this.locationInfo;
	}

    /**
     * Sets location info.
     *
     * @param locationInfo the location info
     */
    public void setLocationInfo(NewsfeedLocationInfo locationInfo) {
		this.locationInfo = locationInfo;
	}

    /**
     * Gets location name.
     *
     * @return the location name
     */
    public String getLocationName() {
		return this.locationName;
	}

    /**
     * Sets location name.
     *
     * @param locationName the location name
     */
    public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

    /**
     * Gets location scheme.
     *
     * @return the location scheme
     */
    public String getLocationScheme() {
		return this.locationScheme;
	}

    /**
     * Sets location scheme.
     *
     * @param locationScheme the location scheme
     */
    public void setLocationScheme(String locationScheme) {
		this.locationScheme = locationScheme;
	}

    /**
     * Gets scene code.
     *
     * @return the scene code
     */
    public String getSceneCode() {
		return this.sceneCode;
	}

    /**
     * Sets scene code.
     *
     * @param sceneCode the scene code
     */
    public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

    /**
     * Gets score.
     *
     * @return the score
     */
    public Long getScore() {
		return this.score;
	}

    /**
     * Sets score.
     *
     * @param score the score
     */
    public void setScore(Long score) {
		this.score = score;
	}

    /**
     * Gets source.
     *
     * @return the source
     */
    public String getSource() {
		return this.source;
	}

    /**
     * Sets source.
     *
     * @param source the source
     */
    public void setSource(String source) {
		this.source = source;
	}

    /**
     * Gets source icon.
     *
     * @return the source icon
     */
    public String getSourceIcon() {
		return this.sourceIcon;
	}

    /**
     * Sets source icon.
     *
     * @param sourceIcon the source icon
     */
    public void setSourceIcon(String sourceIcon) {
		this.sourceIcon = sourceIcon;
	}

    /**
     * Gets source name.
     *
     * @return the source name
     */
    public String getSourceName() {
		return this.sourceName;
	}

    /**
     * Sets source name.
     *
     * @param sourceName the source name
     */
    public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

    /**
     * Gets spread range.
     *
     * @return the spread range
     */
    public Long getSpreadRange() {
		return this.spreadRange;
	}

    /**
     * Sets spread range.
     *
     * @param spreadRange the spread range
     */
    public void setSpreadRange(Long spreadRange) {
		this.spreadRange = spreadRange;
	}

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
		return this.type;
	}

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
		this.type = type;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId() {
		return this.userId;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

    /**
     * Gets video info.
     *
     * @return the video info
     */
    public NewsfeedMediaVideoInfo getVideoInfo() {
		return this.videoInfo;
	}

    /**
     * Sets video info.
     *
     * @param videoInfo the video info
     */
    public void setVideoInfo(NewsfeedMediaVideoInfo videoInfo) {
		this.videoInfo = videoInfo;
	}

    /**
     * Gets visible.
     *
     * @return the visible
     */
    public Long getVisible() {
		return this.visible;
	}

    /**
     * Sets visible.
     *
     * @param visible the visible
     */
    public void setVisible(Long visible) {
		this.visible = visible;
	}

    /**
     * Gets visible range.
     *
     * @return the visible range
     */
    public List<String> getVisibleRange() {
		return this.visibleRange;
	}

    /**
     * Sets visible range.
     *
     * @param visibleRange the visible range
     */
    public void setVisibleRange(List<String> visibleRange) {
		this.visibleRange = visibleRange;
	}

    /**
     * Gets with me.
     *
     * @return the with me
     */
    public List<NewsfeedWithMeInfo> getWithMe() {
		return this.withMe;
	}

    /**
     * Sets with me.
     *
     * @param withMe the with me
     */
    public void setWithMe(List<NewsfeedWithMeInfo> withMe) {
		this.withMe = withMe;
	}

}
