import java.util.Scanner;

public class bubbleSortRecursion {

	public static int[] sort(int[] arr, int n) {
		if(n == 0 || n == 1) {
			return arr;
		}
		
		for(int i = 0 ; i < n-1 ; i++) {
			if(arr[i] > arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		
		return sort(arr, n-1);
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Start entering the array elements: ");
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		
		sort(arr, n);
		System.out.println("Array after sorting is: \n");
		
		for(int i = 0 ; i < n ; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}
