package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑客分佣任务批量查询结果
 *
 * @author auto create
 * @since 1.0, 2017-01-13 11:53:39
 */
public class KbAdvertMissionQueryResponse extends AlipayObject {

	private static final long serialVersionUID = 2326589294558737651L;

	/**
	 * 任务结束时间
	 */
	@ApiField("gmt_end")
	private String gmtEnd;

	/**
	 * 任务开始时间
	 */
	@ApiField("gmt_start")
	private String gmtStart;

	/**
	 * 分佣任务ID
	 */
	@ApiField("mission_id")
	private String missionId;

	/**
	 * 推广状态
EFFECTIVE-有效
INVALID-无效
	 */
	@ApiField("promote_status")
	private String promoteStatus;

	/**
	 * 分佣标的信息
	 */
	@ApiListField("subjects")
	@ApiField("kb_advert_mission_subject")
	private List<KbAdvertMissionSubject> subjects;

    /**
     * Gets gmt end.
     *
     * @return the gmt end
     */
    public String getGmtEnd() {
		return this.gmtEnd;
	}

    /**
     * Sets gmt end.
     *
     * @param gmtEnd the gmt end
     */
    public void setGmtEnd(String gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

    /**
     * Gets gmt start.
     *
     * @return the gmt start
     */
    public String getGmtStart() {
		return this.gmtStart;
	}

    /**
     * Sets gmt start.
     *
     * @param gmtStart the gmt start
     */
    public void setGmtStart(String gmtStart) {
		this.gmtStart = gmtStart;
	}

    /**
     * Gets mission id.
     *
     * @return the mission id
     */
    public String getMissionId() {
		return this.missionId;
	}

    /**
     * Sets mission id.
     *
     * @param missionId the mission id
     */
    public void setMissionId(String missionId) {
		this.missionId = missionId;
	}

    /**
     * Gets promote status.
     *
     * @return the promote status
     */
    public String getPromoteStatus() {
		return this.promoteStatus;
	}

    /**
     * Sets promote status.
     *
     * @param promoteStatus the promote status
     */
    public void setPromoteStatus(String promoteStatus) {
		this.promoteStatus = promoteStatus;
	}

    /**
     * Gets subjects.
     *
     * @return the subjects
     */
    public List<KbAdvertMissionSubject> getSubjects() {
		return this.subjects;
	}

    /**
     * Sets subjects.
     *
     * @param subjects the subjects
     */
    public void setSubjects(List<KbAdvertMissionSubject> subjects) {
		this.subjects = subjects;
	}

}
