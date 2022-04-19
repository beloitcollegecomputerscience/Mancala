package Mancala;

/** TODO: Make checkForWinCondition test for CheckForWinByCuttingOffTheHead */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import Mancala.CheckForWinByCantFillEmptyRow.State;

class CheckForWinTests {
	
	

	//-------------- Testing Abstract Methods in checkForWin for Different Games ---------------------//

		@Test
		@DisplayName("general checkForWinCondition check for wari")
		void testCheckForWinConditionWari() {	
			GameType game = new WariGame();
			game.board.setUpBoard();
			game.player1.setPlayerStatus(true);
			// No win condition yet
			assertFalse( game.win.checkForWinCondition(game.board, game.getCurrentPlayer()));
			// Can win by seed majority
			game.player1.setNumOfCapturedSeeds(25);
			assertTrue(game.win.checkForWinCondition(game.board, game.getCurrentPlayer()));
			
			// player2 wins when player1 can't fill player2 row
			
				// trigger NOT_EMPTY -> BEFORE_MOVE_EMPTY state transition
				game = new WariGame();
				game.board.setUpBoard();
				game.player1.setPlayerStatus(true);
				game.player2.setPlayerStatus(false);
				game.board.setWholeBoard(new int[][] { {0,0,0,2,4,2}, {0,0,0,0,0,0} });
				assertFalse( game.win.checkForWinCondition(game.board, game.getCurrentPlayer()) );
				game.switchPlayerAndRow();
				
				// trigger BEFORE_MOVE_EMPTY -> win state transition
				game.board.setWholeBoard(new int[][] { {1,1,1,3,0,2}, {0,0,0,0,0,0} });
				assertTrue( game.win.checkForWinCondition(game.board, game.getCurrentPlayer()) );
			
			// player1 wins when player2 can't fill player1 row
			
				// trigger NOT_EMPTY -> BEFORE_MOVE_EMPTY state transition
				game = new WariGame();
				game.board.setUpBoard();
				game.player1.setPlayerStatus(false);
				game.player2.setPlayerStatus(true);
				game.board.setWholeBoard(new int[][] {{0,0,0,0,0,0}, {2,4,2,0,0,0} });
				assertFalse( game.win.checkForWinCondition(game.board, game.getCurrentPlayer()) );
				game.switchPlayerAndRow();
				
				// trigger BEFORE_MOVE_EMPTY -> win state transition
				game.board.setWholeBoard(new int[][] { {0,0,0,0,0,0}, {2,0,3,1,1,1} });
				assertTrue( game.win.checkForWinCondition(game.board, game.getCurrentPlayer()) );
				
//			// Trigger NOT_EMPTY -> NOT_EMPTY state transition
//			
//				game = new WariGame();
//				game.board.setUpBoard();
//				game.player1.setPlayerStatus(true);
//				game.player2.setPlayerStatus(false);
//				game.board.setWholeBoard(new int[][] { {1,1,1,0,0,0}, {1,2,1,0,0,0} });
//				assertFalse( game.win.checkForWinCondition(game.board, game.getCurrentPlayer()) );
//				game.switchPlayerAndRow();
//				
//			// Trigger NOT_EMPTY -> BEFORE_MOVE_EMPTY state transition
				
				
				
		}
		
		}
		
		//-------------- Testing Methods in Concrete Classes extending Make Capture ---------------------//
		
//		@Test
//		@DisplayName("test MakeCaptureOfTwos")
//		void testMakeCaptureOfTwos() {
//			
//		}
	//	
//		@Test
//		@DisplayName("test MakeCaptureOfThrees")
//		void testMakeCaptureOfThrees() {
//			
//		}
