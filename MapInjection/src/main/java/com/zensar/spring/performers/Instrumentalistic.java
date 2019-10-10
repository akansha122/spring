package com.zensar.spring.performers;

import java.util.Map;
import java.util.Map.Entry;

import com.zensar.spring.instruments.Instrument;

public class Instrumentalistic implements Performer {
	private Map<Instrument, String> instrumentSongMap;

	public Map<Instrument, String> getInstrumentSongMap() {
		return instrumentSongMap;
	}

	public void setInstrumentSongMap(Map<Instrument, String> instrumentSongMap) {
		this.instrumentSongMap = instrumentSongMap;
	}

	@Override
	public void perform() {
	   System.out.println("Instrumentalist is playing song");
	   
       for(Entry<Instrument, String> map:instrumentSongMap.entrySet())
       {
    	   map.getKey().play(); 
           System.out.println("song"+" "+ map.getValue());
             
       }
	}
}
