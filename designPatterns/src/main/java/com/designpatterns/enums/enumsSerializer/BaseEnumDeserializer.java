package com.designpatterns.enums.enumsSerializer;

import com.designpatterns.enums.BaseEnum;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.BeanUtils;

import java.io.IOException;

/**
 * @author: dengKai
 * @date: 2021/09/03 09:45
 * @description: 枚举类反序列化
 */
public class BaseEnumDeserializer<E extends Enum<E> & BaseEnum> extends JsonDeserializer<BaseEnum> {
    @Override
    public BaseEnum deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        JsonNode node = jp.getCodec().readTree(jp);
        String currentName = jp.currentName();
        Object currentValue = jp.getCurrentValue();
        @SuppressWarnings("rawtypes")
        Class enumClassType = BeanUtils.findPropertyType(currentName, currentValue.getClass());
        return (BaseEnum) BaseEnum.valueOfCode(node.get("index").asInt(),enumClassType);
    }
}
