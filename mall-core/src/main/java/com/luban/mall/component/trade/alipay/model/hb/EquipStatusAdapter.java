package com.luban.mall.component.trade.alipay.model.hb;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;

/**
 * @Author: 伯乐
 * @Date: 2019/5/20
 */
public class EquipStatusAdapter implements JsonSerializer<EquipStatus> {
    @Override
    public JsonElement serialize(EquipStatus equipStatus, Type type, JsonSerializationContext jsonSerializationContext) {
        return new JsonPrimitive(equipStatus.getValue());
    }
}
