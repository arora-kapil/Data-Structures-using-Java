package stack;
//https://www.codingninjas.com/studio/problems/delete-middle-element-from-stack_985246?leftPanelTab=0%3Fsource%3Dyoutube&campaign=Lovebabbarcodestudio&utm_source=youtube&utm_medium=affiliate&utm_campaign=Lovebabbarcodestudio
public class deleteMiddleElement {

}

import java.util.* ;
import java.io.*; 
public class Solution {
	public static void deleteMiddle(Stack<Integer> inputStack, int N) {
		// WRITE YOUR CODE HERE
		int count = 0;
		solve(inputStack, count, N);
	}

	public static void solve(Stack<Integer> inputStack, int count, int N) {
		if(count == N/2) {
			inputStack.pop();
			return;
		}

		int num = inputStack.peek();
		inputStack.pop();

		solve(inputStack, count+1, N);

		inputStack.push(num);
	}
}
