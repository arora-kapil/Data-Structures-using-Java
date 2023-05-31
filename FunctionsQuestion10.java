import java.util.*;
public class FunctionsQuestion10 {
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number to check whether its a pallindrome or not: ");
		int num = scanner.nextInt();
		
		String str = num + "";
		
		if(isPallindrome(str))
		{
			System.out.println("The entered number is a pallindrome.");
		}
		else
		{
			System.out.println("The entered number is not a pallindrome.");
		}
	}
	
	static boolean isPallindrome(String str)
	{
		int l = str.length();
		for(int i = 0 ; i < l/2 ; i++)
		{
			if(str.charAt(i) != str.charAt(l - i - 1))
			{
				return false;
			}
		}
		return true;
	}

}
