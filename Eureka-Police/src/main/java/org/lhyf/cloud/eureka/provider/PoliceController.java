package org.lhyf.cloud.eureka.provider;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/****
 * @author YF
 * @date 2018-09-06 22:16
 * @desc PoliceController
 *
 **/

@RestController
public class PoliceController {

    @GetMapping(value = "/hello/{name}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String,String> hello(@PathVariable("name") String name){

        System.err.println("======>>>" + name);

        Map<String,String> result = new HashMap<>();
        result.put("AA","aa");
        result.put("BB","sg");
        result.put("Df","gg");
        result.put("Ef","sw");

        return result ;
    }
}
