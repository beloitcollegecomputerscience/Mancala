package Mancala;

public abstract class CheckForWin {
//	returns a true value if somebody has won the game, totalscore denotes the number of seeds collected by a player
	public abstract boolean someonewon(Board board, int totalscore); 
}
