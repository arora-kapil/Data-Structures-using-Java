import java.util.Scanner;

public class largestRowSum {

	public static void rowSum(int[][] arr, int r, int c) {
		int max = 0;
		int maxRow = -1;
		for(int i = 0 ; i < r ; i++) {
			int sum = 0;
			for(int j = 0 ; j < c ; j++) {
				sum += arr[i][j];
			}
			if(sum > max) {
				max = sum;
				maxRow = i;
			}
			System.out.println("Sum of " + i + "th row: " + sum);
		}
		
		System.out.println("The largest row is: " + maxRow);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int r = sc.nextInt();
		System.out.println("Enter the number of columns: ");
		int c = sc.nextInt();
		int[][] arr = new int[r][c];
		
		System.out.println("Enter the values: \n");
		for(int i = 0 ; i < r ; i++) {
			for(int j = 0 ; j < c ; j++) {
				System.out.print("Enter the next element: ");
				arr[i][j] = sc.nextInt();
			}
		}
		
		rowSum(arr, r, c);
	}
}
