package Relationship;

public class Mobile {
	String brand;
	double price;
	int ram;
	double storage;

	Mobile(String brand, double price, int ram, double storage) {
		this.brand = brand;
		this.price = price;
		this.ram = ram;
		this.storage = storage;
	}

	public void Print() {
		System.out.println("Brand is : " + brand);
		System.out.println("Mobile Price is : " + price + " K rupees");
		System.out.println("RAM is : " + ram + " GB");
		System.out.println("Storage is : " + storage + " GB");
	}

}
