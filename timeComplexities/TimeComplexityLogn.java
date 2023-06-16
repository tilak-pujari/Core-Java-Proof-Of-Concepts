package timeComplexities;

public class TimeComplexityLogn {
		
		public static void m1(int n) {
			for(int i=1;i<=n;i*=2) {
				System.out.println("Num "+i);
				}
		}
		public static void main(String[] args) {
			m1(10);
		}	
}
		/*Time Complexity for n-input we get log(n) output 
		 	K  i=1  2^0
		 	K  i=2  2^1
		 	K  i=3  2^2
		 	K  i=4  2^3
		 	
		 	k+1  i 2^k
		 	i<=n
		 	2^k=n
		 	log2  both sides
		 	k=log(n);
		 */