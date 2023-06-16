package timeComplexities;

public class TimeComplexityN {
	
	public void m1(int n) {
		for(int i=0;i<n;i++) {
		System.out.println("Hello");	
		}
	}
	
	public static void main(String [] args) {
		TimeComplexityN t=new TimeComplexityN();
		t.m1(10);
	}
// n input n output====>o(n)

}
