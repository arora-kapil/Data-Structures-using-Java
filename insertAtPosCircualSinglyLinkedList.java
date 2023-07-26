package circularLinkedLists;

import java.util.Scanner;

import circularLinkedLists.circularSinglyLinkedList.Node;
import doublyLinkedLists.doublyLinkedList;

public class insertAtPosCircualSinglyLinkedList {

	public static circularSinglyLinkedList insertAtPos(circularSinglyLinkedList list, int data, int pos) {
		Node newNode = new Node(data);
		
		if(list.tail == null) {
			list.tail = newNode;
			newNode.next = newNode;
			return list;
		}
		
		int currentPos = 1;
		Node currentNode = list.tail;
		do{
			currentNode = currentNode.next;
			currentPos++;
		}
		while(currentPos < pos && currentNode != list.tail);
		
		if(currentNode == list.tail) {
			circularSinglyLinkedList.insertToTail(list, data);
			return list;
		}
		
		newNode.next = currentNode.next;
		currentNode.next = newNode;
	
		return list;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		
		circularSinglyLinkedList list = new circularSinglyLinkedList();
		
		System.out.println("Start entering the elements: ");
		for(int i = 0 ; i < n ; i++) {
			list = circularSinglyLinkedList.insertToTail(list, sc.nextInt());
		}
		
		circularSinglyLinkedList.printList(list);
		
		System.out.println("\nEnter the new element to be added: ");
		int el = sc.nextInt();
		
		System.out.println("Enter its position: ");
		int pos = sc.nextInt();
		
		list = insertAtPos(list, el, pos);
		circularSinglyLinkedList.printList(list);
	}
}
