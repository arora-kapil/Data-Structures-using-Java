import java.util.Scanner;
public class rowSum2dArrays {
	
	public static void rowSum(int[][] arr, int r, int c) {
		for(int i = 0 ; i < r ; i++) {
			int sum = 0;
			for(int j = 0 ; j < c ; j++) {
				sum += arr[i][j];
			}
			System.out.println("Sum of " + i + "th row: " + sum);
		}
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
