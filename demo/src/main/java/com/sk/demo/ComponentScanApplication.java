package com.sk.demo;

import com.sk.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.sk")
public class ComponentScanApplication {

    private static Logger logger = LoggerFactory.getLogger(ComponentScanApplication.class);
    public static void main(String[] args){
        ApplicationContext applicationContext = SpringApplication.run(ComponentScanApplication.class);
        ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);
        logger.info("{}",componentDAO);
    }

}
