package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 云凤蝶模板详情模式
 *
 * @author auto create
 * @since 1.0, 2018-05-17 16:00:59
 */
public class FengdieTemplateDetailModel extends AlipayObject {

	private static final long serialVersionUID = 7356734948629752612L;

	/**
	 * 模板 id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 模板包开发者，由开发者在package.json中指定
	 */
	@ApiListField("maintainer")
	@ApiField("string")
	private List<String> maintainer;

	/**
	 * 模板名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 模板包拥有者
	 */
	@ApiField("owner")
	private String owner;

	/**
	 * 模板包预览图，开发者在模板根目录放置的一张命名为snapshot.png的图片
	 */
	@ApiField("snapshot")
	private String snapshot;

	/**
	 * 模板包描述，开发者在package.json里指定
	 */
	@ApiField("summary")
	private String summary;

	/**
	 * 模板标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 模板版本号
	 */
	@ApiField("ver")
	private String ver;

    /**
     * Gets id.
     *
     * @return the id
     */
    public Long getId() {
		return this.id;
	}

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Long id) {
		this.id = id;
	}

    /**
     * Gets maintainer.
     *
     * @return the maintainer
     */
    public List<String> getMaintainer() {
		return this.maintainer;
	}

    /**
     * Sets maintainer.
     *
     * @param maintainer the maintainer
     */
    public void setMaintainer(List<String> maintainer) {
		this.maintainer = maintainer;
	}

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
		return this.name;
	}

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
		this.name = name;
	}

    /**
     * Gets owner.
     *
     * @return the owner
     */
    public String getOwner() {
		return this.owner;
	}

    /**
     * Sets owner.
     *
     * @param owner the owner
     */
    public void setOwner(String owner) {
		this.owner = owner;
	}

    /**
     * Gets snapshot.
     *
     * @return the snapshot
     */
    public String getSnapshot() {
		return this.snapshot;
	}

    /**
     * Sets snapshot.
     *
     * @param snapshot the snapshot
     */
    public void setSnapshot(String snapshot) {
		this.snapshot = snapshot;
	}

    /**
     * Gets summary.
     *
     * @return the summary
     */
    public String getSummary() {
		return this.summary;
	}

    /**
     * Sets summary.
     *
     * @param summary the summary
     */
    public void setSummary(String summary) {
		this.summary = summary;
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

    /**
     * Gets ver.
     *
     * @return the ver
     */
    public String getVer() {
		return this.ver;
	}

    /**
     * Sets ver.
     *
     * @param ver the ver
     */
    public void setVer(String ver) {
		this.ver = ver;
	}

}
