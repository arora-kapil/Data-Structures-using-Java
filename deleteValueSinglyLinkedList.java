package singlyLinkedLists;

import java.util.Scanner;

import singlyLinkedLists.singlyLinkedList.Node;

public class deleteValueSinglyLinkedList {
	
	public static singlyLinkedList deleteValue(singlyLinkedList list, int val) {
		if(list.head == null) {
			return list;
		}
		
		if(list.head.data == val) {
			list.head = list.head.next;
			return list;
		}
		
		Node prevNode = list.head;
		Node currentNode = prevNode.next;
		while(currentNode.next != null && currentNode.data != val) {
			prevNode = prevNode.next;
			currentNode = currentNode.next;
		}
		
		if(currentNode.next == null) {
			prevNode.next = null;
			return list;
		}
		else if(currentNode.data == val) {
			prevNode.next = currentNode.next;
			return list;
		}
		
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
		
		System.out.println("\nEnter the value to be deleted: ");
		int val = sc.nextInt();
		list = deleteValue(list, val);
		singlyLinkedList.printList(list);
		
	}
}
