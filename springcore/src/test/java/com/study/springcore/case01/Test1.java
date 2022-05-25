package com.study.springcore.case01;

public class Test1 {

	public static void main(String[] args) throws ClassNotFoundException {
		// 靜態獲得(多個會造成資源浪費)
		HelloTime helloTime = new HelloTime();
		System.out.println(helloTime.sayHi());
		
	}
	
}
