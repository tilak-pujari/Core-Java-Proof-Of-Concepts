package Encapsulation;

public class MyHero {
	private String name;
	private int Rank;
	private char ClassNo;

	MyHero() {

	}

	MyHero(String name) {
		this.name = name;
	}

	MyHero(int Rank) {
		this.Rank = Rank;
	}

	MyHero(char ClassNo) {
		this.ClassNo = ClassNo;
	}

	MyHero(String name, int Rank, char ClassNo) {
		this(name);
		this.Rank = Rank;
		this.ClassNo = ClassNo;
	}

	public String getName() {
		return name;
	}

	public int getRank() {
		return Rank;
	}

	public char getClassNo() {
		return ClassNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRank(int Rank) {
		this.Rank = Rank;
	}

	public void setClassNo(char ClassNo) {
		this.ClassNo = ClassNo;
	}

}
