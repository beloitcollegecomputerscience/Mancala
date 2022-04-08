package Mancala;

public class MakeCaptureOfSequentialTwos extends MakeCaptureDecorator{
	
	public MakeCaptureOfSequentialTwos(MakeCapture c) {
		super(c);
	}
	
	@Override
	public int collectSeeds(Board board, int rowPos, int colPos) {
		board.setSeedCount(rowPos, colPos, 0);
		return this.makeCapture.collectSeeds(board, rowPos, colPos) + 2;

	}
	
	@Override
	public boolean checkForCaptureCondition(Board board, int rowPos, int colPos) {
		// TODO Auto-generated method stub
		if (board.getSeedCount(rowPos, colPos) == 2) {
			return true;
		}
		return (this.makeCapture.checkForCaptureCondition(board, rowPos, colPos)|| false);
	}

}
