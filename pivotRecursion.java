import java.util.Scanner;

public class pivotRecursion {

	static int pivot(int[] arr, int low, int high) {
		if(low >= high) {
			return low;
		}
		
		int mid = low + (high - low)/2;
		if(arr[mid] >= arr[0]) {
			return pivot(arr, mid+1, high);
		}
		else
		{
			return pivot(arr, low, mid);
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Start entering the array elements: ");
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("The pivot index is: " + pivot(arr, 0, n));
	}
}
