/*
 * Copyright 2012-09-12 the original author or authors.
 */
package pl.sages.spring.lab;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import pl.sages.spring.lab.NewInterface;
import pl.sages.spring.lab.config.JavaConfig;


@ContextConfiguration(classes=JavaConfig.class)//"/spring-context.xml")
public class TestAspect extends AbstractJUnit4SpringContextTests {
    
    @Autowired
    NewInterface bean;
    
    @Test
    public void test() {

        System.out.println(bean.getClass());

        bean.someMethod(1);
        bean.otherMethod();
    }
}
