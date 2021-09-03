package com.designpatterns.service.bread.handler;

import com.designpatterns.dto.domain.request.BreadReq;
import com.designpatterns.service.bread.BreadHandler;
import org.springframework.stereotype.Component;

/**
 * @author: dengKai
 * @date: 2021/09/03 11:28
 * @description: TODO
 */
@Component("cornBreadHandler")
public class CornBreadHandler implements BreadHandler {

    @Override
    public String productBread(BreadReq bread) {
        return "cornBreadHandler";
    }
}
