import java.util.Scanner;

public class powerUsingRecursion {

	public static int power(int a, int b) {
		if(b == 0) {
			return 1;
		}
		
		if(b == 1) {
			return a;
		}
		
		int ans = power(a, b/2);
		
		if(b%2 == 0) {
			return ans * ans;
		}
		else {
			return a * ans * ans;
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base: ");
		int a = sc.nextInt();
		System.out.println("Enter Power: ");
		int b= sc.nextInt();
		
		System.out.println("The result is: " + power(a, b));
	}
}
