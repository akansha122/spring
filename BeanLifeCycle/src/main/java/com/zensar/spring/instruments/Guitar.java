package com.zensar.spring.instruments;

public class Guitar implements Instrument {

	@Override
	public void play() {
	  System.out.println("ting ting ting");	
	}

	@Override
	public void tune() {
		// TODO Auto-generated method stub
		System.out.println("guitar is tune");
	}

	@Override
	public void clean() {
		// TODO Auto-generated method stub
		System.out.println("guitar is clean");
	}

}
