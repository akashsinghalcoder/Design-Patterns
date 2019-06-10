
public class Manager {

	public static void main(String[] args) {
		Pizza pizza = new PeppyPanner();
		System.out.println(pizza.getDescription() + " " + pizza.returnCost());
		pizza = new Onion(pizza);
		System.out.println(pizza.getDescription() + " " + pizza.returnCost());
		pizza = new Tomato(pizza);
		System.out.println(pizza.getDescription() + " " + pizza.returnCost());

	}

}
