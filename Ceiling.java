
public class BinarySearch {
	public static void main(String args[])
	{
		int[] arr = {-3, -2, 0, 1, 2, 3, 4, 5, 6};
		int target = 3;
		int ans = binarySearch(arr, target);
		System.out.println(ans);
		
	}
	
	static int binarySearch(int[] arr, int target)
	{
		if(arr.length == 0)
		{
			return -1;
		}
		
		int start = 0, end = arr.length-1;
		int mid;
		while(start <= end)
		{
			mid = start + (end - start)/2;
			if(target < arr[mid])
			{
				end = mid-1;				
			}
			else if(target > arr[mid])
			{
				start = mid+1;
			}
			else
			{
				return mid;
			}
		}
		return -1;
			
	}

}

public class Ceiling {

}
