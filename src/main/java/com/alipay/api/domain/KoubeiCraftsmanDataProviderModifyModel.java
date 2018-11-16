package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 修改手艺人信息接口
 *
 * @author auto create
 * @since 1.0, 2017-10-11 20:36:17
 */
public class KoubeiCraftsmanDataProviderModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4781913883641178648L;

	/**
	 * 服务商、服务商员工、商户、商户员工等口碑角色操作时必填，对应为《koubei.member.data.oauth.query》中的auth_code，默认有效期24小时；isv自身角色操作的时候，无需传该参数
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 手艺人头像，在商家端手艺人管理和用户端手艺人个人简介中展示手艺人头像 （通过 alipay.offline.material.image.upload 接口上传图片获取的资源id），上限最大5M,支持bmp,png,jpeg,jpg,gif格式的图片。
	 */
	@ApiField("avatar")
	private String avatar;

	/**
	 * 从业起始年月日
	 */
	@ApiField("career_begin")
	private String careerBegin;

	/**
	 * 职业。目前只能传支持一个。枚举类型目前有19种，发型师、美甲师、美容师、美睫师、纹绣师、纹身师、摄影师、教练、教师、化妆师、司仪、摄像师、按摩技师、足疗技师、灸疗师、理疗师、修脚师、采耳师、其他。
	 */
	@ApiListField("careers")
	@ApiField("string")
	private List<String> careers;

	/**
	 * 口碑手艺人id(外部手艺人id和口碑手艺人id二选一，如果都传的话，那么优先使用口碑手艺人id)
	 */
	@ApiField("craftsman_id")
	private String craftsmanId;

	/**
	 * 手艺人简介，上限300字。
	 */
	@ApiField("introduction")
	private String introduction;

	/**
	 * 昵称，上限16字,手艺人个人主页名称，展示给消费者看。
	 */
	@ApiField("nick_name")
	private String nickName;

	/**
	 * 外部手艺人id，由ISV生成，isv的appId + 外部手艺人id全局唯一
	 */
	@ApiField("out_craftsman_id")
	private String outCraftsmanId;

	/**
	 * 手艺人关联门店
	 */
	@ApiListField("shop_relations")
	@ApiField("craftsman_shop_relation_open_model")
	private List<CraftsmanShopRelationOpenModel> shopRelations;

	/**
	 * 描述手艺人擅长的技术（如烫染、二分式剪法、足疗、中医推拿、刮痧、火疗、拔罐、婚纱、儿童、写真...）。最多6个标签
每个标签字段上限10个字。
	 */
	@ApiListField("specialities")
	@ApiField("string")
	private List<String> specialities;

	/**
	 * 手艺人的手机号，在商家端和用户端展示，不支持座机
	 */
	@ApiField("tel_num")
	private String telNum;

	/**
	 * 头衔，手艺人在店内的职称。上限10个字。
	 */
	@ApiField("title")
	private String title;

    /**
     * Gets auth code.
     *
     * @return the auth code
     */
    public String getAuthCode() {
		return this.authCode;
	}

    /**
     * Sets auth code.
     *
     * @param authCode the auth code
     */
    public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

    /**
     * Gets avatar.
     *
     * @return the avatar
     */
    public String getAvatar() {
		return this.avatar;
	}

    /**
     * Sets avatar.
     *
     * @param avatar the avatar
     */
    public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

    /**
     * Gets career begin.
     *
     * @return the career begin
     */
    public String getCareerBegin() {
		return this.careerBegin;
	}

    /**
     * Sets career begin.
     *
     * @param careerBegin the career begin
     */
    public void setCareerBegin(String careerBegin) {
		this.careerBegin = careerBegin;
	}

    /**
     * Gets careers.
     *
     * @return the careers
     */
    public List<String> getCareers() {
		return this.careers;
	}

    /**
     * Sets careers.
     *
     * @param careers the careers
     */
    public void setCareers(List<String> careers) {
		this.careers = careers;
	}

    /**
     * Gets craftsman id.
     *
     * @return the craftsman id
     */
    public String getCraftsmanId() {
		return this.craftsmanId;
	}

    /**
     * Sets craftsman id.
     *
     * @param craftsmanId the craftsman id
     */
    public void setCraftsmanId(String craftsmanId) {
		this.craftsmanId = craftsmanId;
	}

    /**
     * Gets introduction.
     *
     * @return the introduction
     */
    public String getIntroduction() {
		return this.introduction;
	}

    /**
     * Sets introduction.
     *
     * @param introduction the introduction
     */
    public void setIntroduction(String introduction) {
		this.introduction = introduction;
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
     * Gets out craftsman id.
     *
     * @return the out craftsman id
     */
    public String getOutCraftsmanId() {
		return this.outCraftsmanId;
	}

    /**
     * Sets out craftsman id.
     *
     * @param outCraftsmanId the out craftsman id
     */
    public void setOutCraftsmanId(String outCraftsmanId) {
		this.outCraftsmanId = outCraftsmanId;
	}

    /**
     * Gets shop relations.
     *
     * @return the shop relations
     */
    public List<CraftsmanShopRelationOpenModel> getShopRelations() {
		return this.shopRelations;
	}

    /**
     * Sets shop relations.
     *
     * @param shopRelations the shop relations
     */
    public void setShopRelations(List<CraftsmanShopRelationOpenModel> shopRelations) {
		this.shopRelations = shopRelations;
	}

    /**
     * Gets specialities.
     *
     * @return the specialities
     */
    public List<String> getSpecialities() {
		return this.specialities;
	}

    /**
     * Sets specialities.
     *
     * @param specialities the specialities
     */
    public void setSpecialities(List<String> specialities) {
		this.specialities = specialities;
	}

    /**
     * Gets tel num.
     *
     * @return the tel num
     */
    public String getTelNum() {
		return this.telNum;
	}

    /**
     * Sets tel num.
     *
     * @param telNum the tel num
     */
    public void setTelNum(String telNum) {
		this.telNum = telNum;
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
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
		this.title = title;
	}

}
