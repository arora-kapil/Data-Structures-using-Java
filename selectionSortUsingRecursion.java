import java.util.Scanner;

public class selectionSortUsingRecursion {
	
	public static void sort(int[] arr, int n) {
		if(n == 0 || n == 1) {
			return;
		}
		
		int start = arr.length - n;
		int min_ind = start;
		
		for(int i = start ; i < arr.length ; i++) {
			if(arr[i] < arr[min_ind]) {
				min_ind = i;
			}
		}
		
		int temp = arr[start];
		arr[start] = arr[min_ind];
		arr[min_ind] = temp;
		
		sort(arr, n-1);
		
		
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
