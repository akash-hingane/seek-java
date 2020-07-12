package com.java.dotCross;

import java.util.*;

public class DotCrossMain {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		System.out.println("Press 0 to Exit.");
		
//		System.out.println(0%2+ " " + 1%2+ " "+ 2%2 +" " + 3%2);

		int player = 0;
		String[] first = {"", "-", "-", "-"};
		String[] second = {"", "-", "-", "-"};
		String[] third = {"", "-", "-", "-"};
		System.out.println("Your Matrix is\n");
		showMatrix(first, second, third);
		int loop = sc.nextInt();
		while (loop != 0) {
			// Display Matrix
			
			//Accept matrix location
//			System.out.println("Enter Row number First and then Column Number starting from 1 to 3");
			System.out.println("Player: "+player%2);
			
			player = player + AcceptAndValidate.accept(getlocation(sc), getlocation(sc), first, second, third, player);
			
			showMatrix(first, second, third);

			// Exit Code
			if (player > 1000) {
				System.out.println("Player: "+player%2 +" Win.");
				loop = 0;
			}
//			else {
//				System.out.println("Press Zero to Exit.");
//				loop = sc.nextInt();
//			}
		}
		sc.close();
		System.out.println("out1");
	}

	private static int getlocation(Scanner sc) {
		int returnIndex = 0;
		while (!(returnIndex > 0 && returnIndex <= 3)) {
//			System.out.println("Give Correct location");
			returnIndex = sc.nextInt();
		}
		return returnIndex;
	}

	private static void showMatrix(String[] first, String[] second, String[] third) {
		System.out.println(" "+ first[1]+ " "+first[2]+ " "+first[3]+"\n"
				+ " "+ second[1]+ " "+second[2]+ " "+second[3]+"\n"
				+ " "+ third[1]+ " "+third[2]+ " "+third[3]+"\n");

	}

}
