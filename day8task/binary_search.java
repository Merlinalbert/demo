package day8;
import java.util.Scanner;

public class binary_search {   
	    static int binarySearch(int[] arr, int left, int right, int key) {
	        if (right >= left) {
	            int mid = left + (right - left) / 2;
	            if (arr[mid] == key)
	                return mid; 
	            if (arr[mid] > key)
	                return binarySearch(arr, left, mid - 1, key); 
	            return binarySearch(arr, mid + 1, right, key); 
	        }
	        return -1; 
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of elements (sorted): ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter " + n + " sorted elements:");
	        for (int i = 0; i < n; i++)
	            arr[i] = sc.nextInt();
	        System.out.print("Enter element to search: ");
	        int key = sc.nextInt();
	        int result = binarySearch(arr, 0, n - 1, key);
	        if (result == -1)
	            System.out.println("Element not found.");
	        else
	            System.out.println("Element found at index: " + result);
	        sc.close();
	    }
	}


