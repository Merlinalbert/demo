package day4;

public class dll_list {
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
	    public void traverseForward() {
	        Node temp = head;
	        System.out.print("Forward: ");
	        while (temp != null) {
	            System.out.print(temp.data + " <-> ");
	            temp = temp.next;
	        }
	        System.out.println("null");
	    }
	    public void traverseBackward() {
	        if (head == null) return;
	        Node temp = head;
	        while (temp.next != null)
	            temp = temp.next;
	        System.out.print("Backward: ");
	        while (temp != null) {
	            System.out.print(temp.data + " <-> ");
	            temp = temp.prev;
	        }
	        System.out.println("null");
	    }
	    public static void main(String[] args) {
	        dll_list list = new dll_list();
	        list.insertAtEnd(10);
	        list.insertAtEnd(20);
	        list.insertAtEnd(30);
	        list.traverseForward();   
	        list.traverseBackward();  
	    }
	}


