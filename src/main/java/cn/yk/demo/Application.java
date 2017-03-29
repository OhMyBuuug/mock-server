package cn.yk.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * <br> Project: mock-server
 * <br> Package: cn.yk.demo
 * <br> Description: springboot 启动类
 * <br> Date: Created in 9:22 2017/3/29.
 * <br> Modified By
 *
 * @author SiGen
 */
@SpringBootApplication
public class Application extends WebMvcConfigurerAdapter {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
