package com.chenxd.eurekaconsumer.feign;

import com.chenxd.eurekaconsumer.feign.config.FeignFormSupportConfig;
import com.chenxd.eurekaconsumer.feign.fallback.TestFeignFallBack;
import com.chenxd.eurekaconsumer.feign.interceptor.TestFeignInterceptor;
import feign.QueryMap;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.awt.*;
import java.util.Map;

/**
 * @author create by your xiaodong.chen
 * @create 2019/11/22
 * @email xiaodong.chen@huixiaoer.com
 * @description
 */
@FeignClient(name = "eureka-producer", configuration = {TestFeignInterceptor.class, FeignFormSupportConfig.class}, fallback =
        TestFeignFallBack.class)
public interface TestFeign {

    /**
     * 测试
     *
     * @param name
     * @return
     */
    @GetMapping("/eureka-producer/test")
    String test(@RequestParam("name") String name);

    /**
     * form表单
     *
     * @param param
     * @return
     */
    @PostMapping(value = "", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
    String testForm(@QueryMap Map<String, Object> param);
}
