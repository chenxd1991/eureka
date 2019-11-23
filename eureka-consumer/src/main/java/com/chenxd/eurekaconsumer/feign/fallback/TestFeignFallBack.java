package com.chenxd.eurekaconsumer.feign.fallback;

import com.chenxd.eurekaconsumer.feign.TestFeign;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author create by your xiaodong.chen
 * @create 2019/11/23
 * @email xiaodong.chen@huixiaoer.com
 * @description
 */
@Component
@Slf4j
public class TestFeignFallBack implements TestFeign {

    /**
     * 测试
     *
     * @param name
     * @return
     */
    @Override
    public String test(String name) {
        log.info("接口调用失败");
        return "Hello World";
    }

    /**
     * form表单
     *
     * @param param
     * @return
     */
    @Override
    public String testForm(Map<String, Object> param) {
        log.info("接口调用失败");
        return null;
    }
}
