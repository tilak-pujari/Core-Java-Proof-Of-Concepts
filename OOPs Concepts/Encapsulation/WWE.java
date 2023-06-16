package Encapsulation;

public class WWE {
	String userName;
	long phoneNo;
	char gender;
	int pwd;

	WWE() {
	}

	WWE(String userName, long phoneNo, char gender, int pwd) {
		this.userName = userName;
		this.phoneNo = phoneNo;
		this.gender = gender;
		this.pwd = pwd;
	}

	public String getUserName() {
		return userName;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public char getGender() {
		return gender;
	}

	public int getPwd() {
		return pwd;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public void setPwd(int pwd) {
		this.pwd = pwd;
	}

	public void details() {
		System.out.println("Username:\t" + userName + "\nPhone Number: " + phoneNo + "\nGender: " + gender
				+ "\nAccount Password: " + pwd);
	}

}
