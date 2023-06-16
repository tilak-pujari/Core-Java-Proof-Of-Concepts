package Relationship;

public class Car {

	MusicPlayer m;

	Car(MusicPlayer m) {
		this.m = m;
	}
	public static void main(String[] args) {
		Car c = new Car(new MusicPlayer("Sony", 1200, false));
		c.m.Print();
	}

}
