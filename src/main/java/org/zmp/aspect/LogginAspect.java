package org.zmp.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.zmp.model.Message;


@Aspect
public class LogginAspect {

//    @Before("allMessageMethods()")
//    public void logging(){
//        System.out.println("Ha! My name is...");
//    }
    @After("allMessageMethods()")
    public void loggingAdvice(JoinPoint joinPoint){
//        Message msg = (Message) joinPoint.getTarget();
//        System.out.println(msg.getName());
        System.out.println("Loguje");

    }

    @Pointcut("execution(* show*())")
    public void allMessageMethods(){}
}
