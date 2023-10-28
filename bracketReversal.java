package stack;
//https://www.codingninjas.com/studio/problems/minimum-cost-to-make-string-valid_1115770?leftPanelTab=1&campaign=Lovebabbarcodestudio&utm_source=youtube&utm_medium=affiliate&utm_campaign=Lovebabbarcodestudio
public class bracketReversal {

}

import java.util.* ;
import java.io.*; 
public class Solution {
    public static int findMinimumCost(String str) {
		// Write your code here
      if(str.length()%2 == 1) {
        return -1;
      }

      Stack<Character> s = new Stack<>();
    for(int i=0; i<str.length(); i++) {
        char ch = str.charAt(i);
        
        if(ch == '{') 
            s.push(ch);
		else
        {
            //ch is closed brace
            if(!s.empty() && s.peek() == '{') {
                s.pop();
            }
            else
            {
                s.push(ch);
            }
        }
    }
    
        //stack contains invalid expression
        int a = 0, b = 0;
        while(!s.empty()) {
            if(s.peek() == '{') {
                b++;
            }
            else
            {
                a++;
            }
            s.pop();
        }
        
		int ans = (a+1)/2 + (b+1)/2;
        return ans;
    }
}
