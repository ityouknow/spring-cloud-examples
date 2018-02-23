package com.neo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final Logger logger = LoggerFactory.getLogger(FallbackProvider.class);

    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        logger.info("request two name is "+name);
        try{
            Thread.sleep(1000000);
        }catch ( Exception e){
            logger.error(" hello two error",e);
        }
        return "hello "+name+"，this is two messge";
    }
}