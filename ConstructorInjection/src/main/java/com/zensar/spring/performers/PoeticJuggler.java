package com.zensar.spring.performers;

import com.zensar.spring.poems.Poem;

public class PoeticJuggler extends Juggler {

	private Poem poem;

	public PoeticJuggler() {
		System.out.println("no-arg constructor");
	}

	public PoeticJuggler(int beanBags, Poem poem) {
		super(beanBags);
		this.poem = poem;
	}

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		super.perform();
		System.out.println("while resiting a peom");
		poem.resite();
	}

}
