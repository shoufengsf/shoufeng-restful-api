package com.shoufeng.common.utils;

import com.shoufeng.ApplicationTests;
import com.shoufeng.common.pojo.Result;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

/**
 * 网络请求工具测试类
 *
 * @author shoufeng
 */
public class HttpUtilsTest extends ApplicationTests {
    @Autowired
    private HttpUtils httpUtils;

    @Test
    public void get() {
        Map<String, Object> map = new HashMap<>();
        map.put("wd", "脑图");
        Result responseEntity = httpUtils.get("http://www.baidu.com/baidu?wd={wd}", String.class, map);
        System.out.println(responseEntity.toString());
    }
}
