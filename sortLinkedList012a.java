//https://www.codingninjas.com/studio/problems/sort-linked-list-of-0s-1s-2s_1071937?leftPanelTab=0?source=youtube&campaign=YouTube_Lovebabbar31stJan2021&utm_source=youtube&utm_medium=affiliate&utm_campaign=YouTube_Lovebabbar31stJan2021

public class sortLinkedList012a {

}

/****************************************************************

Following is the class structure of the Node class:

class Node {
    public int data;
    public Node next;
   
    Node()
    {
        this.data = 0;
        this.next = null;
    }
   
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
   
    Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
    }
}

*****************************************************************/

public class Solution
{
   public static Node sortList(Node head) {
       // Write your code here
       Node currentNode = head;
       int count0 = 0;
       int count1 = 0;
       int count2 = 0;

       while(currentNode != null)
       {
           if(currentNode.data == 0) {
               count0++;
           }
           else if(currentNode.data == 1) {
               count1++;
           }
           else {
               count2++;
           }

           currentNode = currentNode.next;
       }

       currentNode = head;
       for(int i = 0 ; i < count0 ; i++) {
           currentNode.data = 0;
           currentNode = currentNode.next;
       }

       for(int i = 0 ; i < count1 ; i++) {
           currentNode.data = 1;
           currentNode = currentNode.next;
       }

       for(int i = 0 ; i < count2 ; i++) {
           currentNode.data = 2;
           currentNode = currentNode.next;
       }

       return head;
   }
}
