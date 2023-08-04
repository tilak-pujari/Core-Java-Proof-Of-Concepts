package Project_Netflix;

public class Netflix {
	private String userName;
	private int pwd;
	private long phoneNo;

	Netflix() {
	}

	Netflix(String userName, int pwd, long phoneNo) {
		this.userName = userName;
		this.pwd = pwd;
		this.phoneNo = phoneNo;
	}

	public String getUserName() {
		return userName;
	}

	public int getPwd() {
		return pwd;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPwd(int pwd) {
		this.pwd = pwd;
	}

	public void PrintAccDetails() {
		System.out.println("The Account User Name is: " + userName);
		System.out.println("The Account User Password is: " + pwd);
		System.out.println("The Account User Phone Number is: " + phoneNo);
	}

}
