package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云客服热线数据查询，云客服会有很多外部客服，他们需要查询落地在站内的自己公司的服务数据。
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:20
 */
public class AlipayBossCsChannelQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3368236616748181655L;

	/**
	 * 平均通话时长的qualifier
	 */
	@ApiField("att")
	private String att;

	/**
	 * 总接通率的qualifier
	 */
	@ApiField("connectionrate")
	private String connectionrate;

	/**
	 * 在线小二人数的qualifier
	 */
	@ApiField("curragentsloggedin")
	private String curragentsloggedin;

	/**
	 * 通话中人数的qualifier
	 */
	@ApiField("curragenttalking")
	private String curragenttalking;

	/**
	 * 小休人数的qualifier
	 */
	@ApiField("currentnotreadyagents")
	private String currentnotreadyagents;

	/**
	 * 等待人数的qualifier
	 */
	@ApiField("currentreadyagents")
	private String currentreadyagents;

	/**
	 * 总排队数的Qualifier
	 */
	@ApiField("currnumberwaitingcalls")
	private String currnumberwaitingcalls;

	/**
	 * 查询hbase的rowkey
	 */
	@ApiField("endkey")
	private String endkey;

	/**
	 * 查询hbase的rowkey
	 */
	@ApiField("startkey")
	private String startkey;

	/**
	 * 总流入量的qualifier
	 */
	@ApiField("visitorinflow")
	private String visitorinflow;

	/**
	 * 总应答量的qualifier
	 */
	@ApiField("visitorresponse")
	private String visitorresponse;

	/**
	 * 应答量[转接] 的qualifier
	 */
	@ApiField("visitorresponsetransfer")
	private String visitorresponsetransfer;

    /**
     * Gets att.
     *
     * @return the att
     */
    public String getAtt() {
		return this.att;
	}

    /**
     * Sets att.
     *
     * @param att the att
     */
    public void setAtt(String att) {
		this.att = att;
	}

    /**
     * Gets connectionrate.
     *
     * @return the connectionrate
     */
    public String getConnectionrate() {
		return this.connectionrate;
	}

    /**
     * Sets connectionrate.
     *
     * @param connectionrate the connectionrate
     */
    public void setConnectionrate(String connectionrate) {
		this.connectionrate = connectionrate;
	}

    /**
     * Gets curragentsloggedin.
     *
     * @return the curragentsloggedin
     */
    public String getCurragentsloggedin() {
		return this.curragentsloggedin;
	}

    /**
     * Sets curragentsloggedin.
     *
     * @param curragentsloggedin the curragentsloggedin
     */
    public void setCurragentsloggedin(String curragentsloggedin) {
		this.curragentsloggedin = curragentsloggedin;
	}

    /**
     * Gets curragenttalking.
     *
     * @return the curragenttalking
     */
    public String getCurragenttalking() {
		return this.curragenttalking;
	}

    /**
     * Sets curragenttalking.
     *
     * @param curragenttalking the curragenttalking
     */
    public void setCurragenttalking(String curragenttalking) {
		this.curragenttalking = curragenttalking;
	}

    /**
     * Gets currentnotreadyagents.
     *
     * @return the currentnotreadyagents
     */
    public String getCurrentnotreadyagents() {
		return this.currentnotreadyagents;
	}

    /**
     * Sets currentnotreadyagents.
     *
     * @param currentnotreadyagents the currentnotreadyagents
     */
    public void setCurrentnotreadyagents(String currentnotreadyagents) {
		this.currentnotreadyagents = currentnotreadyagents;
	}

    /**
     * Gets currentreadyagents.
     *
     * @return the currentreadyagents
     */
    public String getCurrentreadyagents() {
		return this.currentreadyagents;
	}

    /**
     * Sets currentreadyagents.
     *
     * @param currentreadyagents the currentreadyagents
     */
    public void setCurrentreadyagents(String currentreadyagents) {
		this.currentreadyagents = currentreadyagents;
	}

    /**
     * Gets currnumberwaitingcalls.
     *
     * @return the currnumberwaitingcalls
     */
    public String getCurrnumberwaitingcalls() {
		return this.currnumberwaitingcalls;
	}

    /**
     * Sets currnumberwaitingcalls.
     *
     * @param currnumberwaitingcalls the currnumberwaitingcalls
     */
    public void setCurrnumberwaitingcalls(String currnumberwaitingcalls) {
		this.currnumberwaitingcalls = currnumberwaitingcalls;
	}

    /**
     * Gets endkey.
     *
     * @return the endkey
     */
    public String getEndkey() {
		return this.endkey;
	}

    /**
     * Sets endkey.
     *
     * @param endkey the endkey
     */
    public void setEndkey(String endkey) {
		this.endkey = endkey;
	}

    /**
     * Gets startkey.
     *
     * @return the startkey
     */
    public String getStartkey() {
		return this.startkey;
	}

    /**
     * Sets startkey.
     *
     * @param startkey the startkey
     */
    public void setStartkey(String startkey) {
		this.startkey = startkey;
	}

    /**
     * Gets visitorinflow.
     *
     * @return the visitorinflow
     */
    public String getVisitorinflow() {
		return this.visitorinflow;
	}

    /**
     * Sets visitorinflow.
     *
     * @param visitorinflow the visitorinflow
     */
    public void setVisitorinflow(String visitorinflow) {
		this.visitorinflow = visitorinflow;
	}

    /**
     * Gets visitorresponse.
     *
     * @return the visitorresponse
     */
    public String getVisitorresponse() {
		return this.visitorresponse;
	}

    /**
     * Sets visitorresponse.
     *
     * @param visitorresponse the visitorresponse
     */
    public void setVisitorresponse(String visitorresponse) {
		this.visitorresponse = visitorresponse;
	}

    /**
     * Gets visitorresponsetransfer.
     *
     * @return the visitorresponsetransfer
     */
    public String getVisitorresponsetransfer() {
		return this.visitorresponsetransfer;
	}

    /**
     * Sets visitorresponsetransfer.
     *
     * @param visitorresponsetransfer the visitorresponsetransfer
     */
    public void setVisitorresponsetransfer(String visitorresponsetransfer) {
		this.visitorresponsetransfer = visitorresponsetransfer;
	}

}
