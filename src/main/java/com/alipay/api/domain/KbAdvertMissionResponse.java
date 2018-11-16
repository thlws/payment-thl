package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑广告系统任务
 *
 * @author auto create
 * @since 1.0, 2017-01-17 10:33:12
 */
public class KbAdvertMissionResponse extends AlipayObject {

	private static final long serialVersionUID = 3277226565274885669L;

	/**
	 * 任务领取时间
	 */
	@ApiField("gmt_claimed")
	private String gmtClaimed;

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
	 * 任务ID
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
	 * 任务标的列表
	 */
	@ApiListField("subjects")
	@ApiField("kb_advert_subject_response")
	private List<KbAdvertSubjectResponse> subjects;

    /**
     * Gets gmt claimed.
     *
     * @return the gmt claimed
     */
    public String getGmtClaimed() {
		return this.gmtClaimed;
	}

    /**
     * Sets gmt claimed.
     *
     * @param gmtClaimed the gmt claimed
     */
    public void setGmtClaimed(String gmtClaimed) {
		this.gmtClaimed = gmtClaimed;
	}

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
    public List<KbAdvertSubjectResponse> getSubjects() {
		return this.subjects;
	}

    /**
     * Sets subjects.
     *
     * @param subjects the subjects
     */
    public void setSubjects(List<KbAdvertSubjectResponse> subjects) {
		this.subjects = subjects;
	}

}
