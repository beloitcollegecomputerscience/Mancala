package Mancala;

/**
 * Checks if a player has won due to having a majority of seeds.
 * In games: Wari
 */

public class CheckForWinBySeedMajority extends CheckForWinDecorator {
	
	public CheckForWinBySeedMajority(CheckForWin c) {
		super(c);
	}
	
	public boolean checkForWinCondition(Board board, Player currentPlayer) {
		// TODO Auto-generated method stub
			if (currentPlayer.getNumCapturedSeeds() > (board.getTotalSeeds() / 2)) {
				return true;
			}
		return (this.checkForWin.checkForWinCondition(board, currentPlayer)|| false);
	}

}
