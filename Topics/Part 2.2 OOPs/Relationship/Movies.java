package Relationship;

public class Movies {
	Actors a;

	Movies(Actors a) {
		this.a = a;
	}

	public static void main(String[] args) {
		Movies m = new Movies(new Actors("Saitama", "Gurou", 120.8));
		System.out.println(m.a.Antaganist);
		System.out.println(m.a.Protaganist);
		System.out.println(m.a.duration);

	}

}
