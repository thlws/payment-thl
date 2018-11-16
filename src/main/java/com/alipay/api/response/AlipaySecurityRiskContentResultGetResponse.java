package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InfoSecHitDetectItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.content.result.get response.
 *
 * @author auto create
 * @since 1.0, 2018-08-08 10:45:00
 */
public class AlipaySecurityRiskContentResultGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 4751536626738594519L;

	/** 
	 * 命中结果详情
	 */
	@ApiListField("hit_detect_items")
	@ApiField("info_sec_hit_detect_item")
	private List<InfoSecHitDetectItem> hitDetectItems;

	/** 
	 * PASSED("数据识别通过，可以在网站上正常显示")

REJECTED("被拒绝的数据，比如内容出现违禁词；不能出现在我们网站上")
	 */
	@ApiField("result_action")
	private String resultAction;

    /**
     * Sets hit detect items.
     *
     * @param hitDetectItems the hit detect items
     */
    public void setHitDetectItems(List<InfoSecHitDetectItem> hitDetectItems) {
		this.hitDetectItems = hitDetectItems;
	}

    /**
     * Gets hit detect items.
     *
     * @return the hit detect items
     */
    public List<InfoSecHitDetectItem> getHitDetectItems( ) {
		return this.hitDetectItems;
	}

    /**
     * Sets result action.
     *
     * @param resultAction the result action
     */
    public void setResultAction(String resultAction) {
		this.resultAction = resultAction;
	}

    /**
     * Gets result action.
     *
     * @return the result action
     */
    public String getResultAction( ) {
		return this.resultAction;
	}

}
