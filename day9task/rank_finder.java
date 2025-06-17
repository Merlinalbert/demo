package day9;
import java.util.Scanner;

public class rank_finder {
	    public static int findRank(int[] nums, int target) {
	        int low = 0, high = nums.length;
	        while (low < high) {
	            int mid = low + (high - low) / 2;
	            if (nums[mid] < target) {
	                low = mid + 1;
	            } else {
	                high = mid;
	            }
	        }
	        return low;  
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number of elements: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter sorted elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        System.out.print("Enter the target element: ");
	        int target = sc.nextInt();
	        int rank = findRank(arr, target);
	        System.out.println("Rank of " + target + " (number of elements less than target) is: " + rank);
	        sc.close();
	    }
	}
