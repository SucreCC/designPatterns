package com.designpatterns.enums;


import com.designpatterns.enums.enumsSerializer.BaseEnumDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.EnumSerializer;

import java.util.Arrays;

/**
 * @author: dengKai
 * @date: 2021/09/03 09:45
 * @description: 基础枚举类,除特殊情况外其他枚举类都因该继承这个枚举类
 */

@JsonSerialize(using = EnumSerializer.class)
@JsonDeserialize(using = BaseEnumDeserializer.class)
public interface BaseEnum {
    /**
     * 索引
     */
    int getIndex();

    /**
     * 名称
     */
    String getName();

    /**
     * 信息
     */
    String getMessage();

    static <E extends Enum<E> & BaseEnum> E valueOfCode(Integer code, Class<E> clazz) {
        return Arrays.stream(clazz.getEnumConstants())
                .filter(ele -> ele.getIndex() == code)
                .findFirst()
                .orElse(null);
    }
}
