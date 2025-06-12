package day5;

public class cll_list {
Node last;

static class Node {
	int data;
	Node next;
	
	Node(int data) {
		this.data = data;
		this.next = null;
	}
}
public void insert(int data) {
	Node newNode = new Node(data);

	if (last == null) {
		last = newNode;
		newNode.next=newNode;
	} else {
		newNode.next = last.next;
		last.next = newNode;
		last = newNode;
	}
}
public void display() {
	if (last == null) {
		System.out.println("list is empty.");
		return;
	}
	Node temp = last.next;
	System.out.print("circular linked list: ");
	do {
		System.out.print(temp.data + " -> ");
		temp = temp.next;
	} while (temp != last.next);
	System.out.println("(back to head)");
}

public static void main(String[] args) {
	 cll_list cll = new cll_list();
	
	cll.insert(10);
	cll.insert(20);
	cll.insert(30);
	cll.insert(40);
	
	cll.display();
	
}
}
