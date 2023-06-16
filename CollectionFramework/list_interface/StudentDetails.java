package list_interface;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of Student you want to Store:");
		int size=sc.nextInt();
		ArrayList al=new ArrayList();
		for(int i=0;i<size;i++) {
		System.out.println("Enter the Student Name:");
		String name=sc.next();
		System.out.println("Enter the Student ID:");
		int id=sc.nextInt();
		System.out.println("Enter the Student Phone Number");
		long phone=sc.nextLong();
		System.out.println("Enter the Student Gender:[M/F/O]");
		char gender=sc.next().charAt(0);
		
		al.add(name);
		al.add(id);
		al.add(phone);
		al.add(gender);
		}
		System.out.println(al);

	}

}
