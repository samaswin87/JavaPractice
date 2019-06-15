package com.string.practice;

import java.util.Scanner;

/*
 * A palindrome is a word, phrase, number, or other sequence of characters which 
 * reads the same backward or forward.(Wikipedia)
 */
public class Problem4 {
	

	public static void main(String[] args) {    
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String reverse = "";
        for(int i = A.length() - 1; i >= 0; i--) {
        	reverse = reverse + Character.toString(A.charAt(i));
        }
        
        if (reverse.equals(A)) {
        	System.out.println("Yes");
        }else {
        	System.out.println("No");
        }
    }

}
