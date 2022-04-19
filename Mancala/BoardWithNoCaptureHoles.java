package Mancala;

public class BoardWithNoCaptureHoles extends Board{

	BoardWithNoCaptureHoles(int rows, int cols, int totalSeeds) {
		super(rows, cols, totalSeeds);
	}

	@Override
	void setUpBoard() {
		int rows = this.board.length;
		int cols = this.board[0].length;
		int startingSeedsPerHole = totalSeeds / ( rows * cols);
		for(rows = rows - 1; rows >= 0; rows--) {
			for(cols = cols - 1; cols >= 0; cols--) {
				this.board[rows][cols] = startingSeedsPerHole;
			}
			cols = this.board[0].length;
		}
		
	}

}