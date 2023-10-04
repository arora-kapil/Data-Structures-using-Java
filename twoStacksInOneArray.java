//https://www.codingninjas.com/studio/problems/two-stacks_983634?leftPanelTab=0&campaign=YouTube_CodestudioLovebabbar5thfeb&utm_source=youtube&utm_medium=affiliate&utm_campaign=YouTube_CodestudioLovebabbar5thfeb

public class twoStacksInOneArray {

}

import java.util.* ;
import java.io.*; 
public class TwoStack {
	int arr[];
	int top1;
	int top2;
	int size;

	// Initialize TwoStack.
	public TwoStack(int s) {
		// Write your code here
		arr = new int[s];
		top1 = -1;
		top2 = s;
		size = s;
	}

	// Push in stack 1.
	public void push1(int num) {
		// Write your code here
		if(top2 - top1 > 1) {
			arr[++top1] = num;
		}
	}

	// Push in stack 2.
	public void push2(int num) {
		// Write your code here
		if(top2 - top1 > 1) {
			arr[--top2] = num;
		}
	}

	// Pop from stack 1 and return popped element.
	public int pop1() {
		// Write your code here
		if(top1 >= 0) {
			return arr[top1--];
		}
		return -1;
	}

	// Pop from stack 2 and return popped element.
	public int pop2() {
		// Write your code here
		if(top2 < size) {
			return arr[top2++];
		}
		return -1;
	}

}

