package com.designpatterns.service.bread.handler;

import com.designpatterns.dto.domain.request.BreadReq;
import com.designpatterns.service.bread.BreadHandler;
import org.springframework.stereotype.Component;

/**
 * @author: dengKai
 * @date: 2021/09/03 11:55
 * @description: TODO
 */
@Component("cheeseBreadHandler")
public class CheeseBreadHandler implements BreadHandler {
    @Override
    public String productBread(BreadReq bread) {
        return "cheeseBreadHandler";
    }
}
