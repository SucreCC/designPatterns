package com.designpatterns.controller;


import com.designpatterns.dto.domain.request.BreadReq;
import com.designpatterns.service.bread.BreadMachineHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: dengKai
 * @date: 2021/09/03 13:44
 * @description: TODO
 */
@RestController
@RequestMapping("/design-pattern")
public class BreadController {

    @Autowired
    private BreadMachineHandler breadMachineHandler;

    @GetMapping("/get-bread")
    public String getBread(BreadReq breadReq) throws Exception {
        return breadMachineHandler.productBread(breadReq);
    }
}
