package Mancala;

/**
 * Object representing a player, meant for there to be two of this instantiated per game.
 * It stores the number of captured seeds and whether or not it is this player's turn.
 */

public class Player {
	
	private int playerNum;
	private int numCapturedSeeds;
	private boolean isCurrentPlayer;
	
	Player(int playerNum) {
		this.numCapturedSeeds = 0;
		this.playerNum = playerNum;
	}
	
	int getNumCapturedSeeds() {
		return numCapturedSeeds;
	}
	
	void setNumOfCapturedSeeds(int numCapturedSeeds) {
		this.numCapturedSeeds = numCapturedSeeds;
	}
	
	void addToNumCapturedSeeds(int newSeeds) {
		this.numCapturedSeeds += newSeeds;
	}
	
	boolean isCurrentPlayer() {
		return this.isCurrentPlayer;
	}
	
	void setPlayerStatus(boolean isCurrentPlayer) {
		this.isCurrentPlayer = isCurrentPlayer;
	}
	
	int getPlayerNum() {
		return this.playerNum;
	}

}
	
