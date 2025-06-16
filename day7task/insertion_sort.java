package day7;
import java.util.Scanner;

public class insertion_sort {
	    static void insertionSort(int[] arr) {
	        int n = arr.length;
	        for (int i = 1; i < n; i++) {
	            int key = arr[i];         
	            int j = i - 1;
	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];
	                j--;
	            }
	            arr[j + 1] = key;
	        }
	    }
	    static void printArray(int[] arr) {
	        for (int val : arr)
	            System.out.print(val + " ");
	        System.out.println();
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter " + n + " elements:");
	        for (int i = 0; i < n; i++)
	            arr[i] = sc.nextInt();
	        insertionSort(arr);
	        System.out.println("Sorted array:");
	        printArray(arr);
	        sc.close();
	    }
	}


