package com.java.dotCross;

public class AcceptAndValidate {

	public static int accept(int rowNo, int columnNo, String[] firstRW, String[] secondRW, String[] thirdRW, int playerTerm) {

		int player = playerTerm%2;
		String sign[] = {"*", "+"};
		int playerCounter = 0;

		switch(rowNo) {
		case 1 : playerCounter = validateAndInert(firstRW, columnNo, sign[player]);
		break;

		case 2 : playerCounter = validateAndInert(secondRW, columnNo, sign[player]);
		break;

		case 3 : playerCounter = validateAndInert(thirdRW, columnNo, sign[player]);
		break;
		}
		//		boolean isWinner = displayResult(firstRW, secondRW, thirdRW);
		if (displayResult(firstRW, secondRW, thirdRW)) 
			return 1000;
		else
			return playerCounter;
	}

	private static boolean displayResult(String[] firstRW, String[] secondRW, String[] thirdRW) {
		if (checkRow(firstRW) ) {
			return true;
		} else if ( checkRow(secondRW) ) {
			return true;
		} else if ( checkRow(thirdRW) ) {
			return true;
		} else if ( checkColumnAndDiagonal(firstRW, secondRW, thirdRW) ) {
			return true;
		} else
			return false;
	}

	private static boolean checkColumnAndDiagonal(String[] firstRW, String[] secondRW, String[] thirdRW) {
		if (column(1, firstRW, secondRW, thirdRW)) {
			return true;
		} else if (column(2, firstRW, secondRW, thirdRW)) {
			return true;
		} else if (column(3, firstRW, secondRW, thirdRW)) {
			return true;
		} else if(diagonal(firstRW, secondRW, thirdRW)) {
			return true;
		} else {
			return false;
		}

	}

	private static boolean diagonal(String[] firstRW, String[] secondRW, String[] thirdRW) {
		if (!firstRW[1].equals("-") && firstRW[1].equals(secondRW[2]) && firstRW[1].equals(thirdRW[3]))
			return true;
		else if (!firstRW[3].equals("-") && firstRW[3].equals(secondRW[2]) && firstRW[3].equals(thirdRW[1]))
			return true;
		else 
			return false;
	}

	private static boolean column(int col, String[] firstRW, String[] secondRW, String[] thirdRW) {
		if (!firstRW[col].equals("-") && firstRW[col].equals(secondRW[col]) && firstRW[col].equals(thirdRW[col]))
			return true;
		else
			return false;
	}

	private static boolean checkRow(String[] row) {
		if (row[1].equals(row[2]) && row[1].equals(row[3]) && !row[1].equals("-"))
			return true;
		else
			return false;
	}

	private static int validateAndInert(String[] columnData, int columnNo, String inputSign) {
		if (columnData[columnNo].equals("-")) {
			columnData[columnNo] = inputSign;
			return 1;
		}
		else {
			System.out.println("You Cannot overrite.");
			return 0;
		}

	}
}
