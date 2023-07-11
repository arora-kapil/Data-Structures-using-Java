package singlyLinkedLists;
import java.util.Scanner;

public class singlyLinkedList {
	Node head;
	
	static class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	
	
	
	public static singlyLinkedList insertToTail(singlyLinkedList list, int data) {
		
		Node newNode = new Node(data);
		
		
		if(list.head == null) {
			list.head = newNode;
		}
		else {
			Node last = list.head;
			while(last.next != null) {
				last = last.next;
			}
			last.next = newNode;
			newNode.next = null;
		}
		
		return list;
	}
	
	public static singlyLinkedList insertToHead(singlyLinkedList list, int data) {
		Node newNode = new Node(data);
		if(list.head == null) {
			list.head = newNode;
			return list;
		}
		
		newNode.next = list.head;
		list.head = newNode;
		
		return list;
		
	}
	
	public static singlyLinkedList insertIntoPos(singlyLinkedList list, int newElement, int pos) {
		Node newNode = new Node(newElement);
		if(list.head == null) {
			list.head = newNode;
			newNode.next = null;
			return list;
		}
		
		int currPos = 1;
		Node prevNode = list.head;
		Node nextNode;
		while(currPos < pos - 1) {
			prevNode = prevNode.next;
			currPos++;
		}
		
		
		newNode.next = prevNode.next;
		prevNode.next = newNode;
		return list;
	}
	
	public static void printList(singlyLinkedList list) {
		if(list.head == null) {
			return;
		}
		
		Node currentNode = list.head;
		
		System.out.println("The Linked List is: ");
		while(currentNode != null) {
			System.out.print(currentNode.data + "\t");
			currentNode = currentNode.next;
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		
		singlyLinkedList list = new singlyLinkedList();
		
		System.out.println("Start entering the elements: ");
		for(int i = 0 ; i < n ; i++) {
			list = insertToTail(list, sc.nextInt());
		}
		
		printList(list);
		
		System.out.println("\nEnter the new element to be inserted: ");
		int newElement = sc.nextInt();
		System.out.println("Enter its position: ");
		int pos = sc.nextInt();
		list = insertIntoPos(list, newElement, pos);
		printList(list);
		
		
	}
	
}
