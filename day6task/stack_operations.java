package day6;
import java.util.Scanner;
import java.util.Stack;

public class stack_operations {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Stack<Integer> stack = new Stack<>();
	        int choice;
	        do {
	            System.out.println("\n--- Stack Operations Menu ---");
	            System.out.println("1. Push");
	            System.out.println("2. Pop");
	            System.out.println("3. Peek");
	            System.out.println("4. Display");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();
	            switch (choice) {
	                case 1: 
	                    System.out.print("Enter element to push: ");
	                    int element = scanner.nextInt();
	                    stack.push(element);
	                    System.out.println(element + " pushed onto the stack.");
	                    break;
	                case 2: 
	                    if (!stack.isEmpty()) {
	                        int popped = stack.pop();
	                        System.out.println("Popped element: " + popped);
	                    } else {
	                        System.out.println("Stack is empty.");
	                    }
	                    break;
	                case 3:
	                    if (!stack.isEmpty()) {
	                        System.out.println("Top element: " + stack.peek());
	                    } else {
	                        System.out.println("Stack is empty.");
	                    }
	                    break;
	                case 4: 
	                    if (!stack.isEmpty()) {
	                        System.out.println("Stack elements: " + stack);
	                    } else {
	                        System.out.println("Stack is empty.");
	                    }
	                    break;
	                case 5:
	                    System.out.println("Exiting...");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        } while (choice != 5);
	        scanner.close();
	    }
	}


