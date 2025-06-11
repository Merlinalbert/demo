package day4;
import java.util.Scanner;

public class menu_dll {
	    static class node {
	        int data;
	        node prev, next;
	        node(int data) {
	            this.data = data;
	        }
	    }
	    node head;
	    void insertAtEnd(int data) {
	        node newNode = new node(data);
	        if (head == null) {
	            head = newNode;
	            return;
	        }
	        node temp = head;
	        while (temp.next != null)
	            temp = temp.next;
	        temp.next = newNode;
	        newNode.prev = temp;
	    }
	    void insertAtBeginning(int data) {
	        node newNode = new node(data);
	        if (head == null) {
	            head = newNode;
	            return;
	        }
	        newNode.next = head;
	        head.prev = newNode;
	        head = newNode;
	    }
	    int size() {
	        int count = 0;
	        node temp = head;
	        while (temp != null) {
	            count++;
	            temp = temp.next;
	        }
	        return count;
	    }
	    void insertAtMiddle(int data) {
	        int mid = size() / 2;
	        node newNode = new node(data);
	        if (head == null) {
	            head = newNode;
	            return;
	        }
	        if (mid == 0) {
	            insertAtBeginning(data);
	            return;
	        }
	        node temp = head;
	        for (int i = 0; i < mid - 1; i++)
	            temp = temp.next;
	        newNode.next = temp.next;
	        if (temp.next != null)
	            temp.next.prev = newNode;
	        temp.next = newNode;
	        newNode.prev = temp;
	    }
	    void deleteByValue(int data) {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }
	        node temp = head;
	        if (temp.data == data) {
	            head = temp.next;
	            if (head != null)
	                head.prev = null;
	            System.out.println(data + " deleted from the list.");
	            return;
	        }
	        while (temp != null && temp.data != data)
	            temp = temp.next;
	        if (temp == null) {
	            System.out.println(data + " not found in the list.");
	            return;
	        }
	        if (temp.next != null)
	            temp.next.prev = temp.prev;
	        if (temp.prev != null)
	            temp.prev.next = temp.next;

	        System.out.println(data + " deleted from the list.");
	    }
	    void traverseForward() {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }
	        System.out.print("Forward traversal: ");
	        node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " <-> ");
	            temp = temp.next;
	        }
	        System.out.println("null");
	    }
	    void traverseBackward() {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }
	        node temp = head;
	        while (temp.next != null)
	            temp = temp.next;
	        System.out.print("Backward traversal: ");
	        while (temp != null) {
	            System.out.print(temp.data + " <-> ");
	            temp = temp.prev;
	        }
	        System.out.println("null");
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        menu_dll list = new menu_dll();
	        while (true) {
	            System.out.println("\nMenu:");
	            System.out.println("1. Insert at end");
	            System.out.println("2. Insert at beginning");
	            System.out.println("3. Insert at middle");
	            System.out.println("4. Delete node by value");
	            System.out.println("5. Traverse forward");
	            System.out.println("6. Traverse backward");
	            System.out.println("7. Exit");
	            System.out.print("Choose an option: ");
	            int choice = sc.nextInt();
	            int data;
	            switch (choice) {
	                case 1:
	                    System.out.print("Enter data to insert at end: ");
	                    data = sc.nextInt();
	                    list.insertAtEnd(data);
	                    break;
	                case 2:
	                    System.out.print("Enter data to insert at beginning: ");
	                    data = sc.nextInt();
	                    list.insertAtBeginning(data);
	                    break;
	                case 3:
	                    System.out.print("Enter data to insert at middle: ");
	                    data = sc.nextInt();
	                    list.insertAtMiddle(data);
	                    break;
	                case 4:
	                    System.out.print("Enter data to delete: ");
	                    data = sc.nextInt();
	                    list.deleteByValue(data);
	                    break;
	                case 5:
	                    list.traverseForward();
	                    break;
	                case 6:
	                    list.traverseBackward();
	                    break;
	                case 7:
	                    System.out.println("Exiting...");
	                    sc.close();
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid choice! Try again.");
	            }
	        }
	    }
	}


