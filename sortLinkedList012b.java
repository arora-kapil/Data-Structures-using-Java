
public class sortLinkedList012b {

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
       Node zeroHead = new Node(-1);
       Node zeroTail = zeroHead;
       Node oneHead = new Node(-1);
       Node oneTail = oneHead;
       Node twoHead = new Node(-1);
       Node twoTail = twoHead;

       while(currentNode != null) {
           Node newNode = new Node(currentNode.data);
           if(newNode.data == 0) {
               populate(zeroTail, 0);
           }
           else if(newNode.data == 1) {
               populate(oneTail, 1);
           }
           else {
               populate(twoTail, 2);
           }
       }

       head = zeroHead;
       zeroTail.next = oneHead;
       oneTail.next = twoHead;

       return head;
   }

   public static void populate(Node tail, int data) {
       Node newNode = new Node(data);
       tail.next = newNode;
       newNode = tail;
   }
}
