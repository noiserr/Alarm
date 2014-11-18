package org.zmp.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import java.awt.event.*;
import javax.swing.*;
@Aspect
public class LogginAspect {


    @After("allMessageMethods()")
    public void loggingAdvice(){

        System.out.println("Loguje");

    }

    @Pointcut("within(org.zmp.model.alarm..*)")
    public void allMessageMethods(){}


}
