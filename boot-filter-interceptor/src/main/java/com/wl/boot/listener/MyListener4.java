package com.wl.boot.listener;

import com.wl.boot.event.MyEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author 17997
 */
@Slf4j
@Component
public class MyListener4 {
    @EventListener
    public void listener(MyEvent event) {
        log.info(String.format("%s 监听到事件源：%s.", MyListener4.class.getName(), event.getSource()));
    }
}
