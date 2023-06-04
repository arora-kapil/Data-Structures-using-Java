import java.util.Scanner;
public class selectionSort {
	
	static void sort(int[] arr, int n) {
		for(int i = 0 ; i < n-1 ; i++) {
			//int min = arr[i];
			int min_ind = i;
			
			for(int j = i+1 ; j < n ; j++) {
				if(arr[j] < arr[min_ind]) {
					//min = arr[j];
					min_ind = j;
				}
			}
			
			int temp = arr[min_ind];
			arr[min_ind] = arr[i];
			arr[i] = temp;
			
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
		
		sort(arr, n);
		System.out.println("The sorted array is: ");
		for(int i = 0 ; i < n ; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}
