import java.util.Scanner;
public class pattern10 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int n = sc.nextInt();
		int row = 1;
		char c = 'A';
		while(row <= n)
		{
			int col = 1;
			while(col <= row)
			{
				char ch = (char) ('A'+row-1);
				System.out.print(ch + "\t");
				col++;
			}
			System.out.println();
			row++;
		}
	}
}
