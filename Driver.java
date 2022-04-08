package Mancala;

/** This is a temporary driver for code development purposes. 
 * 
 * Possible Issues:
 * - GameType and Driver may be too connected.
 * - 
 * - */

import java.util.Scanner;

public class Driver {
	
	static Scanner scnr = new Scanner(System.in);
	
	public static String getUserInput(String prompt) {
		System.out.println(prompt);
		String userInput = scnr.nextLine();
		return userInput;
	}
	
	public static GameType getGameType(String type) {
		switch (type) {
		case "wari":
			return new WariGame();
		default:
			System.out.println("Please enter a valid game type");
			return null;
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameType game;
		String type;
		String keepGoing = "yes";
		
		type = getUserInput("What type of Mancala Game would you like to play?");
		game = getGameType(type);
		
		while(keepGoing.equals("yes")) {
			game.playGame();
			game.makeMove();
			keepGoing = getUserInput("Would you like to play again? Type yes or no.");
			if (keepGoing.equals("no")) {
				break;
			}
			type = getUserInput("What type of Mancala Game would you like to play?");
			game = getGameType(type);
		}
		
		System.out.println("Thank you for playing! Done!");
		
	}

}
