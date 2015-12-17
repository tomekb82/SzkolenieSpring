/*
 * Copyright 2012-09-12 the original author or authors.
 */
package pl.sages.spring.lab;

import org.springframework.stereotype.Component;

@Component
public class TargetBean implements NewInterface {
    
    @Override
    public void someMethod(int id) {
        System.out.println("in someMethod(), id=" + id);
    }
    
    @Override
    public void otherMethod() {
        System.out.println("in otherMethod()");
    }

}
