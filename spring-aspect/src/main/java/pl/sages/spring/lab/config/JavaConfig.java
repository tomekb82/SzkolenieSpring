package pl.sages.spring.lab.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import pl.sages.spring.lab.TargetBean;

/**
 * Created by tomek on 17.12.15.
 */
@Configuration
@ComponentScan(basePackages = "pl.sages.spring.lab")
@EnableAspectJAutoProxy
public class JavaConfig {

    public static void main(String [] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        context.getBean(TargetBean.class).someMethod(0);

    }

}
