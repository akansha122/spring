package com.zensar.spring.performers;

import com.zensar.spring.instruments.Instrument;

public class Instrumentalistic implements Performer {

	private Instrument instrument;
	private String song;

	public Instrumentalistic() {
		// TODO Auto-generated constructor stub
		System.out.println("Instrumental is created");
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
		System.out.println("instrumentalistic is playing a song "+song);
		instrument.play();
	}

}
