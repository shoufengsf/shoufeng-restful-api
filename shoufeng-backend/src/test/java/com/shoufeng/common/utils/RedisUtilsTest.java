package com.shoufeng.common.utils;

import com.shoufeng.ApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

/**
 * redis工具类 测试
 *
 * @author shoufeng
 */
public class RedisUtilsTest extends ApplicationTests {

    @Autowired
    private RedisUtils redisUtils;

    @Test
    public void set() {
        redisUtils.set("张三", "哈哈");
        redisUtils.set("里斯", "oo", 50L);
        redisUtils.set("王五", Person.builder().name("王五").age(17).build());
    }

    @Test
    public void expire() {
        redisUtils.expire("张三", 10L);
    }

    @Test
    public void delete() {
        redisUtils.delete("王五", "张三");
    }

    @Test
    public void get() {
        Person person = redisUtils.get("王五", Person.class);
        System.out.println(person.toString());
    }

    @Test
    public void hashPutAll() {
        Map<String, Person> map = new HashMap<>();
        map.put("zhangsan", Person.builder().name("张三").age(20).build());
        map.put("lisi", Person.builder().name("里斯").age(15).build());
        redisUtils.hashPutAll("person", map);
    }

    @Test
    public void hashPut() {
        redisUtils.hashPut("person", "zhangsan", Person.builder().name("张三").age(11).build());
    }

    @Test
    public void hashGet() {
        Person person = redisUtils.hashGet("person", "zhangsan", Person.class);
        System.out.println(person.toString());
    }
}

