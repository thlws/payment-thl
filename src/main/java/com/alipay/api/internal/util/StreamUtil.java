/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2012 All Rights Reserved.
 */
package com.alipay.api.internal.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;

/**
 * The type Stream util.
 *
 * @author runzhi
 */
public class StreamUtil {
    private static final int DEFAULT_BUFFER_SIZE = 8192;

    /**
     * Io.
     *
     * @param in  the in
     * @param out the out
     * @throws IOException the io exception
     */
    public static void io(InputStream in, OutputStream out) throws IOException {
        io(in, out, -1);
    }

    /**
     * Io.
     *
     * @param in         the in
     * @param out        the out
     * @param bufferSize the buffer size
     * @throws IOException the io exception
     */
    public static void io(InputStream in, OutputStream out, int bufferSize) throws IOException {
        if (bufferSize == -1) {
            bufferSize = DEFAULT_BUFFER_SIZE;
        }

        byte[] buffer = new byte[bufferSize];
        int amount;

        while ((amount = in.read(buffer)) >= 0) {
            out.write(buffer, 0, amount);
        }
    }

    /**
     * Io.
     *
     * @param in  the in
     * @param out the out
     * @throws IOException the io exception
     */
    public static void io(Reader in, Writer out) throws IOException {
        io(in, out, -1);
    }

    /**
     * Io.
     *
     * @param in         the in
     * @param out        the out
     * @param bufferSize the buffer size
     * @throws IOException the io exception
     */
    public static void io(Reader in, Writer out, int bufferSize) throws IOException {
        if (bufferSize == -1) {
            bufferSize = DEFAULT_BUFFER_SIZE >> 1;
        }

        char[] buffer = new char[bufferSize];
        int amount;

        while ((amount = in.read(buffer)) >= 0) {
            out.write(buffer, 0, amount);
        }
    }

    /**
     * Synchronized output stream output stream.
     *
     * @param out the out
     * @return the output stream
     */
    public static OutputStream synchronizedOutputStream(OutputStream out) {
        return new SynchronizedOutputStream(out);
    }

    /**
     * Synchronized output stream output stream.
     *
     * @param out  the out
     * @param lock the lock
     * @return the output stream
     */
    public static OutputStream synchronizedOutputStream(OutputStream out, Object lock) {
        return new SynchronizedOutputStream(out, lock);
    }

    /**
     * Read text string.
     *
     * @param in the in
     * @return the string
     * @throws IOException the io exception
     */
    public static String readText(InputStream in) throws IOException {
        return readText(in, null, -1);
    }

    /**
     * Read text string.
     *
     * @param in       the in
     * @param encoding the encoding
     * @return the string
     * @throws IOException the io exception
     */
    public static String readText(InputStream in, String encoding) throws IOException {
        return readText(in, encoding, -1);
    }

    /**
     * Read text string.
     *
     * @param in         the in
     * @param encoding   the encoding
     * @param bufferSize the buffer size
     * @return the string
     * @throws IOException the io exception
     */
    public static String readText(InputStream in, String encoding, int bufferSize)
                                                                                  throws IOException {
        Reader reader = (encoding == null) ? new InputStreamReader(in) : new InputStreamReader(in,
            encoding);

        return readText(reader, bufferSize);
    }

    /**
     * Read text string.
     *
     * @param reader the reader
     * @return the string
     * @throws IOException the io exception
     */
    public static String readText(Reader reader) throws IOException {
        return readText(reader, -1);
    }

    /**
     * Read text string.
     *
     * @param reader     the reader
     * @param bufferSize the buffer size
     * @return the string
     * @throws IOException the io exception
     */
    public static String readText(Reader reader, int bufferSize) throws IOException {
        StringWriter writer = new StringWriter();

        io(reader, writer, bufferSize);
        return writer.toString();
    }

    private static class SynchronizedOutputStream extends OutputStream {
        private OutputStream out;
        private Object       lock;

        /**
         * Instantiates a new Synchronized output stream.
         *
         * @param out the out
         */
        SynchronizedOutputStream(OutputStream out) {
            this(out, out);
        }

        /**
         * Instantiates a new Synchronized output stream.
         *
         * @param out  the out
         * @param lock the lock
         */
        SynchronizedOutputStream(OutputStream out, Object lock) {
            this.out = out;
            this.lock = lock;
        }

        public void write(int datum) throws IOException {
            synchronized (lock) {
                out.write(datum);
            }
        }

        public void write(byte[] data) throws IOException {
            synchronized (lock) {
                out.write(data);
            }
        }

        public void write(byte[] data, int offset, int length) throws IOException {
            synchronized (lock) {
                out.write(data, offset, length);
            }
        }

        public void flush() throws IOException {
            synchronized (lock) {
                out.flush();
            }
        }

        public void close() throws IOException {
            synchronized (lock) {
                out.close();
            }
        }
    }
}
