import java.util.Scanner;

public class peakInMountainRecursion {

	public static int peak(int[] arr, int low, int high) {
		if(low > high) {
			return -1;
		}
		
		int mid = low + (high-low)/2;
		if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
			return mid;
		}
		else if(arr[mid] < arr[mid + 1]) {
			return peak(arr, low, mid+1);
		}
		else if(arr[mid] < arr[mid - 1]) {
			return peak(arr, mid, high);
		}
		
		return -1;
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
		
		System.out.println("The peak index is: " + peak(arr, 0, n));
	}
}
