package Encapsulation;

public class Encap {
	private String name;
	private int pin;
	private long phoneNo;

	Encap() {
	}

	Encap(String name, int pin, long phoneNo) {
		this.name = name;
		this.pin = pin;
		this.phoneNo = phoneNo;
	}
	public String getName() {
		return name;
	}
	public int getPin() {
		return pin;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setPin(int pin) {
		this.pin=pin;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public void Details() {
		System.out.println(name + " Stays at Pincode " + pin + "\n" + name + "'s Phone Number is " + phoneNo);
	}

}
