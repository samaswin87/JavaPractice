package com.string.practice;

import static java.lang.System.out;

import java.text.DateFormat;


public class StringBufferEx {
	
	public static void main(String... args) {
		StringBuffer sb = new StringBuffer();
		sb.append("flag: ");
		sb.append(true);
		out.println(sb.toString()); 
	}

}
