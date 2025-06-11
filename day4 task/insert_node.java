package day4;

public class insert_node {
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
	        while (temp.next != null)
	            temp = temp.next;
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
	    public void insertAtMiddle(int data) {
	        int mid = size() / 2;
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            return;
	        }
	        if (mid == 0) {  
	            newNode.next = head;
	            head.prev = newNode;
	            head = newNode;
	            return;
	        }
	        Node temp = head;
	        for (int i = 0; i < mid - 1; i++) {
	            temp = temp.next;
	        }
	        newNode.next = temp.next;
	        if (temp.next != null) {
	            temp.next.prev = newNode;
	        }
	        temp.next = newNode;
	        newNode.prev = temp;
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
	        insert_node list = new insert_node();
	        list.insertAtEnd(10);
	        list.insertAtEnd(20);
	        list.insertAtEnd(40);
	        list.insertAtEnd(50);
	        System.out.println("Original list:");
	        list.traverseForward();
	        list.insertAtMiddle(30);
	        System.out.println("After inserting 30 at middle:");
	        list.traverseForward();
	    }
	}
