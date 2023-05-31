import java.util.*;
public class Question7 {
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number to check whether its prime or not: ");
		int num = scanner.nextInt();
		
		if(isPrime(num))
		{
			System.out.println("The entered number is a prime number.");
		}
		else
		{
			System.out.println("The entered number is not a prime number.");
		}
	}
	
	static boolean isPrime(int num)
	{
		for(int i = 2 ; i < num ; i++)
		{
			if(num%i == 0)
			{
				return false;
			}
		}
		return true;
	}

}
