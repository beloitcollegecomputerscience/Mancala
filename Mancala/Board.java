
package Mancala;

/** 
 * <p> An abstract class for implementing different types of boards </p>
 * 
 * <p> Current list of useable classes / boards <br>
 *	   {@link BoardWithCaptureHoles} <br>
 *	   {@link BoardWithCaptureHoles}
 *  </p>
 *
 */

public abstract class Board {
	
	int[][] board;
	int totalSeeds;
	
	Board(int rows, int cols, int totalSeeds) {
		board = new int[rows][cols];
		this.totalSeeds = totalSeeds;
	}
	
	abstract void setUpBoard();
	
	void printBoard() {
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[0].length; col++) {
				System.out.print(board[row][col] + ",");
			}
			System.out.println();
		}
	}
	
	int getSeedCount(int row, int col) {
		return board[row][col];
	}
	
	void setSeedCount(int row, int col, int num) {
		board[row][col] = num;
	}
	
	int getCols() {
		return board[0].length;
	}
	
	int getTotalSeeds() {
		return totalSeeds;
	}
	
	int[] getRow(int rowNum) {
		int[] toReturn = new int[board[0].length];
		for (int i = 0; i < board[0].length; i++) {
			toReturn[i] = board[rowNum][i];
		}
		return toReturn;
	}

}

