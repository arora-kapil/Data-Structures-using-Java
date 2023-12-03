package dynamicProgramming;

public class fibonnaci3 {

}

//Space Optimized Solution

import java.util.*;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		if(n == 0) {
			System.out.println(0);
		}

		int prev1 = 1;
		int prev2 = 0;

		for(int i = 2 ; i <= n ; i++) {
			int curr = prev1 + prev2;
			prev2 = prev1;
			prev1 = curr;
		}

		System.out.println(prev1);
	}
}

