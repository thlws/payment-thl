package org.thlws.payment.wechat.entity.request.mini;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashMap;

/**
 * @author HanleyTang 2019/12/14
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MiniSendDataRequest implements Serializable {

    @SerializedName("touser")
    private String toUser;

    @SerializedName("template_id")
    private String templateId;

    @SerializedName("page")
    private String page;

    @SerializedName("data")
    private HashMap<String, MiniSendDataRequest.Value> data;

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Value{
        private String value;
    }


}
