package doublyLinkedLists;

import java.util.Scanner;

import doublyLinkedLists.doublyLinkedList.Node;

public class insertAtPosition {
	
	public static doublyLinkedList insertAtPos(doublyLinkedList list, int ele, int pos) {
		doublyLinkedList.Node newNode = new doublyLinkedList.Node(ele);
		if(list.head == null) {
			list.head = newNode;
			return list;
		}
		
		int currentPos = 1;
		Node currentNode = list.head;
		Node prevNode = list.head;
		
		while(currentPos < pos && currentNode.next != null) {
			currentNode = currentNode.next;
			prevNode = currentNode.prev;
			currentPos++;
		}
		
		if(currentNode.next == null) {
			prevNode.next = newNode;
			newNode.next = currentNode;
			currentNode.prev = newNode;
			return list;
		}
		
		prevNode.next = newNode;
		newNode.next = currentNode;
		return list;
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		
		doublyLinkedList list = new doublyLinkedList();
		
		System.out.println("Start entering the elements: ");
		for(int i = 0 ; i < n ; i++) {
			list = doublyLinkedList.insertToTail(list, sc.nextInt());
		}
		
		doublyLinkedList.printList(list);
		
		System.out.println("\nEnter the element to be inserted: ");
		int ele = sc.nextInt();
		System.out.println("Enter its position: ");
		int pos = sc.nextInt();
		
		list = insertAtPos(list, ele, pos);
		
		System.out.println("List after element insertion is: ");
		doublyLinkedList.printList(list);
	}

}
