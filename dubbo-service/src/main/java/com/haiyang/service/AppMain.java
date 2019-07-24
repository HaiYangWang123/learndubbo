package com.haiyang.service;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

/**
 * @ClassName: AppMain
 * @Description: springboot 启动类
 * @Author: hywang
 * @CreateDate: 2019-07-23 15:57
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDubbo
public class AppMain {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(AppMain.class, args);
        System.out.println("server start");


    }
}
