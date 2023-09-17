package org.thlws.payment.wechat.entity.response.mini;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author HanleyTang 2019/12/14
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MiniSendDataResponse implements Serializable {

    @SerializedName("errcode")
    private Integer errCode;

    @SerializedName("errmsg")
    private String errMsg;


}
