package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 洗车保养评论
 *
 * @author auto create
 * @since 1.0, 2017-09-15 16:21:52
 */
public class MerchantshopCommentResult extends AlipayObject {

	private static final long serialVersionUID = 8342661575512671147L;

	/**
	 * 评论内容
	 */
	@ApiField("comment")
	private String comment;

	/**
	 * 评论时间格式"yyyy-MM-dd HH:mm:ss"
	 */
	@ApiField("comment_time")
	private String commentTime;

	/**
	 * 评论用户的头像url，记录用户评价时头像完整路径
	 */
	@ApiField("face")
	private String face;

	/**
	 * 评论晒图，多个逗号分隔。使用车主平台接口上传图片地址。
	 */
	@ApiField("imgs")
	private String imgs;

	/**
	 * 评论用户的昵称
	 */
	@ApiField("nick_name")
	private String nickName;

	/**
	 * 车主平台订单编号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 回复内容
	 */
	@ApiField("reply")
	private String reply;

	/**
	 * 回复时间，格式"yyyy-MM-dd HH:mm:ss"
	 */
	@ApiField("reply_time")
	private String replyTime;

	/**
	 * 评分， 两位小数
	 */
	@ApiField("score")
	private String score;

	/**
	 * 车主平台门店编码
	 */
	@ApiField("shop_id")
	private Long shopId;

	/**
	 * 评论用户支付宝uid
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 评论的用户名称，敏感数据脱敏处理。
	 */
	@ApiField("user_name")
	private String userName;

    /**
     * Gets comment.
     *
     * @return the comment
     */
    public String getComment() {
		return this.comment;
	}

    /**
     * Sets comment.
     *
     * @param comment the comment
     */
    public void setComment(String comment) {
		this.comment = comment;
	}

    /**
     * Gets comment time.
     *
     * @return the comment time
     */
    public String getCommentTime() {
		return this.commentTime;
	}

    /**
     * Sets comment time.
     *
     * @param commentTime the comment time
     */
    public void setCommentTime(String commentTime) {
		this.commentTime = commentTime;
	}

    /**
     * Gets face.
     *
     * @return the face
     */
    public String getFace() {
		return this.face;
	}

    /**
     * Sets face.
     *
     * @param face the face
     */
    public void setFace(String face) {
		this.face = face;
	}

    /**
     * Gets imgs.
     *
     * @return the imgs
     */
    public String getImgs() {
		return this.imgs;
	}

    /**
     * Sets imgs.
     *
     * @param imgs the imgs
     */
    public void setImgs(String imgs) {
		this.imgs = imgs;
	}

    /**
     * Gets nick name.
     *
     * @return the nick name
     */
    public String getNickName() {
		return this.nickName;
	}

    /**
     * Sets nick name.
     *
     * @param nickName the nick name
     */
    public void setNickName(String nickName) {
		this.nickName = nickName;
	}

    /**
     * Gets order no.
     *
     * @return the order no
     */
    public String getOrderNo() {
		return this.orderNo;
	}

    /**
     * Sets order no.
     *
     * @param orderNo the order no
     */
    public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

    /**
     * Gets reply.
     *
     * @return the reply
     */
    public String getReply() {
		return this.reply;
	}

    /**
     * Sets reply.
     *
     * @param reply the reply
     */
    public void setReply(String reply) {
		this.reply = reply;
	}

    /**
     * Gets reply time.
     *
     * @return the reply time
     */
    public String getReplyTime() {
		return this.replyTime;
	}

    /**
     * Sets reply time.
     *
     * @param replyTime the reply time
     */
    public void setReplyTime(String replyTime) {
		this.replyTime = replyTime;
	}

    /**
     * Gets score.
     *
     * @return the score
     */
    public String getScore() {
		return this.score;
	}

    /**
     * Sets score.
     *
     * @param score the score
     */
    public void setScore(String score) {
		this.score = score;
	}

    /**
     * Gets shop id.
     *
     * @return the shop id
     */
    public Long getShopId() {
		return this.shopId;
	}

    /**
     * Sets shop id.
     *
     * @param shopId the shop id
     */
    public void setShopId(Long shopId) {
		this.shopId = shopId;
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
     * Gets user name.
     *
     * @return the user name
     */
    public String getUserName() {
		return this.userName;
	}

    /**
     * Sets user name.
     *
     * @param userName the user name
     */
    public void setUserName(String userName) {
		this.userName = userName;
	}

}
