package com.young.ssm.lisenter;

import com.young.ssm.event.DemoEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @Auther:dep
 * @Date: 2019/7/8 16:40
 * @Description:
 */
@Component
public class DemoEventLisenter implements ApplicationListener<DemoEvent> {
    @Override
    @EventListener
    public void onApplicationEvent(DemoEvent event) {
        System.out.println(event.toString());
    }
}
