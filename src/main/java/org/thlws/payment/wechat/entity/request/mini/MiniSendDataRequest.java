package org.thlws.payment.wechat.entity.request.mini;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.HashMap;

/**
 * @author HanleyTang 2019/12/14
 */
public class MiniSendDataRequest implements Serializable {

    @SerializedName("touser")
    private String toUser;

    @SerializedName("template_id")
    private String templateId;

    @SerializedName("page")
    private String page;

    @SerializedName("data")
    private HashMap<String, MiniSendDataRequest.Value> data;

    public static class Value{
        private String value;

        public Value(String value) {
            this.value = value;
        }

        public Value() {
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public String getToUser() {
        return toUser;
    }

    public void setToUser(String toUser) {
        this.toUser = toUser;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public HashMap<String, Value> getData() {
        return data;
    }

    public void setData(HashMap<String, Value> data) {
        this.data = data;
    }
}
