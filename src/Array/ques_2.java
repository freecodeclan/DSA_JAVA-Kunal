/* Q.2 => Swapping an elements in array */
package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ques_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the elements into the array: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        swap(arr, 1,3);
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int[] a, int index1, int index2){
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }
}

