package com.coco.ServiceImpl;


import com.alibaba.dubbo.config.annotation.Service;
import com.coco.service.HelloService;

/**
 * @author zhangxiaoxun
 * @date 2018/8/17  14:51
 **/
@Service(version = "${dubbo.service.version}") //指定版本号
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "hello";
    }
}
