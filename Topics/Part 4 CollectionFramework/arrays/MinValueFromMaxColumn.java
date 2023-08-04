package arrays;

public class MinValueFromMaxColumn {

	public static void main(String[] args) {
		
		int a[][] = { { 10, 7, 5 }, { 1, 3, 11 }, { 4, 9, 9 } };
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
		System.out.println("maximum value "+max);
		
		int min = a[0][maxcolumn];
		int k=0;
		while(k<3) {
		
			if(min>a[k][maxcolumn]) {
				min=a[k][maxcolumn];
			}
			k++;
		}
		System.out.println("minimum value from max column "+min);
	}

}
