package Mancala;
import java.util.Arrays;

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
	
	int[] board;
//	int totalSeeds;
	
	Board(int size, int seeds) {
		board = new int[size];
		Arrays.fill(board, seeds);
	}
	
//	abstract void setUpBoard();
	
	void printBoard() {
		for (int row=1; row < 3; row++ ){
	          if (row==1){
	              for (int i =0; i<board.length/2; i++){
	                  System.out.print(board[i]+ ", ");
	              }
	          }
	          else if (row==2){
	              for (int i =6;i<board.length; i++){
	                  System.out.print(board[i]+", ");
	              }
	          }
	          System.out.println();
	      }
	}
	
	int getSeedCount(int row, int col) {
		return board[row][col];
	}
//	 it is altering the number of seeds in a particular hole
	void setSeedCount(int row, int col, int num) {
		board[row][col] = num;
	}
	
	int getCols() {
		return board[0].length;
	}

}

