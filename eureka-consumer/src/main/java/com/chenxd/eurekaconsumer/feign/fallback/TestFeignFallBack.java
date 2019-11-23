package com.chenxd.eurekaconsumer.feign.fallback;

import com.chenxd.eurekaconsumer.feign.TestFeign;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author create by your xiaodong.chen
 * @create 2019/11/23
 * @email xiaodong.chen@huixiaoer.com
 * @description
 */
@Component
public class TestFeignFallBack implements TestFeign {

    /**
     * 测试
     *
     * @param name
     * @return
     */
    @Override
    public String test(String name) {
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
        return null;
    }
}
