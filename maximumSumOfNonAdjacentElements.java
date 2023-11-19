package dynamicProgramming;

public class maximumSumOfNonAdjacentElements {

}

//https://www.youtube.com/redirect?event=video_description&redir_token=QUFFLUhqbUhVRUdrU3I0U09BZWN1RnliYXNBd3duaURFd3xBQ3Jtc0tsN2ZLWkhnQVIwVnUxUWdvdGxhMVZiS21WdTFoZG9VTGlvWThmcmVXRmdDM0JDNVgzaUV4ajdtMEFwdDVuZlZLY3FES0RlRFVWWkE5bHo5ZHpUbkxXNEZ5LUhjVDFCekJRYUtHYndIUmVQdUdwVy12WQ&q=https%3A%2F%2Fwww.codingninjas.com%2Fcodestudio%2Fproblems%2Fmaximum-sum-of-non-adjacent-elements_843261%3FleftPanelTab%3D0%26utm_source%3Dyoutube%26utm_medium%3Daffiliate%26utm_campaign%3DLovebabbar&v=m9-H6AUBLgY
//Recursion Based Solution

import java.util.* ;
import java.io.*; 
import java.util.*;
public class Solution {
	public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
		// Write your code here.
		int n = nums.size();
		int ans = solve(nums, n-1);
		return ans;
	}

	public static int solve(ArrayList<Integer> nums, int n) {
		if(n < 0) {
			return 0;
		}

		if(n == 0) {
			return nums.get(0);
		}

		int incl = solve(nums, n-2) + nums.get(n);
		int excl = solve(nums, n-1);

		return Math.max(incl, excl);
	}
}
