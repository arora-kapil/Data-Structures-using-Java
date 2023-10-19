package stack;
//https://www.codingninjas.com/studio/problems/reverse-stack-using-recursion_631875?topList=love-babbar-dsa-sheet-problems&leftPanelTab=0?source=youtube&campaign=Lovebabbarcodestudio&utm_source=youtube&utm_medium=affiliate&utm_campaign=Lovebabbarcodestudio
public class reverseStack {

}

import java.util.Stack;

public class Solution {
    
	public static void reverseStack(Stack<Integer> stack) {
		// write your code here
		if(stack.empty()) {
			return;
		}

		int top = stack.peek();
		stack.pop();

		reverseStack(stack);

		moveToBottom(stack, top);
	}

	public static void moveToBottom(Stack<Integer> myStack, int x) {
    if(myStack.empty()) {
      myStack.push(x);
      return;
    }

    int top = myStack.peek();
    myStack.pop();

    moveToBottom(myStack, x);

    myStack.push(top);
  }

}

