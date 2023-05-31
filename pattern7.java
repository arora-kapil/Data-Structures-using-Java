import java.util.Scanner;
public class pattern7 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int n = sc.nextInt();
		int r = 1, count = 1;
		while(r <= n)
		{
			int c = 1;
			while(c <= r)
			{
				System.out.print(count + "\t");
				c++;
				count++;
			}
			System.out.println();
			r++;
		}
	}
}
