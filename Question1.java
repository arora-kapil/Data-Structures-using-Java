import java.util.*;
public class Question1 {
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the first number: ");
		int first = scanner.nextInt();
		
		System.out.println("Please enter the second number: ");
		int second = scanner.nextInt();
		
		System.out.println("Please enter the third number: ");
		int third = scanner.nextInt();
		
		int l = largest(first, second, third);
		int s = smallest(first, second, third);
		
		System.out.println("The largest number is: "+ l);
		System.out.println("The smallest nubmer is: "+ s);
	}
	
	public static int largest(int first, int second, int third)
	{
		if(first >= second && first >= third)
		{
			return first;
		}
		else if(second >= first && second >= third)
		{
			return second;
		}
		else
			return third;
	}
	
	public static int smallest(int first, int second, int third)
	{
		if(first <= second && first <= third)
		{
			return first;
		}
		else if(second <= first && second <= third)
		{
			return second;
		}
		else
			return third;
	}

}
