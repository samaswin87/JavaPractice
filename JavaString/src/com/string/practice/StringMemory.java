package com.string.practice;

public class StringMemory {

	public static void main(String args[]) {
		String s = new String("Test");
		String s1 = new String("Test");
		System.out.println(s == s1);
		
		System.out.println(s.equals(s1));
		
		String s3 = "Test";
		String s4 = "Test";
		System.out.println(s3 == s4);
	}	
}