package com.designpatterns.service.bread.handler;

import com.designpatterns.dto.domain.request.BreadReq;
import com.designpatterns.service.bread.BreadHandler;
import org.springframework.stereotype.Component;

/**
 * @author: dengKai
 * @date: 2021/09/03 11:52
 * @description: TODO
 */
@Component("unknownBreadHandler")
public class DefaultBreadHandler implements BreadHandler {
    @Override
    public String productBread(BreadReq bread) {
        return "unknownBreadHandler";
    }
}
