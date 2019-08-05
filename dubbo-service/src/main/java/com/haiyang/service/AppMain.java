package com.haiyang.service;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.haiyang.api.spi.Robot;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.ServiceLoader;

/**
 * @ClassName: AppMain
 * @Description: springboot 启动类
 * @Author: hywang
 * @CreateDate: 2019-07-23 15:57
 * @Version: 1.0
 */
@SpringBootApplication
public class AppMain {

    public static void main(String[] args) throws IOException, InterruptedException {
      /*  SpringApplication.run(AppMain.class, args);
        System.out.println("server start");*/



        /*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-provider.xml");
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();*/

        // java spi
       /* ServiceLoader<Robot> serviceLoader = ServiceLoader.load(Robot.class);
        System.out.println("JAVA SPI");

        serviceLoader.forEach(robot -> {
            System.out.println(robot.sayHello());
        });*/

       // dubbo spi 接口需要使用注解 @SPI
        ExtensionLoader<Robot> extensionLoader = ExtensionLoader.getExtensionLoader(Robot.class);
        Robot bumblebee = extensionLoader.getExtension("bumblebee");
        System.out.println(bumblebee.sayHello());
        Robot optimusPrime = extensionLoader.getExtension("optimusPrime");
        System.out.println(optimusPrime.sayHello());

    }
}
