package com.chenxd.eurekaconsumer.feign;

import com.chenxd.eurekaconsumer.feign.fallback.TestFeignFallBack;
import com.chenxd.eurekaconsumer.feign.interceptor.TestFeignInterceptor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author create by your xiaodong.chen
 * @create 2019/11/22
 * @email xiaodong.chen@huixiaoer.com
 * @description
 */
@FeignClient(name = "eureka-producer", configuration = {TestFeignInterceptor.class}, fallback = TestFeignFallBack.class)
public interface TestFeign {

    /**
     * 测试
     *
     * @param name
     * @return
     */
    @GetMapping("/eureka-producer/test")
    String test(@RequestParam("name") String name);
}
