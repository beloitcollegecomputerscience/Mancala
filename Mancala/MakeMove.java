package Mancala;

public abstract class MakeMove {
//	the index from which the move starts
	int currentindex;
//	number of seeds in the index
	int seeds;
//	method to move from the chosen index of the board of the game being played
	public abstract boolean movefrom(Board board, int chosenindex);
}
