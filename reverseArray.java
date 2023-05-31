import java.util.Scanner;
public class reverseArray {

	static void reverse(int[] arr) {
		int l = arr.length;
		int start = 0; int end = l-1;
		while(start <= end) {
			int x = arr[start];
			arr[start] = arr[end];
			arr[end] = x;
			start++ ; end-- ;
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
		
		reverse(arr);
		
		System.out.println("The reversed array is: ");
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}
