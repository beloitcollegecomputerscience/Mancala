package Mancala;

public class CheckForWinByCantFillEmptyRow extends CheckForWinDecorator {
	
	 /** State Movements:<br> NOT_EMPTY -> BEFORE_MOVE_EMPTY <br>
	  * 				  	  NOT_EMPTY -> NOT_EMPTY <br>
	  * 				      BEFORE_MOVE_EMPTY -> NOT_EMPTY <br>
	  * 				      BEFORE_MOVE_EMPTY ->  win */
	 enum State { NOT_EMPTY, BEFORE_MOVE_EMPTY, AFTER_MOVE_EMPTY }
	 State state;
	
	public CheckForWinByCantFillEmptyRow(CheckForWin c) {
		super(c);
		this.state = State.NOT_EMPTY;
	}
	
	public boolean checkForWinCondition(Board board, Player currentPlayer) {
		if (currentPlayer.getPlayerNum() == 1) {
			return ( checkForWinHelperPlayer1(board) || this.checkForWin.checkForWinCondition(board, currentPlayer));
		} else {
			return ( checkForWinHelperPlayer2(board) || this.checkForWin.checkForWinCondition(board, currentPlayer));		}
		
	}

	private boolean checkForWinHelperPlayer1(Board board) {
		if (state == State.NOT_EMPTY) { // need to check for other player's row
			// if other player's row is empty, state = state.BEFORE_MOVE_EMPTY
			if ( checkForEmptyRow(board, 1) ) {
				state = State.BEFORE_MOVE_EMPTY;
			}
			
		} else if (state == State.BEFORE_MOVE_EMPTY) { // need to check current player's row
			// if current player's row is empty after other player's move, that means other player couldn't fill hole, so return true
			// else state = state.NOT_EMPTY

			if ( checkForEmptyRow(board, 0) ) {
				return true; // Player 1 wins
			}
			state = State.NOT_EMPTY;
			
		}
		
		return false;
	}
	
	private boolean checkForWinHelperPlayer2(Board board) {
		if (state == State.NOT_EMPTY) {
			// if other player's row is empty, state = state.BEFORE_MOVE_EMPTY
			if ( checkForEmptyRow(board, 0) ) {
				state = State.BEFORE_MOVE_EMPTY;
			}
			
		} else if (state == State.BEFORE_MOVE_EMPTY) {
			if ( checkForEmptyRow(board, 1) ) {
				return true; // player 2 wins
			}
			state = State.NOT_EMPTY;
			
		}
		return false;
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


/*
if (detectedEmptyRow && checkForEmptyRow(board, currentPlayer, state)) { // second encounter of same empty row,
	return true;									// means player couldn't fill hole, other player wins
	
} else if (!detectedEmptyRow && checkForEmptyRow(board, currentPlayer, state)) { //first encounter of the empty row
	detectedEmptyRow = true;
	return (this.checkForWin.checkForWinCondition(board, currentPlayer, state)|| false);
	
} else if (detectedEmptyRow && !checkForEmptyRow(board, currentPlayer, state)) { // second encounter, but same row not empty
	detectedEmptyRow = false;											// means player could fill hole, reset and let game continue
	return (this.checkForWin.checkForWinCondition(board, currentPlayer)|| false);
}

return (this.checkForWin.checkForWinCondition(board, currentPlayer)|| false);

return true;
*/