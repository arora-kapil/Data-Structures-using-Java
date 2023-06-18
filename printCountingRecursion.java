import java.util.Scanner;
public class printCountingRecursion {
	
	public static void printCounting(int n) {
		if(n == 0) {
			return;
		}
		
		System.out.println(n);
		
		printCounting(n-1);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting number: ");
		int n = sc.nextInt();
		printCounting(n);
	}
}
