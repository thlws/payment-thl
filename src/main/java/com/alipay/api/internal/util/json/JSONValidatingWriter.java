package com.alipay.api.internal.util.json;

/**
 * The type Json validating writer.
 */
public class JSONValidatingWriter extends JSONWriter {

    private JSONValidator validator;

    /**
     * Instantiates a new Json validating writer.
     *
     * @param validator     the validator
     * @param emitClassName the emit class name
     */
    public JSONValidatingWriter(JSONValidator validator, boolean emitClassName) {
        super(emitClassName);
        this.validator = validator;
    }

    /**
     * Instantiates a new Json validating writer.
     *
     * @param validator the validator
     */
    public JSONValidatingWriter(JSONValidator validator) {
        this.validator = validator;
    }

    /**
     * Instantiates a new Json validating writer.
     *
     * @param listener      the listener
     * @param emitClassName the emit class name
     */
    public JSONValidatingWriter(JSONErrorListener listener, boolean emitClassName) {
        this(new JSONValidator(listener), emitClassName);
    }

    /**
     * Instantiates a new Json validating writer.
     *
     * @param listener the listener
     */
    public JSONValidatingWriter(JSONErrorListener listener) {
        this(new JSONValidator(listener));
    }

    /**
     * Instantiates a new Json validating writer.
     */
    public JSONValidatingWriter() {
        this(new StdoutStreamErrorListener());
    }

    /**
     * Instantiates a new Json validating writer.
     *
     * @param emitClassName the emit class name
     */
    public JSONValidatingWriter(boolean emitClassName) {
        this(new StdoutStreamErrorListener(), emitClassName);
    }
    
    private String validate(String text) {
        validator.validate(text);
        return text;
    }

    public String write(Object object) {
        return validate(super.write(object));
    }

    public String write(long n) {
        return validate(super.write(n));
    }

    public String write(double d) {
        return validate(super.write(d));
    }

    public String write(char c) {
        return validate(super.write(c));
    }

    public String write(boolean b) {
        return validate(super.write(b));
    }
}
