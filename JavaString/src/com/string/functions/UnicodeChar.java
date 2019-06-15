package com.string.functions;

public class UnicodeChar {

	public static void main(String args[]) {
		String s = new String("Test String");
		System.out.println(s.charAt(0));
		System.out.println(s.codePointAt(0));
		System.out.println(s.codePointBefore(1));
		System.out.println(s.codePointCount(1, 3));
	}
}
