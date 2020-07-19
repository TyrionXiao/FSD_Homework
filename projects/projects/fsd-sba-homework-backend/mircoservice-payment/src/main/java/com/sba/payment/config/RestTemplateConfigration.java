package com.sba.payment.config;

import freemarker.template.Template;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author DengChunXiao
 * @version 1.0
 * @date 2020/7/19 9:48
 */
@Configuration
public class RestTemplateConfigration  {
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
