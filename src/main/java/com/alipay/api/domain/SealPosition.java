package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签章位置描述信息
 *
 * @author auto create
 * @since 1.0, 2017-12-20 15:24:35
 */
public class SealPosition extends AlipayObject {

	private static final long serialVersionUID = 5886788242484665534L;

	/**
	 * 关键字
	 */
	@ApiField("keyword")
	private String keyword;

	/**
	 * 加盖签章页号
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 类型
1 : 基于关键字定位
2 : 基于相对位置定位
3 : 默认签名区
4 : 齐缝章
	 */
	@ApiField("type")
	private Long type;

	/**
	 * 相对于某一页的X轴偏移
	 */
	@ApiField("x")
	private Long x;

	/**
	 * 相对于某一页的y轴偏移
	 */
	@ApiField("y")
	private Long y;

    /**
     * Gets keyword.
     *
     * @return the keyword
     */
    public String getKeyword() {
		return this.keyword;
	}

    /**
     * Sets keyword.
     *
     * @param keyword the keyword
     */
    public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

    /**
     * Gets page no.
     *
     * @return the page no
     */
    public Long getPageNo() {
		return this.pageNo;
	}

    /**
     * Sets page no.
     *
     * @param pageNo the page no
     */
    public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

    /**
     * Gets type.
     *
     * @return the type
     */
    public Long getType() {
		return this.type;
	}

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(Long type) {
		this.type = type;
	}

    /**
     * Gets x.
     *
     * @return the x
     */
    public Long getX() {
		return this.x;
	}

    /**
     * Sets x.
     *
     * @param x the x
     */
    public void setX(Long x) {
		this.x = x;
	}

    /**
     * Gets y.
     *
     * @return the y
     */
    public Long getY() {
		return this.y;
	}

    /**
     * Sets y.
     *
     * @param y the y
     */
    public void setY(Long y) {
		this.y = y;
	}

}
