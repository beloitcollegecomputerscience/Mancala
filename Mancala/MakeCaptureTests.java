package Mancala;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MakeCaptureTests {
	
//	GameType game;
//	
//	@BeforeEach
//	void setUp() {
//		game = new WariGame();
//		game.board.setUpBoard();
//	}
	
	//-------------- Testing Abstract Methods in MakeCapture for Different Games ---------------------//

	@Test
	@DisplayName("general checkCaptureCondition check for wari")
	void testCheckForWinConditionWari() {	
		GameType game = new WariGame();
		game.board.setUpBoard();
		
		// No capture can be made
		assertFalse( game.capture.checkForCaptureCondition(game.board, 0, 0) );
		
		// can capture two seeds
		game.board.setSeedCount(0, 0, 2);
		assertTrue( game.capture.checkForCaptureCondition(game.board, 0, 0) );
		
		//can capture three seeds
		game.board.setSeedCount(0,0,3);
		assertTrue( game.capture.checkForCaptureCondition(game.board, 0, 0) );
	}
	
	@Test
	@DisplayName("general collectSeeds check for wari")
	void testCollectSeedsWari() {	
		GameType game = new WariGame();
		game.board.setUpBoard();
		
		// No seeds collected
		assertEquals( 0, game.capture.collectSeeds(game.board, 0, 0) );
		
		// two seeds collected
		game.board.setSeedCount(0, 0, 2);
		assertEquals( 2, game.capture.collectSeeds(game.board, 0, 0) );
		
		// three seeds collected 
		game.board.setSeedCount(0,0,3);
		assertEquals( 3, game.capture.collectSeeds(game.board, 0, 0) );
	}
	
	//-------------- Testing Methods in Concrete Classes extending Make Capture ---------------------//
	
//	@Test
//	@DisplayName("test MakeCaptureOfTwos")
//	void testMakeCaptureOfTwos() {
//		
//	}
//	
//	@Test
//	@DisplayName("test MakeCaptureOfThrees")
//	void testMakeCaptureOfThrees() {
//		
//	}
	

}
