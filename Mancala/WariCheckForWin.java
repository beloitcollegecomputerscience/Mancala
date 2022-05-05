package Mancala;

public class WariCheckForWin extends CheckForWin{
	public boolean someonewon(Board board, int totalscore) {
		int totalseedsinrow1=0;
		int totalseedsinrow2=0;
//sums the number of seeds in row1
		for (int i=0;i<board.playboard.length/2;i++) {
			totalseedsinrow1=+board.playboard[i];
		}
		//sums the number of seeds in row2

		for (int i=6;i<board.playboard.length;i++) {
			totalseedsinrow2=+board.playboard[i];
		}
//		checks if the totalscore is greater than 24 or not, if yes somebody has won
		if (totalscore>24) {
			return true;	
		}
//		checks to see if one of the rows has no seeds or not, if yes somebody has won
		else if (totalseedsinrow1==0 || totalseedsinrow2==0) {
			return true;
		}
//		if none of the conditions are satisfied nobody has won
		return false;
	}
}
