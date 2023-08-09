https://www.youtube.com/redirect?event=video_description&redir_token=QUFFLUhqbU9lVDZMeEt2U1V6VXVVc04xMWZmNGp0dk9ud3xBQ3Jtc0ttUHRqaWhCRktHVVdsVDJCODR5dWRyS0dWRGo5Zk11ZWRDUk0xblhOUVAyR0JtWVVxamZiLTJNRUpjVFlfcjZINzI1WUlFVVc0Wi1FWlZmdHZUemZXNFZGRE5aRWhEUDdfTE9vU3RBSDVLcFhBUWlCVQ&q=https%3A%2F%2Fbit.ly%2F3H1lKov&v=vqS1nVQdCJM
public class reverseLinkedList {

}

import java.io.*;
import java.util.* ;

/*
	Following is the structure of the Singly Linked List.	
	class LinkedListNode<T> 
    {
    	T data;
    	LinkedListNode<T> next;
    	public LinkedListNode(T data) 
        {
        	this.data = data;
    	}
	}

*/
public class Solution 
{
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {
        // Write your code here!
		LinkedListNode<Integer> prevNode = null;
		LinkedListNode<Integer> currNode = head;
		LinkedListNode<Integer> nextNode;

		while(currNode != null) {
			nextNode = currNode.next;
			currNode.next = prevNode;
			prevNode = currNode;
			currNode = nextNode;
		}

		return prevNode;
    }
}
