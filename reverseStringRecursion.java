
public class reverseStringRecursion {

}

import java.util.* ;
import java.io.*; 
import java.lang.*;
public class Solution {	

	public static char[] reverse(char[] arr, int start, int end) {
		if(start > end) {
			return arr;
		}

		char temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		start++;
		end--;
		return reverse(arr, start, end);
	}

	public static String reverseString(String str) {
		// Write your code here.
		int n = str.length();
		char[] arr = str.toCharArray();

		String str2 = new String(reverse(arr, 0, n-1));
		return str2;
	}
}

