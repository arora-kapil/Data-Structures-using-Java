import java.util.Scanner;
public class insertionSort {

	static void sort(int[] arr, int n) {
		for(int i = 1 ; i < n ; ++i) {
			int temp = arr[i];
			int j = i - 1;
			while(j >= 0 && arr[j] > temp) {
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = temp;
/*			for(; j >= 0 ; j--) {
				if(arr[j] > temp) {
					arr[j+1] = arr[j];
				}
				else {
					break;
				}
			}
			arr[j+1] = temp;*/
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
