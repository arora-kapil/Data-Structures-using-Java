import java.util.Scanner;
public class linearSeach2dArrays {
	
	public static void linearSearch(int[][] arr, int r, int c, int n) {
		int i = 0;
		int j = 0;
		
		//int[] ans = new int[]{-1,  -1};
		
		for( ; i < r ; i++) {
			for( ; j < c ; j++) {
				if(arr[i][j] == n) {
					//ans = {i, j};
					break;
					//return ans;
				}
			}
		}
		
		System.out.println("Row: " + i);
		System.out.println("Column: " + j);
		//return ans;
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
		
		System.out.println("Enter the nubmer to be searched: ");
		int n = sc.nextInt();
		
		System.out.println("Number found at location: ");
		linearSearch(arr, r, c, n);
	}
	
}
