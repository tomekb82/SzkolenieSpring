package pl.sages.spring.lab;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Administrator on 2015-12-14.
 */
@Service
public class UserServiceImpl {

    @PostConstruct
    public void init(){
        System.out.println("initialization...");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroying...");
    }
}
