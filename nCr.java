import java.util.Scanner;
public class nCr {
	
	static int factorial(int x) {
		if(x == 0)	return 0;
		int fact = 1;
		while(x > 0) {
			fact *= x;
			x--;
		}
		return fact;
	}
	
	static int combination(int n, int r) {
		return factorial(n)/(factorial(r)*factorial(n-r));
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		System.out.println("Enter the value of r: ");
		int r = sc.nextInt();
		int ans = combination(n, r);
		System.out.println("nCr = " + ans);
	}

}
