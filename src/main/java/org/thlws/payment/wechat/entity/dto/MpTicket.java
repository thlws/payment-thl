package org.thlws.payment.wechat.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 公众号JS TICKET 核心参数
 * Created by  HanleyTang on 2019-01-02
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MpTicket implements Serializable {

    private String appId;
    private String timestamp;
    private String nonceStr;
    private String signature;

}
