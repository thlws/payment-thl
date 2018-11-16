package com.alipay.api.internal.util.json;

/**
 * The type Stdout stream error listener.
 */
public class StdoutStreamErrorListener extends BufferErrorListener {
    
    public void end() {
        System.out.print(buffer.toString());
    }
}
