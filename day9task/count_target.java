package day9;

public class count_target {
	    public static int firstOccurrence(int[] nums, int target) {
	        int low = 0, high = nums.length - 1, result = -1;
	        while (low <= high) {
	            int mid = low + (high - low) / 2;
	            if (nums[mid] == target) {
	                result = mid;
	                high = mid - 1; 
	            } else if (nums[mid] < target) {
	                low = mid + 1;
	            } else {
	                high = mid - 1;
	            }
	        }
	        return result;
	    }
	    public static int lastOccurrence(int[] nums, int target) {
	        int low = 0, high = nums.length - 1, result = -1;
	        while (low <= high) {
	            int mid = low + (high - low) / 2;
	            if (nums[mid] == target) {
	                result = mid;
	                low = mid + 1; 
	            } else if (nums[mid] < target) {
	                low = mid + 1;
	            } else {
	                high = mid - 1;
	            }
	        }
	        return result;
	    }
	    public static int countOccurrences(int[] nums, int target) {
	        int first = firstOccurrence(nums, target);
	        if (first == -1) return 0; 
	        int last = lastOccurrence(nums, target);
	        return last - first + 1;
	    }
	    public static void main(String[] args) {
	        int[] nums = {1, 2, 2, 2, 3, 4, 5};
	        int target = 2;
	        System.out.println("Count of " + target + ": " + countOccurrences(nums, target));
	    }
	}

