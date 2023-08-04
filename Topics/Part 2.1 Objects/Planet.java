package objectsConstructor;

public class Planet {
	
	public void revolve() {
		System.out.println("Revolve");
	}

	public static void main(String[] args) {
		Planet earth = new Planet();
		Planet venus = new Planet();
		earth.revolve();
		venus.revolve();
	}

}