package doublyLinkedLists;

import java.util.Scanner;

public class deletePos {

	public static doublyLinkedList deletePos(doublyLinkedList list, int pos) {
		if(list.head == null) {
			return list;
		}
		
		int current = 1;
		doublyLinkedList.Node currentNode = list.head;
		while(current < pos) {
			currentNode = currentNode.next;
			current++;
		}
		
		currentNode.prev.next = currentNode.next;
		currentNode.next.prev = currentNode.next;
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
		
		System.out.println("\nEnter the position to be deleted: ");
		int pos = sc.nextInt();
		list = deletePos(list, pos);
		System.out.println("List after deletion: ");
		doublyLinkedList.printList(list);
	}
}

