package org.thlws.payment.wechat.entity.extra;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by  HanleyTang on 2018-12-24
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class IndustryInfo implements Serializable {

    private String first_class;
    private String second_class;

}
