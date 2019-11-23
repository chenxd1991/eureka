package com.chenxd.eurekaproducer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author create by your xiaodong.chen
 * @create 2019/11/22
 * @email xiaodong.chen@huixiaoer.com
 * @description
 */
@RestController
@RequestMapping("/eureka-producer")
public class EurekaProducerController {
    @GetMapping("/test")
    public String test(String name){
        return name + "："+ new Date();
    }
}
