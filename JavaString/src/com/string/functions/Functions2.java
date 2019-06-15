package com.string.functions;

public class Functions2 {

	public static void main(String args[]) {
		String name = "aswin test name";
		
		System.out.println(name.isEmpty());
		
		System.out.println(String.join(" -", name, " added"));
		
		System.out.println(name.length());
		
		System.out.println(name.matches(""));
	}
}
