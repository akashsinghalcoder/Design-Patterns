import java.util.*;
public class Cricket implements Subject {
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	private int score;
	
	Cricket() {
		score = 0 ;
	}
	
	



	@Override
	public void registerObservers(Observer observer) {
		observers.add(observer);	
	}
	
	public void updateScore() {
		score++;
		updateObservers();
		
	}
	
	private void updateObservers() {
		for(Observer observer : this.observers) {
			observer.update(this.score);	
		}
	}
	
	
}
