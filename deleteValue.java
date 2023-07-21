package doublyLinkedLists;

import java.util.Scanner;

public class deleteValue {
	
	public static doublyLinkedList deleteVal(doublyLinkedList list, int val) {
		if(list.head == null) {
			return list;
		}
		
		if(list.head.data == val) {
			if(list.head.next == null) {
				list.head = null;
				return list;
			}
			
			list.head = list.head.next;
			list.head.prev = null;
			return list;
		}
		
		doublyLinkedList.Node currentNode = list.head;
		while(currentNode.data != val && currentNode != null) {
			currentNode = currentNode.next;
		}
		
		if(currentNode == null) {
			System.out.println("Value not found!!");
			return list;
		}
		
		if(currentNode.next == null) {
			currentNode.prev.next = null;
			return list;
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
		
		System.out.println("\nEnter the value to be deleted: ");
		int val = sc.nextInt();
		list = deleteVal(list, val);
		System.out.println("List after deletion: ");
		doublyLinkedList.printList(list);
	}
}
