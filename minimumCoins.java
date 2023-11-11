package dynamicProgramming;

public class minimumCoins {

}

//https://www.codingninjas.com/studio/problems/minimum-elements_3843091?leftPanelTab=0&utm_source=youtube&utm_medium=affiliate&utm_campaign=Lovebabbar
//Recursion

import java.util.* ;
import java.io.*; 
public class Solution {
    public static int minimumElements(int num[], int x) {
        // Write your code here..
        int ans = solve(num, x);
        if(ans == Integer.MAX_VALUE) {
            return -1;
        }

        return ans;
    }

    public static int solve(int[] num, int x) {
        if(x == 0) {
            return 0;
        }

        if(x < 0) {
            return Integer.MAX_VALUE;
        }

        int mini = Integer.MAX_VALUE;

        for(int i = 0 ; i < num.length ; i++) {
            int ans = solve(num, x - num[i]);

            if(ans != Integer.MAX_VALUE) {
                mini = Math.min(mini, 1+ans);
            }
        }

        return mini;
    }

}
