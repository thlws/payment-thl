package org.thlws.payment.alipay.trade.model.hb;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import org.apache.commons.lang3.StringUtils;
import org.thlws.payment.alipay.trade.utils.Utils;

import java.lang.reflect.Type;
import java.util.List;

/**
 *
 * @author liuyangkly
 * @date 15/8/27
 */
public class ExceptionInfoAdapter implements JsonSerializer<List<ExceptionInfo>> {

    @Override
    public JsonElement serialize(List<ExceptionInfo> exceptionInfos, Type type, JsonSerializationContext jsonSerializationContext) {
        if (Utils.isListEmpty(exceptionInfos)) {
            return null;
        }

        return new JsonPrimitive(StringUtils.join(exceptionInfos, "|"));
    }
}
