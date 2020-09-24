package com.java.ludo;

import java.util.HashMap;
import java.util.Scanner;

public class LudoMain {

	public static void main(String[] args) {
		HashMap<Integer, String[]> mainLudo = getList();
		// safe block *
		printLudo(mainLudo);
		System.out.println("Enter Quit to exit Game.");
		Scanner sc= new Scanner(System.in); 
		String loop = sc.next();

		String term = "R";
		int diceValue = 0;

		while(!loop.equalsIgnoreCase("quit")) {
			
			diceValue = (int)(Math.random()*6) + 1; // get dice value
			System.out.println("Term is "+term + " Value: "+ diceValue);
			
			loop = movePlayer(mainLudo, diceValue, term);
			
			switch (term) {
			case "R":
				term = "B";
				break;
			case "B":
				term = "Y";
				break;
			case "Y":
				term = "G";
				break;
			case "G":
				term = "R";
				loop = "QUIT"; // temporary
				break;
			}
		}
		sc.close();
		System.out.println("'"+term + "' Player Win the Game!!");
	}

	private static String movePlayer(HashMap<Integer, String[]> mainLudo, int diceValue, String term) {
		return "cont";
	}

	private static void printLudo(HashMap<Integer, String[]> ludo) {
		System.out.println("------------------------------------------------------------------------------------------");
		ludo.forEach((k, v) -> {
			System.out.println(
					v[0] + v[1] + v[2] + v[3] + v[4] + v[5] + v[6] + v[7]
							+ v[8] + v[9] + v[10] + v[11] + v[12] + v[13] + v[14]
					); 
			System.out.println("------------------------------------------------------------------------------------------");
		}); 
	}

	private static HashMap<Integer, String[]> getList() {
		String[] row0 = {"|G    ", "G G G ", "G G G ", "G G G ", "G G G ", "     G","|     ", "|     ", "|    |", "R     ", "R R R ", "R R R ", "R R R ", "R R R ", "    R|"}; 
		String[] row1 = {"|G    ", "      ", "      ", "      ", "       ", "    G","|     ", "|     ", "|  * |", "R     ", "      ", "      ", "      ", "      ", "    R|"}; 
		String[] row2 = {"|G    ", "      ", "| G   ", "|  G |", "       ", "    G","|  *  ", "|     ", "|    |", "R     ", "      ", "|  R  ", "|  R |", "      ", "    R|"};
		String[] row3 = {"|G    ", "      ", "| G   ", "|  G |", "       ", "    G","|     ", "|     ", "|    |", "R     ", "      ", "|  R  ", "|  R |", "      ", "    R|"};
		String[] row4 = {"|G    ", "      ", "      ", "      ", "       ", "    G","|     ", "|     ", "|    |", "R     ", "      ", "      ", "      ", "      ", "    R|"};
		String[] row5 = {"|G    ", "G G G ", "G G G ", "G G G ", "G G G ", "     G","|     ", "|     ", "|    |", "R     ", "R R R ", "R R R ", "R R R ", "R R R ", "    R|"};

		String[] row6 = {"|     ", "|  *  ", "|     ", "|     ", "|     ", "|     ","|  D  ", "|  E  ", "|  S |", "      ", "|     ", "|     ", "|  *  ", "|     ", "|    |"};
		String[] row7 = {"|     ", "|     ", "|     ", "|     ", "|     ", "|     ","|  T  ", "|     ", "|  I |", "      ", "|     ", "|     ", "|     ", "|     ", "|    |"};
		String[] row8 = {"|     ", "|     ", "|  *  ", "|     ", "|     ", "|     ","|  N  ", "|  T  ", "|  N |", "      ", "|     ", "|     ", "|     ", "|  *  ", "|    |"};

		String[] row9 =  {"|Y    ", "Y Y Y ", "Y Y Y ", "Y Y Y ", "Y Y Y ", "     Y","|     ", "|     ", "|    |", "B     ", "B B B ", "B B B ", "B B B ", "B B B ", "    B|"};		
		String[] row10 = {"|Y    ", "      ", "      ", "      ", "       ", "    Y","|     ", "|     ", "|    |", "B     ", "      ", "      ", "      ", "      ", "    B|"}; 
		String[] row11 = {"|Y    ", "      ", "| Y   ", "|  Y |", "       ", "    Y","|     ", "|     ", "|    |", "B     ", "      ", "|  B  ", "|  B |", "      ", "    B|"}; 
		String[] row12 = {"|Y    ", "      ", "| Y   ", "|  Y |", "       ", "    Y","|     ", "|     ", "|  * |", "B     ", "      ", "|  B  ", "|  B |", "      ", "    B|"};
		String[] row13 = {"|Y    ", "      ", "      ", "      ", "       ", "    Y","|   * ", "|     ", "|    |", "B     ", "      ", "      ", "      ", "      ", "    B|"};
		String[] row14 = {"|Y    ", "Y Y Y ", "Y Y Y ", "Y Y Y ", "Y Y Y ", "     Y","|     ", "|     ", "|    |", "B     ", "B B B ", "B B B ", "B B B ", "B B B ", "    B|"};

		HashMap<Integer, String[]> retMap = new HashMap<>();
		retMap.put(0, row0);
		retMap.put(1, row1);
		retMap.put(2, row2);
		retMap.put(3, row3);
		retMap.put(4, row4);
		retMap.put(5, row5);
		retMap.put(6, row6);

		retMap.put(7, row7);
		retMap.put(8, row8);
		retMap.put(9, row9);

		retMap.put(10, row10);
		retMap.put(11, row11);
		retMap.put(12, row12);
		retMap.put(13, row13);
		retMap.put(14, row14);

		return retMap;
	}

}
