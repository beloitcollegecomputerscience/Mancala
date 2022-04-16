package Mancala;

public class Player {
	
	int numCapturedSeeds;
	boolean isCurrentPlayer;
	
	Player() {
		this.numCapturedSeeds = 0;
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
	
	boolean checkIfCurrentPlayer() {
		return isCurrentPlayer;
	}
	
	void setPlayerStatus(boolean isCurrentPlayer) {
		this.isCurrentPlayer = isCurrentPlayer;
	}

}
	
