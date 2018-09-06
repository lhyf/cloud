package org.lhyf.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/****
 * @author YF
 * @date 2018-09-06 22:47
 * @desc PersonApp
 *
 * 服务调用者(Eureka 客户端)
 **/

@SpringBootApplication
@EnableEurekaClient
public class PersonApp {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(PersonApp.class, args);
    }

}
