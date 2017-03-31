package cn.yk.demo.bo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * <br> Project: mock-server
 * <br> Package: cn.yk.demo.bo
 * <br> Description: 属性注入
 * <br> Date: Created in 14:15 2017/3/29.
 * <br> Modified By
 *
 * @author SiGen
 */

/**
 *  Could not autowire field: private cn.yk.demo.bo.Demo cn.yk.demo.controller.DemoController.demo;
 *  nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException:
 *  No qualifying bean of type [cn.yk.demo.bo.Demo] found for dependency: expected at least 1 bean which qualifies as autowire candidate for this dependency
 *  防止出现注入时找不到bean的错误
 */
@Component
/**
 *  指定注入的属性
 */
@ConfigurationProperties(value = "demo")
public class Demo {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
