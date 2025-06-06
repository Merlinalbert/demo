package day1;

public class minmax {

	    public static void main(String[] args) {
	        int[] numbers = {45, 22, 78, 13, 89, 34, 67};

	        int min = numbers[0];
	        int max = numbers[0];

	        for (int i = 1; i < numbers.length; i++) {
	            if (numbers[i] < min) {
	                min = numbers[i]; 
	            }
	            if (numbers[i] > max) {
	                max = numbers[i]; 
	            }
	        }

	        System.out.println("Minimum value in array: " + min);
	        System.out.println("Maximum value in array: " + max);
	    }
	}


