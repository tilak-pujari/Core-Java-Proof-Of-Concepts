package Abstraction;

public class Ex1DishWithMicroWave extends Ex1Receipe {

	public static void main(String[] args) {
		Ex1DishWithMicroWave dish = new Ex1DishWithMicroWave();
		dish.execute();
	}

	@Override
	public void ready() {
		System.out.println("Cut Vegetables");
		System.out.println("Switch On The MicroWave!");

	}

	@Override
	public void doTheDish() {
		System.out.println("Put The Vegetables in Pot");
		System.out.println("Put the Dish in the MicroWave!");

	}

	@Override
	public void cleanUp() {
		System.out.println("CLean the Utensils");
		System.out.println("Switch Off The MicroWave!");

	}

}