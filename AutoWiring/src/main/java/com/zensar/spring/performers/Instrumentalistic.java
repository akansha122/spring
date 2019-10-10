package com.zensar.spring.performers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.zensar.spring.instruments.Instrument;

@Component("pyare mohan")
public class Instrumentalistic implements Performer {
	@Autowired
	@Qualifier("violin")
	private Instrument instrument;
	@Value("hum toh udd gye")
	private String song;

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("instrumentalistic is playing a song " + song);
		instrument.play();
	}

}
