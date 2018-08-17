package com.coco.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * @author zhangxiaoxun
 * @date 2018/8/17  16:28
 **/
@Service
public class TestService {

    @Reference(version = "${dubbo.service.version}")
    HelloService helloService;

    public String sayHello(String name) {
        return helloService.sayHello(name);
    }
}
