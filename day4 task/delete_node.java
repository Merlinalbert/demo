package day4;

public class delete_node {
	    Node head;
	    static class Node {
	        int data;
	        Node prev, next;
	        Node(int data) {
	            this.data = data;
	        }
	    }
	    public void insertAtEnd(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            return;
	        }
	        Node temp = head;
	        while (temp.next != null) {
	            temp = temp.next;
	        }
	        temp.next = newNode;
	        newNode.prev = temp;
	    }
	    public int size() {
	        int count = 0;
	        Node temp = head;
	        while (temp != null) {
	            count++;
	            temp = temp.next;
	        }
	        return count;
	    }
	    public void deleteMiddle() {
	        if (head == null) return; 
	        int mid = size() / 2;
	        if (mid == 0) {
	            head = head.next;
	            if (head != null) head.prev = null;
	            return;
	        }
	        Node temp = head;
	        for (int i = 0; i < mid; i++) {
	            temp = temp.next;
	        }
	        if (temp.prev != null) temp.prev.next = temp.next;
	        if (temp.next != null) temp.next.prev = temp.prev;
	    }
	    public void traverseForward() {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " <-> ");
	            temp = temp.next;
	        }
	        System.out.println("null");
	    }
	    public static void main(String[] args) {
	        delete_node list = new delete_node();
	        list.insertAtEnd(10);
	        list.insertAtEnd(20);
	        list.insertAtEnd(30);
	        list.insertAtEnd(40);
	        list.insertAtEnd(50);
	        System.out.println("Original list:");
	        list.traverseForward();
	        list.deleteMiddle();
	        System.out.println("After deleting middle node:");
	        list.traverseForward();
	    }
	}


