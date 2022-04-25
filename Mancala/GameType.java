package Mancala;

/** <p>GameType is an abstract class which can carry out any type of mancala game simulation at object creation from any of
 * the concrete classes. </p>
 * 
 *  <p>Concrete classes: <br>
 *  
 *  </p>
 * */

public abstract class GameType {
	
	Board board; // should we have pointers in the board class?
//	MakeMove move; // planned abstract type
	MakeCapture capture;
	CheckForWin win; // Should there be a print win message (like return who won for what reason?)
//	CheckForDraw draw; // planned abstract type
	Player player1; // should we have pointers in the player class?
	Player player2; // should we have pointers in the player class?
					// should player class and board class be combined?
	
	int switchPlayerAndRow() {
		if (player1.isCurrentPlayer() ) {
			player1.setPlayerStatus(false);
			player2.setPlayerStatus(true);
			return 1;
		} else {
			player2.setPlayerStatus(false);
			player1.setPlayerStatus(true);
			return 0;
		}
	}
	
	Player getCurrentPlayer() {
		if (player1.isCurrentPlayer()) {
			return player1;
		} else {
			return player2;
		}
	}
	
	Player getOtherPlayer() {
		if (player1.isCurrentPlayer()) {
			return player2;
		} else {
			return player1;
		}
	}
	
	/** TODO: make better name */
	void makeCapture(int row, int col) {
		int captureCount = 0;
		while (capture.checkForCaptureCondition(board, row, col) && col < board.getCols()) {
			captureCount += capture.collectSeeds(board, row, col);
			getCurrentPlayer().addToNumCapturedSeeds(captureCount);
			col++;
		}
	}
	
	void playGame() {
		System.out.println("Playing Game");
		board.setUpBoard();
		System.out.println("Boardf:");
		board.printBoard();
		player1.setPlayerStatus(true);
		int row = 0;
		int col = 3;
		while ( win.checkForWinCondition(board, getCurrentPlayer() ) == false )  {
			/*int[] rowAndCol = */ makeMove();
			// need way to store place where move stopped and put it into makeCapture
//			if (rowAndCol[0] == getCurrentPlayer().getPlayerNum() - 1) {
				makeCapture(row, col);
//			}
			row = switchPlayerAndRow();
		}
	}

	abstract void makeMove();
	
	

}
