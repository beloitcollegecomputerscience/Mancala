package Mancala;

public abstract class GameType {
	
	Board board;
//	MakeMove move; // planned abstract type
	MakeCapture capture;
	CheckForWin win;
//	CheckForDraw draw; // planned abstract type
	Player player1;
	Player player2;
	
	void switchPlayer() {
		if (player1.isCurrentPlayer() ) {
			player1.setPlayerStatus(false);
			player2.setPlayerStatus(true);
		} else {
			player2.setPlayerStatus(false);
			player1.setPlayerStatus(true);
		}
	}
	
	Player getCurrentPlayer() {
		if (player1.isCurrentPlayer()) {
			return player1;
		} else {
			return player2;
		}
	}
	
	void makeCapture(int row, int col) {
		int captureCount = 0;
		while (capture.checkForCaptureCondition(board, row, col)) {
			captureCount += capture.collectSeeds(board, row, col);
			getCurrentPlayer().addToNumCapturedSeeds(captureCount);
			
		}
	}
	
	void playGame() {
		System.out.println("Playing Game");
		board.setUpBoard();
		System.out.println("Boardf:");
		board.printBoard();
		board.setSeedCount(0,3,3);
		System.out.println("Boardf:");
		board.printBoard();
		int row = 0;
		int col = 0;
		while ( win.checkForWinCondition(board, player1, player2) == false )  {
			makeMove();
			makeCapture(row, col);
		}
	}

	abstract void makeMove();
	
	

}
