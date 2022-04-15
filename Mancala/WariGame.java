
package Mancala;

import java.util.Scanner;

public class WariGame extends GameType {
	
	static Scanner scnr = new Scanner(System.in); // Scanner will get replaced by GUI
	
	WariGame() {
		board = new BoardWithNoCaptureHoles(2,6,48);
		capture = new MakeCaptureOfTwos (new MakeCaptureOfThrees(new MakeCaptureBasic()));
	}
	
	void makeMove() {
		int numBeans;
		int pointer;
		int currentRow = 0; //Temporarily just assuming the person is first row
		
		System.out.println("What hole would you like to move?");
		int userInput = scnr.nextInt();
		pointer = userInput;
		numBeans = board.getSeedCount(0, userInput);
		
		board.setSeedCount(currentRow, pointer, 0);
		
		while (numBeans > 0) {
			if (pointer < board.getCols()-1) {
				pointer++;
			}
			else { // Moves it to the beginning of the next row - change this later to work in a circle
				if (currentRow==0) {
					currentRow = 1;
				}
				else {
					currentRow = 0;
				}
				pointer = 0;
			}
			board.setSeedCount(currentRow, pointer, board.getSeedCount(currentRow, pointer)+1); // Adds one to the next hole
			numBeans--;
		}
		board.printBoard();
	}

}
