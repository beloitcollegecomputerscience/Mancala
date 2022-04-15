
package Mancala;

public class MakeCaptureBasic implements MakeCapture {

	/** Base case will always be 0. Use add on decorators / classes. */
	public int collectSeeds(Board board, int rowPos, int colPos) {
		// TODO Auto-generated method stub
		System.out.println("I can make a Basic Capture");
		return 0;
	}

	/** Base case will always be false since there may not be a condition common to all games*/
	@Override
	public boolean checkForCaptureCondition(Board board, int rowPos, int colPos) {
		// TODO Auto-generated method stub
		return false;
	}

}

