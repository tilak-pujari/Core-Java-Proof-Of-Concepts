package Interface;

public interface TrafficWorld {

	// we can use incomplete non static method
	public void greenGo();

	public void redStop();

	public void orangeWait();

	// we can use abstract methods
	public abstract void countryName();

	// we can use default methods
	default void default_m1() {
		System.out.println("default method m1");
	}

	// we can create static methods
	public static void methods() {
		System.out.println("World Traffic Methods");
	}

}
