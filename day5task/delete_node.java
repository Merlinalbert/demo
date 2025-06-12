package day5;
import java.util.Scanner;
public class delete_node {

class Node {
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
            newNode.next = head;
            return;
        }

        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

   
    public void deleteAtPosition(int pos) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        
        if (head.next == head && pos == 0) {
            head = null;
            return;
        }
        if (pos == 0) {
            Node last = head;
            while (last.next != head) {
                last = last.next;
            }
            head = head.next;
            last.next = head;
            return;
        }

     
        Node current = head;
        for (int i = 0; i < pos - 1; i++) {
            current = current.next;
            if (current.next == head) {
                System.out.println("Position out of bounds");
                return;
            }
        }

        if (current.next == head) {
            System.out.println("Position out of bounds");
            return;
        }

        current.next = current.next.next;
    }

    
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        delete_node list = new delete_node();

    
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        System.out.println("Original Circular Linked List:");
        list.display();

        System.out.print("Enter position to delete (0-based): ");
        int position = sc.nextInt();

        list.deleteAtPosition(position);

        System.out.println("List after deletion:");
        list.display();

        sc.close();
    }
}


	




