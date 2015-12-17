/*
 * Copyright 2012-09-12 the original author or authors.
 */
package pl.sages.spring.lab;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.Arrays;

@Aspect
public class MyAspect {

  //  @Pointcut("execution(public * *(..))")// the pointcut expression
    private void pointcut() {}// the pointcut signature

    @Before("execution(* pl.sages.spring.*.*(..))")
    public void interceptBefore(){//JoinPoint joinPoint) {
        System.out.println("MyAspect, method signature:");// + joinPoint.getSignature());
        //System.out.println("MyAspect, method args:" + Arrays.toString(joinPoint.getArgs()));

    }
    
}
