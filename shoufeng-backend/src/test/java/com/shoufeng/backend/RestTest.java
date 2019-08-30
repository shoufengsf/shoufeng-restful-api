package com.shoufeng.backend;

import com.shoufeng.ApplicationTests;
import com.shoufeng.common.utils.RedisUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestTest extends ApplicationTests {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    private RedisUtils redisUtils;

    @Test
    public void test() {
//        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://www.baidu.com", String.class);
        System.out.println(responseEntity.toString());
        redisUtils.set("zhangsan", "list");
    }
}
