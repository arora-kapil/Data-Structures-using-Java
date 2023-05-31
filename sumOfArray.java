import java.util.Scanner;
public class sumOfArray {

	static int sum(int[] arr) {
		int n = arr.length;
		int sum = 0;
		for(int i = 0 ; i < n ; i++) {
			sum += arr[i];
		}
		return sum;
		
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
		
		System.out.println("The sum of all the elements is: " + sum(arr));
	}
}
