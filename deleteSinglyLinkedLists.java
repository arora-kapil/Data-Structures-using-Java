package singlyLinkedLists;

import java.util.Scanner;

import singlyLinkedLists.singlyLinkedList.Node;

public class deleteSinglyLinkedLists {
	
	public static singlyLinkedList deleteAtPosition(singlyLinkedList list, int pos) {
		if(list.head == null) {
			return list;
		}
		
		if(pos == 1) {
			list.head = list.head.next;
			return list;
		}
		
		if(list.head.next == null) {
			list.head = null;
			return list;
		}
		
		int currentPos = 1;
		Node currentNode = list.head;
		while(currentPos < pos - 1) {
			if(currentNode.next == null) {
				return list;
			}
			currentNode = currentNode.next;
			currentPos++;
		}
		
		if(currentNode.next.next == null) {
			currentNode.next = null;
			return list;
		}
		currentNode.next = currentNode.next.next;
		return list;		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		singlyLinkedList list = new singlyLinkedList();
		
		System.out.println("Start entering the elements: ");
		for(int i = 0 ; i < n ; i++) {
			list = singlyLinkedList.insertToTail(list, sc.nextInt());
		}
		
		singlyLinkedList.printList(list);
		
		System.out.println("\nEnter the position to be deleted: ");
		int pos = sc.nextInt();
		deleteAtPosition(list, pos);
		singlyLinkedList.printList(list);
	}
	
}
