package com.designpatterns.enums.enumsSerializer;

import com.designpatterns.enums.BaseEnum;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

/**
 * @author: dengKai
 * @date: 2021/09/03 09:45
 * @description: 枚举类序列化
 */
public class EnumSerializer<E extends Enum<E> & BaseEnum> extends StdSerializer<E> {
    public EnumSerializer() {
        this(null);
    }

    public EnumSerializer(Class<E> t) {
        super(t);
    }

    @Override
    public void serialize(E value, JsonGenerator generator, SerializerProvider provider) throws IOException {
        generator.writeStartObject();
        generator.writeFieldName("index");
        generator.writeNumber(value.getIndex());
        generator.writeFieldName("name");
        generator.writeString(value.getName());
        generator.writeFieldName("message");
        generator.writeString(value.getMessage());
        generator.writeEndObject();
    }
}
