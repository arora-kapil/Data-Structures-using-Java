package stack;
//https://www.codingninjas.com/studio/problems/design-a-stack-that-supports-getmin-in-o-1-time-and-o-1-extra-space_842465?topList=love-babbar-dsa-sheet-problems%3Fsource%3Dyoutube&campaign=Codestudio_Lovebabbar&utm_source=youtube&utm_medium=affiliate&utm_campaign=Codestudio_Lovebabbar&leftPanelTab=1
public class specialStack {

}

import java.util.Stack;

public class Solution {
    static class SpecialStack {
        Stack<Integer> s = new Stack<>();
        int mini;
        void push(int data) {
            // Implement the push() function.
            if(s.size() == 0) {
                s.push(data);
                mini = data;
                return;
            }
            else {
                if(data < mini) {
                    int val = 2*data - mini;
                    s.push(val);
                    mini = data;
                    return;
                }
                else {
                    s.push(data);
                    return;
                }
            }
        }

        void pop() {
            // Implement the pop() function.
            if(s.empty()) {
                return;
            }

            int curr = s.peek();
            s.pop();
            if(curr > mini) {
                return;
            }
            else {
                int prevMin = mini;
                int val = 2*mini - curr;
                mini = val;
                return;
            }
        }

        int top() {
            // Implement the top() function.
            if(s.empty()) {
                return -1;
            }

            int curr = s.peek();
            if(curr < mini) {
                return mini;
            }
            else {
                return curr;
            }
        }

        int getMin() {
            // Implement the getMin() function.
            if(s.empty()) {
                return -1;
            }

            return mini;
        }
    };
}

