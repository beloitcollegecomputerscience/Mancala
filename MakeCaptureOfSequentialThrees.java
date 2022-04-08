package Mancala;

public class MakeCaptureOfSequentialThrees extends MakeCaptureDecorator {

	public MakeCaptureOfSequentialThrees(MakeCapture c) {
		super(c);
	}
	
	@Override
	public int collectSeeds(Board board, int rowPos, int colPos) {
		return this.makeCapture.collectSeeds(board, rowPos, colPos) + 3;

	}
	
	public boolean checkForCaptureCondition(Board board, int rowPos, int colPos) {

		// TODO Auto-generated method stub

		if (board.getSeedCount(rowPos, colPos) == 3) {
			return true;
		}
		return (this.makeCapture.checkForCaptureCondition(board, rowPos, colPos)|| false);
	}

}
