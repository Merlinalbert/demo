  package day4;

public class basic_dll {
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
	    public void insert(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            return;
	        }
	        Node last = head;
	        while (last.next != null) {
	            last = last.next;
	        }
	        last.next = newNode;
	        newNode.prev = last;
	    }
	    public void traverseForward() {
	        Node current = head;
	        System.out.print("Forward traversal: ");
	        while (current != null) {
	            System.out.print(current.data + " <-> ");
	            current = current.next;
	        }
	        System.out.println("null");
	    }
	    public void traverseBackward() {
	        if (head == null) return;
	        Node tail = head;
	        while (tail.next != null) {
	            tail = tail.next;
	        }
	        System.out.print("Backward traversal: ");
	        while (tail != null) {
	            System.out.print(tail.data + " <-> ");
	            tail = tail.prev;
	        }
	        System.out.println("null");
	    }
	    public static void main(String[] args) {
	        basic_dll list = new basic_dll();
	        list.insert(10);
	        list.insert(20);
	        list.insert(30);
	        list.traverseForward();
	        list.traverseBackward();
	    }
	}


