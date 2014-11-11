package org.zmp.core;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zmp.gui.AppGUI;
import org.zmp.model.Message;

/**
 * Created by MM on 2014-11-11.
 */
public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Message message = (Message) context.getBean("message");
        message.showName();
        AppGUI app = new AppGUI();

    }
}
