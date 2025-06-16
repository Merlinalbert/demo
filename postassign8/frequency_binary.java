package day8;
import java.util.Scanner;

	public class frequency_binary {
	    static int firstOccurrence(int[] arr, int key) {
	        int low = 0, high = arr.length - 1, result = -1;
	        while (low <= high) {
	            int mid = low + (high - low) / 2;
	            if (arr[mid] == key) {
	                result = mid;
	                high = mid - 1; 
	            } else if (arr[mid] < key) {
	                low = mid + 1;
	            } else {
	                high = mid - 1;
	            }
	        }
	        return result;
	    }
	    static int lastOccurrence(int[] arr, int key) {
	        int low = 0, high = arr.length - 1, result = -1;
	        while (low <= high) {
	            int mid = low + (high - low) / 2;
	            if (arr[mid] == key) {
	                result = mid;
	                low = mid + 1; 
	            } else if (arr[mid] < key) {
	                low = mid + 1;
	            } else {
	                high = mid - 1;
	            }
	        }
	        return result;
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of elements (sorted): ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter sorted elements:");
	        for (int i = 0; i < n; i++)
	            arr[i] = sc.nextInt();
	        System.out.print("Enter element to find frequency of: ");
	        int key = sc.nextInt();
	        int first = firstOccurrence(arr, key);
	        if (first == -1) {
	            System.out.println("Element not found.");
	        } else {
	            int last = lastOccurrence(arr, key);
	            int freq = last - first + 1;
	            System.out.println("Frequency of " + key + " is: " + freq);
	        }
	        sc.close();
	    }
	}


