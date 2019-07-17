package com.young.ssm.entity;

import org.apache.ibatis.plugin.Intercepts;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @Auther:dep
 * @Date: 2019/7/17 17:21
 * @Description:
 */
public class User {


    private Long  id;

    private String name;

    private Integer age;

    private String  sex;

   public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
