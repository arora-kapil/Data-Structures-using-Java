import java.util.Scanner;

public class linearSearchRecursion {

	public static int search(int[] arr, int n, int k) {
		if(n == 0) {
			return -1;
		}
		else if(arr[n-1] == k) {
			return n-1;
		}
		
		return search(arr, n-1, k);
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
		
		int found = search(arr, n, k);
		if(found != -1) {
			System.out.println("Element found at index: " + found);
		}
		else {
			System.out.println("Element Not Found!!");
		}
	}
}
