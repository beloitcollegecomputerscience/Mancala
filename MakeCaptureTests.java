package Mancala;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class MakeCaptureTests {
	
	GameType game;
	
	@BeforeEach
	void setUp() {
		game = new WariGame();
		game.board.setUpBoard();
	}

	@Test
	@DisplayName("checkCaptureCondition should work for the specific game")
	void test() {	
		assertTrue(game.capture.checkForCaptureCondition(game.board,0,3));
	}

}
