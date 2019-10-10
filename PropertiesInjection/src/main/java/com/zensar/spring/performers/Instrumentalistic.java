package com.zensar.spring.performers;

import java.util.Enumeration;
import java.util.Properties;

public class Instrumentalistic implements Performer {

	private Properties instrumentSongProps;

	public Properties getInstrumentSongProps() {
		return instrumentSongProps;
	}

	public void setInstrumentSongProps(Properties instrumentSongProps) {
		this.instrumentSongProps = instrumentSongProps;
	}

	@Override
	public void perform() {
		System.out.print("instrumentalist is playing songs");
		Enumeration instrument = instrumentSongProps.keys();// collection of key(string or txt)
		while (instrument.hasMoreElements()) {
			String intrumentName = (String) instrument.nextElement();
			String song = instrumentSongProps.getProperty(intrumentName);
			System.out.println(song + " by " + intrumentName);
		}

	}

}
