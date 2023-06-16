package Encapsulation;

public class SaitamaDriver {

	public static void main(String[] args) {
		System.out.println("Hero Federation\nClass:\nS-Class\nA-Class\nB-Class\nC-Class\nD-Class\nE-Class\n");
		Saitama s = new Saitama();
		System.out.println(s.getName());
		System.out.println(s.getHeroClass());
		System.out.println(s.getRank());
		
		s.setName("Blast");
		s.setHeroClass('S');
		s.setRank(1);
		
		System.out.println(s.getName());
		System.out.println(s.getHeroClass());
		System.out.println(s.getRank());
	}

}
