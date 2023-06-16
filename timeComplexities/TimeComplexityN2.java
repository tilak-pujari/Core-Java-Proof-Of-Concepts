package timeComplexities;

public class TimeComplexityN2 {
	
	public static void m1(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.println("Num "+j);
			}
		}
	}
	public static void main(String[] args) {
		m1(5);
	}

}
//input n  output n2=====>o(n)2