package Project_Netflix;

public class Movies {
	private String movieName;
	private double duration;
	private String genre;

	Movies() {
	}

	Movies(String movieName, double duration, String genre) {
		this.movieName = movieName;
		this.duration = duration;
		this.genre = genre;
	}

	public String getMovieName() {
		return movieName;
	}

	public double getDuration() {
		return duration;
	}

	public String getGenre() {
		return genre;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void DisplayMovies() {
		System.out.println(
				"The Movie Name " + movieName + "\nThe Movie Duration :" + duration + "\nThe Movie Genre: " + genre);
	}

}
