package com.designpatterns.enums;

import java.util.Arrays;

/**
 * @Author: dengKai
 * @Date: 2021-09-03-09-43
 * @Description: 面包枚举类
 */

public enum BreadMaterialTypeEnum implements BaseEnum {
    UNKNOWN(-1,"unknown","未知"),
    CHEESE_BREAD(1,"cheese","芝士面包"),
    CORN_BREAD(2,"corn","玉米面包"),
    BUTTER_BREAD(3,"butter","黄油面包");

    private final int index;
    private final String name;
    private final String message;

    BreadMaterialTypeEnum(int index, String name, String message) {
        this.index = index;
        this.name = name;
        this.message = message;
    }


    @Override
    public int getIndex() {
        return index;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public static BreadMaterialTypeEnum valueOfIndex(int index) {
        return Arrays.stream(BreadMaterialTypeEnum.values())
                .filter(CarrierType -> CarrierType.getIndex() == index)
                .findFirst()
                .orElse(UNKNOWN);
    }

    public static BreadMaterialTypeEnum valueOfMessage(String message) {
        return Arrays.stream(BreadMaterialTypeEnum.values())
                .filter(CarrierType -> CarrierType.getMessage().equals(message))
                .findFirst()
                .orElse(UNKNOWN);
    }
}
