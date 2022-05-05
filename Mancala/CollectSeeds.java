package Mancala;
//the common class to collect seeds for all types of mancala games. An object referencing this class is initialized using the collect seeds class of the individual Mancala Games. These collect seeds classes of each game type
// differ based on the rule of how seeds are collected in each game type.
public abstract class CollectSeeds {
	int totalseedscollected=0;
	public abstract int collectSeeds (Board board, MakeMove makemove);

}
