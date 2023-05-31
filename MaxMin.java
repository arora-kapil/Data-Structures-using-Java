import java.util.Scanner;

public class MaxMin {

	static int maxElement(int[] arr) {
		int n = arr.length;
		int max = Integer.MIN_VALUE;
		for(int i = 0 ; i < n ; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	static int minElement(int[] arr) {
		int n = arr.length;
		int min = Integer.MAX_VALUE;
		for(int i = 0 ; i < n ; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
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
		
		System.out.println("The largest element is: " + maxElement(arr));
		System.out.println("The smallest element is: " + minElement(arr));
	}
}
