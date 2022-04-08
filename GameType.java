package Mancala;

public abstract class GameType {
	
	Board board;
//	MakeMove move; // planned abstract type
	MakeCapture capture;
//	CheckForWin win; // planned abstract type
//	CheckForDraw draw; // planned abstract type
	
	void playGame() {
		System.out.println("Playing Game");
		board.setUpBoard();
		System.out.println("Boardf:");
		board.printBoard();
		board.setSeedCount(0,3,3);
		System.out.println("Boardf:");
		board.printBoard();
		System.out.println ( "can capture?: " + capture.checkForCaptureCondition(board, 0, 3));
		int row = 0;
		int col = 0;
		int captureCount = 0;
		while (capture.checkForCaptureCondition(board, row, col)) {
			captureCount += capture.collectSeeds(board, row, col);
		}
		System.out.println("capture count: " + captureCount);
//		capture.collectSeeds();
	}

	abstract void makeMove();
	
	

}
