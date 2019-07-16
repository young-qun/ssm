package com.young.ssm.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

/**
 * @Auther:dep
 * @Date: 2019/7/8 16:38
 * @Description:
 */
@Component
public class DemoEvent extends ApplicationEvent {

    private String name;

    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public DemoEvent(Object source) {
        super(source);
    }

    public DemoEvent(Object source, String name, String age) {
        super(source);
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "DemoEvent{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
