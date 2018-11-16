package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 行业关注名单详情
 *
 * @author auto create
 * @since 1.0, 2017-08-11 14:25:03
 */
public class ZmWatchListDetail extends AlipayObject {

	private static final long serialVersionUID = 5781494485595127225L;

	/**
	 * 风险信息行业编码
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 风险编码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 扩展信息
	 */
	@ApiListField("extend_info")
	@ApiField("zm_watch_list_extend_info")
	private List<ZmWatchListExtendInfo> extendInfo;

	/**
	 * 风险等级
	 */
	@ApiField("level")
	private Long level;

	/**
	 * 数据刷新时间
	 */
	@ApiField("refresh_time")
	private Date refreshTime;

	/**
	 * 结清状态
	 */
	@ApiField("settlement")
	private Boolean settlement;

	/**
	 * 当用户进行异议处理，并核查完毕之后，仍有异议时，给出的声明
	 */
	@ApiField("statement")
	private String statement;

	/**
	 * 用户本人对该条负面记录有异议时，表示该异议处理流程的状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 行业名单风险类型
	 */
	@ApiField("type")
	private String type;

    /**
     * Gets biz code.
     *
     * @return the biz code
     */
    public String getBizCode() {
		return this.bizCode;
	}

    /**
     * Sets biz code.
     *
     * @param bizCode the biz code
     */
    public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

    /**
     * Gets code.
     *
     * @return the code
     */
    public String getCode() {
		return this.code;
	}

    /**
     * Sets code.
     *
     * @param code the code
     */
    public void setCode(String code) {
		this.code = code;
	}

    /**
     * Gets extend info.
     *
     * @return the extend info
     */
    public List<ZmWatchListExtendInfo> getExtendInfo() {
		return this.extendInfo;
	}

    /**
     * Sets extend info.
     *
     * @param extendInfo the extend info
     */
    public void setExtendInfo(List<ZmWatchListExtendInfo> extendInfo) {
		this.extendInfo = extendInfo;
	}

    /**
     * Gets level.
     *
     * @return the level
     */
    public Long getLevel() {
		return this.level;
	}

    /**
     * Sets level.
     *
     * @param level the level
     */
    public void setLevel(Long level) {
		this.level = level;
	}

    /**
     * Gets refresh time.
     *
     * @return the refresh time
     */
    public Date getRefreshTime() {
		return this.refreshTime;
	}

    /**
     * Sets refresh time.
     *
     * @param refreshTime the refresh time
     */
    public void setRefreshTime(Date refreshTime) {
		this.refreshTime = refreshTime;
	}

    /**
     * Gets settlement.
     *
     * @return the settlement
     */
    public Boolean getSettlement() {
		return this.settlement;
	}

    /**
     * Sets settlement.
     *
     * @param settlement the settlement
     */
    public void setSettlement(Boolean settlement) {
		this.settlement = settlement;
	}

    /**
     * Gets statement.
     *
     * @return the statement
     */
    public String getStatement() {
		return this.statement;
	}

    /**
     * Sets statement.
     *
     * @param statement the statement
     */
    public void setStatement(String statement) {
		this.statement = statement;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
		return this.status;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
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

}
