/*
 * Copyright 2012-09-12 the original author or authors.
 */
package pl.sages.spring.lab;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;


public class MyInterceptor {

    public void intercept(ProceedingJoinPoint proceedingJoinPoint) {
        
        System.out.println("MyInterceptor: before method");
        
        Object[] params = {2}; 
        
        try {
            
            if(proceedingJoinPoint.getArgs().length != 0) {
                proceedingJoinPoint.proceed(params);
            } else {
                proceedingJoinPoint.proceed();
            }
        } catch (Throwable ex) {
            Logger.getLogger(MyInterceptor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("MyInterceptor: after method");
        
    }
    
}
