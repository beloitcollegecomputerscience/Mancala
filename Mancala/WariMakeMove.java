package Mancala;
//import java.lang.Math;
//this class defines how the seeds are moved in the gametype Wari
public class WariMakeMove extends MakeMove {
	int[] playboard;
//	originalseeds denotes the number of seeds in the originally chosen index
	int originalseeds;
	public boolean movefrom(Board board, int chosenindex) {
//		playboard=board.getBoard();
//		returns the number of seeds in the chosen index and assigns it to seeds
		seeds = board.getSeedCount(chosenindex);
//		we assign a new variable original index as the chosen index to handle the situation where there might be more than 12 seeds and we may pass through the originally chosen hole again in which case it would need to be skipped
		int originalindex=chosenindex;
		currentindex=chosenindex;
		originalseeds=seeds;
//		as we have removed the seeds from the chosenindex/current index, the number of seeds in that hole is set to 0
		board.playboard[currentindex]=0;
//		System.out.println(seeds);
//		until we have seeds left
		while (seeds>0) {
//			we move to the next hole in the counterclockwise direction
			currentindex= (currentindex +1)%12;
//			As the board is of length 12, we do mod 12 so that we always are in indexes between 0 and 11, then we increase the seed count in our currentindex by 1 as we are placing a seed in that hole
			board.playboard[currentindex]+=1;  
//			decrease the number of seeds we have in our hand
			seeds-=1;
//			System.out.println(seeds);
//			if we have more than 12 seeds and we plant a seed in our originally chosen hole, we go through this if condition
			if (currentindex==originalindex) {
//				we set the number of seeds in this hole to 0 again
				board.playboard[originalindex]=0;
//				and we increase the seeds we have in our hand by one as we are removing that seed from the original hole
				seeds=+1;
			}
//			System.out.print(" " + currentindex+" , " + originalindex);


		}
//		checks if we end up in the opponents side of the board
		if ((originalindex<6 && currentindex>5)||(originalindex>5 && currentindex<6)) {
//			System.out.println("landed on other side");
//			if we do, the next condition checks if the hole we landed on and added a seed to makes the total number of seeds in that hole 2 or 3
			if (board.playboard[currentindex]==2 || board.playboard[currentindex]==3) {
//				if yes it returns true which is used in class GameType to call the class that collects these seeds from that hole 
//				System.out.println("time to collect seeds");

					return true;
			}
		}
//	if not it returns false, ALSO THIS CLASS DOES NOT COLLECT THE SEEDS AT ALL, IT JUST CHECKS IF THE SEEDS NEED TO BE COLLECTED 
		return false;
		
}

}
	
