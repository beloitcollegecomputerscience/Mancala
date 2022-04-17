package Mancala;

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
