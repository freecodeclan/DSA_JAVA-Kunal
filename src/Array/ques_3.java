/* Q.3 => Reverse an array */
package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ques_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] car = new int[5];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < car.length; i++) {
            car[i] = in.nextInt();
        }
        reverse(car);
        System.out.println("Reversed array looks like : ");
        System.out.println(Arrays.toString(car));
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }

    }
    static void swap(int[] a, int index1, int index2){
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }
}