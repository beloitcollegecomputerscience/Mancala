package Mancala;

public class CheckForWinByCuttingOffTheHead extends CheckForWinDecorator {
	

	public CheckForWinByCuttingOffTheHead(CheckForWin c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean checkForWinCondition(Board board, Player currentPlayer) {
		if ( checkForEmptyRow(board, currentPlayer.getPlayerNum() - 1 ) ) {
			return true;
		}
		
		return (this.checkForWin.checkForWinCondition(board, currentPlayer)|| false);
	}
	
	private boolean checkForEmptyRow(Board board, int row) {
		int[] toCheck = board.getRow(row);
		for (int i = 0; i < toCheck.length; i++) {
			if ( toCheck[i] != 0) {
				return false;
			}
		}
		return true;
	
	}

}
