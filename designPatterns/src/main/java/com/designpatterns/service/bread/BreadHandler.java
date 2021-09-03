package com.designpatterns.service.bread;

import com.designpatterns.dto.domain.request.BreadReq;

/**
 * @author: dengKai
 * @date: 2021/09/03 11:29
 * @description: 面包处理基础类
 */

public interface BreadHandler {
    /**
     * to product bread
     * @param bread
     */
    String productBread(BreadReq bread);
}
