package com.string.practice;

import java.util.Scanner;

/*
 * Given a string, s, and an integer, k, complete the function so that it finds the lexicographically 
 * smallest and largest substrings of length k.
 */
public class Problem3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
		System.out.println(getSmallestAndLargest(s, k));
	}
	
	public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        
        for(int i = 0; i <= s.length() - k; i++) {
        	String value = s.substring(i,k+i);
        	if (smallest.compareTo(value) > 0){
        		smallest = value;
        	}
        	
        	if(largest.compareTo(value) < 0){
                largest = value;
            }
        }
        
        return smallest + "\n" + largest;
    }
}
