package com.sk.demo;

import com.sk.demo.cdi.CDIBuisness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CDIApplication {

    private static Logger logger = LoggerFactory.getLogger(CDIApplication.class);
    public static void main(String[] args){
        ApplicationContext applicationContext = SpringApplication.run(CDIApplication.class);
        CDIBuisness cdiBuisness = applicationContext.getBean(CDIBuisness.class);
        logger.info("CDIBuisness: {}, CDIDao: {}",cdiBuisness,cdiBuisness.getCdiDao());
    }
}
