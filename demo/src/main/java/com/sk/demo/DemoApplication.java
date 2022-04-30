package com.sk.demo;

import com.sk.demo.sorting.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
		/*
			we will get same object for same bean
			1)In spring by default any bean is singleton bean
			2)prototype - new bean whenever requested
			3)request - one bean per http req
			4)session  - one bean per http session
			To use prototype:
			@Component
			@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
			public class BinarySearchImpl {}
		 */
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		binarySearch.binarySearch(new int[] {2,3}, 2);
	}

}
