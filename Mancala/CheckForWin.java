package Mancala;

/** 
 * <p> An abstract class for seeing the different ways you can win a game</p>
 * 
 *  <p>Requirements: <br> When making the objects from current list of usable classes, make sure to have
 *  {@link CheckForWinBasic} in the innermost part of the nest. <br>
 *   Example: win = new CheckForWinBySeedMajority( new CheckForWinBasic); <br>
 *   Must use one of the classes in Current list of usable classes below. </p>
 * 
 * <p> Current list of useable classes / win methods <br>
 *	   {@link CheckForWinBySeedMajority} <br>
 *  </p>
 *
 */

public interface CheckForWin {
		
	boolean checkForWinCondition(Board board, Player currentPlayer);

}
