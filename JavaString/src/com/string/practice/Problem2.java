package com.string.practice;

import java.util.Scanner;

/**
 * 
 * Given a string, s, and two indices, start and end, print a substring consisting of all characters in the 
 * inclusive range from to end -1. 
 *
 */
public class Problem2 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        
        System.out.println(S.substring(start, end));
    }
}
