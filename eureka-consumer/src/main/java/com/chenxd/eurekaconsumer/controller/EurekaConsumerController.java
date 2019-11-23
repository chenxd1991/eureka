package com.chenxd.eurekaconsumer.controller;

import com.chenxd.eurekaconsumer.feign.TestFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author create by your xiaodong.chen
 * @create 2019/11/22
 * @email xiaodong.chen@huixiaoer.com
 * @description
 */
@RestController
@RequestMapping("/eureka-consumer")
public class EurekaConsumerController {

    @Autowired
    private TestFeign testFeign;

    @GetMapping("{name}")
    public String test(@PathVariable("name") String name){

        return testFeign.test(name);
    }
}
