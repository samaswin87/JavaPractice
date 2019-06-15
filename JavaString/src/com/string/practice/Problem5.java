package com.string.practice;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Print "Anagrams" if A and B are case-insensitive anagrams of each other; 
 * otherwise, print "Not Anagrams" instead.
 */


public class Problem5 {
	
	public static void main(String[] args) {
	    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram2(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
	
	static boolean isAnagram1(String a, String b) {
		
		if (a.length() != b.length())
			return false;
		
		char[] aArray = a.toLowerCase().toCharArray();
		char[] bArray = b.toLowerCase().toCharArray();
		Arrays.sort(aArray);
		Arrays.sort(bArray);
		
		return Arrays.equals(aArray, bArray);
    }
	
	
	static boolean isAnagram2(String a, String b) {
		
		if (a.length() != b.length())
			return false;
		
		char[] aArray = a.toLowerCase().toCharArray();
		char[] bArray = b.toLowerCase().toCharArray();
		
		int aIArray[] = new int[aArray.length];
		int bIArray[] = new int[bArray.length];
		
		for (int i = 0; i < aArray.length; i++) {
			aIArray[i] = (int) aArray[i];
		}
		
		for (int i = 0; i < bArray.length; i++) {
			bIArray[i] =  (int) bArray[i];
		}
		
		aIArray = sort(aIArray);
		bIArray = sort(bIArray);
		return compareArrays(aIArray, bIArray);
		  
		
    }
	
	public static int[] sort(int a[]) {
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			
		}
		return a;
	}
	
	public static boolean compareArrays(int[] array1, int[] array2) {
        boolean b = true;
        if (array1.length != array2.length)
              b = false;
        else
        	for (int i = 0; i < array2.length; i++) {
              if (array2[i] != array1[i]) {
                  b = false;    
              }                 
        	}
        return b;
    }
	

}
