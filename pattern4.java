import java.util.Scanner;
public class pattern4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int r = sc.nextInt();
		int i = 1;
		while(i <= r*r) {
			if(i % r == 1) {
				System.out.println();
			}
			System.out.print(i + "\t");
			i++;
		}
	}
}
