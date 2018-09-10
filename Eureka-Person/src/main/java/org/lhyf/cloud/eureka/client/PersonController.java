package org.lhyf.cloud.eureka.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

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

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping(value = "/sayhello")
    public String sayHello() {
        String result = restTemplate.getForObject("http://police/hello/tom", String.class);
        System.err.println(result);
        return result;
    }

    /**
     * 获取服务列表
     * @return
     */
    @GetMapping("/list")
    public String getInstance() {
        List<String> services = discoveryClient.getServices();
        for (String serviceId : services) {
            List<ServiceInstance> instances = discoveryClient.getInstances(serviceId);
            System.out.println(serviceId + " : " +instances.size());
        }
        return "";
    }

    /**
     * 获取实例上的元数据信息
     * @return
     */
    @GetMapping("meta")
    public String getMetadata(){
        List<ServiceInstance> instances = discoveryClient.getInstances("police");
        for (ServiceInstance instance:instances){
            System.out.println(instance.getPort() + " : " + instance.getMetadata().get("company-name"));
        }
        return "";
    }
}
