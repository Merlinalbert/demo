package day9;

public class upper_bound {
	    static int upperBound(int[] arr, int key) {
	        int low = 0, high = arr.length;
	        while (low < high) {
	            int mid = low + (high - low) / 2;
	            if (arr[mid] <= key) {
	                low = mid + 1;  
	            } else {
	                high = mid; 
	            }
	        }
	        return low;
	    }
	    public static void main(String[] args) {
	        int[] arr = {1, 3, 3, 5, 7, 9};
	        int key = 3;
	        int ub = upperBound(arr, key);
	        System.out.println("Upper bound of " + key + " is at index: " + ub);
	    }
	}


