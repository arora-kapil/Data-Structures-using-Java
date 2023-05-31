import java.util.Arrays;

public class Search2DArrays {
	public static void main(String args[])
    {
        int[][] arr = {
        		{23, 4, 1},
        		{18, 12, 3, 9},
        		{78, 39, 44, 66},
        		{1, 2, 3, 4, 5}
        };
        
        int target = 3;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
	
	static int[] search(int[][] arr, int target)
	{
		for(int i = 0 ; i < arr.length; i++)
		{
			for(int j = 0 ; j < arr[i].length ; j++)
			{
				if(arr[i][j] == target)
				{
					return new int[]{i, j};
				}
			}
		}
		return new int[] {-1, -1};
	}

}