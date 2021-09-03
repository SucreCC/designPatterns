package com.designpatterns.dto.domain.request;

import com.designpatterns.enums.BreadMaterialTypeEnum;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author: dengKai
 * @date: 2021/09/03 11:35
 * @description: 面包生产类请求参数
 */
@Data
@Accessors(chain = true)
public class BreadReq {
    private BreadMaterialTypeEnum breadTypeEnum;
}
