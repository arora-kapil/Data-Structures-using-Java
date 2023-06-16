import java.util.Scanner;
public class GCD {
	
	static int gcd(int a, int b) {
		if(a == 0) {
			return b;
		}
		else if(b == 0) {
			return a;
		}
		
		while(a != b) {
			if(a > b) {
				a = a-b;
			}
			else {
				b = b-a;
			}
		}
		
		return a;
		
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		System.out.println("Enter second number: ");
		int b = sc.nextInt();
		
		System.out.println("Their Greatest Common Divisor is: " + gcd(a, b));
	}

}
