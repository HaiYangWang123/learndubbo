package com.haiyang.service;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

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



        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-provider.xml");
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();

    }
}
