import java.util.Scanner;
public class powerRecursion {
	
	public static int power(int n, int p) {
		if(n == 0) {
			return 0;
		}
		
		if(p == 0) {
			return 1;
		}
		
		return n*power(n, p-1);
	}

	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		System.out.println("Enter the power: ");
		int p = sc.nextInt();
		
		System.out.println("The answer is: " + power(n, p));
	}
}
