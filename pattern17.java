import java.util.Scanner;
public class pattern17 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int n = sc.nextInt();
		
		int r = 1;
		while(r <= n) {
			int c1 = 1;
			while(c1 <= n-r+1) {
				System.out.print(c1 + "\t");
				c1++;
			}
			
			int c2 = (r-1)*2;
			while(c2 > 0) {
				System.out.print("*\t");
				c2--;
			}
			
			int c3 = n-r+1;
			while(c3 >= 1) {
				System.out.print(c3 + "\t");
				c3--;
			}
			
			System.out.println();
			r++;
		}
	}
}
