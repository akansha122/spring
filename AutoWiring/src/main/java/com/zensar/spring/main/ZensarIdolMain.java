package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zensar.spring.config.PerformerConfig;
import com.zensar.spring.performers.Performer;

public class ZensarIdolMain {

	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(PerformerConfig.class);//calling constructor
		Performer p=context.getBean("pyare mohan", Performer.class);
		p.perform();
	}

}
