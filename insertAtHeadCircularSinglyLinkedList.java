package circularLinkedLists;

import java.util.Scanner;

import circularLinkedLists.circularSinglyLinkedList.Node;

public class insertAtHeadCircularSinglyLinkedList {
	
	public static circularSinglyLinkedList insertToHead(circularSinglyLinkedList list, int data) {
		Node newNode = new Node(data);
		
		if(list.tail == null) {
			list.tail = newNode;
			newNode.next = newNode;
			return list;
		}
		
		newNode.next = list.tail.next;
		list.tail.next = newNode;
		return list;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		
		circularSinglyLinkedList list = new circularSinglyLinkedList();
		
		System.out.println("Start entering the elements: ");
		for(int i = 0 ; i < n ; i++) {
			list = insertToHead(list, sc.nextInt());
		}
		
		circularSinglyLinkedList.printList(list);
	}
}
