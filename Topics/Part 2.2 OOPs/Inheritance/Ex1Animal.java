package Inheritance;

public class Ex1Animal {
	private String name;
	private String breed;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	Ex1Animal(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}

	public void sound(String sound) {
		System.out.println(sound);
	}

	public void eat(String food) {
		System.out.println(food);
	}

	@Override
	public String toString() {
		return "Name :" + name + "\tBreed :" + breed;
	}

}