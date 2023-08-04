package Encapsulation;

public class Saitama {
	private String Name = "Fubuki";
	private char Class = 'B';
	private int Rank = 1;

	public String getName() {
		return Name;
	}

	public char getHeroClass() {
		return Class;
	}

	public int getRank() {
		return Rank;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public void setHeroClass(char Class) {
		this.Class = Class;
	}

	public void setRank(int Rank) {
		this.Rank = Rank;
	}

}
