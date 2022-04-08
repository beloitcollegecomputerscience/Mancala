package Mancala;

public class BoardWithCaptureHoles extends Board {

	BoardWithCaptureHoles(int rows, int cols, int totalSeeds) {
		super(rows, cols, totalSeeds);
		this.board = new int[rows][cols + 2];
	}

	@Override
	void setUpBoard() {
		int rows = this.board.length;
		int cols = this.board[0].length - 2;
		int startingSeedsPerHole = totalSeeds / ( rows * cols);
		for(rows = rows - 1; rows >= 0; rows--) {
			for(cols = cols - 2; cols >= 1; cols--) {
				this.board[rows][cols] = startingSeedsPerHole;
			}
			cols = this.board[0].length - 2;
		}
		
		
	}

}
