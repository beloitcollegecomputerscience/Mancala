package Mancala;
//concrete class that initializes the game features in terms of the game (in this case, it initializes the boards and moves in terms of the Wari Game)
public class WariGame extends GameType {
	public WariGame() {
		board= new WariBoard();
		makemove= new WariMakeMove();
		makecapture = new Collect2or3Seeds();
		checkforwin = new WariCheckForWin();
		checkfordraw = new WariCheckForDraw();
	}
	
}
