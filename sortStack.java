package stack;
//https://www.codingninjas.com/studio/problems/sort-a-stack_985275?topList=love-babbar-dsa-sheet-problems&leftPanelTab=1&campaign=Lovebabbarcodestudio&utm_source=youtube&utm_medium=affiliate&utm_campaign=Lovebabbarcodestudio
public class sortStack {

}

import java.util.* ;
import java.io.*; 
public class Solution {

	public static void sortStack(Stack<Integer> stack) {
		// Write your code here.
		if(stack.empty()) {
			return;
		}

		int top = stack.peek();
		stack.pop();

		sortStack(stack);

		insertInOrder(stack, top);
	}

	public static void insertInOrder(Stack<Integer> stack, int top) {
		if((!stack.empty() && stack.peek() < top) || stack.empty()) {
			stack.push(top);
			return;
		}

		int num = stack.peek();
		stack.pop();

		insertInOrder(stack, top);

		stack.push(num);
	}

}
