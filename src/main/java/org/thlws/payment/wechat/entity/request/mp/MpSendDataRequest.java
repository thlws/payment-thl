package org.thlws.payment.wechat.entity.request.mp;

import org.thlws.utils.JsonUtil;

import java.io.Serializable;
import java.util.HashMap;

/**
 * 微信通知(模板消息)
 */
public class MpSendDataRequest {

    private String url;
    private String touser;
    private String template_id;
    private HashMap<String,Node> data;

    /**
     * Gets url.
     *
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets url.
     *
     * @param url the url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * The type Node.
     */
    static public class Node implements Serializable {

        /**long MpSendDataRequest.java**/
        private static final long serialVersionUID = -4831188890640769259L;
        private String value;
        private String color;

        /**
         * Instantiates a new Node.
         *
         * @param value the value
         * @param color the color
         */
        public Node(String value, String color) {
            this.value = value;
            this.color = color;
        }

        /**
         * Gets value.
         *
         * @return the value
         */
        public String getValue() {
            return value;
        }

        /**
         * Gets color.
         *
         * @return the color
         */
        public String getColor() {
            return color;
        }

        /**
         * Sets value.
         *
         * @param value the value
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Sets color.
         *
         * @param color the color
         */
        public void setColor(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return JsonUtil.format(this);
        }
    }

    /**
     * Gets touser.
     *
     * @return the touser
     */
    public String getTouser() {
        return touser;
    }

    /**
     * Gets template id.
     *
     * @return the template id
     */
    public String getTemplate_id() {
        return template_id;
    }

    /**
     * Gets data.
     *
     * @return the data
     */
    public HashMap<String, Node> getData() {
        return data;
    }

    /**
     * Sets touser.
     *
     * @param touser the touser
     */
    public void setTouser(String touser) {
        this.touser = touser;
    }

    /**
     * Sets template id.
     *
     * @param template_id the template id
     */
    public void setTemplate_id(String template_id) {
        this.template_id = template_id;
    }

    /**
     * Sets data.
     *
     * @param data the data
     */
    public void setData(HashMap<String, Node> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return JsonUtil.format(this);
    }
}
