package Mancala;

public class CheckForWinBySeedMajority extends CheckForWinDecorator {
	
	public CheckForWinBySeedMajority(CheckForWin c) {
		super(c);
	}
	
	public boolean checkForWinCondition(Board board, Player player1, Player player2) {
		// TODO Auto-generated method stub
		if (player1.isCurrentPlayer()) {
			if (player1.getNumCapturedSeeds() > (board.getTotalSeeds() / 2)) {
				return true;
			}
		} else {
			if (player2.getNumCapturedSeeds() > (board.getTotalSeeds() / 2)) {
				return true;
			}
		}
		return (this.checkForWin.checkForWinCondition(board, player1, player2)|| false);
	}

}
