package Mancala;

/**
 * A class that checks for the board for three seeds and returns 3 as captured seed amount.
 */

public class MakeCaptureOfThrees extends MakeCaptureDecorator {

	public MakeCaptureOfThrees(MakeCapture c) {
		super(c);
	}
	
	@Override
	public int collectSeeds(Board board, int rowPos, int colPos) {
		if (board.getNumOfSeedsAtPos(rowPos, colPos) == 3) {
			return super.collectSeeds(board , rowPos, colPos) + 3;
		}
		return super.collectSeeds(board , rowPos, colPos) + 0;
	}
	
	public boolean checkForCaptureCondition(Board board, int rowPos, int colPos) {
		// TODO Auto-generated method stub
		if (board.getNumOfSeedsAtPos(rowPos, colPos) == 3) {
			return true;
		}
		return (this.makeCapture.checkForCaptureCondition(board, rowPos, colPos)|| false);
	}

}
