package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户行业资质，表示商户具备某行业从业资格
 *
 * @author auto create
 * @since 1.0, 2018-03-14 16:11:58
 */
public class IndustryQualificationInfo extends AlipayObject {

	private static final long serialVersionUID = 7156652966913373944L;

	/**
	 * 商户行业资质图片。其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key
	 */
	@ApiField("industry_qualification_image")
	private String industryQualificationImage;

	/**
	 * 商户行业资质类型，具体选值参见https://mif-pub.alipayobjects.com/QualificationType.xlsx
	 */
	@ApiField("industry_qualification_type")
	private String industryQualificationType;

    /**
     * Gets industry qualification image.
     *
     * @return the industry qualification image
     */
    public String getIndustryQualificationImage() {
		return this.industryQualificationImage;
	}

    /**
     * Sets industry qualification image.
     *
     * @param industryQualificationImage the industry qualification image
     */
    public void setIndustryQualificationImage(String industryQualificationImage) {
		this.industryQualificationImage = industryQualificationImage;
	}

    /**
     * Gets industry qualification type.
     *
     * @return the industry qualification type
     */
    public String getIndustryQualificationType() {
		return this.industryQualificationType;
	}

    /**
     * Sets industry qualification type.
     *
     * @param industryQualificationType the industry qualification type
     */
    public void setIndustryQualificationType(String industryQualificationType) {
		this.industryQualificationType = industryQualificationType;
	}

}
