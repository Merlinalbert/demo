package datastructures;

import java.util.Arrays;

public class reverse_arry {
	public class Rev_array{
	    public static void main(String[] args) {
	        int[] array = {4, 2, 10, 7, 5, 3, 9};
	        Arrays.sort(array);
	        reverse(array); 
	        System.out.println(Arrays.toString(array));
	    }
	    public static void reverse(int[] array) {
	        int left = 0;
	        int right = array.length - 1;
	        while (left < right) {
	            int temp = array[left];
	            array[left] = array[right];
	            array[right] = temp;
	            left++;
	            right--;
	        }
	    }
	}
}
