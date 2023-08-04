package arrays;

public class MutliDimension2 {

	public static void main(String[] args) {
		int arr[][] = { { 10, 20, 30 }, { 1, 2, 3 }, { 4, 5, 6 } };

		for (int[] a : arr) {
			for (int b : a) {
				System.out.println(b);
			}
		}
	}

}
