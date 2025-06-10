package datastructures;

import java.util.Arrays;
import java.util.Collections;

public class descending_order {
    public static void main(String[] args) {
        Integer[] numbers = {10, 4, 7, 1, 9};
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("Array in descending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
