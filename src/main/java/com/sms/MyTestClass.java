package com.sms;

public class MyTestClass {

	public static void main(String[] args) {
	
		System.out.println(wish("Salumiah"));;
	}
	
	public static String wish(String name) {

		System.out.println("given name : "+name);
		return "Hello "+name;
	}

}
