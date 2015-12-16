/*
 * Copyright 2012-09-12 the original author or authors.
 */
package pl.sages.spring.lab;

import org.aspectj.lang.JoinPoint;

import java.util.Arrays;


public class MyAspect {
    
    public void interceptBefore(JoinPoint joinPoint) {
        System.out.println("MyAspect, method signature:" + joinPoint.getSignature());
        System.out.println("MyAspect, method args:" + Arrays.toString(joinPoint.getArgs()));

    }
    
}
