package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.performers.Performer;

public class ZensarIdolMain {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("performers.xml");
        Performer p=context.getBean("akansha", Performer.class);
		p.perform();
		ConfigurableApplicationContext cfgCtx=(ConfigurableApplicationContext) context;
		cfgCtx.close();//to tell spring ioc container to shut down
	}
}
