package com.string.practice;

import java.util.Scanner;

/*
 * Given two strings of lowercase English letters, A and B , perform the following operations:
 * Sum the lengths of A and B.
 * Determine if A is lexicographically larger than B (i.e.: does B come before A in the dictionary?).
 * Capitalize the first letter in A and B and print them on a single line, separated by a space.
 * */
public class Problem1 {
	public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        System.out.println("Sum the lengths of A and B: "+ (A.length() + B.length()));
        String isLexicographically;
        if (A.compareTo(B) >= 1) {
        	isLexicographically = "Yes";
        }
        else {
        	isLexicographically = "No";
        }
        System.out.println("does  come before  in the dictionary? " + isLexicographically);
        System.out.println(capitalize(A) +" "+ capitalize(B));
    }
	
	private static String capitalize(String str) {
		return str.substring(0, 1).toUpperCase() + str.substring(1);
	}
}

