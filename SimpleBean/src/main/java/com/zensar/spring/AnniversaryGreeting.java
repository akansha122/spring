package com.zensar.spring;

public class AnniversaryGreeting implements Greeting {

	public AnniversaryGreeting() {
		// TODO Auto-generated constructor stub
		System.out.println("AnniversaryGreeting is created");
	}

	@Override
	public String greet() {
		return "Happy Work Anniversary";
	}

}
