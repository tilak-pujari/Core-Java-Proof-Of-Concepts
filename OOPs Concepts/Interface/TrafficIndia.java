package Interface;

public class TrafficIndia implements TrafficWorld {

	public static void main(String[] args) {
		TrafficWorld tw = new TrafficIndia();

		tw.greenGo();
		tw.redStop();
		tw.orangeWait();
		tw.countryName();

		tw.default_m1();
		TrafficWorld.methods();
	}

	// we cannot override default methods in class it only allowed in interfaces
//	@Override
//	public default void default_m1() {
//		System.out.println("Default Method Override");
//	}

	@Override
	public void greenGo() {
		System.out.println("GO");

	}

	@Override
	public void redStop() {
		System.out.println("STOP");
	}

	@Override
	public void orangeWait() {
		System.out.println("HALT");
	}

	@Override
	public void countryName() {
		System.out.println("India");
	}

}
