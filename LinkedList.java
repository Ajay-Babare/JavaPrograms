
public class LinkedList {
	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	//implementation of insertion of a node at the end 
	public void insertAtEnd(int newData) {
		Node newNode = new Node(newData);
		
		//linked is empty
		if(head == null) {
			head = new Node(newData);
			return;
		}
		
		//linkedlist is not empty
		newNode.next = null;
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		
		temp.next =newNode;
		return;
	}
	
	//implementation of insertion of node at the beginning
	public void insertAtBeginning(int newData) {
		Node newNode = new Node(newData);
		newNode.next = head;
		head = newNode;
	}
	
	//implementation of insertion of a node after any node
	public void insertionAfter(Node preNode, int newData) {
		if(preNode == null) {
			System.out.println("The previous node cannot contain the null values");
			return;
		}
		Node newNode = new Node(newData);
		newNode.next = preNode.next;
		preNode.next = newNode;
	}
	
	//implementation of displaying the linkedlist
	public void displayLL() {
		Node current = head;
		while(current != null) {
			System.out.println(current.data + " ");
			current = current.next;
		}
	}
	public static void main(String[] args) {
		LinkedList lList = new LinkedList();
		lList.insertAtEnd(2);
		lList.insertAtEnd(4);
		lList.insertAtEnd(8);
		
		System.out.println("Before insertion of 10, 1 and 19");
		lList.displayLL();
		System.out.println();
		
		lList.insertAtBeginning(10);
		lList.insertAtBeginning(1);
		lList.insertAtBeginning(19);
		
		System.out.println("After insertion of 10, 1 and 19");
		lList.displayLL();
		System.out.println();
		
		lList.insertionAfter(lList.head.next.next.next, 13);
		lList.displayLL();
		System.out.println();
		
	}
}
