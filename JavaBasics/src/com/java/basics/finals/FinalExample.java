package com.java.basics.finals;

public class FinalExample extends FinalMethod {
	
	// can not extend final class
	// final method can not override
	public static void main(String[] args) {
		FinalClass  fi = new FinalClass();
		fi.print();
		
		FinalExample fe = new FinalExample();
		fe.print();
		
		FinalMethod fm = new FinalMethod();
		fm.print();
		fm.print1();
	}
	
	public void print() {
		System.out.println("Pring Sub");
	}

}
