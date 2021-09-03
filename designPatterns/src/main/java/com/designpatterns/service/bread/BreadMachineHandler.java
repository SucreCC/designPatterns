package com.designpatterns.service.bread;

import com.designpatterns.dto.domain.request.BreadReq;
import com.designpatterns.enums.BreadMaterialTypeEnum;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author: dengKai
 * @date: 2021/9/3 9:35
 * @description: 根据不同类型材料来映射不同的面包生产方式
 */
@Component("breadMachineHandler")
public class BreadMachineHandler implements ApplicationContextAware {
    private static final String SUFFIX = "Handler";

    private ApplicationContext applicationContext;
    public String productBread(BreadReq bread) throws Exception{
        return getBreadHandler(bread.getBreadTypeEnum()).productBread(bread);
    }

    private BreadHandler getBreadHandler(BreadMaterialTypeEnum breadMaterialTypeEnum){
        String beanName = String.join("", breadMaterialTypeEnum.getName(), SUFFIX);
        return this.applicationContext.getBean(beanName,BreadHandler.class);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
