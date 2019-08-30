package com.shoufeng.backend.controller;

import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * 登陆相关请求
 * @author shoufeng
 */
@RestController
public class LoginController {

    @Autowired
    private Producer producer;

    @RequestMapping("captcha.jpg")
    public void captcha(HttpServletResponse response)throws IOException {

        response.setHeader("Cache-Control", "no-store, no-cache");
        response.setContentType("image/jpeg");

        //生成文字验证码
        String text = producer.createText();
        //生成图片验证码
        BufferedImage image = producer.createImage(text);
        System.out.println("验证码：" + text);
        ServletOutputStream out = response.getOutputStream();
        ImageIO.write(image, "jpg", out);
    }
}
