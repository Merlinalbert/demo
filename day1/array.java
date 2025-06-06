package day1;

public class array {
	    public static void main(String[] args) {
	        int[] arr = {10, 20, 30};     
	        arr[1] = 25;
	        System.out.println("Update: " + arr[0] + " " + arr[1] + " " + arr[2]);
	        int[] insert = {10, 15, 25, 30};
	        System.out.println("Insert: " + insert[0] + " " + insert[1] + " " + insert[2] + " " + insert[3]);
	        int[] delete = {10, 15, 30};
	        System.out.println("Delete: " + delete[0] + " " + delete[1] + " " + delete[2]);
	    }
	}


