package com.zensar.spring.performers;

import com.zensar.spring.megicBoxs.MegicBox;

public class Megician implements Performer {
	private String megicWords;
    private MegicBox megicBox;
    
	public String getMegicWords() {
		return megicWords;
	}

	public void setMegicWords(String megicWords) {
		this.megicWords = megicWords;
	}

	public MegicBox getMegicBox() {
		return megicBox;
	}

	public void setMegicBox(MegicBox megicBox) {
		this.megicBox = megicBox;
	}

	@Override
	public void perform() {
		  System.out.println("Megician says "+megicWords);
		  System.out.println(megicBox.getContent());
	}
}
