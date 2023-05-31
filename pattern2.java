import java.util.Scanner;
public class pattern2 {
	public static void main(String args[])
	{
		System.out.println("Enter the number of rows: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while(i <= n)
		{
			int j = 1;
			while(j <= n)
			{
				System.out.print(i + "\t");
				j++;
			}
			System.out.println();
			i++;
			
		}
	}
}
