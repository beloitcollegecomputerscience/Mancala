package Mancala;
import java.util.Scanner;
//abstract class that all the different Mancala Game Types extend
public abstract class GameType {
	Scanner sc = new Scanner(System.in);
	Board board;
	MakeMove makemove;
	CollectSeeds makecapture;
	CheckForWin checkforwin;
	CheckForDraw checkfordraw;
	boolean winner;
	boolean draw;
	boolean capture;
	int indexchosen;
	int playernumber=0;

	public void playGame() {
		board.setupBoard();
//		board.printBoard();

//		System.out.println(board.getSeedCount(2));
//		System.out.println(board.playboard[5]=0);
//		while there is no winner and the game is not a draw
		while (!winner || !draw){
			board.printBoard();
			System.out.println(makecapture.totalseedscollected);
			getPlayerInput();
//			make a move from a chosen index, which returns a boolean value, true if the hole it lands on has 2 or 3 seeds and false if not
			capture=makemove.movefrom(board, indexchosen);
//			if the hole landed on has 2 or 3 seeds, we collect the seeds 
			if (capture) {
				makecapture.collectSeeds(board, makemove);
			}		
//			after collection checks to see if there is a winner or if its a draw
			winner=checkforwin.someonewon(board, makecapture.totalseedscollected);	
			draw=checkfordraw.drawngame(board, makecapture.totalseedscollected);
			updateplayernumber();
		}
		System.out.println("End of the game. Thank you for playing!");
		

	}
	
	public void updateplayernumber() {
		playernumber=(playernumber+1)%2;
	}
	
	public void getPlayerInput() {
		if (playernumber==0) {
			System.out.println("Enter a hole index between 0 and 5");
			indexchosen= sc.nextInt();
		}
		else if (playernumber==1) {
			System.out.println("Enter a hole index between 6 and 11");
			indexchosen= sc.nextInt();
		}
	}


}


