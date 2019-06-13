package com.afabao.shangguigu.cfgbean;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: 啊发包
 * @Date: 2019/06/11 2019-06-11
 */
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced//开启负载均衡
    public RestTemplate getRestTempalte(){
        return new RestTemplate();
    }


}
//相当于application.xml
