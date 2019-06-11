package com.afabao.shangguigu.cfgbean;

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
    public RestTemplate getRestTempalte(){
        return new RestTemplate();
    }


}
//相当于application.xml
