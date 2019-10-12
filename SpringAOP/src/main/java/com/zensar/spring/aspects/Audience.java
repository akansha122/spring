package com.zensar.spring.aspects;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Audience {
	@Pointcut("execution(* *.perform(..))") // or
	// @Pointcut("execution(void *.perform(..)")or
	// @Pointcut("execution(void
	// com.zensar.spring.performers.Juggler.perform(..)")or
	// @Pointcut("execution(public void
	// com.zensar.spring.performers.Juggler.perform(..)")
	public void performancePointCut() {
	}

	@Before("performancePointCut()")
	public void takeSeats() {
		System.out.println("audience is taking their seats");
	}

	//@Before("performancePointCut()")or
	@Before("execution(* *.perform(..))")
	public void switchOffCellPhones() {
		System.out.println("audience is switching of their cell phones");
	}

	@AfterReturning("performancePointCut()")
	public void aploud() {
		System.out.println("CLAP CLAP CLAP");
	}

	@AfterThrowing("performancePointCut()")
	public void demandRefund() {
		System.out.println("Give me my money back!!!!");
	}
}
