package com.zensar.spring.performers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.zensar.spring.exceptions.PerformanceException;

@Component("ram")
public class Juggler implements Perfomer {
	@Value("5")
	private int beanBags;

	@Override
	public void perform() throws PerformanceException {
		if (beanBags < 3) {
			throw new PerformanceException("no of bean bags are not sufficient");
		} else {
			System.out.print("juggling juggler beanbags"+" "+beanBags);
		}
	}

}
