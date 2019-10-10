package com.zensar.spring.instruments;

import org.springframework.stereotype.Component;

@Component
public class Violin implements Instrument{

	@Override
	public void play() {
	         System.out.println("voilin is created");
	}        
}
