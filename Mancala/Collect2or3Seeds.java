package Mancala;

public class Collect2or3Seeds extends CollectSeeds{
//if wari make move class returns true then gametype class called this class to collect the seeds of the currentindex and check if there is a sequence of holes before that having 2 or 3 seeds
//	if yes the collectseeds method collects the seeds from those holes as well
	@Override
	public int collectSeeds(Board board, MakeMove makemove) {
//		boolean prevhole=false;
//		makemove object is passed so that we can access the currentindex that we are in the board
		int currentindex= makemove.currentindex;
//		the seeds from the current index are collected and is added to the total player score/total seeds collected
		totalseedscollected += board.getSeedCount(currentindex);
//		after collecting the seeds from the current index, the number of seeds in the current hole is set to 0
		board.playboard[currentindex]=0;
//		lets go part by part in the following conditional statement
//		the first part checks to make sure that we are not in index 0 of the array because if we are decreasing the index will take us out of array bounds 
//		if not the second part checks if the previous index has either 2 or 3 seeds and if it does we execute the code inside the if statement
		if (makemove.currentindex-1>-1 && (board.playboard[currentindex-1]==2 || board.playboard[currentindex-1]==3)) {
//			the if statement below checks if the current index we are in is in between 6-11
			if (makemove.currentindex*2>11) {
//				if yes as we can only collect seeds from one side of the board, we put a while loop to make sure our index doesnt reach the other side which is where the index is 0-5
				while (currentindex-1>5) {					
//					we move to the previous index
					currentindex-=1;
//					we collect the seeds in this index and add it to our totalseeds collected
					totalseedscollected += board.getSeedCount(currentindex);
//					make the number of seeds in the hole zero
					board.playboard[currentindex]=0;	
//					as we are already in an index range between 6-11, we do not need to check if the previous index is out of array bounds or not
//					the conditional checks if the seeds in the hole previous to the one we are in has 2 or 3 seeds, if its does we continue with the while loop
//					here something to consider is if the current index is 6 when we are entering the if condition below and index 5 has 2 or 3 holes we will still continue with the while loop even though we know index 5 is in the other side of the board
//					and shouldnt count, however the while statement checks if the currentindex -1 which is 6-1=5 is >5 or not. As its not the code within it isnt executed
					if (board.playboard[currentindex-1]==2 || board.playboard[currentindex-1]==3) {continue;}
//					if the seeds are not 2 or 3 we exit the loop
					else {break;}
				}	
			}
//			similarly if the index of the hole we are originally collecting seeds from is between 0-5 we execute the following conditional
			else {
//				we make sure we dont go out of bounds of the array
				while (currentindex>-1) {
//					we repeat same procedure as we did in the previous if statement
					currentindex-=1;
					totalseedscollected += board.getSeedCount(currentindex);
					board.playboard[currentindex]=0;
//					as we are in the range between 0-5, we again need to check if we move to the previous hole, we are actually not going out of array bounds, if not then finally we check if that previous hole has 2 or 3 seeds or not
					if (currentindex-1>-1 && (board.playboard[currentindex-1]==2 || board.playboard[currentindex-1]==3)) {continue;}
					else {break;}
				}	
			}		
		}
//		we return the totalseeds collected in this one move
		return totalseedscollected;
	}
}
