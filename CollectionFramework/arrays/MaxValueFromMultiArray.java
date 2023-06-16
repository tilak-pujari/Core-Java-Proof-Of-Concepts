package arrays;

public class MaxValueFromMultiArray {

	public static void main(String[] args) {
		int a[][] = { { 10, 7, 5 }, { 1, 3, 11 }, { 4, 9, 2 } };
		int max = a[0][0];
		int maxcolumn = 0;
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(max<a[i][j]) {
					max=a[i][j];
					maxcolumn=j;
				}
			}
		}
		System.out.println(max);
		System.out.println(maxcolumn);
	}

}
