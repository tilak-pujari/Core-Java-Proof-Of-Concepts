package list_interface;

import java.util.ArrayList;

public class AlphaNumArrayList {

	public static void main(String[] args) {
			String s="a1b2c3";
			ArrayList arr1=new ArrayList();
			ArrayList arr2=new ArrayList();
			for(int i=0;i<s.length();i++) {
				char ch=s.charAt(i);
				if(ch<='z' && ch>='a') {
					arr1.add(ch);
				}
				else if(ch<='9' && ch>='0') {
					arr2.add(ch);
				}
			}
			System.out.println(arr1);
			System.out.println(arr2);
			

	}

}
