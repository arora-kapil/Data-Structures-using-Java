import java.util.*;
public class FunctionsQuestion13 {
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int first = scanner.nextInt();
		
		System.out.println("Enter second number: ");
		int second = scanner.nextInt();
		
		System.out.println("The prime numbers in the given range are: ");
		for(int i = first ; i <= second ; i++)
		{
			if(isPrime(i))
			{
				System.out.println(i);
			}
		}
	}
	
	static boolean isPrime(int num)
	{
		if(num % 2 == 0 || num == 1 || num == 0)
		{
			return false;
		}
		
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
