package com.coco.controller;

import com.coco.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangxiaoxun
 * @date 2018/8/17  16:14
 **/
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam String name) {
        return testService.sayHello(name);
    }
}
