package day6;
import java.util.Arrays;

public class Day6_main {
	    int arr[] = new int[5];
	    int rear;
	    int front;
	    public Day6_main() {
	        rear = -1;
	        front = -1;
	    }
	    public void enqueue(int num) {
	        if (rear == arr.length - 1) { 
	            System.out.println("Queue is full");
	        } else {
	            if (front == -1) {
	                front = 0;  
	            }
	            arr[++rear] = num;
	        }
	    }
	    public void dequeue() {
	        if (front == -1 || front > rear) {
	            System.out.println("Empty Queue");
	        } else {
	            arr[front++] = 0;  
	            if (front > rear) {
	                front = -1;
	                rear = -1;
	            }
	        }
	    }
	    public void display() {
	        if (front == -1) {
	            System.out.println("Queue is empty");
	        } else {
	            System.out.println(Arrays.toString(arr));
	        }
	    }
	    public static void main(String[] args) {
	        Day6_main q = new Day6_main();
	        q.enqueue(10);
	        q.enqueue(20);
	        q.enqueue(30);
	        q.display();
	        q.dequeue();
	        q.display();
	        q.enqueue(40);
	        q.enqueue(50);
	        q.enqueue(60);
	        q.display();
	        q.dequeue();
            q.dequeue();
	        q.dequeue();
	        q.dequeue();
	        q.display();
	    }
	}




