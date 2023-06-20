import java.util.Scanner;
public class isSortedRecursion {

	public static boolean isSorted(int[] arr, int n, int i) {
		if(i == n-1) {
			return true;
		}
		if(arr[i+1] < arr[i]) {
			return false;
		}
		
		return isSorted(arr, n, i+1);
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
		
		boolean sorted = isSorted(arr, n, 0);
		if(sorted) {
			System.out.println("The given array is sorted.");
		}
		else {
			System.out.println("The given array is not sorted.");
		}
	}
}
