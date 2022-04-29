package Mancala;
//import java.util.Scanner;
//abstract class that all the different Mancala Game Types extend
public abstract class GameType {
	Board board;
	MakeMove makemove;
	CollectSeeds makecapture;
	CheckForWin checkforwin;
	CheckForDraw checkfordraw;
	boolean winner;
	boolean draw;
	boolean capture;
	int indexchosen;

	public void playGame() {
		board.setupBoard();
		board.printBoard();
//		System.out.println(board.getSeedCount(2));
//		System.out.println(board.playboard[5]=0);
//		while there is no winner and the game is not a draw
		while (!winner || !draw){
//			make a move from a chosen index, which returns a boolean value, true if the hole it lands on has 2 or 3 seeds and false if not
			capture=makemove.movefrom(board, indexchosen);
//			if the hole landed on has 2 or 3 seeds, we collect the seeds 
			if (capture) {
				makecapture.collectSeeds(board, makemove);
			}		
//			after collection checks to see if there is a winner or if its a draw
			winner=checkforwin.someonewon(board, makecapture.totalseedscollected);	
			draw=checkfordraw.drawngame(board, makecapture.totalseedscollected);
		}
		
	}
				
}


