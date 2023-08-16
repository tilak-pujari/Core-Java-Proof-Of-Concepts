package list_interface;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		ArrayList al=new ArrayList();

		System.out.println("Enter the Employee Name:");
		String ename=sc.next();
		System.out.println("Enter the Employee ID:");
		int eid=sc.nextInt();
		System.out.println("Enter the Employee Phone Number");
		long ephone=sc.nextLong();
		System.out.println("Enter the Employee Gender:[M/F/O]");
		char egender=sc.next().charAt(0);
		System.out.println("Enter the Employee Salary");
		int salary=sc.nextInt();
		
		al.add(ename);
		al.add(eid);
		al.add(ephone);
		al.add(egender);
		al.add(salary);
		
		System.out.println(al);

	}

}
