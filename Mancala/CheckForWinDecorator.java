package Mancala;

public class CheckForWinDecorator implements CheckForWin {
	
	protected CheckForWin checkForWin;
	
	public CheckForWinDecorator(CheckForWin c) {
		this.checkForWin = c;
	}

	@Override
	public boolean checkForWinCondition(Board board, Player currentPlayer) {
		// TODO Auto-generated method stub
		return false;
	}

}
