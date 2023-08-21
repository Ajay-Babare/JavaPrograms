
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
	//implementation of deletion of a node in the linkedlist
	public void deleteNode(int position){
		//linkedlist is empty
		if(head == null){
			return;
		}

		Node temp = head;
		//deletion from the beginning
		if(position == 0){
			head = temp.next;
			return;
		}

		//deletion is from other position apart from the beginning
		for(int i=0; temp!=null && i<position-1; i++){
			temp = temp.next;
		}
		if(temp == null && temp.next==null){
			return;
		}
		temp.next = temp.next.next;
	}

	//implementation of reversal of a linkedlist using an iterative approach
	public void reverseLL(){
		Node curr = head;
		Node prev = null;
		Node nextPtr = null;

		while(curr != null){
			nextPtr = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nextPtr;
		}

		head = prev;
		return;
	}
	
	//implementation of reversal of linkedlist using a recursive approach
	public void reversalRec(Node curr, Node prev){
		//last node of the linked list
		if(curr.next == null){
			head = curr;
			curr.next = prev;
			return;
		}
		Node nextPtr = curr.next;
		curr.next = prev;
		//recursion concept
		reversalRec(nextPtr, curr);
	}

	// implementation of finding out the middle node in a linked list
	//two pointer approach
	public void middleNode(){
		Node slowPtr =  head, fastPtr = head;
		while(fastPtr != null && fastPtr.next != null){
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		System.out.println("Middle data of a given linked list is : "+slowPtr.data);
	}

	//implementation of finding out the cycle in a linked list
	//floyd's cycle detection algorithm - interview based question
	public void detectLoop(){
		Node slow = head, fast = head;
		int flag = 0;
		while(slow != null && fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast){
				flag = 1;
				break;
			}
		}
		if(flag == 0){
			System.out.println("No loop detected");
		}
		else{
			System.out.println("Loop is detected");
		}
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
		
		//System.out.println("Before insertion of 10, 1 and 19");
		//lList.displayLL();
		System.out.println();
		
		lList.insertAtBeginning(10);
		lList.insertAtBeginning(1);
		lList.insertAtBeginning(19);
		
		//System.out.println("After insertion of 10, 1 and 19");
		//lList.displayLL();
		System.out.println();
		
		lList.insertionAfter(lList.head.next.next.next, 13);
		lList.displayLL();
		System.out.println();
		
		/*
		lList.deleteNode(3);
		System.out.println("Linked List after deletion of the node: ");
		lList.displayLL();
		System.out.println();
		*/

		//lList.reverseLL();
		//lList.reversalRec(lList.head, null);
		//System.out.println("Reversal of a Linked List is : ");
		//lList.displayLL();
		//lList.middleNode();
		//System.out.println();

		//circular linked list
		Node temp = lList.head;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = lList.head;
		lList.detectLoop();
		System.out.println();
	}
}
