package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.zensar.spring.Greeting;
import com.zensar.spring.config.GreetingConfig;

public class SpringMain {
	public static void main(String[] args) {
		//creating the object of sping IOC container
		ApplicationContext ctx= new AnnotationConfigApplicationContext(GreetingConfig.class);
		
		//retriving object of anniversaryGreeting.
		Greeting greeting1=ctx.getBean("festival", Greeting.class);
		//System.out.println(greeting1.greet());
		
		Greeting greeting2=ctx.getBean("anniversary", Greeting.class);
		//System.out.println(greeting2.greet());
	}
}
