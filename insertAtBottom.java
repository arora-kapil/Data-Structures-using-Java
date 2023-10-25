package stack;
//https://www.codingninjas.com/studio/problems/insert-an-element-at-its-bottom-in-a-given-stack_1171166?topList=love-babbar-dsa-sheet-problems&leftPanelTab=0?source=youtube&campaign=Lovebabbarcodestudio&utm_source=youtube&utm_medium=affiliate&utm_campaign=Lovebabbarcodestudio
public class insertAtBottom {

}

import java.util.* ;
import java.io.*; 
public class Solution 
{
  public static Stack<Integer> pushAtBottom(Stack <Integer> myStack, int x) 
  {
    // Write your code here
    moveToBottom(myStack, x);
    return myStack;
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

