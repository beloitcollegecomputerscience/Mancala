package Mancala;

/** Acts as interface to use any type of Capture method / condition 
 * 	Allows for giving one field multiple conditions without creating large branching if-else statements
 * 
 * References:
 * 'Decorator Design Pattern in Java' by 'Coding Simplified' on Youtube - https://www.youtube.com/watch?v=ZdE9x-qE8_c
 * 'Decorator Pattern - Design Patterns (ep 3)' by 'Christopher Okhravi' on Youtube - https://youtu.be/GCraGHx6gso 
 * 
 * */

public abstract class MakeCapture {

	int numOfCollectedSeeds;
	
	public abstract int collectSeeds(Board board, int rowPos, int colPos);
	public abstract boolean checkForCaptureCondition(Board board, int rowPos, int colPos);
	
}
