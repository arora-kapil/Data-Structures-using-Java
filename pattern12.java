import java.util.Scanner;
public class pattern12 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int n = sc.nextInt();
		int r = 1;
		while(r <= n) {
			int c = 1;
			while(c <= n) {
				char ch = (char) ('A' + (r-1)*n + c - 1);
				System.out.print(ch + "\t");
				c++;
			}
			r++;
			System.out.println();
		}
	}
}
