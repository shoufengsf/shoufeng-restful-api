package com.shoufeng.backend;

import com.shoufeng.ApplicationTests;
import com.shoufeng.backend.controller.LoginController;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 登陆请求模拟
 *
 * @author shoufeng
 */
public class LoginControllerTest extends ApplicationTests {

    @Autowired
    private LoginController loginController;

    @Test
    public void captcha() {
    }
}
