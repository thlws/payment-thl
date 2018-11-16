package com.alipay.api.internal.util.json;

/**
 * The type Buffer error listener.
 */
public class BufferErrorListener implements JSONErrorListener {

    /**
     * The Buffer.
     */
    protected StringBuffer buffer;
    private String input;

    /**
     * Instantiates a new Buffer error listener.
     *
     * @param buffer the buffer
     */
    public BufferErrorListener(StringBuffer buffer) {
        this.buffer = buffer;
    }

    /**
     * Instantiates a new Buffer error listener.
     */
    public BufferErrorListener() {
        this(new StringBuffer());
    }
    
    public void start(String input) {
        this.input = input;
        buffer.setLength(0);
    }

    public void error(String type, int col) {
        buffer.append("expected ");
        buffer.append(type);
        buffer.append(" at column ");
        buffer.append(col);
        buffer.append("\n");
        buffer.append(input);
        buffer.append("\n");
        indent(col-1, buffer);
        buffer.append("^");
    }

    private void indent(int n, StringBuffer ret) {
        for (int i = 0; i< n; ++i) {
            ret.append(' ');
        }
    }

    public void end() {
    }
}
