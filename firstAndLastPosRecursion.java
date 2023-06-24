import java.util.Scanner;

public class firstAndLastPosRecursion {

	
	public static int firstOccurrence(int[] arr, int k, int low, int high, int ans) {
		if(low > high) {
			return ans;
		}
		
		int mid = low + (high - low)/2;
		if(arr[mid] == k) {
			ans = mid;
			return firstOccurrence(arr, k, low, mid-1, ans);
		}
		else if(arr[mid] < k) {
			return firstOccurrence(arr, k, mid+1, high, ans);
		}
		else {
			return firstOccurrence(arr, k, low, mid-1, ans);
		}
	}
	
	public static int lastOccurrence(int[] arr, int k, int low, int high, int ans) {
		if(low > high) {
			return ans;
		}
		
		int mid = low + (high - low)/2;
		if(arr[mid] == k) {
			ans = mid;
			return lastOccurrence(arr, k, mid+1, high, ans);
		}
		else if(arr[mid] < k) {
			return lastOccurrence(arr, k, mid+1, high, ans);
		}
		else {
			return lastOccurrence(arr, k, low, mid-1, ans);
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
		
		System.out.println("Enter the element to be searched: ");
		int k = sc.nextInt();
		
		System.out.println("First Occurrence is at index: " + firstOccurrence(arr, k, 0, n-1, -1));
		System.out.println("Last Occurrence is at index: " + lastOccurrence(arr, k, 0, n-1, -1));
	}
}
