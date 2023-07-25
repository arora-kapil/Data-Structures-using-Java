package circularLinkedLists;

import java.util.Scanner;

import singlyLinkedLists.singlyLinkedList;

public class circularSinglyLinkedList {
	Node tail;
	
	static class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
		}
	}
	
	public static circularSinglyLinkedList insertToTail(circularSinglyLinkedList list, int data) {
		Node newNode = new Node(data);
		
		if(list.tail == null) {
			list.tail = newNode;
			newNode.next = list.tail;
			return list;
		}
		
		Node head = list.tail.next;
		list.tail.next = newNode;
		newNode.next = head;
		list.tail = newNode;
		
		return list;
	}
	
	public static void printList(circularSinglyLinkedList list) {
		if(list.tail == null) {
			return;
		}
		
		System.out.println("The list is: ");
		Node currentNode = list.tail.next;
		do{
			System.out.print(currentNode.data + "\t");
			currentNode = currentNode.next;
		}
		while(currentNode != list.tail.next);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		
		circularSinglyLinkedList list = new circularSinglyLinkedList();
		
		System.out.println("Start entering the elements: ");
		for(int i = 0 ; i < n ; i++) {
			list = insertToTail(list, sc.nextInt());
		}
		
		printList(list);
	}

}
