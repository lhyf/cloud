package org.lhyf.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/****
 * @author YF
 * @date 2018-09-06 22:15
 * @desc ClientApp
 *
 * 服务提供者(Eureka 客户端)
 **/
@SpringBootApplication
@EnableEurekaClient
public class PoliceApp {

    public static void main(String[] args) {
        SpringApplication.run(PoliceApp.class,args);
    }
}
