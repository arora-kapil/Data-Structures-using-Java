import java.util.Scanner;

public class quickSort {
	
	public static int partition(int[] arr, int start, int end) {
		int pivot = arr[start];
		int count = 0;
		for(int i = start+1 ; i <= end ; i++) {
			if(arr[i] <= pivot) {
				count++;
			}
		}
		
		int pivotInd = start + count;
		
		arr[start] = arr[pivotInd];
		arr[pivotInd] = pivot;
		
		int i = start;
		int j = end;
		while(i < pivotInd && j > pivotInd) {
			while(arr[i] < pivot) {
				i++;
			}
			while(arr[j] > pivot) {
				j--;
			}
			
			if(i < pivotInd && j > pivotInd) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = arr[i];
				i++;
				j--;

			}
		}
		
		return start + count;
	}
	
	public static void sort(int[] arr, int start, int end) {
		if(start >= end) {
			return;
		}
		
		int p = partition(arr, start, end);
		
		sort(arr, start, p-1);
		sort(arr, p+1, end);
	}

	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the total number of elements: ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Start entering the array elements: ");
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		
		sort(arr, 0, n-1);
		
		System.out.println("Array after sorting is: \n");
		for(int i = 0 ; i < n ; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}
