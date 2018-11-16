package com.alipay.api.internal.util;

/**
 * The type Request parameters holder.
 */
public class RequestParametersHolder {
	private AlipayHashMap protocalMustParams;
	private AlipayHashMap protocalOptParams;
	private AlipayHashMap applicationParams;

    /**
     * Gets protocal must params.
     *
     * @return the protocal must params
     */
    public AlipayHashMap getProtocalMustParams() {
		return protocalMustParams;
	}

    /**
     * Sets protocal must params.
     *
     * @param protocalMustParams the protocal must params
     */
    public void setProtocalMustParams(AlipayHashMap protocalMustParams) {
		this.protocalMustParams = protocalMustParams;
	}

    /**
     * Gets protocal opt params.
     *
     * @return the protocal opt params
     */
    public AlipayHashMap getProtocalOptParams() {
		return protocalOptParams;
	}

    /**
     * Sets protocal opt params.
     *
     * @param protocalOptParams the protocal opt params
     */
    public void setProtocalOptParams(AlipayHashMap protocalOptParams) {
		this.protocalOptParams = protocalOptParams;
	}

    /**
     * Gets application params.
     *
     * @return the application params
     */
    public AlipayHashMap getApplicationParams() {
		return applicationParams;
	}

    /**
     * Sets application params.
     *
     * @param applicationParams the application params
     */
    public void setApplicationParams(AlipayHashMap applicationParams) {
		this.applicationParams = applicationParams;
	}
	
}
