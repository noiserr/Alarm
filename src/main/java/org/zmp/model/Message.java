package org.zmp.model;



public class Message {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;    }
    public void showName(){
        System.out.println("My name is " + name);
    }

    public void showCos(){
        System.out.printf("gunwo");
    }
}
