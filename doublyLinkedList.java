package doublyLinkedLists;

import java.util.Scanner;

public class doublyLinkedList {
	Node head;

	static class Node {
		int data;
		Node prev;
		Node next;
		
		Node(int data) {
			this.data = data;
			this.prev = null;
			this.next = null;
		}
	}
	
	public static doublyLinkedList insertToTail(doublyLinkedList list, int data) {
		Node newNode = new Node(data);
		if(list.head == null) {
			list.head = newNode;
			return list;
		}
		
		Node currentNode = list.head;
		while(currentNode.next != null) {
			currentNode = currentNode.next;
		}
		
		currentNode.next = newNode;
		newNode.prev = currentNode;
		return list;
		
	}
	
	public static void printList(doublyLinkedList list) {
		if(list.head == null) {
			return;
		}
		
		Node currentNode = list.head;
		System.out.println("The list is:");
		while(currentNode != null) {
			System.out.print(currentNode.data + "\t");
			currentNode = currentNode.next;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		
		doublyLinkedList list = new doublyLinkedList();
		
		System.out.println("Start entering the elements: ");
		for(int i = 0 ; i < n ; i++) {
			list = insertToTail(list, sc.nextInt());
		}
		
		printList(list);
		
		
	}
	
}
