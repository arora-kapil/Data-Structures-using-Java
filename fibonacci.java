import java.util.Scanner;
public class fibonacci {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elemnts: ");
		int n = sc.nextInt();
		int first = 0;
		int second = 1;
		int third = 0;
		System.out.print(first + "\t" + second + "\t");
		for(int i = 0 ; i < n ; i++) {
			third = first + second;
			System.out.print(third + "\t");
			first = second;
			second = third;
			
		}
	}

}
