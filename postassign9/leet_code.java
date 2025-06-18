package day9;

public class leet_code {
	    public static int lowerBound(int[] arr, int target) {
	        int low = 0, high = arr.length; 
	        while (low < high) {
	            int mid = low + (high - low) / 2;
	            if (arr[mid] < target) {
	                low = mid + 1;
	            } else {
	                high = mid;
	            }
	        }
	        return low;
	    }
	    public static int upperBound(int[] arr, int target) {
	        int low = 0, high = arr.length; 
	        while (low < high) {
	            int mid = low + (high - low) / 2;
	            if (arr[mid] <= target) {
	                low = mid + 1;
	            } else {
	                high = mid;
	            }
	        }
	        return low;
	    }
	    public static void main(String[] args) {
	        int[] arr = {1, 3, 3, 5, 7, 9};
	        int target = 3;
	        System.out.println("Lower Bound of " + target + " is at index: " + lowerBound(arr, target));
	        System.out.println("Upper Bound of " + target + " is at index: " + upperBound(arr, target));
	        target = 4;
	        System.out.println("Lower Bound of " + target + " is at index: " + lowerBound(arr, target));
	        System.out.println("Upper Bound of " + target + " is at index: " + upperBound(arr, target));
	    }
	}


	   

	

