package stack;
//https://www.codingninjas.com/studio/problems/next-smaller-element_1112581?topList=love-babbar-dsa-sheet-problems&leftPanelTab=1&campaign=Lovebabbarcodestudio&utm_source=youtube&utm_medium=affiliate&utm_campaign=Lovebabbarcodestudio
public class nextSmallestNumber {

}

import java.util.*;
import java.io.*;

public class Solution{
    static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int n){
        // Write your code here.
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> s = new Stack<>();

        s.push(-1);

        for(int i = n-1 ; i >= 0 ; i--) {
            int el = arr.get(i);

            while(s.peek() >= el) {
                s.pop();
            }

            ans.add(s.peek());
            s.push(el);
        }

        Collections.reverse(ans);
        return ans;
    }
}
