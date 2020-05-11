package com.care.aop_ex02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationAOP_02.xml");
		CoreClass tc = ctx.getBean("core", CoreClass.class);
		
		System.out.println("main start!!!!");
		//tc.corePrint();
		//tc.corePrint02();
		tc.test();
		System.out.println("main end!!!");
		ctx.close();
	}
}
