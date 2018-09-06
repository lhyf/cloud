package org.lhyf.cloud.eureka.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/****
 * @author YF
 * @date 2018-09-06 22:16
 * @desc PoliceController
 *
 **/

@RestController
public class PersonController {


    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/sayhello")
    public String sayHello(){
        String result = restTemplate.getForObject("http://police/hello/tom", String.class);
        System.err.println(result);
        return result;
    }
}
