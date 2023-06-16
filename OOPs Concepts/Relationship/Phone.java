package Relationship;

public class Phone {

	Battery b;

	Phone(Battery b) {
		this.b = b;
	}
	public static void main(String[] args) {
		Phone p = new Phone(new Battery("Samsung", 6000, "Lithium"));
		System.out.println(p.b.brand);
		System.out.println(p.b.mAH);
		System.out.println(p.b.type);
	}
}
