package com.haiyang.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @ClassName: AppMain
 * @Description: springboot 启动类
 * @Author: hywang
 * @CreateDate: 2019-07-23 15:57
 * @Version: 1.0
 */
@SpringBootApplication
public class AppMain {

    public static void main(String[] args) throws IOException {


        SpringApplication.run(AppMain.class, args);
        System.out.println("server start");



    }
}
