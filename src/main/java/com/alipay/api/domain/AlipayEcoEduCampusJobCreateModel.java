package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 实习生职位推送（新增/修改）接口
 *
 * @author auto create
 * @since 1.0, 2017-08-03 10:59:00
 */
public class AlipayEcoEduCampusJobCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1528135963458418772L;

	/**
	 * 城市编码
	 */
	@ApiField("area_city_code")
	private String areaCityCode;

	/**
	 * 城市名称
	 */
	@ApiField("area_city_name")
	private String areaCityName;

	/**
	 * 区编码
	 */
	@ApiField("area_district_code")
	private String areaDistrictCode;

	/**
	 * 区名称
	 */
	@ApiField("area_district_name")
	private String areaDistrictName;

	/**
	 * 工作详细地址
	 */
	@ApiField("area_job_address")
	private String areaJobAddress;

	/**
	 * 省份编码（直辖市
	 */
	@ApiField("area_province_code")
	private Long areaProvinceCode;

	/**
	 * 省份名称（直辖市）
	 */
	@ApiField("area_province_name")
	private String areaProvinceName;

	/**
	 * 街道名称
	 */
	@ApiField("area_street_name")
	private String areaStreetName;

	/**
	 * 企业法律名称
	 */
	@ApiField("company_lawname")
	private String companyLawname;

	/**
	 * 参数描述企业Logo
	 */
	@ApiField("company_logo")
	private String companyLogo;

	/**
	 * 公司名称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 第三方公司ID
	 */
	@ApiField("company_source")
	private String companySource;

	/**
	 * 备注json 数据
	 */
	@ApiField("content_var")
	private String contentVar;

	/**
	 * 过期时间(毫秒数)
	 */
	@ApiField("gmt_expired")
	private String gmtExpired;

	/**
	 * 刷新时间(毫秒数)
	 */
	@ApiField("gmt_refresh")
	private String gmtRefresh;

	/**
	 * 职位开始时间(毫秒数)
	 */
	@ApiField("gmt_start")
	private String gmtStart;

	/**
	 * 职位描述
	 */
	@ApiField("job_desc")
	private String jobDesc;

	/**
	 * 招聘人数
	 */
	@ApiField("job_hire_number")
	private Long jobHireNumber;

	/**
	 * 职位名称
	 */
	@ApiField("job_name")
	private String jobName;

	/**
	 * 职业亮点/关键字
	 */
	@ApiField("job_perk")
	private String jobPerk;

	/**
	 * 要求简历语言（1中文；2英文）
	 */
	@ApiField("job_resume_lg")
	private Long jobResumeLg;

	/**
	 * 学历要求专科（1:大专以下2:大专3:本科4:硕士5:博士6:其他7:不限）
	 */
	@ApiField("job_rq_education")
	private Long jobRqEducation;

	/**
	 * 职业一级分类code
	 */
	@ApiField("job_tier_one_code")
	private String jobTierOneCode;

	/**
	 * 职业一级分类name
	 */
	@ApiField("job_tier_one_name")
	private String jobTierOneName;

	/**
	 * 职业三级分类code
	 */
	@ApiField("job_tier_three_code")
	private String jobTierThreeCode;

	/**
	 * 职业三级分类name
	 */
	@ApiField("job_tier_three_name")
	private String jobTierThreeName;

	/**
	 * 职业二级分类code
	 */
	@ApiField("job_tier_two_code")
	private String jobTierTwoCode;

	/**
	 * 职业二级分类name
	 */
	@ApiField("job_tier_two_name")
	private String jobTierTwoName;

	/**
	 * 职位类型枚举（1实习；2兼职；3全职；）
	 */
	@ApiField("job_type")
	private Long jobType;

	/**
	 * 最大薪资（单位￥）
	 */
	@ApiField("payment_max")
	private Long paymentMax;

	/**
	 * 最小薪资（单位￥）
	 */
	@ApiField("payment_min")
	private Long paymentMin;

	/**
	 * 薪资单位(1:天2:月3:周)
	 */
	@ApiField("payment_unit")
	private Long paymentUnit;

	/**
	 * 职位来源方编码
	 */
	@ApiField("source_code")
	private String sourceCode;

	/**
	 * 职位在合作方的ID
	 */
	@ApiField("source_id")
	private String sourceId;

	/**
	 * 每周到岗天数
	 */
	@ApiField("tra_job_freq")
	private Long traJobFreq;

	/**
	 * 实习时间长度(单位月)
	 */
	@ApiField("tra_job_period")
	private Long traJobPeriod;

	/**
	 * 是否可转正(1可以；0不可以)
	 */
	@ApiField("tra_job_promot")
	private Long traJobPromot;

    /**
     * Gets area city code.
     *
     * @return the area city code
     */
    public String getAreaCityCode() {
		return this.areaCityCode;
	}

    /**
     * Sets area city code.
     *
     * @param areaCityCode the area city code
     */
    public void setAreaCityCode(String areaCityCode) {
		this.areaCityCode = areaCityCode;
	}

    /**
     * Gets area city name.
     *
     * @return the area city name
     */
    public String getAreaCityName() {
		return this.areaCityName;
	}

    /**
     * Sets area city name.
     *
     * @param areaCityName the area city name
     */
    public void setAreaCityName(String areaCityName) {
		this.areaCityName = areaCityName;
	}

    /**
     * Gets area district code.
     *
     * @return the area district code
     */
    public String getAreaDistrictCode() {
		return this.areaDistrictCode;
	}

    /**
     * Sets area district code.
     *
     * @param areaDistrictCode the area district code
     */
    public void setAreaDistrictCode(String areaDistrictCode) {
		this.areaDistrictCode = areaDistrictCode;
	}

    /**
     * Gets area district name.
     *
     * @return the area district name
     */
    public String getAreaDistrictName() {
		return this.areaDistrictName;
	}

    /**
     * Sets area district name.
     *
     * @param areaDistrictName the area district name
     */
    public void setAreaDistrictName(String areaDistrictName) {
		this.areaDistrictName = areaDistrictName;
	}

    /**
     * Gets area job address.
     *
     * @return the area job address
     */
    public String getAreaJobAddress() {
		return this.areaJobAddress;
	}

    /**
     * Sets area job address.
     *
     * @param areaJobAddress the area job address
     */
    public void setAreaJobAddress(String areaJobAddress) {
		this.areaJobAddress = areaJobAddress;
	}

    /**
     * Gets area province code.
     *
     * @return the area province code
     */
    public Long getAreaProvinceCode() {
		return this.areaProvinceCode;
	}

    /**
     * Sets area province code.
     *
     * @param areaProvinceCode the area province code
     */
    public void setAreaProvinceCode(Long areaProvinceCode) {
		this.areaProvinceCode = areaProvinceCode;
	}

    /**
     * Gets area province name.
     *
     * @return the area province name
     */
    public String getAreaProvinceName() {
		return this.areaProvinceName;
	}

    /**
     * Sets area province name.
     *
     * @param areaProvinceName the area province name
     */
    public void setAreaProvinceName(String areaProvinceName) {
		this.areaProvinceName = areaProvinceName;
	}

    /**
     * Gets area street name.
     *
     * @return the area street name
     */
    public String getAreaStreetName() {
		return this.areaStreetName;
	}

    /**
     * Sets area street name.
     *
     * @param areaStreetName the area street name
     */
    public void setAreaStreetName(String areaStreetName) {
		this.areaStreetName = areaStreetName;
	}

    /**
     * Gets company lawname.
     *
     * @return the company lawname
     */
    public String getCompanyLawname() {
		return this.companyLawname;
	}

    /**
     * Sets company lawname.
     *
     * @param companyLawname the company lawname
     */
    public void setCompanyLawname(String companyLawname) {
		this.companyLawname = companyLawname;
	}

    /**
     * Gets company logo.
     *
     * @return the company logo
     */
    public String getCompanyLogo() {
		return this.companyLogo;
	}

    /**
     * Sets company logo.
     *
     * @param companyLogo the company logo
     */
    public void setCompanyLogo(String companyLogo) {
		this.companyLogo = companyLogo;
	}

    /**
     * Gets company name.
     *
     * @return the company name
     */
    public String getCompanyName() {
		return this.companyName;
	}

    /**
     * Sets company name.
     *
     * @param companyName the company name
     */
    public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

    /**
     * Gets company source.
     *
     * @return the company source
     */
    public String getCompanySource() {
		return this.companySource;
	}

    /**
     * Sets company source.
     *
     * @param companySource the company source
     */
    public void setCompanySource(String companySource) {
		this.companySource = companySource;
	}

    /**
     * Gets content var.
     *
     * @return the content var
     */
    public String getContentVar() {
		return this.contentVar;
	}

    /**
     * Sets content var.
     *
     * @param contentVar the content var
     */
    public void setContentVar(String contentVar) {
		this.contentVar = contentVar;
	}

    /**
     * Gets gmt expired.
     *
     * @return the gmt expired
     */
    public String getGmtExpired() {
		return this.gmtExpired;
	}

    /**
     * Sets gmt expired.
     *
     * @param gmtExpired the gmt expired
     */
    public void setGmtExpired(String gmtExpired) {
		this.gmtExpired = gmtExpired;
	}

    /**
     * Gets gmt refresh.
     *
     * @return the gmt refresh
     */
    public String getGmtRefresh() {
		return this.gmtRefresh;
	}

    /**
     * Sets gmt refresh.
     *
     * @param gmtRefresh the gmt refresh
     */
    public void setGmtRefresh(String gmtRefresh) {
		this.gmtRefresh = gmtRefresh;
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
     * Gets job desc.
     *
     * @return the job desc
     */
    public String getJobDesc() {
		return this.jobDesc;
	}

    /**
     * Sets job desc.
     *
     * @param jobDesc the job desc
     */
    public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}

    /**
     * Gets job hire number.
     *
     * @return the job hire number
     */
    public Long getJobHireNumber() {
		return this.jobHireNumber;
	}

    /**
     * Sets job hire number.
     *
     * @param jobHireNumber the job hire number
     */
    public void setJobHireNumber(Long jobHireNumber) {
		this.jobHireNumber = jobHireNumber;
	}

    /**
     * Gets job name.
     *
     * @return the job name
     */
    public String getJobName() {
		return this.jobName;
	}

    /**
     * Sets job name.
     *
     * @param jobName the job name
     */
    public void setJobName(String jobName) {
		this.jobName = jobName;
	}

    /**
     * Gets job perk.
     *
     * @return the job perk
     */
    public String getJobPerk() {
		return this.jobPerk;
	}

    /**
     * Sets job perk.
     *
     * @param jobPerk the job perk
     */
    public void setJobPerk(String jobPerk) {
		this.jobPerk = jobPerk;
	}

    /**
     * Gets job resume lg.
     *
     * @return the job resume lg
     */
    public Long getJobResumeLg() {
		return this.jobResumeLg;
	}

    /**
     * Sets job resume lg.
     *
     * @param jobResumeLg the job resume lg
     */
    public void setJobResumeLg(Long jobResumeLg) {
		this.jobResumeLg = jobResumeLg;
	}

    /**
     * Gets job rq education.
     *
     * @return the job rq education
     */
    public Long getJobRqEducation() {
		return this.jobRqEducation;
	}

    /**
     * Sets job rq education.
     *
     * @param jobRqEducation the job rq education
     */
    public void setJobRqEducation(Long jobRqEducation) {
		this.jobRqEducation = jobRqEducation;
	}

    /**
     * Gets job tier one code.
     *
     * @return the job tier one code
     */
    public String getJobTierOneCode() {
		return this.jobTierOneCode;
	}

    /**
     * Sets job tier one code.
     *
     * @param jobTierOneCode the job tier one code
     */
    public void setJobTierOneCode(String jobTierOneCode) {
		this.jobTierOneCode = jobTierOneCode;
	}

    /**
     * Gets job tier one name.
     *
     * @return the job tier one name
     */
    public String getJobTierOneName() {
		return this.jobTierOneName;
	}

    /**
     * Sets job tier one name.
     *
     * @param jobTierOneName the job tier one name
     */
    public void setJobTierOneName(String jobTierOneName) {
		this.jobTierOneName = jobTierOneName;
	}

    /**
     * Gets job tier three code.
     *
     * @return the job tier three code
     */
    public String getJobTierThreeCode() {
		return this.jobTierThreeCode;
	}

    /**
     * Sets job tier three code.
     *
     * @param jobTierThreeCode the job tier three code
     */
    public void setJobTierThreeCode(String jobTierThreeCode) {
		this.jobTierThreeCode = jobTierThreeCode;
	}

    /**
     * Gets job tier three name.
     *
     * @return the job tier three name
     */
    public String getJobTierThreeName() {
		return this.jobTierThreeName;
	}

    /**
     * Sets job tier three name.
     *
     * @param jobTierThreeName the job tier three name
     */
    public void setJobTierThreeName(String jobTierThreeName) {
		this.jobTierThreeName = jobTierThreeName;
	}

    /**
     * Gets job tier two code.
     *
     * @return the job tier two code
     */
    public String getJobTierTwoCode() {
		return this.jobTierTwoCode;
	}

    /**
     * Sets job tier two code.
     *
     * @param jobTierTwoCode the job tier two code
     */
    public void setJobTierTwoCode(String jobTierTwoCode) {
		this.jobTierTwoCode = jobTierTwoCode;
	}

    /**
     * Gets job tier two name.
     *
     * @return the job tier two name
     */
    public String getJobTierTwoName() {
		return this.jobTierTwoName;
	}

    /**
     * Sets job tier two name.
     *
     * @param jobTierTwoName the job tier two name
     */
    public void setJobTierTwoName(String jobTierTwoName) {
		this.jobTierTwoName = jobTierTwoName;
	}

    /**
     * Gets job type.
     *
     * @return the job type
     */
    public Long getJobType() {
		return this.jobType;
	}

    /**
     * Sets job type.
     *
     * @param jobType the job type
     */
    public void setJobType(Long jobType) {
		this.jobType = jobType;
	}

    /**
     * Gets payment max.
     *
     * @return the payment max
     */
    public Long getPaymentMax() {
		return this.paymentMax;
	}

    /**
     * Sets payment max.
     *
     * @param paymentMax the payment max
     */
    public void setPaymentMax(Long paymentMax) {
		this.paymentMax = paymentMax;
	}

    /**
     * Gets payment min.
     *
     * @return the payment min
     */
    public Long getPaymentMin() {
		return this.paymentMin;
	}

    /**
     * Sets payment min.
     *
     * @param paymentMin the payment min
     */
    public void setPaymentMin(Long paymentMin) {
		this.paymentMin = paymentMin;
	}

    /**
     * Gets payment unit.
     *
     * @return the payment unit
     */
    public Long getPaymentUnit() {
		return this.paymentUnit;
	}

    /**
     * Sets payment unit.
     *
     * @param paymentUnit the payment unit
     */
    public void setPaymentUnit(Long paymentUnit) {
		this.paymentUnit = paymentUnit;
	}

    /**
     * Gets source code.
     *
     * @return the source code
     */
    public String getSourceCode() {
		return this.sourceCode;
	}

    /**
     * Sets source code.
     *
     * @param sourceCode the source code
     */
    public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}

    /**
     * Gets source id.
     *
     * @return the source id
     */
    public String getSourceId() {
		return this.sourceId;
	}

    /**
     * Sets source id.
     *
     * @param sourceId the source id
     */
    public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

    /**
     * Gets tra job freq.
     *
     * @return the tra job freq
     */
    public Long getTraJobFreq() {
		return this.traJobFreq;
	}

    /**
     * Sets tra job freq.
     *
     * @param traJobFreq the tra job freq
     */
    public void setTraJobFreq(Long traJobFreq) {
		this.traJobFreq = traJobFreq;
	}

    /**
     * Gets tra job period.
     *
     * @return the tra job period
     */
    public Long getTraJobPeriod() {
		return this.traJobPeriod;
	}

    /**
     * Sets tra job period.
     *
     * @param traJobPeriod the tra job period
     */
    public void setTraJobPeriod(Long traJobPeriod) {
		this.traJobPeriod = traJobPeriod;
	}

    /**
     * Gets tra job promot.
     *
     * @return the tra job promot
     */
    public Long getTraJobPromot() {
		return this.traJobPromot;
	}

    /**
     * Sets tra job promot.
     *
     * @param traJobPromot the tra job promot
     */
    public void setTraJobPromot(Long traJobPromot) {
		this.traJobPromot = traJobPromot;
	}

}
