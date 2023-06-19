import java.util.Scanner;

public class sayDigits {
	
	public static void sayDigits(int n) {
		if(n == 0) {
			return;
		}
		
		sayDigits(n/10);
		
		int ans = n%10;
		if(ans == 0)	System.out.println("Zero");
		else if(ans == 1)	System.out.println("One");
		else if(ans == 2)	System.out.println("Two");
		else if(ans == 3)	System.out.println("Three");
		else if(ans == 4)	System.out.println("Four");
		else if(ans == 5)	System.out.println("Five");
		else if(ans == 6)	System.out.println("Six");
		else if(ans == 7)	System.out.println("Seven");
		else if(ans == 8)	System.out.println("Eight");
		else if(ans == 9)	System.out.println("Nine");
	}

	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting number: ");
		int n = sc.nextInt();
		sayDigits(n);
	}
}
