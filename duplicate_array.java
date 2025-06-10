package datastructures;
import java.util.Arrays;

public class duplicate_array {
	    public static void main(String[] args) {
	        int[] arr = {2, 3, 4, 4, 5, 8, 2, 3};
	        Arrays.sort(arr);
	        int n = removeDuplicates(arr);
	        System.out.print("Unique elements: ");
	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	    public static int removeDuplicates(int[] arr) {
	        if (arr.length == 0) return 0;
	        int i = 0;
	        for (int j = 1; j < arr.length; j++) {
	            if (arr[j] != arr[i]) {
	                i++;
	                arr[i] = arr[j];
	            }
	        }
	        return i + 1; 
	    }
	}


