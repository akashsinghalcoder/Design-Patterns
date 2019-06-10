
public class Onion extends Toppings {
	
	Onion(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return pizza.getDescription() + " + Onion";
	}

	@Override
	public int returnCost() {
		// TODO Auto-generated method stub
		return pizza.returnCost() + 70;
	}
}

