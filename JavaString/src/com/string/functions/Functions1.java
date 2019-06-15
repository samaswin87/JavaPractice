package com.string.functions;

public class Functions1 {

	public static void main(String args[]) {
		String fname = "aswin";
		String lname = " r";
		String name = fname.concat(lname);
		System.out.println(name);
		
		System.out.println(name.contains("win"));
		
		System.out.println(name.contentEquals("aswin r"));
		
		System.out.println(name.contentEquals(new StringBuffer("aswin r")));
		
		System.out.println(name.equals("aswin r"));
		
		System.out.println(name.equalsIgnoreCase("aswin R"));
		
		System.out.println(name.endsWith(" r"));
		
		System.out.println(name.indexOf("r"));
		
		System.out.println(name.indexOf("win"));
		
		System.out.println(name.indexOf("w", 1));
		
		System.out.println(name.lastIndexOf("w"));
	}
}
