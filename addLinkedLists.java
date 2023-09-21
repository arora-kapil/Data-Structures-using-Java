//https://practice.geeksforgeeks.org/problems/add-two-numbers-represented-by-linked-lists/1

public class addLinkedLists {

}

//{ Driver Code Starts
//driver

import java.util.*;

class Node {
 int data;
 Node next;

 Node(int d) {
     data = d;
     next = null;
 }
}

class GfG{
 
 static void printList(Node n){
     while(n!=null){
         System.out.print(n.data+" ");
         n = n.next;
     }
     System.out.println();
 }
 
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int T = sc.nextInt();
     
     while (T-- > 0) {
         
         int n = sc.nextInt();
         int val = sc.nextInt();
         
         Node first = new Node(val);
         Node tail = first;
         for(int i=0; i<n-1; i++)
         {
             val = sc.nextInt();
             tail.next = new Node(val);
             tail = tail.next;
         }
         
         int m = sc.nextInt();
         val = sc.nextInt();
         
         Node second = new Node(val);
         tail = second;
         for(int i=0; i<m-1; i++)
         {
             val = sc.nextInt();
             tail.next = new Node(val);
             tail = tail.next;
         }
         
         Solution g = new Solution();
         Node res = g.addTwoLists(first, second);
         printList(res);
     }
 }
}

//} Driver Code Ends


/* node for linked list

class Node {
 int data;
 Node next;

 Node(int d) {
     data = d;
     next = null;
 }
}

*/

class Solution{
 //Function to add two numbers represented by linked list.
 static Node addTwoLists(Node first, Node second){
     // code here
     // return head of sum list
     
     Node firstReversed = reverse(first);
     Node secondReversed = reverse(second);
     
     Node ans = add(firstReversed, secondReversed);
     
     Node ansReversed = reverse(ans);
     
     return ansReversed;
 }
 
 public static void insertAtTail(Node head, Node tail, int val) {
     Node temp = new Node(val);
     
     if(head == null) {
         head = temp;
         tail = temp;
         return;
     }
     else {
         tail.next = temp;
         tail = temp;
     }
 }
 
 public static Node add(Node first, Node second) {
     int carry = 0;
     Node ansHead = null;
     Node ansTail = null;
     
     while(first != null || second != null || carry != 0) {
         int value1 = 0;
         if(first != null) {
             value1 = first.data;
         }
         
         int value2 = 0;
         if(second != null) {
             value2 = second.data;
         }
         
         int sum = carry + value1 + value2;
         
         int digit = sum%10;
         
         insertAtTail(ansHead, ansTail, digit);
         carry = sum/10;
         
         if(first != null) {
             first  = first.next;
         }
         if(second != null) {
             second = second.next;
         }
     }
     
     return ansHead;
     
 }
 
 public static Node reverse(Node head) {
     Node prev = null;
     Node current = head;
     Node next = null;
     
     while(current != null) {
         next = current.next;
         current.next = prev;
         prev = current;
         current = next;
     }
     
     return prev;
 }
}
