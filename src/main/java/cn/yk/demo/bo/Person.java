package cn.yk.demo.bo;

import javax.validation.constraints.Min;

/**
 * <br> Project: mock-server
 * <br> Package: cn.yk.demo.bo
 * <br> Description:
 * <br> Date: Created in 16:44 2017/3/29.
 * <br> Modified By
 *
 * @author SiGen
 */
public class Person {
    private Integer Id;
    private String name;
    // 添加 @Valid 注解
    @Min(value = 18, message = "未成年人禁止入内")
    private Integer age;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

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

    @Override
    public String toString() {
        return "Person{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
