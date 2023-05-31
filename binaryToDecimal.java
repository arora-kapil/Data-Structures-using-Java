import java.util.Scanner;
public class binaryToDecimal {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a binary number: ");
		int n = sc.nextInt();
		
		int i = 0;
		int num = 0;
		while(n != 0) {
			int dig = n%10;
			if(dig == 1) {
				num += Math.pow(2, i);
			}
			i++;
			n = n/10;
		}
		
		System.out.println("The decimal number is: " + num);
	}
}
