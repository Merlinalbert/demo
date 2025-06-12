package day5;

public class insert_tail {
	    Node last;
	    static class Node {
	        int data;
	        Node next;
	        Node(int data) {
	            this.data = data;
	        }
	    }
	    public void insertAtTail(int data) {
	        Node newNode = new Node(data);
	        if (last == null) {
	            last = newNode;
	            newNode.next = newNode; 
	        } else {
	            newNode.next = last.next; 
	            last.next = newNode;      
	            last = newNode;         
	        }
	    }
	    public void display() {
	        if (last == null) {
	            System.out.println("List is empty.");
	            return;
	        }
	        Node temp = last.next;
	        System.out.print("Circular Linked List: ");
	        do {
	            System.out.print(temp.data + " -> ");
	            temp = temp.next;
	        } while (temp != last.next);
	        System.out.println("(back to head)");
	    }
	    public static void main(String[] args) {
	        insert_tail cll = new insert_tail();
	        cll.insertAtTail(10);
	        cll.insertAtTail(20);
	        cll.insertAtTail(30);                                        
	        cll.display(); 
	    }
	}


