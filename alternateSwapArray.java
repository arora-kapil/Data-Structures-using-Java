import java.util.Scanner;
public class alternateSwapArray {

	static void alternateSwap(int[] arr) {
		for(int i = 0 ; i < arr.length ; i += 2) {
			if(i < arr.length-1) {
				int x = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = x;
			}
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
		
		System.out.println("The new array is: ");
		alternateSwap(arr);
		
		System.out.println("The reversed array is: ");
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}
