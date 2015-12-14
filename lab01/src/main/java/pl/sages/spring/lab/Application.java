/**
 * Copyright 2015-12-14 the original author or authors.
 */
package pl.sages.spring.lab;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Application {

    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        context.registerShutdownHook();

        Person p = context.getBean(Person.class);
        System.out.println(p);

    }

}
