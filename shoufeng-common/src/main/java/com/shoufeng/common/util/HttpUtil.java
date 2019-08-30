package com.shoufeng.common.util;

import com.shoufeng.common.pojo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * 网络请求工具类
 *
 * @author shoufeng
 */
@Component
public class HttpUtil {

    @Autowired
    RestTemplateBuilder restTemplateBuilder;

    public Result get(String url, Object data) {
        RestTemplate restTemplate = restTemplateBuilder.build();
        return null;
    }
}
