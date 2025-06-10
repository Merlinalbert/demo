package day3;

public class basic_sll {
	    static class Node {
	        int data;
	        Node next;
	        Node(int d) { data = d; }
	    }
	    static class SLL {
	        Node head;
	        void append(int data) {
	            Node n = new Node(data);
	            if (head == null) { head = n; return; }
	            Node curr = head;
	            while (curr.next != null) curr = curr.next;
	            curr.next = n;
	        }
	        void traverse() {
	            Node curr = head;
	            while (curr != null) {
	                System.out.print(curr.data + " -> ");
	                curr = curr.next;
	            }
	            System.out.println("null");
	        }
	    }
	    public static void main(String[] args) {
	        SLL list = new SLL();
	        list.append(1);
	        list.append(2);
	        list.append(3);
	        list.traverse();
	    }
	}

	
