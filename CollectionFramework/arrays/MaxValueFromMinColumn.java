package arrays;

public class MaxValueFromMinColumn {

	public static void main(String[] args) {

		int a[][] = { { 10, 7, 25 }, { 17, 31, 11 }, { 46, 9, 92 } };
		int min = a[0][0];
		int mincolumn = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (min > a[i][j]) {
					min = a[i][j];
					mincolumn = j;
				}
			}
		}
		System.out.println("minimum value " + min);

		int max = a[0][mincolumn];
		int k = 0;
		while (k < 3) {

			if (max < a[k][mincolumn]) {
				max = a[k][mincolumn];
			}
			k++;
		}
		System.out.println("maximum value from max column " + max);
	}
}