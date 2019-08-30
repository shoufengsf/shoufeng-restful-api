package com.shoufeng.backend;

import com.shoufeng.ApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestTest extends ApplicationTests {

    @Autowired
    RestTemplateBuilder restTemplateBuilder;

    @Autowired
    RestTemplate restTemplate;

    @Test
    public void test() {
//        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://www.baidu.com", String.class);
        System.out.println(responseEntity.toString());
    }
}
