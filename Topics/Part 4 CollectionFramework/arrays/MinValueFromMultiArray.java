package arrays;

public class MinValueFromMultiArray {

	public static void main(String[] args) {

		int a[][] = { { 10, 7, 5 }, { 24, 3, 11 }, { 4, 9, 2 } };
		int min = a[0][0];
		int mincolumn=0;
		for (int row[] : a) {
			for (int col : row) {
				if (min > col) {
					min = col;
				}
			}
		}
		
		System.out.println(min);
	}

}
