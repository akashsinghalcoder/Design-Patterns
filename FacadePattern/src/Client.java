
public class Client {

	public static void main(String[] args) {
		HotelKeeper hotelkeeper = new HotelKeeper();
		Menu menu = hotelkeeper.returnVegMenu();
		System.out.print(menu.returnDescription());

	}

}
