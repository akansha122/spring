package com.zensar.spring.instruments;

import org.springframework.stereotype.Component;

@Component
public class Guitar implements Instrument {

	@Override
	public void play() {
	  System.out.print("ting ting ting");	
	}

}
