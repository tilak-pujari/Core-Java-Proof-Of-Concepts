package Project_Netflix;

import java.util.Scanner;

public class NetflixDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Netflix");
		System.out.println("Enter the user Name:");
		String userName = sc.next();
		System.out.println("Enter the Phone Number");
		long phoneNo = sc.nextLong();
		System.out.println("Enter the Password:");
		int pwd = sc.nextInt();
		Movies m = null;
		Netflix n = new Netflix(userName, pwd, phoneNo);
		System.out.println("Account Created Successfully !!!!");
		boolean exit = true;
		while (exit) {
			System.out.println("Enter the Choice\n1.Login\n2.Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter The Phone Number:");
				long phoneNo1 = sc.nextLong();
				System.out.println("Enter the Password");
				int pwd1 = sc.nextInt();
				if (n.getPhoneNo() == phoneNo1 && n.getPwd() == pwd1) {
					System.out.println("Login Successful");
					boolean logout = true;
					while (logout) {
						System.out.println(
								"Enter the Choice Again\n1.Add Movies\n2.Change Movies\n3.Display Movies\n4.Account Details\n5.Logout");
						int choice1 = sc.nextInt();
						switch (choice1) {
						case 1: {
							System.out.println("Enter the Movie Name:");
							String movieName = sc.next();
							System.out.println("Enter the Duration of Movie:");
							double duration = sc.nextDouble();
							System.out.println("Enter the Movie Genre:");
							String genre = sc.next();
							m = new Movies(movieName, duration, genre);
						}
							break;
						case 2: {
							System.out.println("Enter the Movie  to change:");
							String movieName = sc.next();
							System.out.println("Enter the Duration of Movie to change:");
							double duration = sc.nextDouble();
							System.out.println("Enter the Movie Genre to change:");
							String genre = sc.next();
							m.setMovieName(movieName);
							m.setDuration(duration);
							m.setGenre(genre);
						}
							break;
						case 3: {
							m.DisplayMovies();

						}
							break;
						case 4: {
							n.PrintAccDetails();
						}
							break;
						case 5: {
							logout = false;
						}
							break;
						default: {
							System.out.println("Invalid Choice!!!");
						}

						}

					}
				} else {
					System.out.println("Incorrect Credentials!!!!!!!!");
				}
			}
				break;
			case 2: {
				exit = false;
			}
				break;
			default: {
				System.out.println("Invalid Selection???? Try Again!!");
			}
			}

	}
	}

}
