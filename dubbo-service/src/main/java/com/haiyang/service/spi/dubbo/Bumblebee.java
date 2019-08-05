package com.haiyang.service.spi.dubbo;

import com.haiyang.api.spi.Robot;

/**
 * @ClassName: Bumblebee
 * @Description:
 * @Author: hywang
 * @CreateDate: 2019-08-05 14:50
 * @Version: 1.0
 */
public class Bumblebee implements Robot {
    public String sayHello() {
        return "Hello, I am Bumblebee.";
    }
}
