package Mancala;

/** <p>GameType is an abstract class which can carry out any type of mancala game simulation at object creation from any of
 * the concrete classes. </p>
 * 
 *  <p>Concrete classes: <br>
 *  
 *  </p>
 * */

public abstract class GameType {
	
	Board board;
//	MakeMove move; // planned abstract type
	MakeCapture capture;
	CheckForWin win;
//	CheckForDraw draw; // planned abstract type
	Player player1;
	Player player2;
	
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
//			makeMove();
			// need way to store place where move stopped and put it into makeCapture
			makeCapture(row, col);
			row = switchPlayerAndRow();
		}
	}

	abstract void makeMove();
	
	

}
