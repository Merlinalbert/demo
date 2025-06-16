package day8;
import java.util.Scanner;

public class rotated_array {
	    static int search(int[] arr, int left, int right, int key) {
	        if (left > right) 
	            return -1;
	        int mid = left + (right - left) / 2;
	        if (arr[mid] == key) 
	            return mid;
	        if (arr[left] <= arr[mid]) {
	            if (key >= arr[left] && key <= arr[mid]) {
	                return search(arr, left, mid - 1, key);
	            } else {
	                return search(arr, mid + 1, right, key);
	            }
	        }
	        else {
	            if (key >= arr[mid] && key <= arr[right]) {
	                return search(arr, mid + 1, right, key);
	            } else {
	                return search(arr, left, mid - 1, key);
	            }
	        }
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of elements (rotated sorted): ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter " + n + " elements (rotated sorted array):");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        System.out.print("Enter element to search: ");
	        int key = sc.nextInt();
	        int result = search(arr, 0, n - 1, key);
	        if (result == -1) 
	            System.out.println("Element not found.");
	        else
	            System.out.println("Element found at index: " + result);
	        sc.close();
	    }
	}


