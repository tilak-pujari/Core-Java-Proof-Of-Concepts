package Encapsulation;

public class MoviesDriver {

	public static void main(String[] args) {
		Movies m = new Movies("Man of Steel", 300.50, 8.5);
		m.Details();

		m.setMoviename("Batman V Superman");
		m.setBudget(400);
		m.setRating(6.5);
		m.Details();

		m.setMoviename("Zack Snyder's Justice League");
		m.setBudget(400);
		m.setRating(9.5);
		m.Details();
	}

}
