package com.alipay.api.internal.util.json;

/**
 * The type Exception error listener.
 */
public class ExceptionErrorListener extends BufferErrorListener {
    
    public void error(String type, int col) {
        super.error(type, col);
        throw new IllegalArgumentException(buffer.toString());
    }
}
