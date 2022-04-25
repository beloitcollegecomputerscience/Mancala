
package Mancala;

/**
 * A class that checks for the board for three seeds and returns 3 as captured seed amount.
 * In games: Wari
 */

public class MakeCaptureOfThrees extends MakeCaptureDecorator {

	public MakeCaptureOfThrees(MakeCapture c) {
		super(c);
	}
	
	@Override
	public int collectSeeds(Board board, int rowPos, int colPos) {
		if (board.getSeedCount(rowPos, colPos) == 3) {
			System.out.println("I collected 3 seeds at row " + rowPos + ", col " + colPos); // debug statement
			board.setSeedCount(rowPos, colPos, 0);
			return super.collectSeeds(board , rowPos, colPos) + 3;
		}
		return super.collectSeeds(board , rowPos, colPos) + 0;
	}
	
	public boolean checkForCaptureCondition(Board board, int rowPos, int colPos) {
		// TODO Auto-generated method stub
		if (board.getSeedCount(rowPos, colPos) == 3) {
			System.out.println("I see that I can capture 3 seeds at row " + rowPos + ", col " + colPos); // debug statement
			return true;
		}
		return (this.makeCapture.checkForCaptureCondition(board, rowPos, colPos)|| false);
	}

}
