package com.shoufeng.common.utils;

import lombok.Builder;
import lombok.Data;

/**
 * @author shoufeng
 */
@Data
@Builder
public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
