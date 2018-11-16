package com.alipay.api.internal.util.json;

/**
 * The type Json validating reader.
 */
public class JSONValidatingReader extends JSONReader {
    /**
     * The constant INVALID.
     */
    public static final Object INVALID = new Object();
    private JSONValidator validator;

    /**
     * Instantiates a new Json validating reader.
     *
     * @param validator the validator
     */
    public JSONValidatingReader(JSONValidator validator) {
        this.validator = validator;
    }

    /**
     * Instantiates a new Json validating reader.
     *
     * @param listener the listener
     */
    public JSONValidatingReader(JSONErrorListener listener) {
        this(new JSONValidator(listener));
    }

    /**
     * Instantiates a new Json validating reader.
     */
    public JSONValidatingReader() {
        this(new StdoutStreamErrorListener());
    }

    public Object read(String string) {
        if (!validator.validate(string)) return INVALID;
        return super.read(string);
    }
}
