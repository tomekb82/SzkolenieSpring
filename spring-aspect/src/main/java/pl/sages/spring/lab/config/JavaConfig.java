package pl.sages.spring.lab.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import pl.sages.spring.lab.MyAspect;
import pl.sages.spring.lab.TargetBean;

/**
 * Created by tomek on 17.12.15.
 */
@Configuration
@ComponentScan(basePackages = "pl.sages.spring.lab")
@EnableAspectJAutoProxy
public class JavaConfig {

    @Bean
    public MyAspect myAspect(){
        return new MyAspect();
    }

}
