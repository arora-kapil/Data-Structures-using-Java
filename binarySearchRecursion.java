import java.util.Scanner;

public class binarySearchRecursion {
	
	public static int search(int[] arr, int k, int low, int high) {
		if(low >= high) {
			return -1;
		}
		
		int mid = low + (high - low)/2;
		if(arr[mid] == k) {
			return mid;
		}
		else if(arr[mid] > k) {
			return search(arr, k, low, mid-1);
		}
		else {
			return search(arr, k, mid+1, high);
		}
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
		
		System.out.println("Enter the element to be searched: ");
		int k = sc.nextInt();
		
		int found = search(arr, k, 0, n-1);
		if(found != -1) {
			System.out.println("Element found at index: " + found);
		}
		else {
			System.out.println("Element Not Found!!");
		}
	}
}
