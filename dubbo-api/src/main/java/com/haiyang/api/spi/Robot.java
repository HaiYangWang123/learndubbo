package com.haiyang.api.spi;

import com.alibaba.dubbo.common.extension.SPI;

/**
 * @ClassName: Robot
 * @Description:
 * @Author: hywang
 * @CreateDate: 2019-08-05 14:48
 * @Version: 1.0
 */
@SPI
public interface Robot {
    String sayHello();
}
