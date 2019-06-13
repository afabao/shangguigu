package com.afabao.shangguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: 啊发包
 * @Date: 2019/06/11 2019-06-11
 */
@SpringBootApplication
@EnableEurekaClient//负载均衡客户端需要用到
public class DeptConsumer80_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_App.class,args);
    }
}
