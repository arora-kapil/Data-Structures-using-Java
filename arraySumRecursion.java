import java.util.Scanner;

public class arraySumRecursion {
	
	public static int sum(int[] arr, int n, int i, int s) {
		if(i == n) {
			return s;
		}
		
		s += arr[i];
		return sum(arr, n, i+1, s);
		
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		System.out.println("Start entering the array elements: ");
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("The sum of the given array is: " + sum(arr, n, 0, 0));
	}
}
