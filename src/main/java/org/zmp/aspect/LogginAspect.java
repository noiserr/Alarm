package org.zmp.aspect;

import org.aspectj.lang.annotation.*;


@Aspect
public class LogginAspect {

    @Before("allMessageMethods()")
    public void logging(){
        System.out.println("Ha! My name is...");
    }

    @Pointcut("execution(* show*())")
    public void allMessageMethods(){}
}
