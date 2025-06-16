package day8;
import java.util.Scanner;

public class input_detection {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();
	        sc.nextLine();
	        String[] arr = new String[n];
	        System.out.println("Enter elements:");
	        for (int i = 0; i < n; i++)
	            arr[i] = sc.nextLine();
	        System.out.print("Enter element to search: ");
	        String key = sc.nextLine();
	        int idx = -1;
	        for (int i = 0; i < n; i++) {
	            if (arr[i].equals(key)) {
	                idx = i;
	                break;
	            }
	        }
	        if (idx == -1)
	            System.out.println("Not found");
	        else
	            System.out.println("Found at index: " + idx);

	        sc.close();
	    }
	}


