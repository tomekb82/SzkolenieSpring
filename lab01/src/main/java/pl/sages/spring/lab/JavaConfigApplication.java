package pl.sages.spring.lab;

import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.beans.PropertyEditor;
import java.util.HashMap;

/**
 * Created by Administrator on 2015-12-14.
 */
@org.springframework.context.annotation.Configuration
@ComponentScan("pl.sages.spring")
public class JavaConfigApplication {

    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigApplication.class);
        System.out.println(context.getBean("person"));
    }

    @Bean
     public Person person(){
        Person p =  new Person();
        p.setName("T");
        p.setLastName("B");
        p.setBasicAddress(address());
        return p;
    }

    @Bean
    public CustomEditorConfigurer customEditor(){
        CustomEditorConfigurer c =  new CustomEditorConfigurer();
        HashMap<Class<?>, Class<? extends PropertyEditor>> mapa = new HashMap<Class<?>, Class<? extends PropertyEditor>>();
        mapa.put(BasicAddress.class, AddressConverter.class);
        c.setCustomEditors(mapa);
        return c;
    }

    @Bean
    public BasicAddress address(){
       return new BasicAddress();
    }

}
