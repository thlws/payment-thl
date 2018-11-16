package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 即时到账批量退款接口
 *
 * @author auto create
 * @since 1.0, 2016-11-21 12:06:26
 */
public class AlipayTradeBatchRefundModel extends AlipayObject {

	private static final long serialVersionUID = 7487149182178127851L;

	/**
	 * 每进行一次即时到账批量退款，都需要提供一个批次号，通过该批次号可以查询这一批次的退款交易记录。对于每一个合作伙伴，传递的每一个批次号都必须保证唯一性。
格式为：退款日期（8位当天日期）+流水号（3～24位，流水号可以接受数字或英文字符，建议使用数字）。
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 退款明细的笔数，即参数detail_data的值中，“#”字符出现的数量加1，最大支持1000笔。
	 */
	@ApiField("batch_num")
	private String batchNum;

	/**
	 * 退款明细列表
	 */
	@ApiListField("detail_data")
	@ApiField("refund_detail")
	private List<RefundDetail> detailData;

	/**
	 * 退款请求的当前时间。
格式为：yyyy-MM-dd hh:mm:ss。
	 */
	@ApiField("refund_date")
	private String refundDate;

	/**
	 * 是否使用冻结金额退款。
Y：可以使用冻结金额退款；
N：不可使用冻结金额退款；
如果不提供，则默认值为N。
	 */
	@ApiField("use_freeze_amount")
	private String useFreezeAmount;

    /**
     * Gets batch no.
     *
     * @return the batch no
     */
    public String getBatchNo() {
		return this.batchNo;
	}

    /**
     * Sets batch no.
     *
     * @param batchNo the batch no
     */
    public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

    /**
     * Gets batch num.
     *
     * @return the batch num
     */
    public String getBatchNum() {
		return this.batchNum;
	}

    /**
     * Sets batch num.
     *
     * @param batchNum the batch num
     */
    public void setBatchNum(String batchNum) {
		this.batchNum = batchNum;
	}

    /**
     * Gets detail data.
     *
     * @return the detail data
     */
    public List<RefundDetail> getDetailData() {
		return this.detailData;
	}

    /**
     * Sets detail data.
     *
     * @param detailData the detail data
     */
    public void setDetailData(List<RefundDetail> detailData) {
		this.detailData = detailData;
	}

    /**
     * Gets refund date.
     *
     * @return the refund date
     */
    public String getRefundDate() {
		return this.refundDate;
	}

    /**
     * Sets refund date.
     *
     * @param refundDate the refund date
     */
    public void setRefundDate(String refundDate) {
		this.refundDate = refundDate;
	}

    /**
     * Gets use freeze amount.
     *
     * @return the use freeze amount
     */
    public String getUseFreezeAmount() {
		return this.useFreezeAmount;
	}

    /**
     * Sets use freeze amount.
     *
     * @param useFreezeAmount the use freeze amount
     */
    public void setUseFreezeAmount(String useFreezeAmount) {
		this.useFreezeAmount = useFreezeAmount;
	}

}
