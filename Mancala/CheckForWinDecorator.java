package Mancala;

public class CheckForWinDecorator implements CheckForWin {
	
	protected CheckForWin checkForWin;
	
	public CheckForWinDecorator(CheckForWin c) {
		this.checkForWin = c;
	}

	@Override
	public boolean checkForWinCondition(Board board, Player player1, Player player2) {
		// TODO Auto-generated method stub
		return false;
	}

}
