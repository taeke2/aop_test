package com.care.aop_ex02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect	// 공통 기능으로 사용한다.
public class CommonClass {
	@Around("within(com.care.aop_ex02.*)")
	public void commonAop(ProceedingJoinPoint joinpoint) {
		try {
			System.out.println("===공통 기능 시작===");
			joinpoint.proceed(); // 공통기능 일시중지 -> CoreClass 실행됨
			System.out.println("===공통 기능 종료===");
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	
	@Before("execution(* com.care.aop_ex02.CoreClass.test())")
	public void beforeAdvice(JoinPoint joinPoint) {
		System.out.println("beforeAdvice() 핵심 기능 전에 실행");
	}
}
