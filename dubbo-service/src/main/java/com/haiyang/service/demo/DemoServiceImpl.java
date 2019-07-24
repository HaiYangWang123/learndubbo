package com.haiyang.service.demo;


import com.alibaba.dubbo.config.annotation.Service;
import com.haiyang.api.demo.IDemoService;

/**
 * @ClassName: DemoServiceImpl
 * @Description: api接口实现
 * @Author: hywang
 * @CreateDate: 2019-07-23 15:56
 * @Versio1.0
 */

@Service(version = "1.0.0")
public class DemoServiceImpl implements IDemoService {

    //实现
    public String sayHello() {
        return "Dubbo Hello";
    }
}
