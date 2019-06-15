package com.string.functions;

public class Compare {
	
	public static void main(String args[]) {
		String first = new String("first");
		String second = new String("secon");
		compare(first, second);
		
		first = new String("same");
		second = new String("same");
		compare(first, second);
		
		first = new String("secon");
		second = new String("first");
		compare(first, second);
		
		first = new String("same");
		second = new String("Same");
		compare(first, second);
		
		first = new String("same");
		second = new String("Same");
		compareIgnoreCase(first, second);
		
		first = new String("First");
		second = new String("Second");
		compareIgnoreCase(first, second);
	}
	
	public static void compare(String s1, String s2) {
		if (s1.compareTo(s2) == 0)
			System.out.println("Equal");
		else if (s1.compareTo(s2) > 0)
			System.out.println("Lexicographically greater");
		else if (s1.compareTo(s2) < 0)
			System.out.println("Lexicographically less");
		else
			System.out.println("Hell No");
	}
	
	public static void compareIgnoreCase(String s1, String s2) {
		if (s1.compareToIgnoreCase(s2) == 0)
			System.out.println("Equal");
		else if (s1.compareToIgnoreCase(s2) > 0)
			System.out.println("Lexicographically greater");
		else if (s1.compareToIgnoreCase(s2) < 0)
			System.out.println("Lexicographically less");
		else
			System.out.println("Hell No");
	}

}
