package com.zensar.spring.performers;

import java.util.List;
import java.util.Set;

import com.zensar.spring.instruments.Instrument;

public class Instrumentalistic implements Performer {

	private String song;
	private Set<Instrument> instruments;

	public Set<Instrument> getInstruments() {
		return instruments;
	}

	public void setInstruments(Set<Instrument> instruments) {
		this.instruments = instruments;
	}

	public Instrumentalistic() {
		// TODO Auto-generated constructor stub
		System.out.println("Instrumental is created");
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
		System.out.println("instrumentalistic is playing a song " + song);
		
		for(Instrument inst:instruments)
		{
			inst.play();
		}
	}

}
