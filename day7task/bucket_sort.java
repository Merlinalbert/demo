package day7;
import java.util.Scanner;

public class bucket_sort {
	    static void selectionSort(int[] bucket, int size) {
	        for (int i = 0; i < size - 1; i++) {
	            int minIdx = i;
	            for (int j = i + 1; j < size; j++) {
	                if (bucket[j] < bucket[minIdx]) {
	                    minIdx = j;
	                }
	            }
	            int temp = bucket[i];
	            bucket[i] = bucket[minIdx];
	            bucket[minIdx] = temp;
	        }
	    }
	    static void bucketSort(int[] arr, int bucketCount) {
	        if (arr.length == 0) return;
	        int max = arr[0], min = arr[0];
	        for (int val : arr) {
	            if (val > max) max = val;
	            if (val < min) min = val;
	        }
	        int range = (max - min + 1);
	        int interval = (int) Math.ceil((double) range / bucketCount);
	        int[][] buckets = new int[bucketCount][arr.length];
	        int[] bucketSizes = new int[bucketCount];
	        for (int val : arr) {
	            int index = (val - min) / interval;
	            buckets[index][bucketSizes[index]++] = val;
	        }
	        int idx = 0;
	        for (int i = 0; i < bucketCount; i++) {
	            if (bucketSizes[i] > 0) {
	                selectionSort(buckets[i], bucketSizes[i]);
	                for (int j = 0; j < bucketSizes[i]; j++) {
	                    arr[idx++] = buckets[i][j];
	                }
	            }
	        }
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter " + n + " elements (non-negative integers):");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        bucketSort(arr, 5);  
	        System.out.println("Sorted array:");
	        for (int val : arr)
	            System.out.print(val + " ");
	    }
	}


