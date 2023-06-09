import java.util.Scanner;

public class intro2dArrays {

	public static void main(String args[]) {
		int[][] arr1 = new int[3][3];
		int[][] arr2 = new int[3][3];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i < 3 ; i++) {
			for(int j = 0 ; j < 3 ; j++) {
				System.out.println("Enter next value: ");
				int n = sc.nextInt();
				arr1[i][j] = n;
				arr2[j][i] = n;
			}
		}
		
		for(int i = 0 ; i < 3 ; i++) {
			for(int j = 0 ; j < 3 ; j++) {
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0 ; i < 3 ; i++) {
			for(int j = 0 ; j < 3 ; j++) {
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
