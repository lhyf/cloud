package org.lhyf.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/****
 * @author YF
 * @date 2018-09-06 21:45
 * @desc ServerApp
 *
 * Eureka 服务端
 **/
@SpringBootApplication
@EnableEurekaServer
public class ServerApp {

    public static void main(String[] args) {
        SpringApplication.run(ServerApp.class, args);
    }
}
