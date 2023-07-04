import java.util.Scanner;

public class insertionSortUsingRecursion {

	public static void sort(int[] arr, int n) {
		if(n == 0 || n == 1) {
			return;
		}
		
		sort(arr, n-1);
		
		int last = arr[n-1];
        int j = n-2;
        
        while (j >= 0 && arr[j] > last)
        {
            arr[j+1] = arr[j];
            j--;
        }
        
        arr[j+1] = last;
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
