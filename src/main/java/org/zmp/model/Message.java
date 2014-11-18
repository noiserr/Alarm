package org.zmp.model;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
public class Message {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;    }
    @Lookup
    public void showName(){
        System.out.println("My name is " + name);
    }

    public void showCos(){
        System.out.printf("gunwo");
    }
}
