import java.util.Scanner;
public class pattern15 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int n = sc.nextInt();
		int r = 1;
		while(r <= n) {
			int spaces = 1;
			int stars = 1;
			while(spaces <= n - r) {
				System.out.print(" \t");
				spaces++;
			}
			while(stars <= r) {
				System.out.print("*\t");
				stars++;
			}
			r++;
			System.out.println();
		}
	}
}
