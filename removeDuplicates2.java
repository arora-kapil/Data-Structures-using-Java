//Remove duplicates from an unsorted linked list

public class removeDuplicates2 {

}

import java.util.* ;
import java.io.*; 

/************************************************************

    Following is the linked list node structure
    
    class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

************************************************************/


public class Solution {
	
	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {

        // Write your code here	

        LinkedListNode<Integer> current = head;
        LinkedListNode<Integer> second = current.next;

        while(current.next != null) {
            second = current.next;
            while(second.next != null) {
                if(second.next.data == current.data) {
                    second.next = second.next.next;
                }
                else {
                    second = second.next;
                }
            }
        }

        return head;
        
	}

}