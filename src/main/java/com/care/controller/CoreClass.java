package com.care.controller;

public class CoreClass {
	// 프로젝트 완성된 상태
	public void corePrint() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(100);
				System.out.println("핵심 기능 실행!!!(이미 만든 프로그램)");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
