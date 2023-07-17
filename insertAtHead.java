package doublyLinkedLists;

import java.util.Scanner;

public class insertAtHead {
	
	public static doublyLinkedList insertAtHead(doublyLinkedList list, int data) {
		doublyLinkedList.Node newNode = new doublyLinkedList.Node(data);
		if(list.head == null) {
			list.head = newNode;
			return list;
		}
		
		list.head.prev = newNode;
		newNode.next = list.head;
		list.head = newNode;
		return list;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		
		doublyLinkedList list = new doublyLinkedList();
		
		System.out.println("Start entering the elements: ");
		for(int i = 0 ; i < n ; i++) {
			list = insertAtHead(list, sc.nextInt());
		}
		
		doublyLinkedList.printList(list);
	}
}
