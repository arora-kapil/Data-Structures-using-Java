import java.util.Scanner;
public class pattern14 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int n = sc.nextInt();
		int r = 1;
		while(r <= n) {
			int c = 1;
			char ch = (char) ('A' + n - r);
			while(c <= r) {
				System.out.print(ch + "\t");
				ch++;
				c++;
			}
			System.out.println();
			r++;
		}
	}
}
