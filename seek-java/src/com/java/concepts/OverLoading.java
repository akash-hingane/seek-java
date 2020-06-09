package com.java.concepts;

import java.math.BigDecimal;

public class OverLoading {

	public static void main(String[] args) {
//	static {
		print(0, 1);
		print("Welcome");
		print(new BigDecimal(19/5));

	}

	private static void print(BigDecimal i) {
		System.out.println("Division is: "+i);
	}

	private static void print(String str) {
		System.out.println("Entered String is: "+str);
	}

	private static void print(int i, int j) {
		System.out.println("Addition is: "+(i+j));
	}

}

/* Ouptput 
 * Addition is: 1
 * Entered String is: Welcome
 * Division is: 3
*/