package Encapsulation;

public class Movies {
	private String moviename;
	private double budget;
	private double rating;

	Movies() {

	}

	public Movies(String moviename, double budget, double rating) {
		this.moviename = moviename;
		this.budget = budget;
		this.rating = rating;
	}

	public String getMoviename() {
		return moviename;
	}

	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public void Details() {
		System.out.println("Movie name is " + getMoviename() + "\nBudget is " + getBudget()
				+ " Million Dollors\nRating:" + getRating() + " stars");
		System.out.println("------------------------------------------------");

	}
}
