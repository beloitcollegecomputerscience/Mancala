
package Mancala;

/** Allows for multiple conditions to be used in one field in Game Type*/

public class MakeCaptureDecorator implements MakeCapture{

	protected MakeCapture makeCapture;
	
	public MakeCaptureDecorator(MakeCapture c) {
		this.makeCapture = c;
	}
	
	@Override
	public int collectSeeds(Board board, int rowPos, int colPos) {
		return this.makeCapture.collectSeeds(board, rowPos, colPos);
		
	}

	@Override
	public boolean checkForCaptureCondition(Board board, int rowPos, int colPos) {
		// TODO Auto-generated method stub
		return false;
	}	

}

