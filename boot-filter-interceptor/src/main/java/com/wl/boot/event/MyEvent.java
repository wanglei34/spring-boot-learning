package com.wl.boot.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author 17997
 */
public class MyEvent extends ApplicationEvent {
    public MyEvent (Object source){
        super(source);
    }
}
