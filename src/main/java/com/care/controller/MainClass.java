package com.care.controller;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationAOP_01.xml");
		CoreClass tc = ctx.getBean("core", CoreClass.class);
		
		System.out.println("main start!!!!");
		tc.corePrint();
		System.out.println("main end!!!");
		ctx.close();
	}
}
