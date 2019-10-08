package com.zensar.spring.poems;

import java.sql.Array;

public class TwinkleTwinkle implements Poem {
     
	private static final String LINES[]= {
			"twinkle twinkle little star", "how i wander what you are", "up above the world so high", "like a diamond in a sky"
	 };
	@Override
	public void resite() {
     for(String line:LINES)
     {
    	 System.out.println(line);
     }
	}

}
