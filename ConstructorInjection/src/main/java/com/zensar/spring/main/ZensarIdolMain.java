package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.zensar.spring.performers.Performer;

public class ZensarIdolMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("performers.xml");
		Performer p = context.getBean("Pyare Mohan", Performer.class);
		p.perform();
		Performer p1 =context.getBean("ketrina kaif", Performer.class);
		p1.perform();
	}

}
