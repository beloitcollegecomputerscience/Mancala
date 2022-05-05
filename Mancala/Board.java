package Mancala;
//the standard board class whose attributes and methods are common to all mancala game types
public abstract class Board {
	int[] playboard;
//	to set up the board based on the game we are playing
	public abstract void setupBoard();
// to get the board of the game 
	public abstract int[] getBoard();
//	prints the board array and shows how many seeds are there throughout the board
	public abstract void printBoard();
//	returns the seed count in a provided index
	public int getSeedCount(int chosenindex) {
		return playboard[chosenindex];
	}
}
