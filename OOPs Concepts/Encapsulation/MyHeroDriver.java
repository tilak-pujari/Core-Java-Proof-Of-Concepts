package Encapsulation;

public class MyHeroDriver {

	public static void main(String[] args) {
		MyHero m = new MyHero();
		MyHero m1 = new MyHero("Genos");
		MyHero m2 = new MyHero(15);
		MyHero m3 = new MyHero('S');
		MyHero m4 = new MyHero("Saitama",17, 'B');
		System.out.println("The Hero Name is " + m1.getName());
		System.out.println("The Hero Rank is " + m2.getRank());
		System.out.println("The Hero Class is " + m3.getClassNo());
		System.out.println("The Hero Name is " + m4.getName() + "\nThe Hero Rank is " + m4.getRank()
				+ "\nThe Hero Class is " + m4.getClassNo());
		m1.setName("Fubuki");
		m2.setRank(1);
		m3.setClassNo('B');
		System.out.println("The Hero Name is " + m1.getName() + "\nThe Hero Rank is " + m2.getRank()
				+ "\nThe Hero Class is " + m3.getClassNo());

	}

}
