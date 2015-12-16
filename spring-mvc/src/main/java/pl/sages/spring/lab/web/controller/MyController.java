/*
 * Copyright 2011-08-31 the original author or authors.
 */
package pl.sages.spring.lab.web.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MyController {
    
    protected Logger logger = Logger.getLogger(getClass());
    
    @RequestMapping("/")
    public ModelAndView home() {
        
        logger.debug("MyController.home()");
        
        return new ModelAndView("home");
    }
    
}
