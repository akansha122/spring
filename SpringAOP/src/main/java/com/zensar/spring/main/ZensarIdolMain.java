package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zensar.spring.config.PerformerConfig;
import com.zensar.spring.exceptions.PerformanceException;
import com.zensar.spring.performers.Perfomer;

public class ZensarIdolMain {

	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(PerformerConfig.class);
        Perfomer p=context.getBean("ram",Perfomer.class);
        try {
			p.perform();
		} catch (PerformanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
