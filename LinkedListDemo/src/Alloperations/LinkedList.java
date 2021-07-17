package Alloperations;

public class LinkedList {
	
	Node head = null;
	Node current = null;
	
	Node getNode(int data) {
		Node nw = new Node();
		nw.data = data;
		nw.next = null;
		return nw;
	}
	
	void createLinkedList(int data) {
		Node nw = getNode(data);
		if(head == null) {
			head = nw;
			current = nw;
			return ;
		}
		else {
			current.next = nw;
			current = nw;
		}
	}
	
	void display() {
		if(head == null) {
			System.out.println("LinkedList is empty !");
			return ;
		}
		Node ptr = head;
		while(ptr != null) {
			System.out.print(ptr.data + " --> ");
			ptr = ptr.next;
		}
		System.out.println();
		return;
	}
	
	int searchNode(int data) {
		
		int pos = 1;
		Node ptr = head;
		while(ptr != null) {
			if(ptr.data == data) {
				return pos;
			}
			pos++;
			ptr=ptr.next;
		}
		return -1;
	}
	Data findMinMax() {
		Data obj = new Data();
		if(head == null) {
			obj.min = -1;
			obj.max = -1;
			return obj;
		}
		obj.min = head.data;
		obj.max = head.data;
		Node ptr = head;
		while(ptr != null) {
			if(ptr.data > obj.max) {
				obj.max = ptr.data;
			}
			if(ptr.data < obj.min) {
				obj.min = ptr.data;
			}
			ptr = ptr.next;
		}
		return obj;
	}
	void insertFront(int data) {
		Node nw = getNode(data);
		nw.next = head;
		head = nw;
		System.out.println("Inserted successfully at the front!");
		return;
	}
	
}
