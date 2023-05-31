import java.util.Scanner;
public class primeNumber {
	public static void main(String args[])
	{
		System.out.println("Enter any number: ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		//Boolean isPrime = true;
		for(int i = 2 ; i <= n/2 ; i++)
		{
			if(n % i == 0)
			{
				System.out.println("Not a prime number because it is a mulitple of " + i);
				break;
			}
			else
			{
				System.out.println("Prime with " + i);
			}
		}
	}

}
 