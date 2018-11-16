package org.thlws.payment.wechat.entity.request.mp;

import org.thlws.utils.JsonUtil;

import java.io.Serializable;
import java.util.HashMap;

/**
 * 微信通知(模板消息)
 */
public class SendDataRequest {

    private String url;
    private String touser;
    private String template_id;
    private HashMap<String,Node> data;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    static public class Node implements Serializable {

        /**long SendDataRequest.java**/
        private static final long serialVersionUID = -4831188890640769259L;
        private String value;
        private String color;

        public Node(String value, String color) {
            this.value = value;
            this.color = color;
        }

        public String getValue() {
            return value;
        }
        public String getColor() {
            return color;
        }
        public void setValue(String value) {
            this.value = value;
        }
        public void setColor(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return JsonUtil.format(this);
        }
    }

    public String getTouser() {
        return touser;
    }

    public String getTemplate_id() {
        return template_id;
    }

    public HashMap<String, Node> getData() {
        return data;
    }

    public void setTouser(String touser) {
        this.touser = touser;
    }

    public void setTemplate_id(String template_id) {
        this.template_id = template_id;
    }

    public void setData(HashMap<String, Node> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return JsonUtil.format(this);
    }
}
