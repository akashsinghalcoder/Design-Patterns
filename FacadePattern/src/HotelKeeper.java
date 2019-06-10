
public class HotelKeeper {
	public VegMenu returnVegMenu() {
		return (VegMenu)(new VegSection()).returnMenu();
	}
	public NonVeg returnNonVegMenu() {
		return (NonVeg)(new NonVegSection()).returnMenu();
	}

}
