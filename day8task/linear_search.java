package day8;
import java.util.Scanner;

public class linear_search {
	    static int linearSearch(int[] arr, int key) {
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == key)
	                return i;
	        }
	        return -1; 
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter " + n + " unsorted elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        System.out.print("Enter element to search: ");
	        int key = sc.nextInt();
	        int result = linearSearch(arr, key);
	        if (result == -1) {
	            System.out.println("Element not found in the list.");
	        } else {
	            System.out.println("Element found at index: " + result);
	        }
	        sc.close();
	    }
	}


