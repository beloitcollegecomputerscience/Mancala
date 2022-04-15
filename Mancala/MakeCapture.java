
package Mancala;

/** <p> Acts as interface to use any type of Capture method / condition. 
 * 	Allows for giving one field multiple conditions when instantiating a game object
 *  without creating large branching if-else statements. </p>
 *
 *<p> Current list of usable classes:  <br>
 * {@link MakeCaptureOfTwos}, <br>
 * {@link MakeCaptureOfThrees} </p>
 *
 * <p> References: <br>
 * 'Decorator Design Pattern in Java' by 'Coding Simplified' on Youtube - https://www.youtube.com/watch?v=ZdE9x-qE8_c <br>
 * 'Decorator Pattern' - Design Patterns (ep 3)' by 'Christopher Okhravi' on Youtube - https://youtu.be/GCraGHx6gso <br>
 * 'The Decorator Pattern in Java' - by baeldung on the web - https://www.baeldung.com/java-decorator-pattern
 * </p>
 */

public interface MakeCapture {
	
	public int collectSeeds(Board board, int rowPos, int colPos);
	public abstract boolean checkForCaptureCondition(Board board, int rowPos, int colPos);
	
}
