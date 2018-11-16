package com.alipay.api.internal.util.json;

/**
 * The interface Json error listener.
 */
public interface JSONErrorListener {
    /**
     * Start.
     *
     * @param text the text
     */
    void start(String text);

    /**
     * Error.
     *
     * @param message the message
     * @param column  the column
     */
    void error(String message, int column);

    /**
     * End.
     */
    void end();
}
