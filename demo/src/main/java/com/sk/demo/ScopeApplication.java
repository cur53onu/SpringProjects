package com.sk.demo;

import com.sk.demo.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class ScopeApplication {

	private static Logger logger = LoggerFactory.getLogger(ScopeApplication.class);
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ScopeApplication.class, args);
		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
		PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);

		logger.info("personDAO: {}, JDBC: {}",personDAO,personDAO.getJdbcConnection());
		logger.info("personDAO: {}, JDBC: {}",personDAO2,personDAO2.getJdbcConnection());
	}

}
