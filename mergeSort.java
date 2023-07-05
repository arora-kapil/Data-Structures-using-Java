import java.util.Scanner;

public class mergeSort {

	public static void merge(int[] arr, int start, int end) {
		int mid = start + (end - start)/2;
		
		int len1 = mid - start + 1;
		int len2 = end - mid;
		
		int[] arr1 = new int[len1];
		int[] arr2 = new int[len2];
		
		int k = start;
		for(int i = 0 ; i < len1 ; i++) {
			arr1[i] = arr[k++];
		}
		
		k = mid+1;
		for(int i = 0 ; i < len2 ; i++) {
			arr2[i] = arr[k];
		}
		
		k = 0;
		int ind1 = 0;
		int ind2 = 0;
		
		while(ind1 < len1 && ind2 < len2) {
			if(arr1[ind1] < arr2[ind2]) {
				arr[k++] = arr1[ind1++];
			}
			else {
				arr[k++] = arr2[ind2++];
			}
		}
		
		while(ind1 < len1) {
			arr[k++] = arr1[ind1++];
		}
		
		while(ind2 < len2) {
			arr[k++] = arr2[ind2++];
		}
	}

	public static void sort(int[] arr, int start, int end) {
		if(start >= end) {
			return;
		}
		
		int mid = start + (end - start)/2;
		
		sort(arr, start, mid);
		sort(arr, mid+1, end);
		
		merge(arr, start, end);
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
		
		sort(arr, 0, n-1);
		System.out.println("Array after sorting is: \n");
		
		for(int i = 0 ; i < n ; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}
