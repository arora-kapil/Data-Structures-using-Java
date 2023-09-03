//Remove duplicates from a sorted singly linked list

public class removeDuplicates {

}

class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Solution {
    public static Node uniqueSortedList(Node head) {
        if (head == null) {
            return head;
        }

        Node currentNode = head;
        while (currentNode.next != null) {
            if (currentNode.next.data == currentNode.data) {
                currentNode.next = currentNode.next.next;
            } else {
                currentNode = currentNode.next;
            }
        }

        return head; 
    }
}

