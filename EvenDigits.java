import java.util.*;

public class EvenDigits {
	public static void main(String args[])
	{
		int[] arr = {12, 3, 45, 6, 78, 9};
		System.out.println(findNumbers(arr));
	}
	
	static int findNumbers(int[] nums)
	{
		int count = 0;
		for(int i = 0 ; i < nums.length; i++)
		{
			if(even(i))
			{
				count++;
			}
		}
		return count;
	}

	private static boolean even(int i) {
		int count = 0;
		while(i > 0)
		{
			count++;
			i /= 10;
		}
		
		if(count%2 == 0 && count != 0)
		{
			return true;
		}
		// TODO Auto-generated method stub
		return false;
	}

}
