package Encapsulation;

public class Wrestlers {
	String name;
	String roaster;
	double winRatio;
	int champion;

	Wrestlers() {
	}

	Wrestlers(String name, String roaster, double winRatio, int champion) {
		this.name = name;
		this.roaster = roaster;
		this.winRatio = winRatio;
		this.champion = champion;
	}

	public String getName() {
		return name;
	}

	public String getRoaster() {
		return roaster;
	}

	public double getWinRatio() {
		return winRatio;
	}

	public int getChampion() {
		return champion;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRoaster(String roaster) {
		this.roaster = roaster;
	}

	public void setWinRatio(double winRatio) {
		this.winRatio = winRatio;
	}

	public void setChampion(int champion) {
		this.champion = champion;
	}

	public void wrestlerDetails() {
		System.out.println(name + " plays in " + roaster + " having winning % of " + winRatio);
		System.out.println("has been Champion for " + champion + " times.");
	}

}
