import java.util.Scanner;
public class pattern8 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int n = sc.nextInt();
		int r = 1;
		while(r <= n)
		{
			int c = 1;
			int count = r;
			while(c <= r)
			{
				System.out.print(r+c-1 + "\t");
				c++;
				count++;
			}
			System.out.println();
			r++;
		}
	}
}
