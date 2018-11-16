package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发票业务result
 *
 * @author auto create
 * @since 1.0, 2018-05-21 18:03:48
 */
public class BillInferenceResult extends AlipayObject {

	private static final long serialVersionUID = 2563459415959258257L;

	/**
	 * 角度
	 */
	@ApiField("angle")
	private Long angle;

	/**
	 * 分数
	 */
	@ApiField("bill_score")
	private Long billScore;

	/**
	 * 算法版本
	 */
	@ApiField("bill_version")
	private String billVersion;

	/**
	 * 发票金额
	 */
	@ApiListField("capital_sum")
	@ApiField("string")
	private List<String> capitalSum;

	/**
	 * 发票时间
	 */
	@ApiListField("date")
	@ApiField("string")
	private List<String> date;

	/**
	 * 发票报销人
	 */
	@ApiListField("name")
	@ApiField("string")
	private List<String> name;

	/**
	 * 发票号
	 */
	@ApiListField("no")
	@ApiField("string")
	private List<String> no;

	/**
	 * 分辨率
	 */
	@ApiListField("rotate_shape")
	@ApiField("string")
	private List<String> rotateShape;

	/**
	 * 发票标题
	 */
	@ApiListField("title")
	@ApiField("string")
	private List<String> title;

    /**
     * Gets angle.
     *
     * @return the angle
     */
    public Long getAngle() {
		return this.angle;
	}

    /**
     * Sets angle.
     *
     * @param angle the angle
     */
    public void setAngle(Long angle) {
		this.angle = angle;
	}

    /**
     * Gets bill score.
     *
     * @return the bill score
     */
    public Long getBillScore() {
		return this.billScore;
	}

    /**
     * Sets bill score.
     *
     * @param billScore the bill score
     */
    public void setBillScore(Long billScore) {
		this.billScore = billScore;
	}

    /**
     * Gets bill version.
     *
     * @return the bill version
     */
    public String getBillVersion() {
		return this.billVersion;
	}

    /**
     * Sets bill version.
     *
     * @param billVersion the bill version
     */
    public void setBillVersion(String billVersion) {
		this.billVersion = billVersion;
	}

    /**
     * Gets capital sum.
     *
     * @return the capital sum
     */
    public List<String> getCapitalSum() {
		return this.capitalSum;
	}

    /**
     * Sets capital sum.
     *
     * @param capitalSum the capital sum
     */
    public void setCapitalSum(List<String> capitalSum) {
		this.capitalSum = capitalSum;
	}

    /**
     * Gets date.
     *
     * @return the date
     */
    public List<String> getDate() {
		return this.date;
	}

    /**
     * Sets date.
     *
     * @param date the date
     */
    public void setDate(List<String> date) {
		this.date = date;
	}

    /**
     * Gets name.
     *
     * @return the name
     */
    public List<String> getName() {
		return this.name;
	}

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(List<String> name) {
		this.name = name;
	}

    /**
     * Gets no.
     *
     * @return the no
     */
    public List<String> getNo() {
		return this.no;
	}

    /**
     * Sets no.
     *
     * @param no the no
     */
    public void setNo(List<String> no) {
		this.no = no;
	}

    /**
     * Gets rotate shape.
     *
     * @return the rotate shape
     */
    public List<String> getRotateShape() {
		return this.rotateShape;
	}

    /**
     * Sets rotate shape.
     *
     * @param rotateShape the rotate shape
     */
    public void setRotateShape(List<String> rotateShape) {
		this.rotateShape = rotateShape;
	}

    /**
     * Gets title.
     *
     * @return the title
     */
    public List<String> getTitle() {
		return this.title;
	}

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(List<String> title) {
		this.title = title;
	}

}
