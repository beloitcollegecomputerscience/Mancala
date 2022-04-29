package Mancala;
import java.util.Arrays;
//class that contains the details of the board of the Mancala gametype Wari
public class WariBoard extends Board{
	@Override
//	sets up a board 'playboard' which is a one dimensional array of length 12 with 4 seeds in each index
	public void setupBoard() {
		playboard = new int[12];
		Arrays.fill(playboard, 4);
	}
//	prints the one dimensional array as a 2-d array for better visualization
	public void printBoard() {
		for (int row=1; row < 3; row++ ){
	          if (row==1){
	              for (int i =0; i<playboard.length/2; i++){
	                  System.out.print(playboard[i]+ ", ");
	              }
	          }
	          else if (row==2){
	              for (int i =6;i<playboard.length; i++){
	                  System.out.print(playboard[i]+", ");
	              }
	          }
	          System.out.println();
	      }
//	returns the array playboard
	}
	public int[] getBoard() {
		return playboard;
	}

}
