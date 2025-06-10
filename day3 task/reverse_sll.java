package day3;

public class reverse_sll {    
	    static class Node {
	        int data;
	        Node next;
	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }
	    Node head;
	    public void insert(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            return;
	        }
	        Node current = head;
	        while (current.next != null) {
	            current = current.next;
	        }
	        current.next = newNode;
	    }
	    public void reverse() {
	        Node prev = null;
	        Node current = head;
	        Node next;
	        while (current != null) {
	            next = current.next;
	            current.next = prev;
	            prev = current;
	            current = next;
	        }
	        head = prev;
	    }
	    public void printList() {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " -> ");
	            current = current.next;
	        }
	        System.out.println("null");
	    }
	    public static void main(String[] args) {
	        reverse_sll list = new reverse_sll();
	        list.insert(1);
	        list.insert(2);
	        list.insert(3);
	        list.insert(4);
	        list.insert(5);
	        System.out.println("Original list:");
	        list.printList();
	        list.reverse();
	        System.out.println("Reversed list:");
	        list.printList();
	    }
	}
