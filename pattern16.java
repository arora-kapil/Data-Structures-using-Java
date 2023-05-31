import java.util.Scanner;
public class pattern16 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int n = sc.nextInt();
		int r = 1;
		while(r <= n) {
			int spaces = 1;
			while(spaces <= n-r) {
				System.out.print(" \t");
				spaces++;
			}
			int c1 = 1;
			while(c1 <= r) {
				System.out.print(c1 + "\t");
				c1++;
			}
			int c2 = r - 1;
			while(r != 1 && c2 > 0) {
				System.out.print(c2 + "\t");
				c2--;
			}
			r++;
			System.out.println();
			
		}
	}
}
