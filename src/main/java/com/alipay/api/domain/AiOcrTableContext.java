package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 表格ocr结构
 *
 * @author auto create
 * @since 1.0, 2018-07-04 14:04:10
 */
public class AiOcrTableContext extends AlipayObject {

	private static final long serialVersionUID = 8569582715558981284L;

	/**
	 * one past end column index(单元格所占的列数(colspan)为ex - sx)
	 */
	@ApiField("ex")
	private Long ex;

	/**
	 * one past end row index(单元格所占的行数(rowspan)为ey - sy)
	 */
	@ApiField("ey")
	private Long ey;

	/**
	 * cell height,图片上单元格的高度
	 */
	@ApiField("height")
	private Long height;

	/**
	 * start from column(单元格的起始列id)
	 */
	@ApiField("sx")
	private Long sx;

	/**
	 * start row(单元格的起始行id)
	 */
	@ApiField("sy")
	private Long sy;

	/**
	 * 表格文字内容
	 */
	@ApiListField("text")
	@ApiField("string")
	private List<String> text;

	/**
	 * 类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * cell width，图片上单元格的宽度
	 */
	@ApiField("width")
	private Long width;

    /**
     * Gets ex.
     *
     * @return the ex
     */
    public Long getEx() {
		return this.ex;
	}

    /**
     * Sets ex.
     *
     * @param ex the ex
     */
    public void setEx(Long ex) {
		this.ex = ex;
	}

    /**
     * Gets ey.
     *
     * @return the ey
     */
    public Long getEy() {
		return this.ey;
	}

    /**
     * Sets ey.
     *
     * @param ey the ey
     */
    public void setEy(Long ey) {
		this.ey = ey;
	}

    /**
     * Gets height.
     *
     * @return the height
     */
    public Long getHeight() {
		return this.height;
	}

    /**
     * Sets height.
     *
     * @param height the height
     */
    public void setHeight(Long height) {
		this.height = height;
	}

    /**
     * Gets sx.
     *
     * @return the sx
     */
    public Long getSx() {
		return this.sx;
	}

    /**
     * Sets sx.
     *
     * @param sx the sx
     */
    public void setSx(Long sx) {
		this.sx = sx;
	}

    /**
     * Gets sy.
     *
     * @return the sy
     */
    public Long getSy() {
		return this.sy;
	}

    /**
     * Sets sy.
     *
     * @param sy the sy
     */
    public void setSy(Long sy) {
		this.sy = sy;
	}

    /**
     * Gets text.
     *
     * @return the text
     */
    public List<String> getText() {
		return this.text;
	}

    /**
     * Sets text.
     *
     * @param text the text
     */
    public void setText(List<String> text) {
		this.text = text;
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
     * Gets width.
     *
     * @return the width
     */
    public Long getWidth() {
		return this.width;
	}

    /**
     * Sets width.
     *
     * @param width the width
     */
    public void setWidth(Long width) {
		this.width = width;
	}

}
