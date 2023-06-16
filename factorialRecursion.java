import java.util.Scanner;
public class factorialRecursion {

	public static int factorial(int n) {
		if(n == 0) {
			return 1;
		}
		
		return n*factorial(n-1);
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nubmer: ");
		int n = sc.nextInt();
		System.out.println("The factorial is: " + factorial(n));
	}
}
