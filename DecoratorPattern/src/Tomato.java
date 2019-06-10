
public class Tomato extends Toppings {
	Tomato(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return pizza.getDescription() + " + Tomatoes";
	}

	@Override
	public int returnCost() {
		// TODO Auto-generated method stub
		return pizza.returnCost() + 50;
	}
}
