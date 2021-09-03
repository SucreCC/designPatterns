package com.designpatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动类
 * @author dengkai
 * @date 2021/9/3 9:35
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class DesignPatternsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignPatternsApplication.class, args);
    }

}
