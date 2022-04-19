package Mancala;

/** A class that checks for the board for two seeds and returns 2 as captured seed amount.
 */

public class MakeCaptureOfTwos extends MakeCaptureDecorator{
	
	public MakeCaptureOfTwos(MakeCapture c) {
		super(c);
	}
	
	public int collectSeeds(Board board, int rowPos, int colPos) {
		if (board.getSeedCount(rowPos, colPos) == 2) {
			System.out.println("I collected 2 seeds at row " + rowPos + ", col " + colPos); // debug statement
			board.setSeedCount(rowPos, colPos, 0);
			return super.collectSeeds(board , rowPos, colPos) + 2;
		}
		return super.collectSeeds(board , rowPos, colPos) + 0;
	}
	
	public boolean checkForCaptureCondition(Board board, int rowPos, int colPos) {
		// TODO Auto-generated method stub
		if (board.getSeedCount(rowPos, colPos) == 2) {
			System.out.println("I see that I can capture 2 seeds at row " + rowPos + ", col " + colPos); // debug statement
			return  true;
		}
		return (this.makeCapture.checkForCaptureCondition(board, rowPos, colPos) || false);
	}

}