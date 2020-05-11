package com.care.controller;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class CommonClass {
	public void commonAop(ProceedingJoinPoint joinpoint) {
		try {
			System.out.println("===공통 기능 시작===");
			joinpoint.proceed();	// 공통기능 일시중지
			System.out.println("===공통 기능 종료===");
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	
	public void beforeAdvice(JoinPoint joinPoint) {
		System.out.println("beforeAdvice() 핵심 기능 전에 실행");
	}
}
