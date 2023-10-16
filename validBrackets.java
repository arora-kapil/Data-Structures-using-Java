package stack;
//https://www.codingninjas.com/studio/problems/valid-parenthesis_795104?topList=love-babbar-dsa-sheet-problems&leftPanelTab=1&campaign=Lovebabbarcodestudio&utm_source=youtube&utm_medium=affiliate&utm_campaign=Lovebabbarcodestudio
public class validBrackets {

}

import java.util.*;
public class Solution {
    public static boolean isValidParenthesis(String s) {
        // Write your code here.
        Stack<Character> st = new Stack<>();

        for(int i=0; i < s.length(); i++) {
         
         char ch = s.charAt(i);
         
         //if opening bracket, stack push
         //if close bracket, stacktop check and pop
         
         if(ch == '(' || ch == '{' || ch == '['){
             st.push(ch);
         }
         else
         {
             //for closing bracket
             if(!st.empty()) {
                  char top = st.peek();
                  if( (ch == ')' && top == '(') || 
                     ( ch == '}' && top == '{') || 
                     (ch == ']' && top == '[') ) {
                      st.pop();
                  }
                 else
                 {
                     return false;
                 }
             }
             else
             {
                 return false;
             } 
         }  
     }
    
    if(st.empty())
        return true;
    else
        return false;
    }
}
