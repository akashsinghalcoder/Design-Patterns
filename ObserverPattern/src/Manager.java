
public class Manager {
	public static void main(String args[]) {
		Cricket cricket = new Cricket();
		ScoreDisplay scoredisplay = new ScoreDisplay();
		cricket.registerObservers(scoredisplay);
		cricket.updateScore();	
	}
}
