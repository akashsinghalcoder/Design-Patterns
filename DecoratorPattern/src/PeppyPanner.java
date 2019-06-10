
public class PeppyPanner extends Pizza {
	
	PeppyPanner() {
		this.description = "Peppy Panner";
		
	}

	@Override
	public String getDescription() {
		return this.description;
		
	}

	@Override
	public int returnCost() {
		return 100;
	}
	
}
