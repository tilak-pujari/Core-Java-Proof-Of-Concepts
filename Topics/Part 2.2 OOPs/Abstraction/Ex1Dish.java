package Abstraction;

public class Ex1Dish extends Ex1Receipe {


	public static void main(String[] args) {
		Ex1Dish dish = new Ex1Dish();
		dish.execute();
	}

	@Override
	public void ready() {
		System.out.println("Cut Vegetables");

	}

	@Override
	public void doTheDish() {
		System.out.println("Put The Vegetables in Pot");

	}

	@Override
	public void cleanUp() {
		System.out.println("CLean the Utensils");

	}

}
