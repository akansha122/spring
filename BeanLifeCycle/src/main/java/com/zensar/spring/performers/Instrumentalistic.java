package com.zensar.spring.performers;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.zensar.spring.instruments.Instrument;

public class Instrumentalistic implements Performer, BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
	private String name;
	private Instrument instrument;
	private String song;

	public Instrumentalistic() {
		// TODO Auto-generated constructor stub
		System.out.println("Instrumentalistic is created");
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
		System.out.println("instrument is set");
	}

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
		System.out.println("song is set");
	}

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("instrumentalistic is playing a song " + song+" "+name);
		instrument.play();
	}

	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		this.name=name; 
		System.out.println("beanName is set");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("beanFactory is set");
		
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Applicationcontext is set");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("afterPropertiesSet is set");
		//instrument.tune();
	}
	
	public void tuneInstrument()
	{
		System.out.println("custom init method");
		instrument.tune();
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy is called");
		instrument.clean();
	}
	
	public void cleanInstrument()
	{
		System.out.println("custom-destroy is called");
	}

}
